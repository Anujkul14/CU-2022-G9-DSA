package lec6;

public class NQueens {
    public static void nQueens(int[][] board,int row)
    {
        if(row == board.length)
        {
            printBoard(board);
            return;
        }
        for(int col = 0;col < board[0].length;col++)
        {
            if(isSafe(board,row,col))
            {
                board[row][col] = 1;
                nQueens(board,row + 1);
                board[row][col] = 0;
            }
        }
    }

    public static boolean isSafe(int[][] board,int row,int col)
    {
        //check vertically
        for(int r = row; r >= 0;r--)
        {
            if(board[r][col] == 1)
                return false;
        }
        //check positive diagonal
        int r = row;
        int c = col;
        while(r >= 0 && c >= 0)
        {
            if(board[r][col] == 1)
                return false;
            r--;
            c--;
        }
        //check negative diagonal
        r = row;
        c = col;
        while(r >= 0 && c < board[0].length)
        {
            if(board[r][col] == 1)
                return false;
            r--;
            c++;
        }
        return true;
    }

    public static void printBoard(int[][] board)
    {
        System.out.println("----------------------------");
        for(int i = 0;i < board.length;i++)
        {
            for(int j = 0;j < board[0].length;j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        nQueens(new int[4][4],0);
    }
}
