package StudyJava.static1;

// static 키워드를 사용하여 클래스에서 공용으로 사용할 수 있음
// 멤버변수: 인스턴스 변수-> 인스터를 생성해야 사용. 인스턴스 만들 때마다 새로 만들어짐

// 클래스 변수, 인스턴스랑 다르게 클래스에 바로 접근 가능. 자바 만들 때 하나만 만들어짐
// 필브면수랑 멤버변수

// 정적 변수에서는 인스턴스 변수 메서드 못부름 ;

public class DataCount {
    public static void main(String[] args) {

        Data1 d1 = new Data1("D1");
        System.out.println(Data1.count);
        Data1 d2 = new Data1("D2");
        System.out.println(Data1.count);

        Data1 d3 = new Data1("D3");
        System.out.println(Data1.count);

        Data1 d4 = new Data1("D4");

        // 인스턴스화
        System.out.println(d4.count);
        System.out.println(Data1.count);
    }
}
