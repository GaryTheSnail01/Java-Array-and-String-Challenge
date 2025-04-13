import java.util.Scanner;

public class ArrayChallenge {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("The console will prompt you to enter 5 numbers...");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println(ArrayUtils.reverseArray(numbers));
        System.out.println(ArrayUtils.findMinMax(numbers));
        System.out.println(ArrayUtils.findEvenNum(numbers));
        System.out.println(ArrayUtils.findTotal(numbers));

    }
}