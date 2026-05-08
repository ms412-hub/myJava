public class Exam002 {
    //Exam002라는 이름의 클래스를 선언한다.
    public static void main(String[] args) {
        //프로그램의 객체를 저장하지않으며 시작 지점(main 메서드)이다.
        String log = "127.0.0.1 - frank [10/Oct/2000:13:55:36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200";
        //웹 서버 로그 형식의 문자열을 log 변수에 저장한다.
        //이 문자열 안에는 HTTP 요청 정보가 포함되어 있다.
        int start = log.indexOf("GET") + 4;
        //"GET"이라는 문자열이 시작되는 위치를 찾는다.
        int end = log.indexOf(" ",start);
        //start 위치 이후에서 처음 등장하는 공백(" ")의 위치를 찾는다.
        String result = log.substring(start, end);
        //start부터 end 직전까지의 문자열을 잘라낸다

        System.out.println(result);
        //결과를 호출한 문자열을 출력한다.
    }
}