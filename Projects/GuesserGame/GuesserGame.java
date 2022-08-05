import java.util.Scanner;
import java.util.Random; // Little feature Upadation/Modification for Random Guessing by guesser game

// Guesser Class
class Guesser {

    int guessNum;

    public int guessNumber() {
        // Modifying or Enhancing the Guesser Number code using Random class
        Random rand = new Random();
        // Logic part of the Guesser Number code
        guessNum = rand.nextInt(10) + 1;
        System.out.println("Guesser guess a number : "+guessNum+"\n");
        return guessNum;
    }
}

// Player Class
class Player {
    int pguessNum;

    public int guessNumber(int playerNum) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player "+playerNum+" Kindly, guess a number between 1 and 10");
        pguessNum = sc.nextInt();
        return pguessNum;
    }
    // Check and validate the player guess number is b/w 1 and 10
    public void validationMethod(int numToCheck, int playerNum) {
        if (numToCheck > 9 || numToCheck < 1) {
            System.out.println();
            System.out.println("Player "+playerNum+" has entered an invalid number \nKindly, enter a number between 1 and 10");
            System.out.println();
            return;        
        }
    }
}

// Umpire Class
class Umpire {

    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;


    //1. Collect number from Guesser
    public void collectNumFromGuesser() {
        Guesser guesser=new Guesser();
        numFromGuesser = guesser.guessNumber();
    }


    //2. Collect number from Player
    public void collectNumFromPlayer() {

        Player player1=new Player();
        Player player2=new Player();
        Player player3=new Player();

        numFromPlayer1 = player1.guessNumber(1);
       
        numFromPlayer2 = player2.guessNumber(2);
        
        numFromPlayer3 = player3.guessNumber(3);

        player1.validationMethod(numFromPlayer1, 1);
        player2.validationMethod(numFromPlayer2, 2);
        player3.validationMethod(numFromPlayer3, 3);
    }


    //3. Compare the collected numbers from player and guesser
    public void compare() {
        if (numFromGuesser == numFromPlayer1) {
            if (numFromGuesser==numFromPlayer1 && numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3) {
                System.out.println("Game tied, All three players are winners");
            }

            else if(numFromGuesser==numFromPlayer2){
                System.out.println("Player 1 and Player 2 are the winners");
            }
            else if(numFromGuesser==numFromPlayer3){
                System.out.println("Player 1 and Player 3 are the winners");
            }
            else{
                System.out.println("Player 1 is the winner");
            }
        } else if (numFromGuesser == numFromPlayer2) {
            if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 2 and Player 3 are the winners");
            } else {
                System.out.println("Player 2 is the winner");
            }
        } else if (numFromGuesser == numFromPlayer3) {
            System.out.println("Player 3 is the winner");
        } else {
            System.out.println("Game Lost! No one is the winner, try again");
        }
            
    }
}



// Driver Class
public class GuesserGame {
    public static void main(String[] args) {
        Umpire umpire=new Umpire();
        umpire.collectNumFromGuesser();
        umpire.collectNumFromPlayer();
        umpire.compare();
        System.out.println();
    }
}
