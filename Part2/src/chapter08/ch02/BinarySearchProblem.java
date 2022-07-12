package chapter08.ch02;

public class BinarySearchProblem {

    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};

        System.out.println(binarySearch(arr, 83));
        System.out.println(binarySearch(arr, 88));
    }
}
