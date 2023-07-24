package BackTracking;

public class Maze_With_all_Paths {
    public static void main(String[] args){

        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        mazeAllPaths("", maze, 0, 0);
    }

    static void mazeAllPaths(String p, boolean[][] maze, int r, int c){
        // base case
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(maze[r][c] == false){
            return ;
        }

        maze[r][c] = false;

        if(r < maze.length-1){
            mazeAllPaths(p + "D", maze, r+1, c);
        }
        if(c < maze[0].length-1){
            mazeAllPaths(p + "R", maze, r, c+1);
        }
        if(r > 0){
            mazeAllPaths(p + "U", maze, r-1, c);
        }
        if(c > 0){
            mazeAllPaths(p + "L", maze, r, c-1);
        }

        // This is the line where the function will get over
        // so , before the function gets removed , also remove the changes made by that function

        maze[r][c] = true;
    }
}
