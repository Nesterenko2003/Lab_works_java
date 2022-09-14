package Lab_work2;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
    System.out.println("COUNT WITH LIFO METHOD");
    Cart cart = new Cart(5);
    cart.push(new Item("Milk", 10));
    cart.push(new Item("Cofe", 5));
    cart.push(new Item("Bread", 15));
    cart.push(new Item("Soda", 5));
    cart.push(new Item("Sugar", 10));
    cart.sumOrder();
    cart.increasePrice(15);
    cart.sumOrder();
    cart.decreasePrice(30);
    cart.sumOrder();
    System.out.println("COUNT WITH FIFO METHOD ");
    CartSecond cartSecond = new CartSecond(5);
    cartSecond.push(new Item("Milk", 10));
    cartSecond.push(new Item("Cofe", 5));
    cartSecond.push(new Item("Bread", 15));
    cartSecond.push(new Item("Soda", 5));
    cartSecond.push(new Item("Sugar", 10));
    cartSecond.sumOrder();
    cartSecond.increasePrice(15);
    cartSecond.sumOrder();
    cartSecond.decreasePrice(30);
    cartSecond.sumOrder();
    }


}
