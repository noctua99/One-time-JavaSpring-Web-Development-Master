package chapter08.ch03;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {

            int j = i - 1;
            int target = arr[i];

            while (j >= 0 && target < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = target;
        }
    }

    public static void main(String[] args) {

        int[] arr = {50, 80, 70, 10, 60, 20, 40, 30};

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
