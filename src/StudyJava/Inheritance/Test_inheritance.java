package StudyJava.Inheritance;

public class Test_inheritance {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.sound();

        Dog dog = new Dog();
        dog.sound();
        dog.printParentSound();
    }
}
