package gr.teilar.ordercoffe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleOrder(View view) {
        Coffee coffee = new Coffee();
        //Θέσε την διεύθυνση
        EditText address = (EditText) findViewById(R.id.addressEditText);
        coffee.setAddress(address.getText().toString());
        //Θέσε το αν ο καφές είναι κρύος ή ζεστός
        RadioGroup rg = (RadioGroup) findViewById(R.id.tempRadioGroup);
        int selectedRbId = rg.getCheckedRadioButtonId();
        switch (selectedRbId) {
            case R.id.coldRadioButton:
                coffee.setHot(false);
                break;
            case R.id.hotRadioButton:
                coffee.setHot(true);
                break;
            default:
                //πήγαινε κρύο καφέ εξ ορισμού
                coffee.setHot(false);
        }
        //θέσε το αν ο καφές έχει γάλα
        CheckBox milkCheckBox = (CheckBox) findViewById(R.id.milkCheckBox);
        coffee.setMilk(milkCheckBox.isChecked());
        //Θέσε το αν ο καφές έχει ζάχαρη
        CheckBox sugarCheckBox = (CheckBox) findViewById(R.id.sugarCheckBox);
        coffee.setSugar(sugarCheckBox.isChecked());
        //Δημιούργησε ένα νέο explicit intent για το ConfirmOrder activity
        Intent intent = new Intent(this, ConfirmOrder.class);
        intent.putExtra("coffee",coffee);
        startActivity(intent);
    }
}
