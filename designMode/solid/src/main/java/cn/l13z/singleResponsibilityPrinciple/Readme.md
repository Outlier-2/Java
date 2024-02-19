# 区分单例与单一责任 / Distinguish between singleton and single responsibility

## 单一职责原则（Single Responsibility Principle）：

定义： 单一职责原则是面向对象设计中的一个原则，它指导一个类应该只有一个责任，也就是说，一个类应该只有一个引起它变化的原因。
目的： 该原则的目标是提高代码的可维护性、可理解性和可扩展性。通过确保每个类都有一个明确的职责，可以更容易地理解和维护代码，并且在需要修改的时候不容易引起不相关的变化。
例子： 一个处理用户登录的类应该只关心用户认证，而不涉及其他业务逻辑，比如订单处理。如果将这两个职责混在一起，会导致类的职责不清晰，难以维护。

Definition: The Single Responsibility Principle is a principle in object-oriented design that
dictates that a class should have only one responsibility, that is, a class should have only one
cause for its change.
Purpose: The goal of this principle is to improve the maintainability, comprehensibility, and
extensibility of the code. By ensuring that each class has a clear role, the code is easier to
understand and maintain, and less likely to cause irrelevant changes when changes need to be made.
Example: A class that handles user logins should only care about user authentication and not other
business logic, such as order processing. If these two responsibilities are mixed together, the
responsibilities of the class are unclear and difficult to maintain.

## 单例模式（Singleton Pattern）：

定义： 单例模式是一种创建型设计模式，确保一个类只有一个实例，并提供一个全局访问点以便于其他类获取该实例。
目的： 该模式的目标是确保在整个应用程序中只有一个实例，并提供对该实例的全局访问。通常用于管理共享资源或状态。
例子： 一个日志记录器类可能是一个单例，确保在整个应用程序中只有一个日志记录器实例，以便记录系统的日志。

Definition: A singleton pattern is a creative design pattern that ensures that there is only one
instance of a class and provides a global access point for other classes to access that instance.
Purpose: The goal of the pattern is to ensure that there is only one instance in the entire
application and to provide global access to that instance. Typically used to manage shared resources
or status.
Example: A logger class might be a singleton, ensuring that there is only one instance of the logger
in the entire application in order to log the system.
区别：

单一职责原则关注于类的职责，强调一个类应该只有一个原因引起变化。
单例模式关注于一个类只有一个实例，并提供全局访问点，以确保在应用程序中只有一个实例存在。
单一职责原则是一种面向对象设计原则，而单例模式是一种创建型设计模式。它们解决的问题和关注的方面不同。

Distinguish:

The Single Responsibility Principle focuses on the responsibilities of a class, emphasizing that a
class should have only one reason for change.
The singleton pattern focuses on having only one instance of a class and provides a global access
point to ensure that only one instance exists in the application.
The singleton principle is an object-oriented design principle, while the singleton pattern is a
creative design pattern. They address different issues and focus on different areas.