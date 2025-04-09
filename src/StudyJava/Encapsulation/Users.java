package StudyJava.Encapsulation;

// 캡슐화 Encapsulation
// 데이터와 그 데이터를 조작하는 메서드를 하나의 클래스로 묶는 것
// 직접적인 필드 접근을 막아서 외부에서 함부로 값을 바꾸지 못하게 함

// 캡슐화의 이점:
/*
*   데이터 보호: 필드를 직접 노출하지 않아 잘못된 값이 들어오는 것을 막을 수 있음.
*   유지보수 용이: 내부 구현이 바뀌어도 getter/setter만 유지하 외부 코드는 영향을 받지 않음.
*   유효성 검사 추가 가능: setter에서 조건 검사를 넣을 수 있어서, 잘못된 데이터가 저장되는 것응ㄹ 막을 수 있음.
* */



public class Users {

    private String name;
    private int age;

    public String GetName() { return name; }
    public int GetAge() { return age; }

    public void SetNameAndAge(String name, int age)
    {
        // isEmpty()는 "" 인지 확인해줌
        if ( name == null || name.isEmpty() || age < 0 )
        {
            // throw는 예외를 발생시킬 때 사용함
            // new로 새로운 객체를 만듦
            throw new IllegalArgumentException("잘못된 값이 입력되었습니다.");
        }

        this.name = name;
        this.age = age;
    }

    // this는 현재 객체 자기 자신을 가리키는 참조 변수. String name은 매게변수여서 필드의 변수와 같기 때문에 구별해야함
    public void SetName(String name) { this.name = name; }


}
