package Chapter_06;

public class _02_Parameter {

    // 전달값이 있는 메소드
    public static void power(int x) { // Paramter 매개변수
        int result = x * x;
        System.out.println(result);
    }
    public static void powerByExp(int x, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= x;
        }

        System.out.println(result);
    }
    public static void main(String[] args) {
        // 전달값, Parameter

        // Argument, 인수
        power(4);
        power(2);
        powerByExp(4, 15);
    }
}
