package StudyJava.Comparable;

// 객체들 사이의 정렬 순서를 정의하는 인터페이스
// compareTo 메서드를 구현해서 기본 정렬 기준을 정해주는 역할을 함


public interface Comparable<T> {
    int compareTo(T o);

    String toString();
}

