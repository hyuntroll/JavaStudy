package StudyJava.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {
    public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);
        HashSet<Integer> B = new HashSet<Integer>();
        B.add(3);
        B.add(4);
        B.add(5);
        HashSet<Integer> C = new HashSet<Integer>();
        C.add(1);
        C.add(2);

        System.out.println(A.containsAll(B)); // A의 부분집합이 B인가?
        System.out.println(A.containsAll(C)); // A의 부분집합이 C인가?

        Iterator hi = (Iterator) A.iterator();
        while (hi.hasNext()) {
            System.out.println(hi.next());
        }
    }
}
