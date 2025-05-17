package TodayStudy.DI;

// 필드주입(FieldInjection

// 필드에 바로 의존 관계를 주입하는 방법

/*
* 코드가 간결해져서 과거에 상당히 많이 이용했던 주입.
* 외부에서 접근이 불가능하다는 단점 존재 ->거의 사용하지 않게 되었음
* 필드 주입은 바드시 DI 프레임워크가 존재해야함
*
* */
public class FieldInjection {

    private UserRepository userRepository;
    private MemberService memberService;
}
