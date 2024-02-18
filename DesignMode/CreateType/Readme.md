# 创建型设计模式

## 概念

创建型设计模式关注对象的实例化过程，提供一种机制处理对象的创建和初始化。这类模式帮助隐藏系统中对象的创建方式，使系统更加灵活、可扩展，并降低了对象之间的耦合。

## 主要目标

1. **抽象对象创建过程：** 将对象的创建过程与其使用相分离，使系统更具灵活性。

2. **隐藏细节：** 将对象的创建细节隐藏在系统内部，使客户端代码无需了解对象如何创建和初始化。

3. **降低耦合度：** 允许系统根据需要改变实例化的类，而无需修改客户端代码。

## 常见创建型设计模式

1. **简单工厂模式（Simple Factory Pattern）：** 由一个工厂类根据传入的参数决定创建哪一种产品类的实例。客户端无需关心产品的具体创建过程。

2. **工厂方法模式（Factory Method Pattern）：**
   定义一个创建对象的接口，但将实际的实例化推迟到子类中。每个子类都可以通过选择性重写工厂方法来改变所创建的对象类型。

3. **抽象工厂模式（Abstract Factory Pattern）：** 提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们的具体类。抽象工厂模式是工厂方法模式的扩展。

4. **建造者模式（Builder Pattern）：** 将一个复杂对象的构建过程与其表示相分离，使同样地构建过程可以创建不同的表示。

5. **原型模式（Prototype Pattern）：** 使用原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象。

6. **单例模式（Singleton Pattern）：** 保证一个类只有一个实例，并提供一个全局访问点。

这些模式都属于创建型设计模式，通过不同的方式实现对象的创建和初始化，以满足系统的需求。

# Create a design pattern

## Concept

The Creative Design pattern focuses on the process of instantiating objects and provides a mechanism
to handle the creation and initialization of objects. This type of pattern helps hide how objects
are created in the system, making the system more flexible and scalable, and reducing the coupling
between objects.

## Primary Objective

1. Abstract Object Creation Process: Separate the process of creating objects from their use to make
   the system more flexible.

2. Hide Details: Hide the creation details of objects inside the system, so that client code does
   not need to know how objects are created and initialized.

3. Reduced Coupling: Allows the system to change instantiated classes as needed without modifying
   the client-side code.

## Common creative design patterns

1. Simple Factory Pattern :* a factory class that decides which instance of the product class to
   create based on the parameters passed in. The client doesn't need to care about the specific
   creation process of the product.

2. Factory Method Pattern :* defines an interface for creating objects, but defers the actual
   instantiation to a subclass. Each subclass can change the type of object it creates by
   selectively overriding the factory method.

3. Abstract Factory Pattern :* provides an interface for creating a series of related or
   interdependent objects without specifying their concrete classes. The Abstract Factory pattern is
   an extension of the Factory Method pattern.

4. Builder Pattern :* decouples the construction process of a complex object from its
   representation, so that the same build process can create different representations.

5. **Prototype Pattern:* Use prototype instances to specify the kinds of objects to be created, and
   create new objects by copying those prototypes.

6. Singleton Pattern :* guarantees that there is only one instance of a class and provides a global
   access point.

These patterns are all creative design patterns, and objects are created and initialized in
different ways to meet the needs of the system.
