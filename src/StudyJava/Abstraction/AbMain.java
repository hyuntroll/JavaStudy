package StudyJava.Abstraction;

/* 추상화 abstraction
*
*  공통적인 특징만 뽑아서 구조화하고
*  세부 구현은 자식/구현 클래스에 맡기는 것
*
*   Ex) 도형은 모두 넓이를 가지지만, 계산 방식이 다름
*   그래서 공통적으로 area()만 정의하고, 구체적인 것은 각 클래스에서
*
* */


// 객체를 직접 생성 불가, 일부 구현 + 일부 추상 메서드 가능, 자슥 클래스가 상속하여 완성해야함
abstract class Shape {
    abstract double Area(); // 추상 메서드

    void printType() {
        System.out.println("This is a Shape.");
    }
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // 무조건 추상 메서드를 완성시켜야함
    @Override
    double Area() {
        return Math.PI * radius * radius;
    }
}


public class AbMain {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println(circle.Area());
    }
}
