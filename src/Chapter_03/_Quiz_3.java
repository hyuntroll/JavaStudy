package Chapter_03;

public class _Quiz_3 {
    public static void main(String[] args) {

        String citizen_id = "090529-3xxxxxx";

        System.out.println(citizen_id.substring(0, 8));
        System.out.println(citizen_id.substring(0, citizen_id.indexOf("-")+2));
    }
}
