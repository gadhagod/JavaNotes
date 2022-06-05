import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(input.nextInt());
        arr.add(input.nextInt());
        arr = fibSeq(arr, input.nextInt());
        System.out.println(arr);
    }

    public static ArrayList<Integer> fibSeq(ArrayList<Integer> arr, int lenLimit) {
        if (arr.size() == lenLimit) { // base case
            return arr;
        } else {
            arr.add(
                arr.get(arr.size() - 1) + arr.get(arr.size() - 2)
            );
            return fibSeq(arr, lenLimit);
        }
    }
}
