package Chapter_05;

public class _05_ASCII {
    public static void main(String[] args) {

        char c = 'a';
        System.out.println(c);
        System.out.println((int)c);

        c = 'b';
        System.out.println(c);
        System.out.println((int)c);
        c++;
        System.out.println(c++);
        System.out.println(c);


        String[][] seats3 = new String[10][15];
//        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j+1);
            }
            ch++;
        }

        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
