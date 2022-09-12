package Lab_work2;

public class Item {
    String name;
    float price;
    public Item (String name, float price) {
        this.name = name;
        this.price = price;
        if (price<0) {
           price=0;
           System.out.println("gh");
        }
    }
    float PriceUp(float percent) {
        price += price*percent;
        return price;
    }
    float PriceDown (float percent) {
        price -= price*percent;
        return price;
    }
    }
