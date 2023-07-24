

public class Printing_Numbers_1_To_N {
    public static void main(String[] args){
        print(1);
    }

    static void print(int n){
        if(n == 5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n + 1);
    }
}
