import java.util.Scanner;

public class TicTacToe {
	
	private char[][] board;  

	public static char[][] board() {
			return new char[][]{{' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' '},
							 {'-', '-', '+', '-', '-', '-', '+', '-', '-'},
							 {' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' '},
							 {'-', '-', '+', '-', '-', '-', '+', '-', '-'},
							 {' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' '}};
		}
	}

	public TicTacToe() {

		board = new char[3][3];
		for (int count = 0; count < 3; count++) {
			for (int counter = 0; counter < 3; counter++) {
				board[count][counter] = '_';  
		}
	}
}

      public void displayBoard() {
        System.out.println("Board:");
        
        for (int i = 0; i < 3; i++) {
           
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " "); 
            }
            System.out.println();
        }
    }

 
    public boolean checkWin(char player) {
    
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

      
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }

     
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true; 
        }

        return false;
    }


    public boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '_') {
                    return false; 
                }
            }
        }
        return true;
    }

   
    public boolean makeMove(int row, int col, char player) {
        
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '_') {
            board[row][col] = player; 
            return true; 
        }
        return false;     }

   
    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        char currentPlayer = 'X';
        boolean gameOver = false;

        while (!gameOver) {

            displayBoard(); 
            System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();


            if (makeMove(row, col, currentPlayer)) {
                
                if (checkWin(currentPlayer)) {
                    displayBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameOver = true; 

                }
              
                else if (isDraw()) {
                    displayBoard();
                    System.out.println("It's a draw!");
                    gameOver = true; 
                }
                
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Invalid move, try again.");
            }
        }
}

  
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe(); 
        game.playGame(); 
	char[][] board = boards();
	Board.printBoard(board);

    }
}