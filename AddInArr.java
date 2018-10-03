import java.util.Scanner;

public class AddInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arr.generator(10);
        Arr.print(arr);
        System.out.print("nhập index: ");
        int index = sc.nextInt();
        while ((index < 0) || (index >= arr.length)) {
            System.out.println("không hợp lệ");
            System.out.print("nhập index: ");
            index = sc.nextInt();
        }
        System.out.print("nhập số cần chuyển: ");
        int input = sc.nextInt();
        int[] newRay = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (i > index) {
                newRay[i + 1] = arr[i];
            } else if (i == index) {
                newRay[i] = input;
            } else {
                newRay[i] = arr[i];
            }
        }
        Arr.print(newRay);
    }
}
