package cn.l13z.FactoryMethod.simpleFactory;

// 产品接口
interface Product {

    void display();
}

// 具体产品1
class ConcreteProductA implements Product {

    @Override
    public void display() {
        System.out.println("Product A");
    }

}

// 具体产品B
class ConcreteProductB implements Product {

    @Override
    public void display() {
        System.out.println("Product B");
    }
}

public class SimpleFactory {
    public  static Product createProduct(String type) {
        switch (type) {
            case "A":
                return new ConcreteProductA();
            case "B":
                return new ConcreteProductB();
            default:
                throw new IllegalArgumentException("Invalid product type");
        }
    }

}

// 客户端代码
 class Client {
    public static void main(String[] args) {
        Product productA = SimpleFactory.createProduct("A");
        Product productB = SimpleFactory.createProduct("B");

        productA.display();  // Output: Product A
        productB.display();  // Output: Product B
    }
}
