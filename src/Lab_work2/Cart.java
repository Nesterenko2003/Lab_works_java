package Lab_work2;
public class Cart {
    private int size; //Array length
    private Item[] array; //Stack
    private int top; //Index of top element

    public Cart(int length) { //Cart constructor
        size = length;
        array = new Item[size];
        top = -1;
    }

    public boolean isEmpty() { //Check empty status of stack
        return (top == -1);

    }
    public boolean isFull() {
        return (top == array.length-1);
    }

    public void push(Item item) { //Add elements to stack
        if (isFull()){
            System.out.println("Stack is full ( work only with " + array.length + " elements )");
        }
        else {
            int i = ++top;
            array[i] = item;
        }
    }

    public Item pop() { //Delete last added element from stack
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return array[top--];
        }
    }

    public Item pick() { //Take last added element without deleting
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return array[top];
        }
    }
    public float sumOrder() { //Sum of all item's prices
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
    public float increasePrice(float percent) { //Increase price of every item
        for (int i = 0; i < array.length; i++) {
            array[i].price = array[i].PriceUp(percent);
        }
        return 0;
    }
    public float decreasePrice(float percent) { //decrease prise of every item
        for (int i = 0; i < array.length; i++) {
            array[i].price = array[i].PriceDown(percent);
        }
        return 0;
    }
}


