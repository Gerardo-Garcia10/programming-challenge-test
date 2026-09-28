import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Here are the test cases
// You should familiarize yourself with them if you have to troubleshoot
// Do not modify this file. 
public class SolutionTest {
    //add tests .. multiple tests
    @Test
    public void testPositiveNumbers() {
        Solution s = new Solution();
        assertEquals(5, s.add(2, 3));
    }

    @Test
    public void testNegativeNumbers() {
        Solution s = new Solution();
        assertEquals(-1, s.add(2, -3));
    }

    // subtract 

    @Test
    public void testSubtractPositive() {
        Solution s = new Solution();
        assertEquals(4, s.subtract(7, 3));
    }


    @Test
    public void testSubtractNegative() {
        Solution s = new Solution();
        assertEquals(5, s.subtract(2, -3));
    }

    // multiply

    @Test
    public void testMultiplyPositive() {
        Solution s = new Solution();
        assertEquals(12, s.multiply(3, 4));
    }

    @Test
    public void testMultiplyByZero() {
        Solution s = new Solution();
        assertEquals(0, s.multiply(7, 0));
    }

    // divide - returns a double, so results are compared with a small tolerance.

    @Test
    public void testDivideEven() {
        Solution s = new Solution();
        assertEquals(3.0, s.divide(12, 4), 1e-9); //since we are not rounding, need delta for trailing number
    }

    @Test
    public void testDivideKeepsFraction() {
        // Catches integer division: 7 / 2 in int math would give 3.0.
        Solution s = new Solution();
        assertEquals(3.5, s.divide(7, 2), 1e-9);
    }

    @Test
    public void testDivideNegative() {
        Solution s = new Solution();
        assertEquals(-2.5, s.divide(-5, 2), 1e-9);
    }

    // concatenate

    @Test
    public void testConcatenateWords() {
        Solution s = new Solution();
        assertEquals("helloworld", s.concatenate("hello", "world"));
    }

    @Test
    public void testConcatenateEmpty() {
        Solution s = new Solution();
        assertEquals("abc", s.concatenate("abc", ""));
    }

    //transform

    @Test
    public void testTransformZero() {
        Solution s = new Solution();
        assertEquals(12, s.transform(0));
    }

    @Test
    public void testTransformNegative() {
        Solution s = new Solution();
        assertEquals(0, s.transform(-6));
    }
}
