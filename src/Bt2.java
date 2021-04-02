import java.util.Scanner;

public class Bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = Integer.parseInt(sc.nextLine());
        String[] count = {"Mot", "Hai", "Ba","Bon","Nam","Sau","Bay","Tam","Chin","Muoi"};
        for (int i = 0; i < count.length; i++) {
            if(num == i){
                System.out.println(count[i-1]);
            }
        }
    }
}
