package StudyJava.Encapsulation;

public class Test_private {
    public static void main(String[] args) {

        Users user = new Users();
        // Users 의 name함수는 private라서 외부에서 사용을 못함
//        System.out.println(user.name);

        System.out.println(user.GetName());
        user.SetName("엄준식");
        System.out.println(user.GetName());

        user.SetNameAndAge("아야", 34);
        System.out.println(user.GetName() + user.GetAge());

//        user.SetNameAndAge("a", -23); 오류발생

    }
}
