package Chapter_06;

public class _05_OverLoading {
    public static int getPower(int number) {
        int result = number * number;
        return result;
    }
    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static void main(String[] args) {

        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러번 선언
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 개수가 다르거나
        // 반환겂은 달라도 안됨 X
        System.out.println(getPower(12));
        System.out.println(getPower("12"));
    }
}
