package StudyJava.Try_Except;

public class trya {
    public static void main(String[] args) {
        try {

        }
        catch ( ArrayIndexOutOfBoundsException e) {

        }
        catch ( Exception e ) {
            System.out.println(e.getMessage()); // 유형 없이 왜 오류가 발생했는가
            System.out.println(e.toString()); // 어떤 오류가 발생했는지, 원인과 이유 / 에러의 위치는 X
            e.printStackTrace(); // 발생 위치, 어떤 오류, 원인 전부 표시
        }
        finally {
            // 예외 발생여부와 관계없이 실행되는 로직

            // 예외가 발행하건 안하건 반드시 처리해야할 일이 있을 때 finally
        }
    }
}
