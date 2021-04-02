import java.util.Scanner;

public class Bt1 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your number: ");
            double number = sc.nextDouble();
            if (number >= 0) {
                System.out.println(number + " la so nguyen duong");
            } else {
                System.out.println(number + " la so nguyen am");
            }
        }
    }
}
