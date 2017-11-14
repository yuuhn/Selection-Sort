package basepackage;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            int minId = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minId]) {
                    minId = j;
                }
            }

            if (i != minId) {
                int minValue = arr[minId];
                arr[minId] = arr[i];
                arr[i] = minValue;
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        // int[] inArr = new int[] {11, 5, 3, 5, 7, 15, 8, 6};

        Scanner sc = new Scanner(System.in);
        String arrLine = sc.nextLine();
        String[] numbers = arrLine.split(" ");
        int[] inArr = new int[numbers.length];

        for (int i = 0; i < inArr.length; i++) {
            inArr[i] = Integer.parseInt(numbers[i]);
        }

        int[] sortedArr = selectionSort(inArr);
        System.out.println(Arrays.toString(sortedArr));
    }
}
