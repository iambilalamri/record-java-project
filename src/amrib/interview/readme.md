## What is the difference between a class and an object?
A class is a blueprint or template for creating objects. An object is an
instance of a class. 

## What does instantiating mean?
Instantiating means creating an instance of a class: new Customer()

## What is the difference between stack and heap memory? How are they managed?
Stack is used for storing primitive types (numbers, boolean and
character) and variables that store references to objects in the heap.
Variables stored in the stack are immediately cleared when they go out
of scope (eg when a method finishes execution). Objects stored in the
heap get removed later on when they’re no longer references. This is
done by Java’s garbage collector.

## What are the problems of procedural code? How does object-oriented programming help solve these problems?
Big classes with several unrelated methods focusing on different
concerns and responsibilities. These methods often have several
parameters. You often see the same group of parameters repeated
across these methods. All you see is procedures calling each other
passing arguments around.<br/>

By applying object-oriented programming techniques, we extract these
repetitive parameters and declare them as fields in our classes. Our
classes will then encapsulate both the data and the operations on the
data (methods). As a result, our methods will have fewer parameters
and our code will be cleaner and more reusable.

## What is encapsulation?

Encapsulation is the first principle of object-oriented programming.
It suggests that we should bundle (paquet) the data and operations on the data
inside a single unit (class).

## Why should we declare fields as private ?

How we store data in an object is considered an implementation
detail. We may change how we store the data internally. Plus, we don’t
want our objects to go into a bad state (hold bad data). That’s why we
should declare fields as private and provide getters and or setters only if
required. These setters can ensure our objects don’t go into a bad state
by validating the values that are passed to them

## What is abstraction?

Abstraction is the second principle of object-oriented programming.
It suggests that we should reduce complexity by hiding the unnecessary
implementation details. As a metaphor, think of the remote control of
your TV. All the complexity inside the remote control is hidden from
you. It’s abstracted away. You just work with a simple interface to
control your TV. We want our objects to be like our remote controls.

## What is coupling

Coupling represents the level of dependency between software
entities (eg classes). The more our classes are dependent on each other,
the harder it is to change them. Changing one class may result in several
cascading and breaking changes.

## How does the abstraction principle help reduce coupling?

By hiding the implementation details, we prevent other classes from
getting affected when we change these details. For example, if the logic
board and transistors inside a remote control change from one model to
another, we’re not affected. We still use the same interface to work with
our TV. Also, reducing these details and exposing fewer methods makes 
our classes easier to use. For example, remote controls with fewer
buttons are easier to use. 

## What are constructors?

Constructors are called when we instantiate our class. We use them
to initialize our objects. Initialization means putting an object into an
early or initial state (eg giving it initial values). 

## What is method overloading? 
Method overloading means declaring a method with the same name
but with different signatures. The number, type and order of its
parameters will be different.

## What are static methods?
Static methods are accessible via classes, not objects.

## How can we have ClassA inherit from ClassB?
class ClassA extends ClassB

## What will be printed on the console and why?
var point1 = new Point(1, 2);<br/>
var point2 = new Point(1, 2);<br/>
System.out.println(point1.equals(point2)); // False <br/>

False - even though point1 and point2 have the same coordinates, the
default implementation of the equals() method compares objects for
reference equality. These two objects are in two different locations in
memory, that’s why the equals() method returns false.

## What does hashCode() method of the Object class return?
The hashCode() methods returns a numeric value that is calculated
based on the address of the object in memory. 

## What is a default constructor? 
A constructor without any parameters. If we don’t create it, the Java
compiler will automatically add one to our classes.

## How can we add a constructor to the Customer class? 
public Constructor(String name) {}

## What is the super keyword?
The super keyword is a reference to the base or parent class. We can
use it to access the members (fields and methods) or call the
constructors of the base class. In contrast, the this keyword returns a
reference to the current object.

## What is the difference between private and protected access modifiers?
Members marked with protected or private access modifiers are
only accessible inside of a class. Protected members are inherited and
are accessible by child (derived) classes. Private members are not.

## How accessible is a field or method if it’s declared without an access modifier?
If we omit the access modifier, the member will have the default
access modifier which makes that member public in package. In other
words, that member will be public in the package but private outside of
the package.

## What is method overriding? How is it different from method overloading?
Method overriding means changing the implementation of an
inherited method in a subclass. For example, we can override the
equals() or hashCode() methods of the Object class. Method
overloading means declaring a method with different signatures
(different number, type and order of parameters).

## What is the benefit of applying the @Override annotation when overriding a method?
It signals the Java compiler that we’re overriding a method in the
base class and this helps the compiler check our code for correctness. It
will ensure the signature of the method in the subclass matches the on
declared in the base class. Also, if we remove this method from the base
class, the compiler will let us know and we can remove the method in
the subclass as well.

