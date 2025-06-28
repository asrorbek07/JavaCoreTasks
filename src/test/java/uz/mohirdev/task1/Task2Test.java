package uz.mohirdev.task1;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class Task2Test {

    @Test
    public void testMultiplicationTable() {
        // Test with positive number
        List<String> result = Task2.multiplicationTable(5);
        assertEquals(10, result.size());
        assertEquals("5 x 1 = 5", result.get(0));
        assertEquals("5 x 10 = 50", result.get(9));
        
        // Test with negative number
        result = Task2.multiplicationTable(-3);
        assertEquals(1, result.size());
        assertEquals("Son musbat bo'lishi kerak.", result.get(0));
        
        // Test with zero
        result = Task2.multiplicationTable(0);
        assertEquals(1, result.size());
        assertEquals("Son musbat bo'lishi kerak.", result.get(0));
    }

    @Test
    public void testReverseNumber() {
        // Test with regular number
        assertEquals(321, Task2.reverseNumber(123));
        
        // Test with trailing zeros
        assertEquals(65, Task2.reverseNumber(5600));
        
        // Test with single digit
        assertEquals(7, Task2.reverseNumber(7));
        
        // Test with zero
        assertEquals(0, Task2.reverseNumber(0));
        
        // Test with negative number
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Task2.reverseNumber(-123);
        });
        assertEquals("Musbat son kiriting.", exception.getMessage());
    }

    @Test
    public void testEvenOrOdd() {
        // Test with even numbers
        assertEquals("Juft son", Task2.evenOrOdd(2));
        assertEquals("Juft son", Task2.evenOrOdd(100));
        assertEquals("Juft son", Task2.evenOrOdd(0));
        assertEquals("Juft son", Task2.evenOrOdd(-4));
        
        // Test with odd numbers
        assertEquals("Toq son", Task2.evenOrOdd(1));
        assertEquals("Toq son", Task2.evenOrOdd(99));
        assertEquals("Toq son", Task2.evenOrOdd(-3));
    }

    @Test
    public void testFibonacci() {
        // Test with various limits
        assertEquals("1 1 2 3 5 8 13", Task2.fibonacci(13));
        assertEquals("1 1 2 3 5 8 13 21 34", Task2.fibonacci(34));
        assertEquals("1", Task2.fibonacci(1));
        
        // Test with invalid inputs
        assertEquals("", Task2.fibonacci(0));
        assertEquals("", Task2.fibonacci(-5));
    }

    @Test
    public void testGradeToText() {
        // Test with valid grades
        assertEquals("Juda yomon", Task2.gradeToText(1));
        assertEquals("Yomon", Task2.gradeToText(2));
        assertEquals("Qoniqarli", Task2.gradeToText(3));
        assertEquals("Yaxshi", Task2.gradeToText(4));
        assertEquals("A'lo", Task2.gradeToText(5));
        
        // Test with invalid grades
        assertEquals("Noto'g'ri baho", Task2.gradeToText(0));
        assertEquals("Noto'g'ri baho", Task2.gradeToText(6));
        assertEquals("Noto'g'ri baho", Task2.gradeToText(-1));
    }

    @Test
    public void testMonthToSeason() {
        // Test winter months
        assertEquals("Qish", Task2.monthToSeason(12));
        assertEquals("Qish", Task2.monthToSeason(1));
        assertEquals("Qish", Task2.monthToSeason(2));
        
        // Test spring months
        assertEquals("Bahor", Task2.monthToSeason(3));
        assertEquals("Bahor", Task2.monthToSeason(4));
        assertEquals("Bahor", Task2.monthToSeason(5));
        
        // Test summer months
        assertEquals("Yoz", Task2.monthToSeason(6));
        assertEquals("Yoz", Task2.monthToSeason(7));
        assertEquals("Yoz", Task2.monthToSeason(8));
        
        // Test autumn months
        assertEquals("Kuz", Task2.monthToSeason(9));
        assertEquals("Kuz", Task2.monthToSeason(10));
        assertEquals("Kuz", Task2.monthToSeason(11));
        
        // Test invalid months
        assertEquals("Noto'g'ri oy raqami", Task2.monthToSeason(0));
        assertEquals("Noto'g'ri oy raqami", Task2.monthToSeason(13));
        assertEquals("Noto'g'ri oy raqami", Task2.monthToSeason(-1));
    }

    @Test
    public void testEvaluateGrade() {
        // Test failing grade
        assertEquals("Imtihondan o'tmadi", Task2.evaluateGrade(0));
        assertEquals("Imtihondan o'tmadi", Task2.evaluateGrade(25));
        assertEquals("Imtihondan o'tmadi", Task2.evaluateGrade(49));
        
        // Test satisfactory grade
        assertEquals("Qoniqarli", Task2.evaluateGrade(50));
        assertEquals("Qoniqarli", Task2.evaluateGrade(60));
        assertEquals("Qoniqarli", Task2.evaluateGrade(69));
        
        // Test good grade
        assertEquals("Yaxshi", Task2.evaluateGrade(70));
        assertEquals("Yaxshi", Task2.evaluateGrade(80));
        assertEquals("Yaxshi", Task2.evaluateGrade(89));
        
        // Test excellent grade
        assertEquals("A'lo", Task2.evaluateGrade(90));
        assertEquals("A'lo", Task2.evaluateGrade(95));
        assertEquals("A'lo", Task2.evaluateGrade(100));
        
        // Test invalid percentages
        assertEquals("Noto'g'ri foiz", Task2.evaluateGrade(-1));
        assertEquals("Noto'g'ri foiz", Task2.evaluateGrade(101));
    }

    @Test
    public void testCheckSign() {
        // Test positive numbers
        assertEquals("Musbat son", Task2.checkSign(1));
        assertEquals("Musbat son", Task2.checkSign(100));
        assertEquals("Musbat son", Task2.checkSign(Integer.MAX_VALUE));
        
        // Test negative numbers
        assertEquals("Manfiy son", Task2.checkSign(-1));
        assertEquals("Manfiy son", Task2.checkSign(-100));
        assertEquals("Manfiy son", Task2.checkSign(Integer.MIN_VALUE));
        
        // Test zero
        assertEquals("Son nolga teng", Task2.checkSign(0));
    }
}