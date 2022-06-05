/*
When using the '+' operatoron a string and object, the object's toString() is used.
*/

public class Main {
    public static void main(String[] args) {
        Car c = new Car("Toyota");
        String msg = "Model: " + c; // is now "Model: Toyota"
        System.out.println(msg);
    }
}
