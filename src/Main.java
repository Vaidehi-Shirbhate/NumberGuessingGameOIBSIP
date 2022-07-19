import java.util.Random;
import java.util.Scanner;
class Game {
    int randInt,userInt,noOfGuesses=0;
    public Game(){
        Random rand = new Random();
        randInt = rand.nextInt(101);
    }
    public void takeUserInput(){
        Scanner gameInput = new Scanner(System.in);
        System.out.print("Guess any number (0 to 100) : ");
        userInt = gameInput.nextInt();
    }
    public void isCorrectNumber(){
        if (userInt>randInt){
            System.out.println("\t The number is too HIGH ");
        }
        else if (userInt<randInt){
            System.out.println("\t The number is too LOW ");
        }
        else if (userInt==randInt){
            System.out.println("\n\t You Win!!");
        }
    }
    public void setnoOfGuesses(int guess){
        noOfGuesses = guess;
    }
    public int getnoOfGuesses(){
        return noOfGuesses;
    }
}
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        do {
            game.takeUserInput();
            if (game.userInt<0||game.userInt>100){
                System.out.println("\t Number out of range !\n Try Again.\n");
                continue;
            }
            game.setnoOfGuesses(++game.noOfGuesses);
            game.isCorrectNumber();
        }
        while (game.userInt!=game.randInt);
        System.out.println("\tNumber of guesses : "+game.getnoOfGuesses());
        System.out.println("\tYour score is "+((11-game.getnoOfGuesses())*10)+" out of 100");
    }
}

