package Recursion_Subset_Subsequence;

import java.util.ArrayList;

public class Return_Subseq_Ascii_list {
    public static void main(String[] args){

        ArrayList<String> ans = subseqasciilist("", "abc");
        System.out.println(ans);
    }

    static ArrayList<String> subseqasciilist(String op, String ip){
        // base case
        if(ip.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(op);
            return list;
        }
        char c = ip.charAt(0);

        ArrayList<String> first = subseqasciilist(op + c, ip.substring(1));
        ArrayList<String> second = subseqasciilist(op, ip.substring(1));
        ArrayList<String> third = subseqasciilist(op + (c+0), ip.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
