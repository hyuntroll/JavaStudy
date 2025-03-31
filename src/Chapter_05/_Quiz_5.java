package Chapter_05;

public class _Quiz_5 {
    public static void main(String[] args) {

        int[] ShoesSize = new int[10];
        ShoesSize[0] = 250;
        for (int i = 1; i < ShoesSize.length; i++) {
//            ShoesSize[i] = ShoesSize[i - 1] + 5;
            ShoesSize[i] = 250 + (i * 5);
        };

        for (int Size : ShoesSize) {
            System.out.println("사이즈 " + Size + " (재고 있음)");
        }
    }
}
