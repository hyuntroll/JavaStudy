package StudyJava.Polymorphism;

/*
* 다형성 Polymorphism
* 하나의 객체가 여러 타입처럼 동작할 수 있는 성질
*
* 정적 바인딩
* 컴파일 시점에 어떤 메소드를 사용할지 결정
*
* 동적 바인딩
* 실행 시점 객체에 맞춰 결정 -> 오버라이딩 메서드 호출
*
* 장점
* 1. 유언성
* 모든 하위 클래스가 같은 메서드로 동작 가능함
*
* 2. 확장성
* 코드를 건들지 않고 객체만 바꾸어 설정가능
*
*
* 다형성의 필수조건
* 상속 관계
* 메서드를 오버라이딩 해야함
* 부모 타임 참조변수로 자식 객체 참조
*
*
* */

class Animal {
    void Sound() {
        System.out.println("some sound");
    }
}

class Dog extends Animal {
    @Override
    void Sound() {
        System.out.println("bark");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.Sound();
    }
}
