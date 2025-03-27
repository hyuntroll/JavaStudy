package Chapter_02;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class _01_Operator1 {

    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 / 2);
        System.out.println(5 / 2); // 정수 / 정수 결과는 항상 정수
        System.out.println((double) 5 / 2);
        System.out.println(5 % 2);

        // 우선 순위 연산
        System.out.println(5 + 2 * 5);
        System.out.println((5 + 2) * 5);

        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);

        c = a * b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);

        c = a % b;
        System.out.println(c);


        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val);
        System.out.println(val++); // val를 불러온 후 +1
        System.out.println(val);
        System.out.println(++val); // val에 +1을 하고 출력

        // ex 은행 대번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++);
        System.out.println("대기 인원 : " + waiting++);
        System.out.println("대기 인원 : " + waiting++);
        System.out.println("총 대기 인원 : " + waiting);
    }
}
