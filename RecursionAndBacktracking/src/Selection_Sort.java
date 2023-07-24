import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args){
        int[] arr = {6,7,7,1,2,9};
        sort(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr , int idx){
        // base case
        if(idx == 0){
            return;
        }
        int max = 0;
        for(int i=1; i<=idx; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        swap(arr, max, idx);
        sort(arr, idx-1);
    }

    static void swap(int[] arr, int maxIdx, int lastIdx){
        int temp = arr[maxIdx];
        arr[maxIdx] = arr[lastIdx];
        arr[lastIdx] = temp;
    }
}
