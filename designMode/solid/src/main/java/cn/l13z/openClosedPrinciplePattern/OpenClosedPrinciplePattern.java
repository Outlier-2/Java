package cn.l13z.openClosedPrinciplePattern;

// 场景：图形绘制系统中，需要支持绘制不同形状，且后续可能添加新的形状
// Scenario: In the graphics system, you need to support drawing different shapes, and new shapes may be added in the future

abstract class Shape {
    abstract void draw();
}
// 实现类 :
class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("draw a circle");
    }
}
class Square extends Shape {

    @Override
    void draw() {
        System.out.println("draw a square");
    }
}

public class OpenClosedPrinciplePattern {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();

        circle.draw();
        square.draw();
    }
}