## The Customer class inherits from the User class. Can we pass a Customer object to this method? Why?
`public void print(User user) {}`
Yes. We can pass an instance of any classes that inherit directly or
indirectly from the User class. In this case, the customer object will get
automatically upcast (meaning it’ll get converted to its base type - User).
If we need to work with members of the customer object in this method,
we need to explicitly downcast it by prefixing the object with
(Customer).

## What is the usage of the instanceof operator?

It tells us if an object is an instance of a class. We use it before
casting an object to a different type to make sure we don’t get a casting
exception. 

## What are the four principles of object-oriented programming?
The four principles of object-oriented programming are:
1. Encapsulation: bundling the data and operations on the data inside
a single unit (class).
2. Abstraction: reducing complexity by hiding unnecessary details
(metaphor: the implementation detail of a remote control is hidden
from us. We only work with its public interface.)
3. Inheritance: a mechanism for reusing code.
4. Polymorphism: a mechanism that allows an object to take many
forms and behave differently. This will help us build extensible
applications.
 
## When do we use abstract classes?
An abstract class is a partially-implemented (half-cooked) class. We
cannot instantiate them. But we use them to share some common code
across their subclasses. 

## Can we have an abstract class without any abstract methods?
Yes! An abstract class does not need abstract methods. But if we
mark a method as abstract, we should mark the class as abstract as well. 

## When do we use final classes?
Final classes cannot be inherited. We use them when we’ve made
certain assumptions about a class and we want to prevent other classes
extending our class and break those assumptions. 

## What is the diamond problem?
The diamond problem happens in languages that support multiple
inheritance. If two classes (B, C) derive from A and are also the parents 
of another class (D), we see a diamond. If the top class (A) declares a
method (eg toString) and its children (B and C) override this method,
it’s not clear which implementation will be inherited by D.

## Does Java support multiple inheritance?
No.

## Why do we use interfaces?

## What is tightly-coupled code?
Tightly-coupled code is code that is hard to change because there is a
strong dependency between the entities (eg classes) in the code.
Changing one class may result in several cascading, breaking changes in
the code.

## What is dependency injection?
Dependency injection refers to passing or injecting dependencies of a
class.

## What are the various types of dependency injection?
We can inject dependencies via constructors, setters and regular
methods. 

## What is the Interface Segregation Principle (ISP)?
The Interface Segregation Principle (ISP) suggests that we should
segregate or divide big, fat interfaces into smaller ones, each focusing on
a single responsibility or capability. Smaller interfaces are less likely to
change. Changes to one capability, will only affect a single interface and
fewer classes that depend on that interface. 

## Why shouldn’t we declare fields, static or private methods in interfaces?
Fields, static and private methods are all about implementation.
Interfaces are contracts and should not have any implementation. 

## What are the similarities and differences between interfaces and abstract classes?
Both are abstract concepts and we cannot instantiate them.
Interfaces are contracts and should only have method declarations.
Abstract classes are partially-implemented classes. We use them to
share some common code across their derivates. The new features in
Java allow writing code and logic in interfaces but this is a bad practice
and should be avoided.

## Should we extract an interface from every class? Why?
Blindly extracting interfaces doesn’t solve any problems nor is it
considered a best practice. If you extract an interface from every single
class, you’ll end up with an explosion of interfaces that don’t necessarily
add any values. You should use interfaces in situations where you want
to decouple a class from its dependencies so you can swap these
dependencies. This allows building applications that are extensible and
testable.

## Garbage Collector 
Le ramasse-miettes est une fonctionnalité de la JVM qui a pour rôle de gérer la mémoire notamment en libérant celle des objets qui ne sont plus utilisés.

## Serialization
La sérialisation est un procédé qui permet de rendre un objet ou un graphe d'objets de la JVM persistant pour stockage ou échange et vice versa

## AutoBoxing
la conversion d'une valeur primitive en un objet de la classe wrapper correspondante est appelée autoboxing

## Unboxing (Inversement)

## Abstract Class
Une classe abstraite est une classe déclarée abstract- elle peut ou non inclure des méthodes abstraites. Les classes abstraites ne peuvent pas être instanciées, mais elles peuvent être sous-classées

## Some Java frameworks
1. JSF (Java Server Faces), a Java web framework that makes easier the construction of user interfaces for server-based applications
2. GWT (Google Web Toolkit), an open-source set of tools that helps programmers to create and maintain JavaScript applications in Java Spring, a Java framework which doesn’t impose any specific programming model
3. Struts
4. Hibernate
5. Grails
6. Play!
7. Vaadin
8. Maven

## Java Machine Virtuel
La JVM est une machine virtuelle qui permet à l'ordinateur d'exécuter des programmes Java qui ont été compilés en bytecode

## Notes
1. L'interface ne peut pas herité d'un classe.
2. L'interface peut heriter d'un interface.
3. Une classe ne peut pas heriter d'un interface.