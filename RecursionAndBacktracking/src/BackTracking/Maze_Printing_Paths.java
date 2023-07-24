package BackTracking;

public class Maze_Printing_Paths {
    public static void main(String[] args){
        printPaths("", 3,3);
    }

    static void printPaths(String p, int r, int c){
        // base case
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r > 0){
            printPaths(p + "D", r-1, c);
        }
        if(c > 0){
            printPaths(p + "R", r, c-1);
        }
    }
}
