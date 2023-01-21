package cw;
import java.util.function.IntPredicate;

/*
* Create a method all which takes two params:
* a sequence
* a function (function pointer in C)
* and returns true if the function in the params returns true for every element in the sequence.
* Otherwise, it should return false. If the sequence is empty, it should return true,
* since technically nothing failed the test.
 */

public class MainApp {
    public static IntPredicate intPredicate = (x) -> x <= 9;
    public static IntPredicate intPredicate2 = (x) -> x %2 != 0;
    public static IntPredicate intPredicate3 = (x) -> x >= 5;

    public static void main(String[] args) {
        int[] arr = {3, 5, 9, 17};
        int[] arr2 = {4, 6, 2, 8};
        System.out.println(all(arr, intPredicate));
        System.out.println(all(arr2, intPredicate));
        System.out.println(all(arr, intPredicate2));
        System.out.println(all(arr2, intPredicate2));
        System.out.println(all(arr, intPredicate3));
        System.out.println(all(arr2, intPredicate3));
    }

    public static boolean all(int[] list, IntPredicate predicate){
        for(int item : list) {
            if(!predicate.test(item))
                return false;
        }
        return true;
    }
}
