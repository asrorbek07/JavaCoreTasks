package uz.mohirdev.task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task1Test {

    @Test
    public void testCalculateDistance() {
        assertEquals(5.830951894845301, Task1.calculateDistance(2, 3, 5, 8), 0.000001);
        assertEquals(10.44030650891055, Task1.calculateDistance(-3, 7, 1, -2), 0.000001);
        assertEquals(0.0, Task1.calculateDistance(0, 0, 0, 0), 0.0);
    }

    @Test
    public void testCalculateCircleArea() {
        assertEquals(78.53981633974483, Task1.calculateCircleArea(5), 0.000001);
        assertEquals(314.1592653589793, Task1.calculateCircleArea(10), 0.000001);
        assertEquals(0.0, Task1.calculateCircleArea(0), 0.0);
    }

    @Test
    public void testCalculateBMI() {
        assertEquals(22.03856749311295, Task1.calculateBMI(60, 1.65), 0.000001);
        assertEquals(27.777777777777775, Task1.calculateBMI(90, 1.8), 0.000001);
        assertEquals(17.5, Task1.calculateBMI(70, 2.0), 0.000001);
    }

    @Test
    public void testIsValidPassword() {
        assertTrue(Task1.isValidPassword("Abcd123%"));
        assertFalse(Task1.isValidPassword("asdfg%123"));
        assertTrue(Task1.isValidPassword("Password1@"));
        assertFalse(Task1.isValidPassword("onlylowercase1"));
        assertFalse(Task1.isValidPassword("ONLYUPPERCASE1"));
        assertFalse(Task1.isValidPassword("NoDigits!"));
    }

    @Test
    public void testReverseString() {
        assertEquals("!oynud molaS", Task1.reverseString("Salom dunyo!"));
        assertEquals("54321", Task1.reverseString("12345"));
        assertEquals("", Task1.reverseString(""));
    }

    @Test
    public void testCheckBooleans() {
        assertEquals("AND: false, OR: true", Task1.checkBooleans(true, false));
        assertEquals("AND: false, OR: true", Task1.checkBooleans(false, true));
        assertEquals("AND: true, OR: true", Task1.checkBooleans(true, true));
        assertEquals("AND: false, OR: false", Task1.checkBooleans(false, false));
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0, Task1.fahrenheitToCelsius(32), 0.0001);
        assertEquals(20.0, Task1.fahrenheitToCelsius(68), 0.0001);
        assertEquals(40.0, Task1.fahrenheitToCelsius(104), 0.0001);
    }

    @Test
    public void testCalculateOperations() {
        assertEquals("Yig'indi: 38, Ayirma: -12, Ko'paytma: 325, Bo'linma: 0.52", Task1.calculateOperations(13, 25));
        assertEquals("Yig'indi: 16, Ayirma: -2, Ko'paytma: 63, Bo'linma: 0.7777777777777778", Task1.calculateOperations(7, 9));
        assertEquals("Yig'indi: 123456789, Ayirma: -123456789, Ko'paytma: 0, Bo'linma: 0.0", Task1.calculateOperations(0, 123456789));
        assertEquals("Yig'indi: 10, Ayirma: 10, Ko'paytma: 0, Bo'linma: Bo'lish mumkin emas!", Task1.calculateOperations(5, 0));
    }
}