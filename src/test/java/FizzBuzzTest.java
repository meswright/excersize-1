import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void returnsFizzBuzzSequenceUpTo15() {
        String[] sequenceTo15Array = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};
        List<String> sequenceTo15List = Arrays.asList(sequenceTo15Array);

        assertEquals(sequenceTo15List, FizzBuzz.fizzBuzz(15));
    }
}
