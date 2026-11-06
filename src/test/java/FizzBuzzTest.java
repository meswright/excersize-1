import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    // initialize the FizzBuzz class
    private List<String> fizzBuzz(int n) {
        return FizzBuzz.fizzBuzz(n);
    }

    /* test cases for normal inputs */

    @Test // no FizzBuzz, no Fizz, no Buzz
    void returnsStringSequenceUpTo2() {
        List<String> result = List.of("1", "2");
        assertEquals(result, fizzBuzz(2));
    }

    @Test // Fizz for multiples of 3
    void returnsFizzSequenceUpTo3() {
        List<String> result = List.of("1", "2", "Fizz");
        assertEquals(result, fizzBuzz(3));
    }

    @Test // Buzz for multiples of 5
    void returnsBuzzSequenceUpTo5() {
        List<String> result = List.of("1", "2", "Fizz", "4", "Buzz");
        assertEquals(result, fizzBuzz(5));
    }

    @Test // FizzBuzz for multiples of both 3 and 5
    void returnsFizzBuzzSequenceUpTo15() {
        List<String> result = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        assertEquals(result, fizzBuzz(15));
    }

    /* test cases for boundary values */

    @Test // returns empty list for input 0
    void returnsEmptyListForZero() {
        List<String> result = List.of();
        assertEquals(result, fizzBuzz(0));
    }

    @Test // returns empty list for negative inputs
    void returnsEmptyListForNegativeInput() {
        List<String> result = List.of();
        assertEquals(result, fizzBuzz(-5));
    }

}
