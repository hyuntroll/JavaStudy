package StudyJava.generic;


// 클래스 내부에서 사용할 데이터 타입을 외부에서 지정해주는 방식

// 변수의 데이터 타입을 Ojbect로 두면 어떠한 데이터 타입도 모두 다 가능하니까
// 실행 도중 에러 검출 -> 타입이 안전하지 않음

// 타입이 안전/코드 중복을 위해 사용

// 복수 가능 ( 타입 파라미터로 올 수 있는건 '참조'만 가능



class TTS<T> {
    public T info;
}
class TTS2<T, U> {
    public T info;
    public U test1;

}
public class Generic {
    public static void main(String[] args) {
        TTS<String> tts = new TTS<String>();
    }
}
