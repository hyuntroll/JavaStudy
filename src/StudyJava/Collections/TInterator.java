package StudyJava.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class TInterator {
    public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<Integer>();
        // Colection<Integer>로 바꿔도 문제가 되지 않겠죠?
        A.add(1);
        A.add(2);
        A.add(3);

        Iterator it = A.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
