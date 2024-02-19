package cn.l13z.FactoryMethod.abstractFactory;

// 产品A接口
interface ProductA {

    void display();
}

// 产品B接口
interface ProductB {

    void display();
}

// 抽象工厂接口
interface AbstractFactory {

    ProductA createProductA();

    ProductB createProductB();
}

// 具体产品A1
class ConcreteProductA1 implements ProductA {

    @Override
    public void display() {
        System.out.println("Product A1");
    }
}

// 具体产品A2
class ConcreteProductA2 implements ProductA {

    @Override
    public void display() {
        System.out.println("Product A2");
    }
}

// 具体产品B1
class ConcreteProductB1 implements ProductB {

    @Override
    public void display() {
        System.out.println("Product B1");
    }
}

// 具体产品B2
class ConcreteProductB2 implements ProductB {

    @Override
    public void display() {
        System.out.println("Product B2");
    }
}

// 具体工厂1
class ConcreteFactory1 implements AbstractFactory {

    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}

// 具体工厂2
class ConcreteFactory2 implements AbstractFactory {

    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}

// 客户端代码
class Client {

    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractFactory factory2 = new ConcreteFactory2();

        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();

        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();

        productA1.display();  // Output: Product A1
        productB1.display();  // Output: Product B1

        productA2.display();  // Output: Product A2
        productB2.display();  // Output: Product B2
    }
}
