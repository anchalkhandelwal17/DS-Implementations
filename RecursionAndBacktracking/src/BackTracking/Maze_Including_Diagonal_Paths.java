package BackTracking;

import java.util.ArrayList;

public class Maze_Including_Diagonal_Paths {
    public static void main(String[] args){
        ArrayList<String> ans = retPaths("", 3,3);
        System.out.println(ans);
    }

    static ArrayList<String> retPaths(String p, int r, int c){
        // base case
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r>1 && c>1){
            list.addAll(retPaths(p + "D", r-1, c-1));
        }
        if(r>1){
            list.addAll(retPaths(p + "V", r-1, c));
        }
        if(c>1){
            list.addAll(retPaths(p + "H", r, c-1));
        }
        return list;
    }
}
