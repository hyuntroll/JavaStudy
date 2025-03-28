package Chapter_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Python, but I don't like Java Because My Name is Fucking christan. Win Python!!";

        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length());

        // 대소문자 변환

        // 대문자로 변경
        System.out.println(s.toUpperCase());

        // 소문자로 변경
        System.out.println(s.toLowerCase());

        // 포함 관계
        System.out.println(s.contains("Python")); // 포함되는지
        System.out.println(s.contains("C#"));
        System.out.println(s.indexOf("Python")); // 위치정보 문자열의 시작 위치를 반환

        System.out.println(s.indexOf("C#")); // 포함되지 않을 경우 -1

        System.out.println(s.lastIndexOf("Python")); // 마지막으로 일치하는 위치정보
        System.out.println(s.startsWith("I")); // 이 문자열로 시작하는지
        System.out.println(s.startsWith("Python")); // 이 문자열로 시작하는지
        System.out.println(s.endsWith(".")); // 이 문자열로 끝나는지
    }
}
