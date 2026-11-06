import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FizzBuzzTest {

    @Test
    void returnsFizzBuzzSequenceUpTo15() {

        // 1. Arrange expected list sequence up to 15
        List<String> expectedSequence = List.of(
            "1", "2", "Fizz", "4", "Buzz", 
            "Fizz", "7", "8", "Fizz", "Buzz", 
            "11", "Fizz", "13", "14", "FizzBuzz"
        );

        // 2. Act
        List<String> actualSequence = FizzBuzz.fizzBuzz(15);

        // 3. Assert (Verifies exact order, size, and values)
        assertEquals(expectedSequence, actualSequence, "The FizzBuzz sequence up to 15 did not match expected output.");
    }

    // ==========================================
    // REQUISITE SPECIAL MATHEMATICAL VALUE TESTS
    // ==========================================

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12})
    void numbersDivisibleByThreeOnlyReturnFizz(int input) {
        List<String> result = FizzBuzz.fizzBuzz(input);
        // The last element in the returned sequence represents our input number
        String lastElement = result.get(result.size() - 1);
        
        assertEquals("Fizz", lastElement, "Input " + input + " should have returned Fizz.");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20})
    void numbersDivisibleByFiveOnlyReturnBuzz(int input) {
        List<String> result = FizzBuzz.fizzBuzz(input);
        String lastElement = result.get(result.size() - 1);
        
        assertEquals("Buzz", lastElement, "Input " + input + " should have returned Buzz.");
    }

    // ==========================================
    // UNHAPPY PATHS & BOUNDARY EDGE CASES
    // ==========================================

    @Test
    void throwsExceptionWhenInputIsZero() {
        // Zero is technically divisible by 3 and 5, but invalid for standard sequences
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            FizzBuzz.fizzBuzz(0);
        });
        
        assertEquals("Number must be greater than 0", exception.getMessage());
    }

    @Test
    void throwsExceptionWhenInputIsNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            FizzBuzz.fizzBuzz(-5);
        });
        
        assertEquals("Number must be greater than 0", exception.getMessage());
    }

    @Test
    void handlesSingleElementBoundaryCleanly() {
        // Checking the smallest possible valid sequence length
        List<String> result = FizzBuzz.fizzBuzz(1);
        
        assertEquals(1, result.size());
        assertEquals("1", result.get(0));
    }

    @Test
    void handlesLargeBoundsWithoutCrashing() {
        // Ensures the program handles large scales dynamically without memory choking
        int largeBound = 100_000;
        
        assertDoesNotThrow(() -> {
            List<String> result = FizzBuzz.fizzBuzz(largeBound);
            assertEquals(largeBound, result.size());
            assertEquals("FizzBuzz", result.get(14)); // 15th element (index 14)
        });
    }
}
