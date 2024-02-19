# Design Mode / 设计模式

## DesignPrinciples / 设计原则 (SOLID)

### 单一责任原则（Single Responsibility Principle - SRP）：

意味着一个类应该只有一个引起变化的原因，即一个类应该只有一个责任。这有助于提高类的可维护性和降低耦合度。

### 开闭原则（Open/Closed Principle - OCP）：

表明软件实体（类、模块、函数等）应该对扩展开放，对修改关闭。这意味着可以通过扩展来添加新功能，而无需修改已有的代码。

### 里氏替换原则（Liskov Substitution Principle - LSP）：

子类必须能够替换其基类而不影响程序的正确性。简而言之，子类应该表现得像其基类一样，符合预期。

### 迪米特法则（Law of Demeter - LoD）：

也称为最少知识原则，表示一个对象应该对其他对象有最少地了解。对象之间的耦合越低，系统越容易维护和扩展。

### 接口隔离原则（Interface Segregation Principle - ISP）：

接口应该是客户端所需的最小接口集合，不应该强迫客户端实现它们不使用的接口。这有助于防止类因不需要的接口而变得臃肿。

### 依赖倒置原则（Dependency Inversion Principle - DIP）：

高层模块不应该依赖于低层模块，二者都应该依赖于抽象。抽象不应该依赖于具体细节，而具体细节应该依赖于抽象。这有助于实现松耦合，提高代码的灵活性和可维护性。

| 设计原则   | 描述                                                    | 具体实现模式                                          | 文件                                                                                                   |
|--------|-------------------------------------------------------|-------------------------------------------------|------------------------------------------------------------------------------------------------------|
| 单一责任原则 | 一个类只有一个责任，提高可维护性和降低耦合度。                               | 每个类只负责一个明确的职责。                                  | [单一](./solid/src/main/java/cn/l13z/singleResponsibilityPrinciple/SingleResponsibilityPrinciple.java) |
| 开闭原则   | 软件实体应对扩展开放，对修改关闭。通过扩展来添加新功能，而不是修改已有的代码。               | 使用抽象类和接口，依赖注入等方式来实现。                            | [开闭](./solid/src/main/java/cn/l13z/openClosedPrinciplePattern/OpenClosedPrinciplePattern.java )      |
| 里氏替换原则 | 子类可以替换其基类而不影响程序的正确性。子类应该表现得像其基类一样，符合预期。               | 避免在子类中重写基类方法改变其原有含义。(对含义不改变，我们重写即可达到目的Override) | [里氏替换](./solid/src/main/java/cn/l13z/liskovSubstitutionPattern/LiskovSubstitutionPattern.java)       |
| 迪米特法则  | 对象之间的耦合越低越好，一个对象不应了解太多其他对象的内部细节。                      | 尽量降低对象之间的直接交互，通过中介者或者依赖注入。                      | [迪米特](./solid/src/main/java/cn/l13z/lawOfDemeterPattern/LawOfDemeterPattern.java)                    |
| 接口隔离原则 | 接口应该是客户端所需的最小接口集合，不应该强迫客户端实现不需要的接口。                   | 将庞大的接口拆分为小的、更具体的接口。                             | 📆                                                                                                   |
| 依赖倒置原则 | 高层模块不应该依赖于低层模块，二者都应该依赖于抽象。抽象不应该依赖于具体细节，提高代码的灵活性和可维护性。 | 使用抽象类或接口来定义高层模块的抽象，低层模块依赖于相同的抽象。(利用多态实现)        | [依赖倒置](./solid/src/main/java/cn/l13z/dependencyInversionExample/DependencyInversionExample.java)     |

| Design Principle      | Description                                                                                                                                                                      | Specific Implementation Patterns                                                                                                     |
|-----------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------|
| Single Responsibility | A class should have only one reason to change, enhancing maintainability and reducing coupling.                                                                                  | Each class should have a single, clear responsibility.                                                                               |
| Open/Closed           | Software entities should be open for extension but closed for modification. Use extension for adding new features without modifying existing code.                               | Use abstract classes, interfaces, and dependency injection, among others.                                                            |
| Liskov Substitution   | Subtypes must be substitutable for their base types without altering the correctness of the program.                                                                             | Avoid overriding methods in subclasses that change their original meanings.                                                          |
| Law of Demeter        | Objects should have low coupling; an object should not have too much knowledge about the internal details of other objects.                                                      | Minimize direct interactions between objects, use mediators or dependency injection.                                                 |
| Interface Segregation | Clients should not be forced to implement interfaces they do not use.                                                                                                            | Split large interfaces into smaller, more specific ones.                                                                             |
| Dependency Inversion  | High-level modules should not depend on low-level modules; both should depend on abstractions. Abstractions should not depend on details; details should depend on abstractions. | Use abstract classes or interfaces to define abstractions for high-level modules; low-level modules depend on the same abstractions. |

## SpecificLists / 具体列表

| 类型                          | 地址                       | 
|-----------------------------|--------------------------|
| CreateType / 创建型设计模式        | [创建型](./createType)      |
| Structural / 结构型设计模式        | [结构型](./structuralType)  |
| BehaviorType / 行为型型设计模式     | [行为型](./behaviorType)    |
| OtherDesignModes / 其他类型设计模式 | [其他](./otherDesignModes) |

