import java.util.Scanner;

public class StringChallenge {

    public static void main(String[] args) {
        StringBuilder sentence;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        sentence = new StringBuilder(scanner.nextLine());

        System.out.println("The sentence you entered in reverse is: " + sentence.reverse());

    }

}
