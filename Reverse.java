import java.sql.SQLOutput;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập mảng (n)");
        int[] arr = Arr.generator(sc.nextInt());
        Arr.print(arr);
        for (int i = 0; i < arr.length - i - 1; i++) {
            int bak = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = bak;
        }
        System.out.println("after: ");
        Arr.print(arr);
    }


}
