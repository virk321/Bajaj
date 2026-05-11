import java.util.Arrays;
import java.util.HashMap;

//brute force
//public class twoSum{
//    public static int[] sum(int[] arr, int t){
//        for(int i=0; i<arr.length; i++){
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i]+arr[j]==t){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return new int[]{};
//    }
//    public static void main(String[] args) {
//        int[] arr = {2, 7, 11, 15};
//        int target = 9;
//        System.out.println(Arrays.toString(sum(arr,target)));
//    }
//}


//optimized-hashmap
public class twoSum{
    public static int[] sum(int[] arr, int t){
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for(int i=0; i<arr.length; i++){
            int d = t-arr[i];

            if(map.containsKey(d)){
                ans[0]=map.get(d);
                ans[1]=i;
                break;
            }
            else{
                map.put(arr[i],i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(sum(arr,target)));
    }
}
