import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args){

        int[] arr = {1,2,5,6,4};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] arr, int low , int high){
        if(low >= high){
            return;
        }

        int s = low;
        int e = high;
        int m = (s + e)/2;
        int pivot = arr[m];

        while(s <= e){
            while(arr[s] < pivot){
                s++;
            }

            while(arr[e] > pivot){
                e--;
            }

            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        // now pivot is at correct index, sort two halves now

        sort(arr, low, e);
        sort(arr, s, high);

    }
}
