package lec7;

import java.util.ArrayList;

public class RatInAMaze {
    static ArrayList<String> ans;
    public static void helper(int[][] board,int row,int col,String path,boolean[][] visited)
    {

        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] == 0 || visited[row][col])
            return;

        if(row == board.length - 1 && col == board[0].length - 1)
        {
            ans.add(path);
            return;
        }

        visited[row][col] = true;
        helper(board,row - 1,col,path + "U",visited);
        helper(board,row + 1,col,path + "D",visited);
        helper(board,row ,col - 1,path + "L",visited);
        helper(board,row ,col + 1,path + "R",visited);
        visited[row][col] = false;
    }

    public static void rat(int[][] board)
    {
        ans = new ArrayList<>();
        helper(board,0,0,"",new boolean[4][4]);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,0,0,0},{1,1,0,1},{1,1,0,1},{0,1,1,1}};
        rat(arr);
    }

}
