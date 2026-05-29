abstract class Rabbit9{
    int xpos;
    int ypos;

    void move(int x, int y) {
        this.xpos=x;
        this.ypos=y;
    }

    abstract void sleep();
}

class HouseRabbit9 extends Rabbit9{
    @Override
    void sleep() {
        System.out.println("집토끼가 우리에서 잠자고 있습니다.");
    }
}

class MountainRabbit9 extends Rabbit9{
    @Override
    void sleep() {
        System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
    }
}

public class Code08_08 {
    public static void main(String[] args){
        HouseRabbit9 hRabbit9 = new HouseRabbit9();
        MountainRabbit9 mRabbit9 = new MountainRabbit9();

        hRabbit9.sleep();
        mRabbit9.sleep();
    }
}
