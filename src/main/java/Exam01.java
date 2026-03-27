import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a,b;
        double resDiv;

        a = s.nextInt();
        b = s.nextInt();

        resDiv = (double) a/b;
        System.out.println(a + " / " + b + " = " + resDiv);

        s.close();
    }
}