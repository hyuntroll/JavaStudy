package StudyJava.Collections;

// 기존 배열은 원래 지정해둔 값을 넘어서면 오류가 발생하게 됨
// 이런 문제를 해결하기 위해 ArrayList를 만들었음

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {

        // -> 몇개 넣을 지 지정안해도 됨
        //
        ArrayList al = new ArrayList(); // 데이터 타입을 지정하지 않으면 Object -> 모든 클래스의 조상임
        al.add("one");
//        al.add(2);
        al.add("three");
        for (int i = 0; i < al.size(); i++) {
            String value = (String)al.get(i); // Object타입으로 지정되어있음 -> 이를 String으로 형변환을 해줘야함
            System.out.println(value);
        }

        // -> 이렇게 하면 타입이 불안전 하기 때문에 generic을 사용하면 됨

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("one");
        al2.add("two");
        al2.add("three");
        for (String s : al2) {
            System.out.println(s);
        }
    }
}
