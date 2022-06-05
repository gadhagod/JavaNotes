/*
The refrence of objects are passed when objects are passed in as parameters.
Modifying a parameterized object from within a function changes the same object
even outside the class.
*/
import java.util.ArrayList;
import java.util.Arrays;

public class Main 
{
    public static void main(String[] args) 
    {
        Car c = new Car("Toyota");
        System.out.println(c.getName());
        changeCar(c);
        System.out.println(c.getName());

        String x = "hi";
        System.out.println(x);
        changeString(x);
        System.out.println(x);

        int[] y = {1, 2, 3};
        System.out.println(Arrays.toString(y));
        changeArr(y);
        System.out.println(Arrays.toString(y));

        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("No");
        arrList.add("You");
        arrList.add("Ben");
        arrList.add("Fu");
        System.out.println(arrList);
        changeArrList(arrList);
        System.out.println(arrList);
    }

    public static void changeCar(Car object) 
    {
        object = new Car("Audi");
    }

    public static void changeString(String x)
    {
        x = "bye";
    }

    public static void changeArr(int[] arr) 
    {
        arr[0] = 5;
    }

    public static void changeArrList(ArrayList<String> arrList) 
    {
        arrList.set(0, "Yes");
    }
}
