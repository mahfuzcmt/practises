Abstract class in Java is similar to interface except that it can contain default method implementation. An abstract class can have an abstract method without body and it can have methods with implementation also.

abstract keyword is used to create a abstract class and method. Abstract class in java can’t be instantiated. An abstract class is mostly used to provide a base for subclasses to extend and implement the abstract methods and override or use the implemented methods in abstract class.
Abstract Class in Java

abstract class in java, java abstract class example

Here is a simple example of an Abstract Class in Java.


package com.journaldev.design;

//abstract class
public abstract class Person {
	
	private String name;
	private String gender;
	
	public Person(String nm, String gen){
		this.name=nm;
		this.gender=gen;
	}
	
	//abstract method
	public abstract void work();
	
	@Override
	public String toString(){
		return "Name="+this.name+"::Gender="+this.gender;
	}

	public void changeName(String newName) {
		this.name = newName;
	}	
}

Notice that work() is an abstract method and it has no-body. Here is a concrete class example extending an abstract class in java.


package com.journaldev.design;

public class Employee extends Person {
	
	private int empId;
	
	public Employee(String nm, String gen, int id) {
		super(nm, gen);
		this.empId=id;
	}

	@Override
	public void work() {
		if(empId == 0){
			System.out.println("Not working");
		}else{
			System.out.println("Working as employee!!");
		}
	}
	
	public static void main(String args[]){
		//coding in terms of abstract classes
		Person student = new Employee("Dove","Female",0);
		Person employee = new Employee("Pankaj","Male",123);
		student.work();
		employee.work();
		//using method implemented in abstract class - inheritance
		employee.changeName("Pankaj Kumar");
		System.out.println(employee.toString());
	}

}

Note that subclass Employee inherits the properties and methods of superclass Person using inheritance in java.

Also notice the use of Override annotation in Employee class. Read more for why we should always use Override annotation when overriding a method.
Abstract class in Java Important Points

    abstract keyword is used to create an abstract class in java.
    Abstract class in java can’t be instantiated.
    We can use abstract keyword to create an abstract method, an abstract method doesn’t have body.
    If a class have abstract methods, then the class should also be abstract using abstract keyword, else it will not compile.
    It’s not necessary for an abstract class to have abstract method. We can mark a class as abstract even if it doesn’t declare any abstract methods.
    If abstract class doesn’t have any method implementation, its better to use interface because java doesn’t support multiple class inheritance.
    The subclass of abstract class in java must implement all the abstract methods unless the subclass is also an abstract class.
    All the methods in an interface are implicitly abstract unless the interface methods are static or default. Static methods and default methods in interfaces are added in Java 8, for more details read Java 8 interface changes.
    Java Abstract class can implement interfaces without even providing the implementation of interface methods.
    Java Abstract class is used to provide common method implementation to all the subclasses or to provide default implementation.
    We can run abstract class in java like any other class if it has main() method.