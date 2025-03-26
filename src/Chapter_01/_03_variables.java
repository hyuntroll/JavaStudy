package Chapter_01;

public class _03_variables {

    public static void main(String[] args) {
        String name; // name 이라는 문자열 변수 선언
        name = "나님"; // 값을 대입
        int age = 17; // age 라는 정수형 변수를 선언하고 초깃값을 17로

        long inter = 1000000000L; // int보다 바이트가 큼, 마지막에 L을
        inter = 1_000_000_000L; // 위에 적은 값과 같음 _는 보기 편하라고 적어줌

        System.out.println(name + "이가 당신을 저격하는 글을 작성하였습니다.");

        float pi = 3.14F; // 기본적으로 3.14로 적으면 더블로 인식하기 때문에 f를 적어야함
        double score = 90.54;
        char grade = 'A'; // 문자 하나 ( 작은 따움표에 )
        name = "너님"; // 값을 변경

        boolean pass = true;

        System.out.println(pi);
        System.out.println("당신의 인생은 통과했을까요? " + pass);
        System.out.println(name +"이의 나이는 "+age+"살 입니다.");
        System.out.println(name+"이의 점수는 "+score+"이고, 학점은 "+grade+"입니다.");
    }
}
