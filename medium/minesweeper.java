class Solution {
    public char[][] updateBoard(char[][] board, int[] click) {
        int height = board.length;
        int width = board[0].length;
        int row = click[0];
        int col = click[1];
        
        if (board[row][col] == 'M') { // mine clicked
            board[row][col] = 'X';
        }
        else {
            int numMines = 0;
            for (int i = -1; i <= 1; i += 1) { // checks boxes above and below
                for (int j = -1; j <= 1; j += 1) { // checks boxes left and right
                    if (i == 0 && j == 0) { // if current square
                        continue;
                    }
                    int r = row + i;
                    int c = col + j;
                    // checks if out of bounds of board
                    if (r < 0 || r >= height || c < 0 || c < 0 || c >= width) { 
                        continue;
                    }
                    if (board[r][c] == 'M' || board[r][c] == 'X') {
                        numMines += 1; // counts number of mines surrounding square
                    }
                }
            }
            
            if (numMines > 0) { // means not a 'B'
                // convert int to char and sets square to that number 
                board[row][col] = (char)(numMines + '0'); 
            }
            else {
                board[row][col] = 'B'; // means a 'B'
                for (int i = -1; i <= 1; i += 1) { // checks boxes above and below
                    for (int j = -1; j <= 1; j += 1) {
                        if (i == 0 && j == 0) {
                            continue;
                        }
                        int r = row + i;
                        int c = col + j;
                        if (r < 0 || r >= height || c < 0 || c < 0 || c >= width) { 
                            continue;
                        }
                        if (board[r][c] == 'E') {
                            updateBoard(board, new int[] {r, c}); // recursion for surrounding squares
                        }
                    }
                }
            }
        }
        return board;
    }
}