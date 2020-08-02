package gr.teilar.ordercoffe;

import java.io.Serializable;

/**
 * Created by George on 10/4/2016.
 */
public class Coffee implements Serializable {
    private String address;
    private boolean hot;
    private boolean sugar;
    private boolean milk;


    public boolean isHot() {
        return hot;
    }

    public void setHot(boolean hot) {
        this.hot = hot;
    }

    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
