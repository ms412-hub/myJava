import java.util.ArrayList;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);


        // 2세대 for문 사용
        for (int num : a) {
            System.out.println(num);
        }

        //3세대 for문 사용
        a.forEach(num -> System.out.println(num));
    }
}