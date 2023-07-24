package Recursion_Subset_Subsequence;

public class Subseq_Ascii {
    public static void main(String[] args){
        subseqascii("", "abc");
    }

    static void subseqascii(String op, String ip){
        if(ip.isEmpty()){
            System.out.println(op);
            return;
        }

        char c = ip.charAt(0);
        subseqascii( op + c, ip.substring(1));
        subseqascii(op, ip.substring(1));
        subseqascii(op + (c+0), ip.substring(1));
    }

}
