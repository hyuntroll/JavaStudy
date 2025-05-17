package StudyJava.Collections;
import java.util.*;

/*
List
내부구조는 Object[] 배열 기반. 초기 용량은 10
장점 : 인덱스를 통한 접근 가능 .get(index), .set(index, value) 시간복잡도는 O(1)
단점 : 중간 삽입/삭제는 O(n)
동기화: X비동기. 동시화 시에는 Collections.synchronizedList()로 래핑.
 */


public class ListArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        System.out.println(list);
        list.remove("A");
        System.out.println(list);

        System.out.println(list.get(1)); // 리스트의 index에 접근. index범위를 넘어가면 오류발생

        
    }
}
