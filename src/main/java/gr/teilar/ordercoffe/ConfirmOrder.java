package gr.teilar.ordercoffe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ConfirmOrder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_order);
        Intent intent = getIntent();
        Coffee coffee = (Coffee) intent.getSerializableExtra("coffee");
        TextView address = (TextView) findViewById(R.id.confirmedAddress);
        address.setText(coffee.getAddress());
        String coffeeType=getString(R.string.type)+": ";
        if (coffee.isHot())
            coffeeType+=getString(R.string.hot);
        else
            coffeeType+=getString(R.string.cold);
        TextView coffeeTypeTextView = (TextView) findViewById(R.id.coffeeType);
        coffeeTypeTextView.setText(coffeeType);

        String sugar;
        if (coffee.isSugar())
            sugar=getString(R.string.with)+" "+getString(R.string.sugar);
        else
            sugar=getString(R.string.without)+" "+getString(R.string.sugar);
        TextView sugarTypeTextView = (TextView) findViewById(R.id.coffeeSugar);
        sugarTypeTextView.setText(sugar);

        String milk;
        if (coffee.isMilk())
            milk=getString(R.string.with)+" "+getString(R.string.milk);
        else
            milk=getString(R.string.without)+" "+getString(R.string.milk);
        TextView milkTypeTextView = (TextView) findViewById(R.id.coffeeMilk);
        milkTypeTextView.setText(milk);


    }
}
