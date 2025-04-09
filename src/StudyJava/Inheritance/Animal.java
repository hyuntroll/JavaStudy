package StudyJava.Inheritance;

/* 상속 inheritance

기존 클래스의 속성과 기능을 " 물려받아서 " 새로운 클래스를 만드는 것
부모 클래스의 기능을 그대로 가져오거나 오버라이딩 해서 재사용 가능

상속의 이점

코드 재사용: 부모 클래스의 기능을 그대로 사용 할 수 있음.
유지보수 용이: 공통 코드를 부모에 넣으면, 여러 자식 클래스에서 공유 가능. 수정도 한 곳에서 끝남
확장성: 기존 클래스 기능을 기반으로 새로운 기능을 만들기 쉬움

static으로 선언하면 부모에서 필드를 공유하는 거임

 */


public class Animal {
    void sound() { System.out.println("Some Sound"); }
}

// Animal을 확장해서 Dog클래스를 만든다는 예기
// animal이 가진 모든 메서드와 필드를 받아옴
// sound 메서드는 재정의 되었음
class Dog extends Animal {
    // 같은 이름으로 변수를 다시 정의해서 다르게 출력 <- Override

    @Override
    void sound() { System.out.println("Bark"); }

    // super는 부모 클래스를 참조할 때 사용. 원래 부모클래스에 있는 메서드를 가져옴
    void printParentSound() { super.sound(); }
}

class Cat extends Animal {
    @Override
    void sound() { System.out.println("Meow"); }
}
