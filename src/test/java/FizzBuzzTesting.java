import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTesting {
    @DisplayName("When the Value is 15")
    @Test
    public void CheckWhetherItFizzOrBuzz() {
        MethodsFizzBuzz Obj = new MethodsFizzBuzz(15);
        String expectedoutcome = "FizzBuzz";
        String actualoutcome = Obj.fizzorbuzz();
        assertEquals(expectedoutcome, actualoutcome);
    }

    @DisplayName("When the Value is 27")
    @Test
    public void CheckWhenValueIsDivisibleByThree() {
        MethodsFizzBuzz Obj = new MethodsFizzBuzz(27);
        String expectedoutcome = "Fizz";
        String actualoutcome = Obj.fizzorbuzz();
        assertEquals(expectedoutcome, actualoutcome);
    }

    @DisplayName("When the Value is 25")
    @Test
    public void CheckWhenValueIsDivisibleByFive() {
        MethodsFizzBuzz Obj = new MethodsFizzBuzz(25);
        String expectedoutcome = "Buzz";
        String actualoutcome = Obj.fizzorbuzz();
        assertEquals(expectedoutcome, actualoutcome);
    }

}