package Chapter_07;

public class Person {

    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void talk() {
        System.out.println("내 이름은 "+ name + " 나이는 " + age);
    }

    public static void main(String[] args) {
        Person p1; // 객체 생성
        p1 = new Person("엄준식", 19); // 인스턴스 생성
        p1.talk();


    }
}
