package Recursion_Subset_Subsequence;

import java.util.ArrayList;

public class PhonePad_ArrayList {
    public static void main(String[] args){

        ArrayList<String> ans = phonePadRet("", "12");
        System.out.println(ans);
    }

    static ArrayList<String> phonePadRet(String p, String up){
        // base case
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();

        for(int i=(digit-1)*3; i<(digit * 3); i++){
            char ch = (char)('a' + i);
            list.addAll(phonePadRet(p + ch, up.substring((1))));
        }
        return list;
    }
}
