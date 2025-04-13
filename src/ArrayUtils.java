public class ArrayUtils {


    public static String reverseArray(int[] arr) {
        StringBuilder result = new StringBuilder();
        int arrLength = arr.length;

        for (int i = (arrLength - 1); i >= 0; i--) {
            result.append(arr[i]).append(" ");
        }

        return ("The numbers you entered in reverse are: " + result);
    }

    public static String findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < 5; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return ("The biggest number entered was: " + max + "\nThe smallest number entered was: " + min);
    }

    public static String findTotal(int[] arr) {
        int result = 0;

        for (int num : arr) {
            result += num;
        }

        return ("The total sum of all numbers is: " + result);
    }

    public static String findEvenNum(int[] arr) {
        for (int num : arr) {
            if (num % 2 == 0) {
                return ("You entered an even number!");
            }
        }

        return ("You did not enter an even number!");
    }
}
