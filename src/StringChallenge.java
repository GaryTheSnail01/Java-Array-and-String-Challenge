import java.util.Scanner;

public class StringChallenge {
    public static String reverseSentence(String[] sen) {
        StringBuilder result = new StringBuilder();

        for (String word : sen) {
            StringBuilder reversedWord = new StringBuilder(word);

            result.append(reversedWord.reverse().append(" "));

        }

        return result.toString();
    }

    public static void main(String[] args) {
        String sentence;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        sentence = scanner.nextLine();

        String[] splitSentence = sentence.split(" ");
        String reversedSentence = reverseSentence(splitSentence);

        System.out.println("The sentence you entered in reverse is: " + reversedSentence);

    }

}
