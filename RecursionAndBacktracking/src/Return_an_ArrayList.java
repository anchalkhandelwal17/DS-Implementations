
// Find all the occurrences of the target element and return their index in a list.

import java.util.ArrayList;
import java.util.Arrays;

public class Return_an_ArrayList {
    public static void main(String[] args){

        int[] arr = {2,4,3,7,8,9,10,3,4,2,3};
        int target = 3;
        ArrayList<Integer> ans = searchIdx(arr, target, 0, new ArrayList<Integer>());
        System.out.println(ans);
    }

    static ArrayList<Integer> searchIdx(int[] arr, int target, int idx, ArrayList<Integer> list){
        // base case
        if(idx == arr.length){
            return list;
        }

        if(arr[idx] == target){
            list.add(idx);
        }
        return searchIdx(arr, target, idx+1, list);
    }
}
