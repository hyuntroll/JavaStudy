package Chapter_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        String Bus01Number = "1234";
        String Bus02Number = "상암08";

        int Bus01Time = 3;
        int Bus02Time = 5;

        double Bus01Distance = 1.5;
        double Bus02Distance = 0.8;

        System.out.println(Bus01Number+"번 버스");
        System.out.println("약 "+Bus01Time+"분 후 도착");
        System.out.println("남은 거리 "+Bus01Distance+"km");

        System.out.println(Bus02Number+"번 버스");
        System.out.println("약 "+Bus02Time+"분 후 도착");
        System.out.println("남은 거리 "+Bus02Distance+"km");

    }
}
