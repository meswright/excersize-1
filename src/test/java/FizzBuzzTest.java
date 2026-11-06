import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test   //CHECK FOR NO FIZZ OR BUZZ
    void returnsFizzBuzzSequenceUpTo2() {
        List<String> expected = List.of("1", "2");
        List<String> actual = FizzBuzz.fizzBuzz(2);
        assertEquals(expected, actual);
    }
    @Test   //CHECK FOR FIZZ AT 3
    void returnsFizzBuzzSequenceUpTo3() {
        List<String> expected = List.of("1", "2", "Fizz");
        List<String> actual = FizzBuzz.fizzBuzz(3);
        assertEquals(expected, actual);
    }
    @Test   //CHECK FOR BUZZ AT 5
    void returnsFizzBuzzSequenceUpTo5() {
        List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz");
        List<String> actual = FizzBuzz.fizzBuzz(5);
        assertEquals(expected, actual);
    }
    @Test   //CHECK FOR FIZZBUZZ AT 15
    void returnsFizzBuzzSequenceUpTo15() {
        List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        List<String> actual = FizzBuzz.fizzBuzz(15);
        assertEquals(expected, actual);
    }
    @Test   //CHECK FOR VALUES OUTSIDE RANGE
    void returnsFizzBuzzSequenceNegatives() {
        List<String> expected = List.of();
        List<String> actual = FizzBuzz.fizzBuzz(-15);
        assertEquals(expected, actual);
    }
}