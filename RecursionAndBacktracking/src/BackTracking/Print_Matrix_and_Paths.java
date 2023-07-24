package BackTracking;

import java.util.Arrays;

public class Print_Matrix_and_Paths {
    public static void main(String[] args){

        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] paths = new int[maze.length][maze[0].length];
        matrixAndpaths("", 0, 0, maze, paths, 1);
    }

    static void matrixAndpaths(String p, int r, int c, boolean[][] maze, int[][] paths, int path){
        // base case
        if(r == maze.length-1 && c == maze[0].length-1){
            paths[r][c] = path;

            for(int[] arr : paths){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(maze[r][c] == false){
            return;
        }

        maze[r][c] = false;
        paths[r][c] = path;

        if(r < maze.length-1){
            matrixAndpaths(p + "D", r+1, c, maze, paths, path+1);
        }
        if(c < maze[0].length-1){
            matrixAndpaths(p + "R", r, c+1, maze, paths, path+1);
        }
        if(r > 0){
            matrixAndpaths(p + "U", r-1, c, maze, paths, path+1);
        }
        if(c > 0){
            matrixAndpaths(p + "L", r, c-1, maze, paths, path+1);
        }
        maze[r][c] = true;
        paths[r][c] = 0;

    }
}
