package StudyJava.Factory;

// Factory는 객체 만드는 것을 보여주지 않고
// 필요에 따라 다양한 객체를 만들 수 있게 하는 로직
/*사용이유
1. 객체 생성 로직 을 따로 분리해서 유지보수하기 위함
2. 조건에 따라 객체를 유연하게 생성하기 위함
3.
*
* */


abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("bark!");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow~");
    }
}

class AnimalFactory {
    static Animal createAnimal(String type) {
        if (type.equalsIgnoreCase("dog")) {
            return new Dog();
        }
        else if (type.equalsIgnoreCase("cat")) {
            return new Cat();
        }
        else {
            throw new IllegalArgumentException("Unknown animal type");
        }
    }
}


public class fact {
    public static void main(String[] args) {
        Animal a;
        a = AnimalFactory.createAnimal("dog");
        a.sound();
    }
}


