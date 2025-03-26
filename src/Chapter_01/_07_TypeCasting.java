package Chapter_01;

public class _07_TypeCasting {

    public static void main(String[] args) {
        // 형변환 TypeCasting
        // ex) 정수 -> 실수
        // 실수 -> 정수

//        int score = 93 + 98.8;
        int score = 93;
        System.out.println(score);

        System.out.println((float) score); // float 로 형변환
        System.out.println((double) score);
        System.out.println((char) score); // 93에 해당하는 문자값으로 출력

        float score_f = 93.94F;
        System.out.println((int) score_f); // 소숫점 이하 부분은 모두 버림
        score = (int) score_f + 94;
        System.out.println(score);
        double convertScoreToDouble = score;
        // int -> long -> float -> double 자동 형변환
        int convertScoreToInt = (int) score_f; // 이런 경우 무조건 수동으로 형변환


        // 숫자를 문자열로
        String s1 = String.valueOf(93); // 93이라는 정수를 문자열로
        s1 = Integer.toString(93); // 정수를 문자열로
        System.out.println(s1); // 93

        String s2 = String.valueOf(93.94);
        s2 = Double.toString(93.94);
        System.out.printf(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("95"); // 문자열을 정수로
        System.out.println(i);
        double d = Double.parseDouble("95.4578765432"); // 문자열을 실수로
        System.out.println(d);

//        int error = Integer.parseInt("javascripts"); 데이터가 올바로 들어가 있어야함
    }
}
