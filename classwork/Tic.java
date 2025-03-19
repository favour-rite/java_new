import java.util.Scanner;

/* public class Tic{
	 public static void main(String[] args) {
        



	}
	
	public char[][] TicTacToe() {

		char[][] gameBoard = {


			{'_','|','_','|','_'},
			{'_','|','_','|','_'},
			{' ','|',' ','|',' '}

    	};
		System.out.println(Arrays.deepToString(gameBoard));




	 public static void playerMoves(char[][] gameBoard,int number, String player){
        char character = ' ';

        if(player.equals("player")){
            character = 'X';
        }else
        if(player.equals("player1")){
            character = 'O';
        }
 
	public boolean checkWin(char player, char[][] gameBoard ) {


    		for(int count = 0; count <= 4; count+=2){
			if(gameBoard[count][0] = ' ' && gameBoard[count][1] !=  )
		}
       

	}
        
   
	public boolean makeMove(int row, int col, char player) {
        
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && gameBoard[row][col] == '_') {
            gameBoard[row][col] = player;
            return true; 
        }
        return false;     }

   
    public void playGame(char board) {
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

  
   

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   	
}

 */