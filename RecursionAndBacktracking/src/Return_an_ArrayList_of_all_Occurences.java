
// Find all the occurrences of the target element and return their index in a list
// (without passing list in the argument of the function)
// create a new list in function body of every function call

import java.util.ArrayList;

public class Return_an_ArrayList_of_all_Occurences {
    public static void main(String[] args){
        int[] arr = {2,4,3,7,8,9,10,3,4,2,3};
        int target = 3;
        ArrayList<Integer> list = search(arr, target, 0);
        System.out.println(list);
    }

    static ArrayList<Integer> search(int[] arr, int target, int idx){

        ArrayList<Integer> list = new ArrayList<>();
        if(idx == arr.length){
            return list;
        }
        if(arr[idx] == target){
            list.add(idx);
        }
        ArrayList<Integer> ans = search(arr, target, idx+1);
        list.addAll(ans);
        return list;
    }
}
