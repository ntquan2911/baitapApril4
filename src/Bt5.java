import java.util.Scanner;

public class Bt5 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your number: ");
            int number = sc.nextInt();
            if (number % 3 == 0) {
                System.out.println("Fizz3");
            }
            if (number % 5 == 0) {
                System.out.println("Buzz5");
            }
            if (number % 5 == 0 && number % 3 == 0) {
                System.out.println("FizzBuzz35");
            }
        }
    }
}
