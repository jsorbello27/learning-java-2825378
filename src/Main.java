import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "Is Jude cutest baby alive?";
        String choiceOne = "yes";
        String choiceTwo = "no";
        String choiceThree = "maybe";


        String correctAnswer = choiceOne;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println(choiceOne +"\n" +choiceTwo +"\n"  + choiceThree);

        // Have the user input an answer
        Scanner scanner = new Scanner(System.in);
        // Retrieve the user's input
        String input = scanner.next();



        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        if(correctAnswer.equals(input.toLowerCase())){
            System.out.println("Correct!");
        }else{
            System.out.println("Wrong Loser!");
        }
        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.

    }

}
