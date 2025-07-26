package Collections;
import java.util.*;
public class FindLeader{
    public static void main(String[] args){
        int[] arr={16,17,4,5,2};
        System.out.println(find(arr));
    }
    public static List<Integer> find(int arr[]){
        List<Integer> list=new ArrayList<>();
        int leader=arr[arr.length-1];
        list.add(leader);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>leader){
                leader=arr[i];
                list.add(leader);
                
            }
        }
        return list;

    }
}
