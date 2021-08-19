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
    @DisplayName("When the Value is 29")
    @Test
    public void CheckWhenValueIsNotDivisibleByThreeAndFive() {
        MethodsFizzBuzz Obj = new MethodsFizzBuzz(29);
        String expectedoutcome = "29";
        String actualoutcome = Obj.fizzorbuzz();
        assertEquals(expectedoutcome, actualoutcome);
    }

    @DisplayName("When the Value is 83")
    @Test
    public void CheckWhenValueHasThreeInItButNotDivisibleBy3() {
        MethodsFizzBuzz Obj = new MethodsFizzBuzz(83);
        String expectedoutcome = "Fizz";
        String actualoutcome = Obj.fizzorbuzz();
        assertEquals(expectedoutcome, actualoutcome);
    }

    @DisplayName("When the Value is 85")
    @Test
    public void CheckWhenValueHasFiveInItButNotDivisibleBy5() {
        MethodsFizzBuzz Obj = new MethodsFizzBuzz(85);
        String expectedoutcome = "Buzz";
        String actualoutcome = Obj.fizzorbuzz();
        assertEquals(expectedoutcome, actualoutcome);
    }
    @DisplayName("When the Value is 70")
    @Test
    public void CheckWhenValueIsDivisibleBy5() {
        MethodsFizzBuzz Obj = new MethodsFizzBuzz(70);
        String expectedoutcome = "Buzz";
        String actualoutcome = Obj.fizzorbuzz();
        assertEquals(expectedoutcome, actualoutcome);
    }
    @DisplayName("When the Value is 70")
    @Test
    public void CheckWhenValueIsDivisibleBy() {
        MethodsFizzBuzz Obj = new MethodsFizzBuzz(101);
        String expectedoutcome = "Unexpected Input Value";
        String actualoutcome = Obj.fizzorbuzz();
        assertEquals(expectedoutcome, actualoutcome);
    }

}