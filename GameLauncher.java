import java.util.Scanner;
class Guesser {

    int guessNumber;
    // Method to get input from guesser
    public int guesserNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello Guesser!. Kindly, enter the number that you need to tell it to the Umpire. Range: 1-10");
        guessNumber = sc.nextInt();
        if(guessNumber>10) {
            System.out.println("Error!. Restart the game and enter number between 1-10");
        }
        return guessNumber;
    }
}

class Player {
    int playerNumber;
    // Method to get input from Player
    public int playerGuessedNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello Player! Kindly Guess the number in between range of 1 - 10:");
        playerNumber = sc.nextInt();
        return playerNumber;
    }
}

class Umpire {
    int numberFromGuesser;
    int numberFromPlayer1;
    int numberFromPlayer2;
    int numberFromPlayer3;
    int numberFromPlayer4;
    int numberFromPlayer5;

    public void guesserNumberCollector() {
        Guesser g = new Guesser();
        numberFromGuesser = g.guesserNumber();
    }
    public void playerNumberCollector() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Player p4 = new Player();
        Player p5 = new Player();
        numberFromPlayer1 = p1.playerGuessedNumber();
        numberFromPlayer2 = p2.playerGuessedNumber();
        numberFromPlayer3 = p3.playerGuessedNumber();
        numberFromPlayer4 = p4.playerGuessedNumber();
        numberFromPlayer5 = p5.playerGuessedNumber();
    }
    public void compare() {
        if(numberFromGuesser == numberFromPlayer1) {
            if(numberFromGuesser == numberFromPlayer2 && numberFromGuesser == numberFromPlayer3 && numberFromGuesser == numberFromPlayer4 && numberFromGuesser == numberFromPlayer5 ) {
                System.out.println("Game was tied as all the Players guessed the number correctly..Congratulations");
            } else if(numberFromGuesser == numberFromPlayer2) {
                System.out.println("Player 1 and Player 2 won the game!...Congratulations");
            } else if(numberFromGuesser == numberFromPlayer3) {
                System.out.println("Player 1 and Player 3 won the game!..Congratulations");
            } else if(numberFromGuesser == numberFromPlayer4) {
                System.out.println("Player 1 and Player 4 won the game!...Congratulations");
            } else if(numberFromGuesser == numberFromPlayer5) {
                System.out.println("Player 1 and Player 5 won the game!..Congratulations");
            } else {
                System.out.println("Player 1 won the Game!... Congratulations ");
            }
        } else if(numberFromGuesser == numberFromPlayer2) {
            if(numberFromGuesser == numberFromPlayer3 && numberFromGuesser == numberFromPlayer4 && numberFromGuesser == numberFromPlayer5) {
                System.out.println("Game was tied among the Players 2,3,4,5 guessed the number correctly..Congratulations");
            } else if(numberFromGuesser == numberFromPlayer3) {
                System.out.println("Player 2 and Player 3 won the game!...Congratulations");
            } else if(numberFromGuesser == numberFromPlayer4) {
                System.out.println("Player 2 and Player 4 won the game!..Congratulations");
            } else if(numberFromGuesser == numberFromPlayer5) {
                System.out.println("Player 2 and Player 5 won the game!...Congratulations");
            } else {
                System.out.println("Player 2 won the Game!... Congratulations ");
            }
        } else if(numberFromGuesser == numberFromPlayer3) {
            if(numberFromGuesser == numberFromPlayer4 && numberFromGuesser == numberFromPlayer5) {
                System.out.println("Game was tied among the Players 3,4,5 guessed the number correctly..Congratulations");
            } else if(numberFromGuesser == numberFromPlayer4) {
                System.out.println("Player 3 and Player 4 won the game!...Congratulations");
            } else if(numberFromGuesser == numberFromPlayer5) {
                System.out.println("Player 3 and Player 5 won the game!..Congratulations");
            } else {
                System.out.println("Player 3 won the Game!... Congratulations ");
            }
        } else if(numberFromGuesser == numberFromPlayer4) {
            if(numberFromGuesser == numberFromPlayer5) {
                System.out.println("Game was tied among the Players 4,5 guessed the number correctly..Congratulations");
            } else {
                System.out.println("Player 4 won the Game!... Congratulations ");
            }
        } else if(numberFromGuesser == numberFromPlayer5) {
            System.out.println("Player 5 won the Game!.. Congratulations");
        } else {
            System.out.println("No one won the Game. Please try again. Thank you!");
        }
    }
}
public class GameLauncher {
    public static void main(String[] args) {
        Umpire ump = new Umpire();
        ump.guesserNumberCollector();
        ump.playerNumberCollector();
        ump.compare();
    }
}