###Factory pattern is one of the most used design patterns in Java.

The factory design pattern is used when we have a superclass with multiple sub-classes and based on input, we need to return one of the sub-class. This pattern takes out the responsibility of the instantiation of a class from the client program to the factory class.
Super class in factory design pattern can be an interface, abstract class or a normal java class. For our factory design pattern 

##Factory Design Pattern Advantages
    1. Factory design pattern provides approach to code for interface rather than implementation.
    2. Factory pattern removes the instantiation of actual implementation classes from client code. Factory pattern makes our code more robust, 
        less coupled and easy to extend. For example, we can easily change MailSender class implementation because client program is unaware of this.
    3. Factory pattern provides abstraction between implementation and client classes through inheritance.

Factory Design Pattern Examples in JDK

    java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.
    valueOf() method in wrapper classes like Boolean, Integer etc.