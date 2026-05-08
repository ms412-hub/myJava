public class Exam001 {
    //클래스명을 Exam01로 선언하다.
    public static void main(String[] args) {
        // 프로그램의 객체를 저장하지않으며 시작 지점(main 메서드)이다.
        for (int i = 0; i < 4; i++) {
            //바깥쪽 for 문으로 행을 제어하는 변수i가,0~3까지 4번 반복함,각줄 의 상태를 추적함
            for (int j = 0; j < 3 - i; j++) {
            //공백의 개수를 제어하는 안쪽 for문으로 조건식으로 줄이 바뀔때마다 공백이 3,2,1,0 으로 점차 줄어듬
                System.out.print(" ");
                // 줄바꿈 없이 공백을 출력
            }
            for (int s = 0; s < 2 * i + 1; s++) {
                //별의 개수를 제어하는 두번쨰 안쪽for문 별의개수가 각줄마다 2개씩 증가하도록 반복
                System.out.print("*");
                // 줄바꿈 없이 별을 출력
            }
            System.out.println();
            //순서대로 별모양 결과 출력
        }
    }
}