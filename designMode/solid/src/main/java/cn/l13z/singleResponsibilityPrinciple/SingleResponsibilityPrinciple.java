package cn.l13z.singleResponsibilityPrinciple;

// 场景：汽车系统中，需要处理汽车行驶和收音机播放两个独立的功能
// Scenario: In an automotive system, two separate functions need to be handled: car driving and radio playback

class Car {

    public void drive() {
        System.out.println("Car is driving");
    }
}

class CarRadio {

    public void play() {
        System.out.println("CarRadio is playing");
    }
}

/**
 * @author AlfredOrlando
 */
public class SingleResponsibilityPrinciple {

    public static void main(String[] args) {
        Car car = new Car();
        CarRadio carRadio = new CarRadio();

        car.drive();
        carRadio.play();
    }

}


