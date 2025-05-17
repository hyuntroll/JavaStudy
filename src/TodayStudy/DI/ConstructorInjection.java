package TodayStudy.DI;

// 다양한 의존성 주입 방법
// 1. 생성자 주입 : 생성자를 통해 의존 관계를 주입하는 방법.

// 생성자의 호출 시점에 1회 호출 되는 것이 보장됨
// 주입받은 객체가 변하지 않거나 반드시 // 객체의 주입이 필요한 경우에 강제하기 위해 사용

class UserRepository {

}

class MemberService {

}

class UserService {
    private UserRepository userRepository;
    private MemberService memberService;

    public UserService(UserRepository userRepository, MemberService memberService) {
        this.userRepository = userRepository;
        this.memberService = memberService;
    }
}




public class ConstructorInjection {
}
