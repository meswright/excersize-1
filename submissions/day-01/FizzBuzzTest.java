import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
//FizzBuzzTest by reina.g.a.gujelde

class FizzBuzzTest {
    @Test
    void returnFizzBuzzUpTo15() {
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

     @Test
    void emptyListForNegative() {
        List<String> expected = List.of();

        List<String> actual = FizzBuzz.fizzBuzz(-1);

        assertEquals(expected, actual);
    }

    @Test
    void fizzDivisibleByThree() {
        List<String> expected = List.of("1","2","Fizz");

        List<String> actual = FizzBuzz.fizzBuzz(3);

        assertEquals(expected, actual);
    }

    @Test
    void buzzDivisibleByFive() {
        List<String> expected = List.of("1","2","Fizz","4","Buzz");
        
        List<String> actual = FizzBuzz.fizzBuzz(5);

        assertEquals(expected, actual);
    }

    @Test
    void notDivisibleByThreeOrFive() {
        List<String> expected =
                List.of(
            "1",
            "2",
            "Fizz",
            "4",
            "Buzz",
            "Fizz",
            "7"
        );

        List<String> actual =
                FizzBuzz.fizzBuzz(7);

        assertEquals(expected, actual);
    }
}
