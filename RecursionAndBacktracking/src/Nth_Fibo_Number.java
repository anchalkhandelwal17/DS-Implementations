
public class Nth_Fibo_Number {
    public static void main(String[] args){

        int ans = fibo(6);
        System.out.print(ans);
    }

    static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
