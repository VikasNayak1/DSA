package Arrays;

public class MoveAllZerosToEnd {
        public static void main(String[] args) {
            int arr[]={0,1,0,3,12};
            moveZeros(arr);
        }
        public static void moveZeros(int[] arr) {
            int n = arr.length;
            int count = 0; 
            for (int i = 0; i < n; i++) {
                if (arr[i] != 0) {
                    arr[count++] = arr[i];
                }
            }
            while (count < n) {
                arr[count++] = 0;
            }
    
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    
}
