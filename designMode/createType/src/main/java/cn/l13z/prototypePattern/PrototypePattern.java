package cn.l13z.prototypePattern;

interface Shape extends Cloneable{
    void draw();
    Shape clone();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("This is a Rectangle");
    }

    @Override
    public Shape clone() {
        return new Rectangle();
    }
}


class Circle implements Shape {
    @Override
    public Shape clone() {
        return new Circle();
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Client {
    public static void main(String[] args) {
        Shape originalRectangle = new Rectangle();
        Shape clonedRectangle = originalRectangle.clone();

        Shape originalCircle = new Circle();
        Shape clonedCircle = originalCircle.clone();

        originalRectangle.draw();  // Drawing a Rectangle
        clonedRectangle.draw();    // Drawing a Rectangle

        originalCircle.draw();     // Drawing a Circle
        clonedCircle.draw();       // Drawing a Circle
    }
}

