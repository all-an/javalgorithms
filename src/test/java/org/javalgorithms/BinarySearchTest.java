package org.javalgorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinarySearchTest {

    @Test
    public void testExistsIsEmpty() {
        int[] ints = {0};
        assertTrue(BinarySearch.exists(ints, 0), "Should not return empty");
        int[] intsEmpty = new int[0];
        assertFalse(BinarySearch.exists(intsEmpty, 0), "Should return false for empty");
    }

    @Test
    public void testExistsIsEqualButNotFindOnUnorderedBinarySearchrray() {
        int[] ints = {-10, 70, -1, 0, 5, 10};
        assertFalse(BinarySearch.exists(ints, 70), "Should return false for 70 because array is unordered");
    }

    @Test
    public void testExistsWithExampleBinarySearchrray() {
        int[] ints = {-9, 14, 37, 102};
        assertTrue(BinarySearch.exists(ints, 102), "Should find 102");
        assertFalse(BinarySearch.exists(ints, 36), "Should not find 36");
    }

    @Test
    public void testExistsWithSingleElement() {
        int[] ints = {5};
        assertTrue(BinarySearch.exists(ints, 5), "Should find single element");
        assertFalse(BinarySearch.exists(ints, 3), "Should not find different element");
    }

    @Test
    public void testExistsWithEmptyBinarySearchrray() {
        int[] ints = {};
        assertFalse(BinarySearch.exists(ints, 1), "Should return false for empty array");
    }

    @Test
    public void testExistsBinarySearchtBoundaries() {
        int[] ints = {1, 3, 5, 7, 9};
        assertTrue(BinarySearch.exists(ints, 1), "Should find first element");
        assertTrue(BinarySearch.exists(ints, 9), "Should find last element");
        assertTrue(BinarySearch.exists(ints, 5), "Should find middle element");
    }

    @Test
    public void testExistsWithNegativeNumbers() {
        int[] ints = {-10, -5, -1, 0, 5, 10};
        assertTrue(BinarySearch.exists(ints, -5), "Should find negative number");
        assertTrue(BinarySearch.exists(ints, 0), "Should find zero");
        assertFalse(BinarySearch.exists(ints, -3), "Should not find non-existent negative");
    }

    @Test
    public void testExistsWithDuplicates() {
        int[] ints = {1, 2, 2, 2, 5};
        assertTrue(BinarySearch.exists(ints, 2), "Should find duplicated element");
        assertFalse(BinarySearch.exists(ints, 3), "Should not find non-existent element");
    }

    @Test
    public void testExistsWithLargeBinarySearchrray() {
        // Test with larger array to verify efficiency
        int[] ints = new int[1000];
        for (int i = 0; i < 1000; i++) {
            ints[i] = i * 2; // Even numbers: 0, 2, 4, 6, ...
        }
        assertTrue(BinarySearch.exists(ints, 500), "Should find element in large array");
        assertFalse(BinarySearch.exists(ints, 501), "Should not find odd number");
    }

}
