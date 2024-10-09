package lec7;

public class SudokuSolver {
    class Solution {
        public void solveSudoku(char[][] board) {
            helper(board,0,0);
        }

        public boolean helper(char[][] board,int row,int col)
        {
            if(col == board[0].length)
            {
                row++;
                col = 0;
            }

            if(row == board.length)
                return true;

            if(board[row][col] == '.')
            {
                for(char num = '1';num <= '9';num++)
                {
                    if(isVal(board,row,col,num))
                    {
                        board[row][col] = num;
                        if(helper(board,row,col + 1))
                            return true;
                        board[row][col] = '.';
                    }
                }
                return false;
            }
            return helper(board,row,col + 1);
        }

        public boolean isVal(char[][] board,int row,int col,char num)
        {
            for(int i = 0;i < 9;i++)
            {
                if(board[i][col] == num)
                    return false;
            }

            for(int i = 0;i < 9;i++)
            {
                if(board[row][i] == num)
                    return false;
            }
            int startRow = (row / 3) * 3;
            int startCol = (col / 3) * 3;
            for(int i = startRow;i < startRow + 3;i++)
            {
                for(int j = startCol;j < startCol + 3;j++)
                {
                    if(board[i][j] == num)
                        return false;
                }
            }
            return true;
        }
    }
}
