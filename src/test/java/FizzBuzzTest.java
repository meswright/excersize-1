import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class FizzBuzzTest {

    //Test case divisble by 3
    @Test
    void testFizzBuzz3() {
        List<String> expected = new ArrayList<>();
        expected.addAll(List.of("1", "2", "Fizz"));
        List<String> actual = FizzBuzz.fizzBuzz(3);
        assertEquals(expected, actual);
    }

    // Test case divisble by 5
    @Test 
    void testFizzBuzz5() {
        List<String> expected = new ArrayList<>();
        expected.addAll(List.of("1", "2", "Fizz", "4", "Buzz"));
        List<String> actual = FizzBuzz.fizzBuzz(5);
        assertEquals(expected, actual);
    }

    // Test case divsble by 3 and 5
    @Test
    void testFizzBuzz3n5() {
        List<String> expected = new ArrayList<>();
        expected.addAll(List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"));
        List<String> actual = FizzBuzz.fizzBuzz(15);
        assertEquals(expected, actual);
    }

    // Test case number 0
    @Test 
    void testFizzBuzzNeither(){
        List<String> expected = new ArrayList<>();
        List<String> actual = FizzBuzz.fizzBuzz(0);
        assertEquals(expected, actual);
    }
    
    // Test case negative number
    @Test
    void testCaseNegative() {
        List<String> expected = new ArrayList<>();
        List<String> actual = FizzBuzz.fizzBuzz(-5);
        assertEquals(expected, actual);
    }
}
