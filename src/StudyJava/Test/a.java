package StudyJava.Test;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle = 90;
        int in_a;
        String answer = "";
        for (int i = 0; i < 10; i++) {
            in_a = sc.nextInt(); sc.nextLine();
            switch (in_a) {
                case 1:
                    angle -= 90;
                    break;
                case 2:
                    angle -= 180;
                    break;
                case 3:
                    angle += 90;
                    break;
                default:
                    break;
            }
//            System.out.println(angle);
            if (angle < 0 ) {
                angle += 360;
            }
            else if ( angle > 360) {
                angle -= 360;
            }
            else if ( angle == 360) {
                angle = 0;
            }
        }

        switch (angle) {
            case 0:
                answer = "E";
                break;
            case 90:
                answer = "N";
                break;
            case 180:
                answer = "W";
                break;
            case 270:
                answer = "S";
                break;
            default:
                break;
        }

        System.out.println(answer);

    }
}
