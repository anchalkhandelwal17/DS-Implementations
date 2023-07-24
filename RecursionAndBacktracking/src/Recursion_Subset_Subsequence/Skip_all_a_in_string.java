package Recursion_Subset_Subsequence;

public class Skip_all_a_in_string {
    public static void main(String[] args){

        String str = "anaconda";
      //  String newStr = "";
        String ans = skipAllA(str);

        System.out.println(ans);
    }

    // passing string as parameter in the function
    static void skipAllA(String str,  String ans){
        // base case

        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char c = str.charAt(0);
        if(c == 'a'){
             skipAllA(str.substring(1), ans);
        }
        else{
             skipAllA(str.substring(1), ans + c);
        }
    }

    // creating string in body of the function
    static String skipAllA(String str) {
        // base case

        if (str.isEmpty()) {
            return "";
        }
        char c = str.charAt(0);
        if(c != 'a'){
            return c + skipAllA(str.substring(1));
        }

        return skipAllA(str.substring(1));
    }
}
