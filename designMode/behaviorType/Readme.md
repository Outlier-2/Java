# 行为型设计模式

## 概念

行为型设计模式关注对象之间的通信、职责分配和算法的抽象。这些模式通过定义对象间的算法和责任分配来完成行为。

## 主要目标

1. **责任链模式（Chain of Responsibility Pattern）：** 将请求的发送者和接收者解耦，使多个对象都有机会处理请求，形成一个链。

2. **命令模式（Command Pattern）：** 将请求封装成一个对象，使发出请求的责任和执行请求的责任分开，可以灵活地控制请求的调用。

3. **迭代器模式（Iterator Pattern）：** 提供一种方法顺序访问一个聚合对象中的各个元素，而无需暴露该对象的内部表示。

4. **中介者模式（Mediator Pattern）：** 用一个中介对象来封装一系列对象的交互，使各对象之间松耦合。

5. **备忘录模式（Memento Pattern）：** 在不破坏封装的情况下，捕获一个对象的内部状态，以便稍后恢复到这个状态。

6. **观察者模式（Observer Pattern）：** 定义对象间的一种一对多的依赖关系，使得当一个对象状态改变时，所有依赖它的对象都会得到通知并自动更新。

7. **状态模式（State Pattern）：** 允许一个对象在其内部状态改变时改变其行为，使对象看起来似乎修改了其类。

8. **策略模式（Strategy Pattern）：** 定义一系列算法，将每个算法封装起来，并使它们可以互换，使得算法的变化不会影响到使用算法的客户。

9. **模板方法模式（Template Method Pattern）：**
   定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以在不改变算法结构的情况下重新定义算法的某些步骤。

10. **访问者模式（Visitor Pattern）：** 表示一个作用于某对象结构中的各元素的操作，可以在不改变各元素的类的前提下定义作用于这些元素的新操作。

这些模式都属于行为型设计模式，通过不同的方式组织对象之间的通信和职责，以满足系统的需求。

# Behavioral design patterns

## Concept

Behavioral design patterns focus on communication between objects, the assignment of duties, and the
abstraction of algorithms. These patterns accomplish behavior by defining algorithms and the
distribution of responsibilities between objects.

## Primary Objective

1. Chain of Responsibility Pattern :* decouple the sender and receiver of a request, giving multiple
   objects a chance to process the request, forming a chain.

2. Command Pattern :* Encapsulates the request into an object, separating the responsibility for
   making the request from the responsibility for executing the request, and allowing for flexible
   control over the invocation of the request.

3. Iterator Pattern :* provides a way to access elements in an aggregate object sequentially without
   exposing the internal representation of the object.

4. Mediator Pattern:* Encapsulates the interaction of a series of objects with a single mediator
   object, so that the objects are loosely coupled to each other.

5. Memento Pattern:* Capture the internal state of an object without breaking the encapsulation so
   that you can later return to that state.

6. Observer Pattern :* defines a one-to-many dependency between objects, so that when an object's
   state changes, all objects that depend on it are notified and automatically updated.

7. State Pattern :* allows an object to change its behavior when its internal state changes, making
   it appear as if the object has modified its class.

8. Strategy Pattern :* define a series of algorithms, encapsulate each algorithm, and make them
   interchangeable so that changes in the algorithm do not affect the customers who use the
   algorithm.

9. Template Method Pattern :* define the skeleton of the algorithm in an operation, while delaying
   some steps into subclasses. Template methods make it possible for subclasses to redefine certain
   steps of the algorithm without changing the structure of the algorithm.

10. Visitor Pattern :* represents an action that acts on elements in an object's structure, and new
    actions can be defined for each element without changing the class of each element.

These patterns are behavioral design patterns that organize communication and responsibilities
between objects in different ways to meet the needs of the system.