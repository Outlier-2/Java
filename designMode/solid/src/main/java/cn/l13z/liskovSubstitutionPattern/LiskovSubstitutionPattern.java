package cn.l13z.liskovSubstitutionPattern;

// 场景：鸟类系统中，需要处理不同种类的鸟，且某些鸟不能飞

class Bird {
    public void fly() {
        System.out.println("I can fly");
    }
}

class Penguin extends Bird {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}

/**
 * @author AlfredOrlando
 */
public class LiskovSubstitutionPattern {

    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        penguin.fly();  // 企鹅有飞但是会飞
    }
}
