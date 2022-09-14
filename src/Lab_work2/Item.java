package Lab_work2;

public class Item {
    String name;
    float price;
    private void CheckPrice(float price) {
        if (price<0) {
            this.price = 0;
            System.out.println("Incorect value");
        }
    }
    public Item (String name, float price) {
        this.name = name;
        this.price = price;
        CheckPrice(price);
    }
    public float PriceUp(float percent) {
        percent /= 100;
        float priceUp = price;
        priceUp += price*percent;
        CheckPrice(priceUp);
        return priceUp;
    }
    public float PriceDown (float percent) {
        percent /= 100;
        float priceDown = price;
        priceDown -= price*percent;
        CheckPrice(priceDown);
        return priceDown;
    }

    }
