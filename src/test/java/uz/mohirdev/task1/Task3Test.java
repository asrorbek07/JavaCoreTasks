package uz.mohirdev.task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task3Test {

    @Test
    public void testReverseArray() {
        // Test with regular array
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, Task3Answer.reverseArray(new int[]{1, 2, 3, 4, 5}));

        // Test with single element
        assertArrayEquals(new int[]{7}, Task3Answer.reverseArray(new int[]{7}));

        // Test with empty array
        assertArrayEquals(new int[]{}, Task3Answer.reverseArray(new int[]{}));

        // Test with null array
        assertArrayEquals(new int[]{}, Task3Answer.reverseArray(null));
    }

    @Test
    public void testFindMax() {
        // Test with regular array
        assertEquals(9, Task3Answer.findMax(new int[]{5, 3, 9, 1, 7}));

        // Test with negative numbers
        assertEquals(-1, Task3Answer.findMax(new int[]{-5, -3, -1, -10}));

        // Test with single element
        assertEquals(42, Task3Answer.findMax(new int[]{42}));

        // Test with duplicate max values
        assertEquals(8, Task3Answer.findMax(new int[]{8, 3, 8, 5}));
    }

    @Test
    public void testCountEvenNumbers() {
        // Test with mixed numbers
        assertEquals(3, Task3Answer.countEvenNumbers(new int[]{1, 2, 3, 4, 5, 6}));

        // Test with all even numbers
        assertEquals(4, Task3Answer.countEvenNumbers(new int[]{2, 4, 6, 8}));

        // Test with all odd numbers
        assertEquals(0, Task3Answer.countEvenNumbers(new int[]{1, 3, 5, 7}));

        // Test with empty array
        assertEquals(0, Task3Answer.countEvenNumbers(new int[]{}));

        // Test with null array
        assertEquals(0, Task3Answer.countEvenNumbers(null));

        // Test with zero (which is even)
        assertEquals(1, Task3Answer.countEvenNumbers(new int[]{0}));

        // Test with negative even numbers
        assertEquals(2, Task3Answer.countEvenNumbers(new int[]{-2, -4}));
    }

    @Test
    public void testMergeArrays() {
        // Test with regular arrays
        assertArrayEquals(
            new int[]{1, 2, 3, 4, 5}, 
            Task3Answer.mergeArrays(new int[]{1, 2, 3}, new int[]{4, 5})
        );

        // Test with empty first array
        assertArrayEquals(
            new int[]{4, 5, 6}, 
            Task3Answer.mergeArrays(new int[]{}, new int[]{4, 5, 6})
        );

        // Test with empty second array
        assertArrayEquals(
            new int[]{1, 2, 3}, 
            Task3Answer.mergeArrays(new int[]{1, 2, 3}, new int[]{})
        );

        // Test with both empty arrays
        assertArrayEquals(
            new int[]{}, 
            Task3Answer.mergeArrays(new int[]{}, new int[]{})
        );

        // Test with null arrays
        assertArrayEquals(new int[]{}, Task3Answer.mergeArrays(null, null));
        assertArrayEquals(new int[]{1, 2}, Task3Answer.mergeArrays(null, new int[]{1, 2}));
        assertArrayEquals(new int[]{3, 4}, Task3Answer.mergeArrays(new int[]{3, 4}, null));
    }

    @Test
    public void testBubbleSort() {
        // Test with unsorted array
        assertArrayEquals(
            new int[]{1, 2, 3, 5, 8}, 
            Task3Answer.bubbleSort(new int[]{5, 2, 8, 1, 3})
        );

        // Test with already sorted array
        assertArrayEquals(
            new int[]{1, 2, 3, 4, 5}, 
            Task3Answer.bubbleSort(new int[]{1, 2, 3, 4, 5})
        );

        // Test with reverse sorted array
        assertArrayEquals(
            new int[]{1, 2, 3, 4, 5}, 
            Task3Answer.bubbleSort(new int[]{5, 4, 3, 2, 1})
        );

        // Test with duplicate elements
        assertArrayEquals(
            new int[]{1, 2, 2, 3, 4, 5, 5}, 
            Task3Answer.bubbleSort(new int[]{5, 2, 4, 2, 1, 5, 3})
        );

        // Test with empty array
        assertArrayEquals(new int[]{}, Task3Answer.bubbleSort(new int[]{}));

        // Test with null array
        assertNull(Task3Answer.bubbleSort(null));

        // Test with single element
        assertArrayEquals(new int[]{7}, Task3Answer.bubbleSort(new int[]{7}));
    }

    @Test
    public void testSumArray() {
        // Test with positive numbers
        assertEquals(15, Task3Answer.sumArray(new int[]{1, 2, 3, 4, 5}));

        // Test with negative numbers
        assertEquals(-10, Task3Answer.sumArray(new int[]{-1, -2, -3, -4}));

        // Test with mixed numbers
        assertEquals(5, Task3Answer.sumArray(new int[]{-5, 10}));

        // Test with empty array
        assertEquals(0, Task3Answer.sumArray(new int[]{}));

        // Test with null array
        assertEquals(0, Task3Answer.sumArray(null));

        // Test with zero
        assertEquals(0, Task3Answer.sumArray(new int[]{0}));
    }

    @Test
    public void testAverageArray() {
        // Test with integers that divide evenly
        assertEquals(3.0, Task3Answer.averageArray(new int[]{1, 2, 3, 4, 5}));

        // Test with integers that don't divide evenly
        assertEquals(2.5, Task3Answer.averageArray(new int[]{1, 2, 3, 4}));

        // Test with negative numbers
        assertEquals(-2.5, Task3Answer.averageArray(new int[]{-1, -2, -3, -4}));

        // Test with mixed numbers
        assertEquals(2.5, Task3Answer.averageArray(new int[]{-5, 0, 5, 10}));

        // Test with single element
        assertEquals(7.0, Task3Answer.averageArray(new int[]{7}));
    }
}
