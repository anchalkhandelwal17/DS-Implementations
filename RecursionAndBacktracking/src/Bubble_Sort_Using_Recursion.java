import java.util.Arrays;

public class Bubble_Sort_Using_Recursion {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        sort(arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int i, int j){
        // base case
        if(i == 0){
            return;
        }
        if(j < i){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            sort(arr, i, j+1);
        }
        sort(arr, i-1, 0);
    }
}
