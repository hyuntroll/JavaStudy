package Chapter_03;

public class _02_String2 {
    public static void main(String[] args) {

        String s = "I like Python, but I don't like Java Because My Name is Fucking christan. WinPython!!";

        System.out.println(s);

        // 문자열 변화 ( 변수가 변하는 것은 아님 )
        System.out.println(s.replace("Python", "C and Python")); // target을 replacement로 변환

        System.out.println(s.substring(7)); // 7번째 부터 시작 ( 이전 내용은 삭제 )

        System.out.println(s.substring(s.indexOf("but")));

        // 시작위치는 포함하지만, 끝 위치 직전까지 잘라냄
        System.out.println("ㅎㅇ " + s.substring(s.indexOf("Python"), s.lastIndexOf("Python")));

        s = "      I love String.    ";
        System.out.println(s);

        System.out.println(s.trim()); // 앞뒤 공백을 제거

        // 문자열 결합
        String s1 = "i";
        String s2 = "love u";
        System.out.println(s1+s2);
        System.out.println(s1.concat(s2).concat(s2).concat(s2)); // concat을 하면 괄호 안의 문자열을 결합함
    }
}
