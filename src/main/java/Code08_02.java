class Rabbit3{
    String shape;
    int xpos;
    int ypos;

    void move(int x,int y){
        this.xpos=x;
        this.ypos=y;
    }
}

class HOuseRabbit3 extends Rabbit3 {
    String owner;
    void eatfeed(){
        System.out.println(("점토끼가 사료를 먹습니다."));
    }
}
class MountainRabbit3 extends Rabbit3{
    String mountain;
    void eatwildglass(){
        System.out.println("산토끼가 풀을 먹습니다.");
    }
}

public class Code08_02 {
    public static void main(String[] args){

    }
}
