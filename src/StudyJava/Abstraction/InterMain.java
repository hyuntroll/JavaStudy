package StudyJava.Abstraction;

/* 인터페이스 interface
모든 메서드가 기본적으로 public abstract
필드는 public static final ( 상수만 가능 )
다중 구현 가능 -> 다중 상속을 인터페이스로 지원

클래스가 기본적으로 구현해야할 틀만 재공해줌:

 */

interface Drawable {
    void draw();
}

class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("사각형 그려요");
    }


}


public class InterMain {
}
