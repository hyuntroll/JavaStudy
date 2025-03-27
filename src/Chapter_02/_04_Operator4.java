package Chapter_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 엄준식 = true;
        boolean 비뇨기과 = false;
        boolean 아시는구나 = true;

        // or 조건
        System.out.println(엄준식 || 비뇨기과 || 아시는구나);

        // and 조건
        System.out.println(엄준식 && 비뇨기과 && 아시는구나);

        // 논리부정
        System.out.println(!true);
        System.out.println(!false);
    }
}
