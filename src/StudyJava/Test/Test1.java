package StudyJava.Test;

/*
*     제어자	같은 클래스	같은 패키지	자식 클래스	외부 클래스
private	✅	❌	❌	❌
(default)	✅	✅	❌	❌
protected	✅	✅	✅	❌
public	✅	✅	✅	✅
*
*
* 상속할 때 접근 범위는 더 작게해선 안됨
* */

import java.util.ArrayList;
import java.util.Scanner;

abstract class Animal {
    private String name;
    private int age;

    protected String species;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    // abstarct앞에 public, -- 다 가능
    abstract void makeSound();
    void printInfo() {
        System.out.println("이름: " + name + "\n" + "나이: " + age + "\n" +"종: " + species);
    }
}

class Dog extends Animal {
    Dog(String name, int age, String species) {setName(name); setAge(age); this.species = species;}

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }
}

class Cat extends Animal {
    Cat(String name, int age, String species) {setName(name); setAge(age); this.species = species;}
    @Override
    public void makeSound() {
        System.out.println("Meow~");
    }
}


public class Test1 {
    public static void main(String[] args) {

        // 개신박한데 뭔지 모르겠음
        ArrayList<Animal> animals = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        for (;;) {
            System.out.print("강아지 or 고양이: ");
            String an = sc.nextLine();
            System.out.print("이름 입력: ");
            String name = sc.nextLine();
            System.out.print("나이 입력: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("종 입력: ");
            String species = sc.nextLine();


            Animal newAnimal = (an.equalsIgnoreCase("강아지")) ? new Dog(name, age, species) : new Cat(name, age, species);

            animals.add(newAnimal);

            System.out.print("동물을 더 추가하시겠습니까?");
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("no")) break;

        }
        sc.close(); // 닫아주기


//        System.out.println(name + age + species);


//        Animal[] animals = {
//                new Dog("망망이,", 1, "게"), new Cat("고양이", 2, "고"),
//                new Cat("김춘식", 28, "엄"), new Dog("엄준식", 3, "식")
//        };

        System.out.println("======================");
        for ( Animal animal : animals ) {
//            instaceof: 해당 객체가 어떤 클래스의 인스턴스인지 확인함
//            다형성 때문에 사용. 어떤 객체에는 있는 메서드가 어떤 객체엔 없을수도 있기 때문에

            if ( animal instanceof Dog) {
                System.out.println("강아지입니다 \uD83D\uDC36");
            } else if ( animal instanceof Cat) {
                System.out.println("고양이입니다 🐱");
            }

            animal.printInfo();
            animal.makeSound();
        }
    }
}


/*
* instanceof 써서 동물 타입마다 특별한 메시지 출력

중복 이름 방지 (Set 사용 또는 이름 확인 로직)

Animal을 파일에 저장/불러오기 (BufferedWriter/Reader)

interface 도입해서 Drawable 같은 기능 나눠보기
* */