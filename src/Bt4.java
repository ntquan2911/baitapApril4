import java.util.Scanner;

public class Bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a :");
        double x = Math.pow(sc.nextDouble(), 2);

        System.out.println("b :");
        double y = Math.pow(sc.nextDouble(), 2);

        System.out.println("c :");
        double z = Math.pow(sc.nextDouble(), 2);

        if (x + y == z || x + z == y || y + z == x) {
            System.out.println("This is right triangle");
        } else {
            System.out.println("This is not right triangle");
        }
    }
}
