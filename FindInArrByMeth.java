import java.util.Scanner;
public class FindInArrByMeth {
    public static void main(String[] args) {
        int []arr = {4, 2, 0, 3, 1, 9, 8};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
    public static int minValue(int []array){

        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
                index = i;
            }
        }

        return index;
    }
}
