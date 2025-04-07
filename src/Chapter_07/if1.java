package Chapter_07;

public class if1 {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 20) {
            System.out.println("성인입니다.");
        }
//        if ( age < 20){
        else {
            System.out.println("미자입니다.");
        }


        int grade = 1;
        switch (grade) {
            case 1:
                System.out.println("1학년");
                break;
            case 2:
                System.out.println("2학년");
                break;
            case 3:
                System.out.println("3학년");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }

//       switch문을 간략하게
        int coupon = switch (grade){
            case 1 -> 1000;
            case 2 -> 2000;
            default -> 5000;
        };

        System.out.println(coupon);

    }
}
