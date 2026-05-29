abstract class Rabbit8{
    String shape;
    int xpos;
    int ypos;

    void move(int x, int y) {
        this.xpos=x;
        this.ypos=y;
    }
}

class HouseRabbit8 extends Rabbit8{
}

class MountainRabbit8 extends Rabbit8{
}

public class Code08_07 {
    public static void main(String[] args) {
//      Rabbit8 rabbit8=new Rabbit8();
        HouseRabbit8 hRabbit8=new HouseRabbit8();
        System.out.println("집토끼 객체 생성~~~");
        MountainRabbit8 mRabbit = new MountainRabbit8();
        System.out.println("산토끼 객체 생성~~~");
    }
}

