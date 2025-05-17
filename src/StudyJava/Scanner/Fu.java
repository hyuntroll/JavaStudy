package StudyJava.Scanner;

import java.io.File;
import java.util.Scanner;

public class Fu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("new.txt");
//        Scanner sc_fi = new Scanner(file);

        while ( sc.hasNextInt() ) {
            System.out.println(sc.nextInt());
        }
        sc.close();


    }
}
