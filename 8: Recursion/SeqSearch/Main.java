import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String[] names = {"hi", "bye", "nai", "fai", "tai"};
        System.out.println(search(names, "fai"));
    }

    public static int search(String[] arr, String target) 
    {
        return searchWithIndex(0, arr, target);
    }

    public static int searchWithIndex(int index, String[] arr, String target)
    {
        if (index  == arr.length) 
        {
            return -1;
        }
        else if (arr[index] == target) {
            return index;
        }
        else 
        {
            return searchWithIndex(index + 1, arr, target);
        }
    }
}
