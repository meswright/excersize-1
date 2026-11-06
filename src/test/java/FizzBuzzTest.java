import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FizzBuzzTest {

    @Test
    void returnsFizzBuzzSequenceWhenEmpty() {
        List<String> actual = FizzBuzz.fizzBuzz(0);

        assertTrue(actual.isEmpty());
    }

    @Test
    void returnFizzBuzz15FizzBuzz() {
        String actual = FizzBuzz.fizzBuzz(15).getLast();
        assertEquals("FizzBuzz", actual);
    }

    @Test
    void returnFizzBuzzSequence3() {
        List<String> expected = List.of("1","2","Fizz");
        List<String> actual = FizzBuzz.fizzBuzz(3);
        assertEquals(expected, actual);
    }

    @Test
    void returnFizzBuzzSequence4() {
        List<String> expected = List.of("1","2","Fizz", "4");
        List<String> actual = FizzBuzz.fizzBuzz(4);
        assertEquals(expected, actual);
    }

    @Test
    void returnsFizzBuzzSequence15() {
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
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource (ints = {1,3,5,15})
    void returnArraySizeMatches(int number) {
        assertEquals(number, FizzBuzz.fizzBuzz(number).size());
    }
}

