# heading
## heading


> Bottom up approach where we fisrt thing of the task the behaviour and stuff.<br>
> main is executed by JVM from where the program run.
> java has a lot of boiler plate code ==>> non usable code


````JAVA
Human abject = new Human();
//refrence of human = object of human
Himan abject  = new Man();
//refrence of human = object of man
````

> works on objecs

> access modifiers:
> 1. Default
> 2. Public
> 3. Private
> 4. Protected

> more secure
> features like -- overloading, overiding, inheritence

> 4 pillars of OOPS
*  Encapsulation
*  Polymorphism
*  abstraction
*  Inheritance

## Inheritance / Generalisation

> property of one object is aquired by another object
> is-a replationship
> whenever you call the parameterised constructor of sub class it calls the default constructor of super class not he parameterised constructor
> whenever we inherit any class A to B the super(); is by default persent in the B's constructor 
> Some advantages
* code reusablity
* Extensiblity
* Overridding
* Data hidding (Privatising)
>no multiple inheritance supported --> Multiple parents having same object --> it is opposite of hierarchical inheritance

## **polymorphism**
> having same name with different dwfinations
> 2 types: -
* Compile time / Static  --> Over **_loading_** --> Compiler will evaluate that which MEthord will be executed with which funtion call.
* *  Over **_loading_**
* * * must have different argument list
* * * can have different return type
* Run time / Runtime --> Over **_ridding_** --> 
* *  Over **_ridding_**
* * * must have same argument list
* * * must have same return type

## **Abstraction**
> Achieving runtime polymorphism
> Achieved through abstract classes and interfaces 
### abstract
> Abstract keyword
> we can define as well as declare methods.
> if we dont want to create object of any class we declare it abstract.
> if we declare an method abstract it does not have any body --> that means it is only declaration
> if we extend an abstract class we need to define the body of its abstract methods in sub class.
>  
````JAVA
abstract class Human
{
    public abstract void eat();
    
	public void walk()
	{

	}
}

class Man extends Human
{
	public void eat()
	{
		
	}
}
public class AbstractDemo 
{
	public static void main(String[] args)
	{
		Human obj = new Man();
	}
}
````
* * we cannot create objects
* * we can have abstract/non abstract methods
* * can have static methods and constructors 
* * can have final methods.

### interface
> we can only declare methods.
>We can say its the better version of the abstract class
>it enables multiple inheritance and help in acheiving loose copling
> We can create refrence of interface but we cannot create object of it.
> methods have no bodyin interfaces.
> main function is to achieve multiple inheritance as we can implement many interfaces.
> all the methods in interface are bydefault public abstract.
> in abstract class we can define methods and in interface we cannot==>> main difference.
> <b> In java 1.8 we can define methods </b>
## Class--> extends --> Class
## Class--> implemets --> Interface
## Interface--> extends --> Interface
> Types: - 
> * Normal ==>> if an interface has more than one methods.
> * Marker ==>> no method.
> * Single abstract method ==>> which has only one method. ==>> from java 8 it is called Functional interface ==>> Lamda expression
> lamda came from scala lang. ==>> java acquired scala.
````java
interface Ac
{
	void show();
}

public class AnonymousInterface 
{
	public static void main(String[] args)
	{
		Ac obj =() -> System.out.println("Im the best");
		
				obj.show();
	}
}
````


### encapsulation
> nothing but privatising all the variables
> implemting getters and setters is the key of encapsulation
> data hidding which is basically security of our data

## Wrapper class

> Primitive is fast.
> frameworks like hibernate work only with wrapper classes and not primitive datatypes
````JAVA
int i = 5; //primitive datatype  ==>> Simple variable
Integer ii = new Integer(5); //Wrapper class ==>> Object class
Integer ii = new Integer(5); //Boxing ==>> Wrapping
int j = ii.intValue(); //Unboxing ==>> Unwrapping
Integer val = i; //AutoBoxing ==>> AutoWrapping
int k = val; //AutoUnboxing
````

## Final
> final variable value can't be changed.
> it can assign value only once.
> class is declared final if we dont want ot let other classes extend it.
> method ==>> no one can override that method

### Anonymous class
> Main function is to override the show method of class without creating another class.
````JAVA
class Ab
{
	public void show()
	{
		System.out.println("in A show");
	}
}
public class AnonymousExample 
{
	public static void main(String[] args)
	{
		Ab obj = new Ab()
				{
					public void show()
					{
						System.out.println("im the best");
					}
				};
				
		obj.show();
	}
}

// With interface
//main adv. is it not use lots of memory 
interface Ac
{
	void show();
} 
public class AnonymousInterface 
{
	public static void main(String[] args)
	{
		Ac obj = new Ac()
				{
					public void show()
					{
						System.out.println("Im the best");
					}
				};
		
				obj.show();
	}
}
````