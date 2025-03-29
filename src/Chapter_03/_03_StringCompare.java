package Chapter_03;

public class _03_StringCompare {
    public static void main(String[] args) {

        // 문자열 비교
        String s1 = "Python";
        String s2 = "java";


        // 두 문자열을 비교
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("python"));
        System.out.println(s1.equalsIgnoreCase("python")); // 대소문자 구별 X

        // 문자열 비교 심화
        s1 = "1234"; // 메모리 공간에 "1234" 이 변수는 참조함
        s2 = "1234"; // 메모리 공간에 "1234" 이 변수도 참조함

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        s1 = new String("1234");
        s2 = new String("1234");

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false

    }
}
