package StudyJava.Test;

// 동물농장 확장버전 !!

import java.util.ArrayList;
import java.util.Scanner;

abstract class NewAnimal {
    private String name;
    private int age;
    protected String species;

    public String getName() {return name;}
    public int getAge() {return age;}

    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}

    abstract void MakeSound();

}

class NewDog extends NewAnimal {
    @Override
    public void MakeSound() { System.out.println("Bark!"); }

    NewDog(String name, int age, String species) { setName(name); setAge(age); this.species = species;}

    public void fetchBall() {System.out.println("공 물어오는 중!!");}
}

class NewCat extends NewAnimal {
    @Override
    public void MakeSound() { System.out.println("Meow~");}

    NewCat(String name, int age, String species) { setName(name); setAge(age); this.species = species; }

    public void nap() { System.out.println("낮잠 자는 ~"); }

}


public class Test2 {
    public static void main(String[] args) {
        ArrayList<NewAnimal> animals = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(;;)
        {
            System.out.print("강아지 or 고양이: ");
            String dogOrcat = sc.nextLine();
            System.out.print("이름: ");
            String name = sc.nextLine();
            System.out.print("나이: ");
            int age = sc.nextInt(); sc.nextLine();
            System.out.print("종: ");
            String species = sc.nextLine();

            if ( dogOrcat.equalsIgnoreCase("강아지") )
                animals.add(new NewDog(name, age, species));
            else if ( dogOrcat.equalsIgnoreCase("고양이") )
                animals.add(new NewCat(name, age, species));
            else
            {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            System.out.print("동물을 더 추가하시겠습니까: ");
            if ( sc.nextLine().equalsIgnoreCase("no") )
                break;
        }
        for ( NewAnimal animal : animals)
        {
            System.out.println("===========");

            System.out.println("이름: " + animal.getName());
            System.out.println("나이: " + animal.getAge());
            System.out.println("종: " + animal.species);
            animal.MakeSound();
            if ( animal instanceof NewDog ) {
                ((NewDog) animal).fetchBall();
            }
            else if ( animal instanceof NewCat ) {
                ((NewCat) animal).nap();
            }
        }

    }
}
