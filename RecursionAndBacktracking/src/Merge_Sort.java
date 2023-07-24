import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {2,1,7,4,8,3,9,11};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {
        // base case
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);

    }

    public static int[] merge(int[] first, int[] second) {

        int[] ans = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                ans[k] = first[i];
                i++;
            } else if (second[j] < first[i]) {
                ans[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            ans[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            ans[k] = second[j];
            j++;
            k++;
        }
        return ans;
    }
}
