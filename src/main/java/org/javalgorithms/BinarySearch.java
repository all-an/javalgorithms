package org.javalgorithms;

public class BinarySearch {

    /**
     * Checks if a value exists in a sorted integer array using binary search.
     * Time complexity: O(log n)
     * Space complexity: O(1)
     *
     * @param ints sorted array of integers in ascending order
     * @param k the value to search for
     * @return true if k exists in the array, false otherwise
     */
    static boolean exists(int[] ints, int k) {
        if (isEmpty(ints)) {
            return false;
        }

        int left = 0;
        int right = ints.length - 1;

        while (left <= right) {
            int mid = calculateMidPoint(left, right);
            int midValue = ints[mid];

            if (isEqual(midValue, k)) {
                return true;
            }

            if (isLessThan(midValue, k)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    private static int calculateMidPoint(int left, int right) {
        return left + (right - left) / 2;
    }

    private static boolean isEmpty(int[] ints) {
        return ints.length == 0;
    }

    private static boolean isEqual(int a, int b) {
        return a == b;
    }

    private static boolean isLessThan(int a, int b) {
        return a < b;
    }

    public static void main(String[] args) {
        int[] ints = {-10, 70, -1, 0, 5, 10};
        System.out.println(BinarySearch.exists(ints, 70));
    }

}
