package Recursion_Subset_Subsequence;

public class Subsequences {
    public static void main(String[] args){
        subseq("", "abc");
    }

    static void subseq(String op, String ip){
        if(ip.isEmpty()){
            System.out.println(op);
            return;
        }
        char c = ip.charAt(0);
        subseq(op + c, ip.substring(1));
        subseq(op, ip.substring(1));
    }

}
