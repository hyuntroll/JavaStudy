package Chapter_06;

public class _07_VariableScope {
    public static void methodA() {
//        System.out.println(number);
    }

    public static void methodB() {
        // 지역변수
        int number = 1; // 이 메소드에서 정의된 변수는 이 안에서만
    }
    public static void main(String[] args) {
        // 지역변수
        int number = 3; // main에서 정의된 변수는 이 안에서만
//        System.out.println(result);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

//        System.out.println(i);
        {
            int j = 0;
            System.out.println(j);
        }
//        System.out.println(j);


    }
}
