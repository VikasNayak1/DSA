package Arrays;

public class CountEven {
    // public static void main(String[] args) {
    //     int [] arr={1,2,3,4,5,6,7,8};
    //     int evenCount=0;
    //     int oddCount=0;
    //     for(int i=0;i<arr.length;i++) {
    //         if(arr[i]%2==0){
    //             evenCount++;
    //         }else{
    //             oddCount++;
    //         }
    //     }
    //    System.out.println("Even: "+evenCount);
    //    System.out.println("Odd: "+oddCount);

    // }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8};
        System.out.println(count(arr));
    }
    public static String count(int []arr){
        int evenCount=0;
        int oddCount=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
       return "Even count "+ evenCount +" odd count "+ oddCount;
    }
}
