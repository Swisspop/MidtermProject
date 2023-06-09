package math.problems;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
        @Test
        public void testFactorial() {
            assertEquals(1, Factorial.factorial(0));
            assertEquals(1, Factorial.factorial(1));
            assertEquals(2, Factorial.factorial(2));
            assertEquals(6, Factorial.factorial(3));
            assertEquals(24, Factorial.factorial(4));
    }
}
