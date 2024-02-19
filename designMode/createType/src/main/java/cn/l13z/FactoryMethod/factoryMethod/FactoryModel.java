package cn.l13z.FactoryMethod.factoryMethod;

interface Product {

    void display();
}

interface ProductFactory {

    Product createProduct();
}

class ConcreteProductA implements Product {

    @Override
    public void display() {
        System.out.println("Product A");
    }
}

class ConcreteProductB implements Product {

    @Override
    public void display() {
        System.out.println("Product B");
    }
}

// 具体工厂A
class ConcreteProductFactoryA implements ProductFactory {

    @Override
    public Product createProduct() {
        return new ConcreteProductA();

    }
}

// 具体工厂B
class ConcreteProductFactoryB implements ProductFactory {

    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}

// 客户端代码
class Client {

    public static void main(String[] args) {
        ProductFactory factoryA = new ConcreteProductFactoryA();
        ProductFactory factoryB = new ConcreteProductFactoryB();

        Product productA = factoryA.createProduct();
        Product productB = factoryB.createProduct();

        productA.display();  // Output: Product A
        productB.display();  // Output: Product B
    }
}



