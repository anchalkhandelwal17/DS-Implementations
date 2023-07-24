package Recursion_Subset_Subsequence;

import java.util.ArrayList;

public class Return_Subsequence_List {
    public static void main(String[] args){
        ArrayList<String> ans =  subseqRet("", "abc");
        System.out.println(ans);
    }

    static ArrayList<String> subseqRet(String op, String ip){
        if(ip.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(op);
            return list;
        }

        char c = ip.charAt(0);
        ArrayList<String> left = subseqRet(op + c, ip.substring(1));
        ArrayList<String> right = subseqRet(op, ip.substring(1));

        left.addAll(right);
        return left;
    }
}
