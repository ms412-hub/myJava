class Rabbit10{
    String shape;
    int xpos;
    int ypos;
    static int count;
    //static읋 사용하면 기본 0값 생성한 토끼의 수
    Rabbit10() {
        count++;
    }
}

public class Code08_01 {
    public static void main(String[] args){
        System.out.println("객페 생성전의 총 토끼의 수==>"+Rabbit10.count);

        Rabbit10 rabbit1 = new Rabbit10();
        System.out.println("토끼 객체1 생성후의 총 토끼 수==>"+Rabbit10.count);

        Rabbit10 rabbit2 = new Rabbit10();
        System.out.println("토끼 객체2 생성 후의 총 토끼 수==>"+ Rabbit10.count);
    }
}
