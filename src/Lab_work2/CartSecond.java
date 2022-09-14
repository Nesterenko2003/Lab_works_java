package Lab_work2;

public class CartSecond {
    private int size;
    private Item[] array;
    private int head;
    private int tail;

    public CartSecond(int length) {
        size = length;
        array = new Item[size];
        head = 0;
        tail = -1;
    }

    public boolean isEmpty() {
        return (head == tail);

    }
    public boolean isFull() {
        return (tail == array.length-1);
    }

    public void push(Item item) {
        if (isFull()){
            System.out.println("Stack is full ( work only with " + array.length + " elements )");
        }
        else {
            int i = ++tail;
            array[i] = item;
        }
    }

    public Item pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return array[head++];
        }
    }

    public Item pick() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            System.out.println(array[head].name);
            return array[head];
        }
    }
    public float sumOrder() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        }
        else {
            float sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i].price;
            }
            System.out.println("Sum of all item's prices is equal: " + sum);
            return sum;
        }
    }
    public float increasePrice(float percent) {
        for (int i = 0; i < array.length; i++) {
            array[i].price = array[i].PriceUp(percent);
        }
        return 0;
    }
    public float decreasePrice(float percent) {
        for (int i = 0; i < array.length; i++) {
            array[i].price = array[i].PriceDown(percent);
        }
        return 0;
    }
}
