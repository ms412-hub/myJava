import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();
        String result = input.replace(" ","").toLowerCase();

        System.out.println(result);

        s.close();
    }
}
