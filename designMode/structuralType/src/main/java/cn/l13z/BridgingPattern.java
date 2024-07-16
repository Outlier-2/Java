// 实现部分接口
interface Implementor {
    void operationImpl();
}

// 具体实现类A
class ConcreteImplementorA implements Implementor {
    public void operationImpl() {
        System.out.println("Concrete Implementor A operation");
    }
}

// 具体实现类B
class ConcreteImplementorB implements Implementor {
    public void operationImpl() {
        System.out.println("Concrete Implementor B operation");
    }
}

// 抽象部分
abstract class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}

// 扩展抽象部分
class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    public void operation() {
        System.out.println("Refined Abstraction operation");
        implementor.operationImpl();
    }
}

// 客户端代码
public class Main {
    public static void main(String[] args) {
        Implementor implementorA = new ConcreteImplementorA();
        Abstraction abstractionA = new RefinedAbstraction(implementorA);
        abstractionA.operation();

        Implementor implementorB = new ConcreteImplementorB();
        Abstraction abstractionB = new RefinedAbstraction(implementorB);
        abstractionB.operation();
    }
}
