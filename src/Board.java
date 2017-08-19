//Pranay Patel
// imports the random method !! 
import java.util.Random;
public class Board {
	// Initializes variables that will later be used. 
	private final int size = 3;
	public int player1;
	public int player2;
	public int [][] board = new int [size][size];
	// creates a constructor. 
	public void Board(){
		// assigns values to variables and creates the tic tac toe board.
		player1 = 1;
		player2 = 2;
		for(int row =0; row <board.length; row++){
			for(int column = 0; column< board[row].length; column++){
				board[row][column] = 0;
			}
		}		
	}
	// this is another constructor that is used for mode2. Same thing except it assigns a value
	// to the middle of the board
	public void Board(int x1){
		player1 = 1;
		player2 = 2;
		for(int row =0; row <board.length; row++){
			for(int column = 0; column< board[row].length; column++){
				board[row][column] = 0;
			}
		}	
		board[1][1] = x1;
		
	}
	// method prints the board. not ever used except for when debugging to see what's going on
	public void showBoard(){
		for(int row = 0; row<board.length; row++ ){
			for(int column = 0; column<board[row].length; column++){
				System.out.print(board[row][column]);
			}
			System.out.println();
		}
		System.out.println();
	}
	// assigns a 1 to a random area in the double matrix aka our board. 
	public void player1move(){
		Random r = new Random();
		int x = r.nextInt(size);
		int y = r.nextInt(size);
		while(board[x][y] == 1 || board[x][y] ==2){
			x = r.nextInt(size);
			y = r.nextInt(size);
		}
		board[x][y] = 1;
		
	}
	// assigns a 2 to a random area in the double matrix; this is our player 2 !
	public void player2move(){
		Random r = new Random();
		int x = r.nextInt(size);
		int y = r.nextInt(size);
		while(board[x][y] == 1 || board[x][y] ==2){
			x = r.nextInt(size);
			y = r.nextInt(size);
		}
		board[x][y] = 2;	
	}
	// this is a method created specifically for mode3. basically, if there is not already a 
	// 1 in the middle of the board, player 2 will pick that spot his/her first turn.
	public boolean mode3(){
		boolean mode3 = false;
		if(board[1][1] != 1){
			board[1][1] = 2;
			mode3 = true;
		}
		return mode3;
		
	}
	// this actually plays the game. checks to see if the board is full nor not. 
	public boolean playGame(){
		boolean gameOver = true;
		for(int row =0; row <board.length; row++){
			for(int column = 0; column< board[row].length; column++){
				if(board[row][column] == 0){
					gameOver = false;
				}
			}
		}		
		return gameOver;
	}
	// statements to see if player one has won this thing or not 
	public boolean isGameOver(){
		 if( board [0][0]==board[1][0] && board[1][0] == board[2][0] && (board [0][0]==1 || board [0][0]==2))
             return true;
 else if( board [0][1]==board[1][1] && board[1][1] == board[2][1] && (board [0][1]== 1 || board [0][1]==2))
             return true;
 else if( board [0][2]==board[1][2] && board[1][2] == board[2][2] && (board [0][2]==1 || board [0][2]==2))
             return true;
 else if( board [0][0]==board[0][1] && board[0][1] == board[0][2] && (board [0][0]==1 || board [0][0]==2))
             return true;
 else if( board [1][0]==board[1][1] && board[1][1] == board[1][2] && (board [1][0]==1 || board [1][0]==2))
             return true;
 else if( board [2][0]==board[2][1] && board[2][1] == board[2][2] && (board [2][0]==1|| board [2][0]==2))
             return true;
 else if( board [0][0]==board[1][1] && board[1][1] == board[2][2] && (board [0][0]==1 || board [0][0]==2))
             return true;
 else if( board [2][0]==board[1][1] && board[1][1] == board[0][2] && (board [2][0]==1 || board [2][0]==2))
             return true;
 else
             return false;
		
		
	}
	// checks to see if player 1 won or not. this will be influential in our main method.
	public boolean checkIfWinner() {
   if( (board [0][0] == board[1][0] && board[1][0] == board[2][0]) && (board [0][0] == 1)){
               return true;
   }
   else if(( board [0][1]==board[1][1] && board[1][1] == board[2][1]) && (board [0][1]==1)){
               return true;
   }
   else if(( board [0][2]==board[1][2] && board[1][2] == board[2][2]) && (board [0][2]== 1)){
               return true;
   }
        
   else if((board [0][0]==board[0][1] && board[0][1] == board[0][2]) && (board [0][0]== 1)){
               return true;
   }
   else if((board [1][0]==board[1][1] && board[1][1] == board[1][2]) && (board [1][0]== 1)){
               return true;
   }
   else if((board [2][0]==board[2][1] && board[2][1] == board[2][2]) && (board [2][0]== 1)){
               return true;
   }
   else if(( board [0][0]==board[1][1] && board[1][1] == board[2][2]) && (board [0][0]== 1)){
               return true;
   }
   else if(( board [2][0]==board[1][1] && board[1][1] == board[0][2]) && (board [2][0]== 1))
               return true;
   else{
               return false;
   }
}
	// checks to see if it there is a tie. 
	public boolean checkIfTie() {
		if(checkIfWinner() == true){
			return false;
		}
	    for (int i = 0; i < 3; i++){
	        for (int j=0; j < 3; j++){
	            if(board [i][j]== 0){
	                return false;
	            }
	        }
	    }
	    return true;
	}
	
	

	
}
