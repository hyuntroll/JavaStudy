package Chapter_07;

public class while2 {
    public static void main(String[] args) {
        int a= 0;
        while(a<10){
            System.out.println(a++);
        }

        int c = 0;
        while ( true ) {
            if ( c > 10 )
                break;
            System.out.print(c + " ");
            c++;
        }
    }
}
