class Rabbit4{
    String shape;
    int xpos;
    int ypos;

    void move(int x,int y){
        this.xpos=x;
        this.ypos=y;
    }
}

class HOuseRabbit4 extends Rabbit4 {
    String owner;
    void eatfeed(){
        System.out.println(("점토끼가 사료를 먹습니다."));
    }
}
class MountainRabbit4 extends Rabbit4{
    String mountain;
    void eatwildglass(){
        System.out.println("산토끼가 풀을 먹습니다.");
    }
}

public class Code08_03 {
    public static void main(String[] args){
        HOuseRabbit4 hrabbit= new HOuseRabbit4();
        MountainRabbit4 mrabbit= new MountainRabbit4();

        hrabbit.shape="삼각형";
        hrabbit.owner="난생이";
        hrabbit.move(100,100);
        hrabbit.eatfeed();

        mrabbit.shape="네모";
        mrabbit.mountain="설악산";
        mrabbit.move(200,200);
        mrabbit.eatwildglass();

    }
}
