import java.util.Scanner;

public class RemoveInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arr.generator(20);
        System.out.println("nhập index cần remove");
        int index = sc.nextInt();
        arr[index] = 0;
        Arr.print(arr);
    }
}
