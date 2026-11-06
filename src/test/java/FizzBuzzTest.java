import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void returnsFizzBuzzSequenceUpTo15() {
 List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz" );
 List<String> actual = FizzBuzz.fizzBuzz(15);
assertEquals(expected, actual);
}
}
