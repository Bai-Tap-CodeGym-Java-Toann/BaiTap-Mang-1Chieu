import java.util.Scanner;
public class GopArr {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        int[] arr3 = new int[arr1.length + arr2.length];
        int index = 0;
        for (int x : arr1) {
            arr3[index] = x;
            index++;
        }
        for (int x : arr2) {
            arr3[index] = x;
            index++;
        }
        for (int x:arr3){
            System.out.println(x);
        }
    }
}
