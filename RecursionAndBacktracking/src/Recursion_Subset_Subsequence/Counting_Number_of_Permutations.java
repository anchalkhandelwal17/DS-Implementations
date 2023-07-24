package Recursion_Subset_Subsequence;

import java.util.ArrayList;

public class Counting_Number_of_Permutations {
    public static void main(String[] args){
        int ans = permutationsCount("", "abcd");
        System.out.println(ans);
        }

    public static int permutationsCount(String p, String up){
        // base case

        if(up.isEmpty()){
            return 1;
        }

        char ch = up.charAt(0);

        int count = 0;

        for(int i=0; i<=p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permutationsCount(f + ch + s, up.substring(1));
        }
        return count;
    }
}
