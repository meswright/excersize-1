import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;



class FizzBuzzTest {

    private static final List<String> ansFor15 = new ArrayList<>(List.of("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"));

    private static String fbSingle(int n) {
        return FizzBuzz.fizzBuzz(n).get(n-1);
    }

    @Test
    void returnsFizzBuzzSequenceUpTo15() {
        assertEquals(ansFor15, FizzBuzz.fizzBuzz(15));
    }

    @Test
    void multOfThree() {
        assertEquals("Fizz", fbSingle(3));
        assertEquals("Fizz", fbSingle(6));
        assertEquals("Fizz", fbSingle(9));
    }

    @Test
    void multOfFive() {
        assertEquals("Buzz", fbSingle(5));
        assertEquals("Buzz", fbSingle(10));
        assertEquals("Buzz", fbSingle(20));
    }

    @Test
    void multOfFifteen() {
        assertEquals("FizzBuzz", fbSingle(15));
        assertEquals("FizzBuzz", fbSingle(30));
        assertEquals("FizzBuzz", fbSingle(45));
    }

    @Test
    void nonMults() {
        assertEquals("1", fbSingle(1));
        assertEquals("2", fbSingle(2));
        assertEquals("49", fbSingle(49));
    }

    @Test
    void zero() {
        assertTrue(FizzBuzz.fizzBuzz(0).isEmpty());
    }

    @Test
    void negative() {
        assertTrue(FizzBuzz.fizzBuzz(-1).isEmpty());
    }
}
