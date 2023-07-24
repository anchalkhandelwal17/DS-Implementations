
public class Count_Zeroes_in_a_number {
    public static void main(String[] args){

        int ans = totalZeroes(1020304050,0);
        System.out.println(ans);
    }

    static int totalZeroes(int n, int zeroes){
        if(n == 0){
            return zeroes;
        }
        if(n % 10 == 0){
            return totalZeroes(n/10, zeroes+1);
        }
        return totalZeroes(n/10, zeroes);
    }
}
