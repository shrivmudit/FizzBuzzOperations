public class MethodsFizzBuzz {
    int input;
    int rem;


    public MethodsFizzBuzz(int input) {
        this.input = input;
    }

    public String fizzorbuzz() {
        rem = input % 10;
        if(input>0 && input<=100) {
            if (input % 3 == 0 && input % 5 == 0)
                return "FizzBuzz";
            else if (input % 3 == 0)
                return "Fizz";

            else if (input % 5 == 0)
                return "Buzz";

            else if (rem == 3)
                return "Fizz";
            else if (rem == 5)
                return "Buzz";

            else
                return String.valueOf(input);
        }
        return "Unexpected Input Value";


    }


}