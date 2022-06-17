package ss8_CleanCode_Refactoring.thuc_hanh;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        if (number%3==0&&number%5==0)
            return "FizzBuzz";
        if (number%3==0)
            return "Fizz";
        if (number%5==0)
            return "Buzz";

        return number+" ";
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(16));

    }
}
