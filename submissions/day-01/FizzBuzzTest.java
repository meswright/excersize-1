import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void returnsFizzBuzzSequenceUpTo15() {

        List<String> expected = List.of(
            "1",
            "2", 
            "Fizz", 
            "4", 
            "Buzz",
            "Fizz", 
            "7", 
            "8", 
            "Fizz", 
            "Buzz",
            "11", 
            "Fizz", 
            "13", 
            "14", 
            "FizzBuzz"
        );

        List<String> actual = FizzBuzz.fizzBuzz(15);

        assertEquals(expected, actual, "Test case for fizzBuzz(15) failed");
    }


    @Test
    void emptyListForZero() {
        List<String> expected = List.of();
        List<String> actual = FizzBuzz.fizzBuzz(0);
        assertEquals(expected, actual, "Test case for fizzBuzz(0) failed");
    }
    
    @Test 
    void emptyListForNegative() {
        List<String> expected = List.of();
        List<String> actual = FizzBuzz.fizzBuzz(-1);
        assertEquals(expected, actual, "Test case for fizzBuzz(-1) failed");
    }


    @Test 
    void fizzForMultiplesOfThree() {
        List<String> expected = List.of("1","2","Fizz");
        List<String> actual = FizzBuzz.fizzBuzz(3);
        assertEquals(expected, actual, "Test case for fizzBuzz(3) failed");
    }

    @Test 
    void buzzforMultipleOfFive() {
        List<String> expected = List.of("1","2","Fizz","4","Buzz");
        List<String> actual = FizzBuzz.fizzBuzz(5);
        assertEquals(expected, actual, "Test case for fizzBuzz(5) failed");
    }

}
