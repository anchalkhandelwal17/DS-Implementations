
public class ArraySorted {
    public static void main(String[] args){

        int[] arr = {2,3,4,34,8,9,15,17};
        boolean ans = sort(arr, 0);
        System.out.println(ans);
    }

    static boolean sort(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && sort(arr, index + 1);
    }
}
