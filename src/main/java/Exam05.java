public class Exam05 {
    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {

            int s;

            if (i <= 4) {
                s = i;
            } else {
                s = 8 - i;
            }

            for (int z = 1; z <= s; z++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}