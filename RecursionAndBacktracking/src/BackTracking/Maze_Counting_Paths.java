package BackTracking;

public class Maze_Counting_Paths {
    public static void main(String[] args){
        int ans = countPaths(3,3);
        System.out.println(ans);
    }

    static int countPaths(int r, int c){
        // base case
        if(r == 1 || c == 1){
            return 1;
        }

        int left = countPaths(r-1, c);
        int right = countPaths(r, c-1);
        return left + right;
    }
}
