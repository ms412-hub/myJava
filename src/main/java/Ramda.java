import java.util.ArrayList;
import java.util.List;

public class Ramda {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();

        a.add(5);
        a.add(3);
        a.add(6);
        a.add(1);
        a.add(2);
        a.add(4);

        a.forEach(n -> System.out.print(n + " "));
    }
}


