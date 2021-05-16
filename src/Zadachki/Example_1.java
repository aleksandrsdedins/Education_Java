package Zadachki;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int amount = userInput.nextInt();

        System.out.println("------------------------------------------"); // Separation
        for (int i = 0; i <= 4; amount -= (amount / 10)) {
            if (i == 3) {
                System.out.println(amount);
            }
            i++;
        }


    }
}