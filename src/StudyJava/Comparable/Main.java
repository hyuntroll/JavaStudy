package StudyJava.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class NewClass implements Comparable<NewClass> {

    String name;
    int price;

    NewClass(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(NewClass o) {
        return this.price - o.price;
    }

    @Override
    public String toString() {
        return "이름: " + name + ", 가격: " + price;
    }
}

public class Main {
    public static void main(String[] args) {
        List<NewClass> list = new ArrayList<>();
        list.add(new NewClass("A", 10));
        list.add(new NewClass("b", 43));
        list.add(new NewClass("d", 65));
        list.add(new NewClass("c", 23));

        list.sort(null); // price 기준 오름차순 정렬

        for (NewClass l : list ) {
            System.out.println(l); // toString()에 의해 형식대로 출력됨
        }
    }
}
