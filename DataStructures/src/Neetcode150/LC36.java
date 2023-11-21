package Neetcode150;

public class LC36 {
    public boolean isValidSudoku(char[][] board) {
        // check horizontal lines
        for(int row = 0; row < 9; row++) {
            boolean[] visited = new boolean[10];
            for(int col = 0; col < 9; col++) {
                if(board[row][col] == '.') {
                    continue;
                }
                if( visited[ Character.getNumericValue(board[row][col]) ]) return false;
                visited[ Character.getNumericValue(board[row][col]) ] = true;
            }
        }

        // check vertical lines
        for(int col = 0; col < 9; col++) {
            boolean[] visited = new boolean[10];
            for(int row = 0; row < 9; row++) {
                if(board[row][col] == '.') {
                    continue;
                }
                if( visited[ Character.getNumericValue(board[row][col]) ]) return false;
                visited[ Character.getNumericValue(board[row][col]) ] = true;
            }
        }

        // check 3x3 boxes
        boolean[][] visited = new boolean[9][10];
        for(int row = 0; row < 9; row++) {
            for(int col = 0; col < 9; col++) {
                if(board[row][col] == '.') continue;
                int boxkey = 3*(row/3) + col/3;
                if( visited[ boxkey ][ Character.getNumericValue(board[row][col]) ]) return false;
                visited[ boxkey ][ Character.getNumericValue(board[row][col]) ] = true;
            }
        }
        return true;
    }
}
