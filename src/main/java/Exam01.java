import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int z = s.nextInt();
        int y = s.nextInt();

        System.out.println(z + " / " + y + " = " + (double) z/y);
    }
}