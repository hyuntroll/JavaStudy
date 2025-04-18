package StudyJava.SingletonPattern;

// 싱글톤 패턴
// 인스턴스를 하나만 만들기 위해서 사용
// '로거 설정 캐시' 같이 **함께 사용하는 것에 주로 이요됨


public class Single {
    private static Single instance = new Single(); // 객체를 미리 선언
    private Single() { // 생성자는 private로 막아기 때문에 생성자를 만들 수 없음
        System.out.println("엄;");
    }

    // 정적 메소드로 인스턴스를 반환시켜줌
    public static Single getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Single single1 = Single.getInstance(); // 정적 메소드기 때문에 꼭 Single.을 붙여줘야함
        Single single2 = Single.getInstance();
        System.out.println(single1 == single2);
    }

}
