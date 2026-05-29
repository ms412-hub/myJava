class Rabbit7{
    int xpos;
    int ypos;

    void move(int x, int y){
        this.xpos=x;
        this.ypos=y;
    }
}

class HouseRabbit7 extends Rabbit7{

    void move(int x, int y){
        this.xpos=x;
        this.ypos=y;

        if (this.xpos>100)
            this.xpos=100;
        if (this.ypos>100)
            this.ypos=100;
    }
}
class MountainRabbit7 extends Rabbit7{

}

public class Code08_06 {
    public static void main(String[] args){
        HouseRabbit7 hRabbit7 = new HouseRabbit7();
        MountainRabbit7 mRabbit7 = new MountainRabbit7();

        hRabbit7.move(500,500);
        mRabbit7.move(500,500);

        System.out.printf("집토끼 위치 : (%d,%d)\n",hRabbit7.xpos,hRabbit7.ypos);
        System.out.printf("산토끼 위치 : (%d,%d)\n",mRabbit7.xpos,mRabbit7.ypos);
    }
}
