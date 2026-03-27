import java.util.Scanner;

public class Code03_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int socre;

        System.out.print("필기시험 점수를 입력하세요: ");
        socre = s.nextInt();
        System.out.println(socre >= 70);

        s.close();
    }
}
