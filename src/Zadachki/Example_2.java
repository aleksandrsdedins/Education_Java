package Zadachki;

import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String text = userInput.nextLine();
        char[] arr = text.toCharArray();

        String output = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            output += arr[i];
        }
        System.out.println(output);
    }
}