/**
 * Created by Neto on 11/14/16.
 */
public class FizzBuzz {

    public static void main(String[] args) {
        int fizzbuzz;
        for (fizzbuzz = 0; fizzbuzz <= 100; fizzbuzz++) {
            if (fizzbuzz % 15 == 0) {
                System.out.println(fizzbuzz + " FizzBuzz");
            }else if (fizzbuzz % 3 == 0) {
                System.out.println(fizzbuzz + " Fizz");
            } else if (fizzbuzz % 5 == 0) {
                System.out.println(fizzbuzz + " Buzz");
            } else {
                System.out.println(fizzbuzz);
            }
        }
    }
}
