package TodayStudy.Collection;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

// 순서 o 중복 허가
public class list {
    public static void main(String[] args) {

        //list 구현체
        //ArrayList 내부 배열, '삽입,삭제' 느림 || '조회' 빠름
        List<String> list = new ArrayList<>();
        list.add("A");
        System.out.println(list.get(0)); // O(1) -> 빠름
        list.remove(0); // O(n) -> 느림

        //LinkedList  노드 연결 구조, 삽입삭제 빠름 || 조회 느림
        List<String> list2 = new LinkedList<>();
        list2.add("B");
        list2.add("C");
        System.out.println(list2.get(0));

        //TreeSet 정렬됨 ( Comparable 또는 Comparator 필요 )

    }
}
