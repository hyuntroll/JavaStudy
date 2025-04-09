package StudyJava;

import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i -1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (1+i)*2 -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < a-1; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (a-2-i)*2+1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 0; i < a+a-1; i++) {
            for (int j = 0; j < Math.abs(a-i-1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (a - Math.abs(a-i-1)) * 2 -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
