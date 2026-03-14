package strings;

import java.util.Scanner;

public class AsciiValueOfChar {
    static void method(char ch) {
        System.out.print((int) ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        char ch = sc.next().charAt(0);   // taking character input
        method(ch);
        sc.close();
    }
}