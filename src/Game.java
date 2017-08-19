// Pranay Patel
public class Game {
	public static void main(String [] args){
		// creates an object mode1 for the game.
		Board mode1 = new Board();
		// assigns an intial value of 0 to the count of wins, loses, and ties. 
		int win = 0;
		int lose= 0;
		int tie=  0;
		// mode 1 starts. for loop for the 1000 games. 
		for(int i = 0; i<1000; i++){
			mode1.Board();
			// each game is played as long as play game returns a false. 
		while(mode1.playGame() == false){
			// moves a value for player 1
			mode1.player1move();
			// checks to see if game is still on
			if(mode1.isGameOver() == true){
				break;
			}
			// if game is on, then player 2 moves and ends the game if after player 2 the game
			// ends via a win, lose, or tie. 
			if(mode1.playGame() == false){
				mode1.player2move();
				if(mode1.isGameOver() == true){
					break;
				}
			}
			}
		// conditional statements to determine if there was win,lose, or tie and keeps a count.
		if(mode1.checkIfWinner() == true && mode1.checkIfTie() == false){
			win++;
		}
		else if(mode1.checkIfTie() == true && mode1.checkIfWinner() == false){
			tie++;
		}
		else{
			lose++;
		}
		}
		// print statement for mode1.
		System.out.println("For mode 1: " + " win: " + win + " lose: " + lose + " tie: " + tie);
		// mode 2 starts. resets win lose and tie counts to 0
		Board mode2 = new Board();
		 win = 0;
		 lose= 0;
		 tie=  0;
		 // 1000 game for loop.
		for(int i = 0; i<1000; i++){
			// instead of normal constructor, another constructor is used.
			// this will put the first move in the middle always.
			mode2.Board(1);
			// player 2 moves after this.
			mode2.player2move();
			// conditional statement now throws game into a loop until it ends.
			// everything else is the same as mode1.
		while(mode2.playGame() == false){
			mode2.player1move();
			if(mode2.isGameOver() == true){
				break;
			}
			if(mode2.playGame() == false){
				mode2.player2move();
				if(mode2.isGameOver() == true){
					break;
				}
			}
			}
		if(mode2.checkIfWinner() == true && mode2.checkIfTie() == false){
			win++;
		}
		else if(mode2.checkIfTie() == true && mode2.checkIfWinner() == false){
			tie++;
		}
		else{
			lose++;
			
		}
		}
		System.out.println("For mode 2: " + " win: " + win + " lose: " + lose + " tie: " + tie);
		// mode3, the constructors are reset.
		 win = 0;
		 lose= 0;
		 tie=  0;
		 // creates an object for mode3
		Board mode3 = new Board();
		for(int i = 0; i<1000; i++){
			// moves player one but then if the mode3 method returns a true aka middle space is empty,
			// player 2 moves there.
			mode3.Board();
			mode3.player1move();
			if(mode3.mode3() == true){
				mode3.mode3();
			}
			// if player one selects the middle space his first turn, player two just moves somewhwhere else
			else{
				mode3.player2move();
			}
			// while loop starts. everything else is the exact same pretty much 
		while(mode3.playGame() == false){
			mode3.player1move();
			if(mode3.isGameOver() == true){
				break;
			}
			if(mode3.playGame() == false){
				mode3.player2move();
				if(mode3.isGameOver() == true){
					break;
				}
			}
			}
		if(mode3.checkIfWinner() == true && mode3.checkIfTie() == false){
			win++;
			
		}
		else if(mode3.checkIfTie() == true && mode3.checkIfWinner() == false){
			tie++;
			
		}
		else{
			lose++;
			
		}
		}
		// prints everything 
		System.out.println("For mode 3: " + " win: " + win + " lose: " + lose + " tie: " + tie);
		
	}
	}
