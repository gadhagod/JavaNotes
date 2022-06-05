import java.util.Arrays;
import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) 
    {
        // creation
        ArrayList<String> carsArrLs = new ArrayList<String>();
        carsArrLs.add("Volvo");
        carsArrLs.add("BMW");
        carsArrLs.add("Ford");
        carsArrLs.add("Mazda");
        System.out.println(carsArrLs);
        String[] carsArr = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(Arrays.toString(carsArr));

        // get item
        System.out.println(carsArrLs.get(0));
        System.out.println(carsArr[0]);

        // set item
        carsArrLs.set(0, "Toyota");
        System.out.println(carsArrLs);
        carsArr[0] = "Toyota";
        System.out.println(Arrays.toString(carsArr));

        // get length
        System.out.println(carsArrLs.size());
        System.out.println(carsArr.length);
    }
}
