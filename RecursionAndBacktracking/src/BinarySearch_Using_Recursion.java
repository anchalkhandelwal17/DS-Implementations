
public class BinarySearch_Using_Recursion {
    public static void main(String[] args){

        int[] arr = {3,4,7,9,11,13,15,18,20,25};
        int target = 28;
        int ans = BS(arr, target, 0, 9);
        System.out.print(ans);
    }

    static int BS(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }

        int m = (s + e)/2;

        if(arr[m] == target){
            return m;
        }
        else if(arr[m] > target){
            return BS(arr, target, s, m-1);
        }
        else{
            return BS(arr, target, m+1, e);
        }
    }
}
