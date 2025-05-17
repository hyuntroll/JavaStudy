package TodayStudy.DI;

// 수정자 주입
// 필드 값을 변경하는 Setter를 통해서 의존 관를 주입하는 방법
// 주입받은 객체가 변경될 가능성이 있는 경우에 사용

class MembersService {
    private UserRepository userRepository;
    private MemberService memberService;

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }
}


public class SetterInjection {
}
