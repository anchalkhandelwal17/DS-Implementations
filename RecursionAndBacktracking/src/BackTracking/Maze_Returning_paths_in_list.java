package BackTracking;

import java.util.ArrayList;

public class Maze_Returning_paths_in_list {
    public static void main(String[] args){
        ArrayList<String> ans = returnPaths("", 3, 3);
        System.out.println(ans);
    }

    static ArrayList<String> returnPaths(String p, int r, int c){
        // base case
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(r > 0){
            list.addAll(returnPaths(p + "D", r-1, c));
        }
        if(c > 0){
            list.addAll(returnPaths(p + "R", r, c-1));
        }
        return list;
    }
}
