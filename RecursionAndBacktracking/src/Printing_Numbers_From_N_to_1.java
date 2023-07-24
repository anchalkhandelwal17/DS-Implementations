public class Printing_Numbers_From_N_to_1 {
    public static void main(String[] args){
        printBoth(5);
    }

    static void printRev(int n){
        if(n == 0){
            //System.out.println(n);
            return;
        }
        System.out.println(n);
        printRev(n-1);
    }

    static void print(int n){
        if(n == 0){
           // System.out.println(n);
            return;
        }
        print(n-1);
        System.out.println(n);
    }

    static void printBoth(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printBoth(n-1);
        System.out.println(n);
    }
}
