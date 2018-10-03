public class Arr {
    static int[] generator(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round(Math.random() * n);
        }
        return arr;
    }
    static void print(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println("index "+i+" : "+arr[i]);
        }
    }
}
