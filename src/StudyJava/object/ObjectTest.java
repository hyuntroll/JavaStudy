package StudyJava.object;

/*
* 자바에서 Object는 사실 모든 클래스에 상속받고있음
* toString -> 객체를 문자열화 시킴
* equals -> 객체가 같은지 비교
* hashCode()
*
*
* 가비지 컬랙션:
*
* 자바에서 안쓰는 램을 자동으로 정리해주는거
*
* clone -> 객체를 똑같이 복제 시키는 메서드 -> 이때는 Cloneable를 붙여줘야함
* */
class Test12 implements Cloneable {
    public Test12 clone() throws CloneNotSupportedException {
        return (Test12) super.clone();
    }
}

public class ObjectTest {
    public String test;

    public boolean equals (Object obj) {
        ObjectTest o = (ObjectTest)obj;
        return this.test.equals(o.test);
    }

    ObjectTest(String test) { this.test = test;}

    public static void main(String[] args) {
        ObjectTest o1 = new ObjectTest("시발련");
        ObjectTest o2 = new ObjectTest("시발련");

        System.out.println(o1.equals(o2));
    }
}
