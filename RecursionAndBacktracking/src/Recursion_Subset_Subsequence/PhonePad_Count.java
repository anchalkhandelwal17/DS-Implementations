package Recursion_Subset_Subsequence;

import java.util.ArrayList;

public class PhonePad_Count {
    public static void main(String[] args){
        int ans = phonePadCount("", "12");
        System.out.println(ans);
    }

    static int phonePadCount(String p, String up){
        // base case
        if(up.isEmpty()){
            return 1;
        }

        int digit = up.charAt(0) - '0';
        int count = 0;

        for(int i=(digit-1)*3; i<(digit * 3); i++){
            char ch = (char)('a' + i);
            count = count + phonePadCount (p + ch, up.substring((1)));
        }
        return count;
    }
}
