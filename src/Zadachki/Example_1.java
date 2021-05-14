package Zadachki;
import java.util.Scanner;

public class Example_1 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int amount = scanner.nextInt();

    while (amount == 72900) {
   /*     if (amount > 72900) {
            continue;
        }

    */
        amount = amount - amount / 10;
        System.out.println(amount);
    }
    }
}