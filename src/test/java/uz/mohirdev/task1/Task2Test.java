package uz.mohirdev.task1;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class Task2Test {

    @Test
    public void testMultiplicationTable() {
        // Test with positive number
        List<String> result = Task2Answer.multiplicationTable(5);
        assertEquals(10, result.size());
        assertEquals("5 x 1 = 5", result.get(0));
        assertEquals("5 x 10 = 50", result.get(9));

        // Test with negative number
        result = Task2Answer.multiplicationTable(-3);
        assertEquals(1, result.size());
        assertEquals("Son musbat bo'lishi kerak.", result.get(0));

        // Test with zero
        result = Task2Answer.multiplicationTable(0);
        assertEquals(1, result.size());
        assertEquals("Son musbat bo'lishi kerak.", result.get(0));
    }

    @Test
    public void testReverseNumber() {
        // Test with regular number
        assertEquals(321, Task2Answer.reverseNumber(123));

        // Test with trailing zeros
        assertEquals(65, Task2Answer.reverseNumber(5600));

        // Test with single digit
        assertEquals(7, Task2Answer.reverseNumber(7));

        // Test with zero
        assertEquals(0, Task2Answer.reverseNumber(0));

        // Test with negative number
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Task2Answer.reverseNumber(-123);
        });
        assertEquals("Musbat son kiriting.", exception.getMessage());
    }

    @Test
    public void testEvenOrOdd() {
        // Test with even numbers
        assertEquals("Juft son", Task2Answer.evenOrOdd(2));
        assertEquals("Juft son", Task2Answer.evenOrOdd(100));
        assertEquals("Juft son", Task2Answer.evenOrOdd(0));
        assertEquals("Juft son", Task2Answer.evenOrOdd(-4));

        // Test with odd numbers
        assertEquals("Toq son", Task2Answer.evenOrOdd(1));
        assertEquals("Toq son", Task2Answer.evenOrOdd(99));
        assertEquals("Toq son", Task2Answer.evenOrOdd(-3));
    }

    @Test
    public void testFibonacci() {
        // Test with various limits
        assertEquals("1 1 2 3 5 8 13", Task2Answer.fibonacci(13));
        assertEquals("1 1 2 3 5 8 13 21 34", Task2Answer.fibonacci(34));
        assertEquals("1", Task2Answer.fibonacci(1));

        // Test with invalid inputs
        assertEquals("", Task2Answer.fibonacci(0));
        assertEquals("", Task2Answer.fibonacci(-5));
    }

    @Test
    public void testGradeToText() {
        // Test with valid grades
        assertEquals("Juda yomon", Task2Answer.gradeToText(1));
        assertEquals("Yomon", Task2Answer.gradeToText(2));
        assertEquals("Qoniqarli", Task2Answer.gradeToText(3));
        assertEquals("Yaxshi", Task2Answer.gradeToText(4));
        assertEquals("A'lo", Task2Answer.gradeToText(5));

        // Test with invalid grades
        assertEquals("Noto'g'ri baho", Task2Answer.gradeToText(0));
        assertEquals("Noto'g'ri baho", Task2Answer.gradeToText(6));
        assertEquals("Noto'g'ri baho", Task2Answer.gradeToText(-1));
    }

    @Test
    public void testMonthToSeason() {
        // Test winter months
        assertEquals("Qish", Task2Answer.monthToSeason(12));
        assertEquals("Qish", Task2Answer.monthToSeason(1));
        assertEquals("Qish", Task2Answer.monthToSeason(2));

        // Test spring months
        assertEquals("Bahor", Task2Answer.monthToSeason(3));
        assertEquals("Bahor", Task2Answer.monthToSeason(4));
        assertEquals("Bahor", Task2Answer.monthToSeason(5));

        // Test summer months
        assertEquals("Yoz", Task2Answer.monthToSeason(6));
        assertEquals("Yoz", Task2Answer.monthToSeason(7));
        assertEquals("Yoz", Task2Answer.monthToSeason(8));

        // Test autumn months
        assertEquals("Kuz", Task2Answer.monthToSeason(9));
        assertEquals("Kuz", Task2Answer.monthToSeason(10));
        assertEquals("Kuz", Task2Answer.monthToSeason(11));

        // Test invalid months
        assertEquals("Noto'g'ri oy raqami", Task2Answer.monthToSeason(0));
        assertEquals("Noto'g'ri oy raqami", Task2Answer.monthToSeason(13));
        assertEquals("Noto'g'ri oy raqami", Task2Answer.monthToSeason(-1));
    }

    @Test
    public void testEvaluateGrade() {
        // Test failing grade
        assertEquals("Imtihondan o'tmadi", Task2Answer.evaluateGrade(0));
        assertEquals("Imtihondan o'tmadi", Task2Answer.evaluateGrade(25));
        assertEquals("Imtihondan o'tmadi", Task2Answer.evaluateGrade(49));

        // Test satisfactory grade
        assertEquals("Qoniqarli", Task2Answer.evaluateGrade(50));
        assertEquals("Qoniqarli", Task2Answer.evaluateGrade(60));
        assertEquals("Qoniqarli", Task2Answer.evaluateGrade(69));

        // Test good grade
        assertEquals("Yaxshi", Task2Answer.evaluateGrade(70));
        assertEquals("Yaxshi", Task2Answer.evaluateGrade(80));
        assertEquals("Yaxshi", Task2Answer.evaluateGrade(89));

        // Test excellent grade
        assertEquals("A'lo", Task2Answer.evaluateGrade(90));
        assertEquals("A'lo", Task2Answer.evaluateGrade(95));
        assertEquals("A'lo", Task2Answer.evaluateGrade(100));

        // Test invalid percentages
        assertEquals("Noto'g'ri foiz", Task2Answer.evaluateGrade(-1));
        assertEquals("Noto'g'ri foiz", Task2Answer.evaluateGrade(101));
    }

    @Test
    public void testCheckSign() {
        // Test positive numbers
        assertEquals("Musbat son", Task2Answer.checkSign(1));
        assertEquals("Musbat son", Task2Answer.checkSign(100));
        assertEquals("Musbat son", Task2Answer.checkSign(Integer.MAX_VALUE));

        // Test negative numbers
        assertEquals("Manfiy son", Task2Answer.checkSign(-1));
        assertEquals("Manfiy son", Task2Answer.checkSign(-100));
        assertEquals("Manfiy son", Task2Answer.checkSign(Integer.MIN_VALUE));

        // Test zero
        assertEquals("Son nolga teng", Task2Answer.checkSign(0));
    }
}
