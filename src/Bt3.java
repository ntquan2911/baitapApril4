import java.util.Scanner;

public class Bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a: ");
        double a = sc.nextDouble();

        System.out.println("b: ");
        double b = sc.nextDouble();

        System.out.println("c: ");
        double c = sc.nextDouble();

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("It's 3 sides of triangle");
        } else {
            System.out.println("Invalid");
        }
    }
}
