## Main method

In the Java programming language, every application must contain a main method whose signature is:

```java 
public static void main(String [ ] args){...}
```
The main method is the entry point for your application.


## Console Output


```java
System.out.print("Tell me off ");
System.out.println("if I’m going too fast");
```

The difference between `print` and `println` is that println adds an "enter" AKA newline to the end of the input.

## Variables
Variables act as labeled boxes to store things.  
The value of the variables can be changed later in the program.  

Each variable can store a particular type of data, chosen by you.
 There are many different types.

## Numbers
Come in many flavours, based on how large or small you need them to go, and if you need decimal points.

###### the integral types:
* byte
* short
* int
* long
###### the floating-point types:
* float
* double


```java
int temperatureToday = 18;
int myBankBalance = -65;
```

## Strings
A String is a sequence of (0 or more) characters.  
e.g. ``['H', 'e', 'l', 'l', 'o', ' ', 't', 'h', 'e', 'r', 'e', '.']``

```java
String name = "Hello World";
System.out.println("Hello Java");
```

*(These are also known as String literals, where literal means it is a fixed value in the program)*

## Concatenating Strings
Strings can be concatenated using the + operator e.g.

```java
String hello = "Hello";
String world = "World";
System.out.println(hello + " " + world);
```

You can also use different data types in concatenation.

```java
System.out.println(hello + " " + world);
```

## Booleans
A boolean can be either true or false, use this for simple flags such as:

```java
boolean haveCards = true;
haveCards = false;
```

## final keyword
The final keyword can be used on classes, methods and variables. When used on a variable, 
you can't change the object's reference to point to another reference or another object. 
In other words, its a constant rather than a variable.

```java
final boolean haveCards = true;
haveCards = false; // ERROR
```


## Arithmetic Operators
We can perform basic arithmetic operations on variables:
* `+` add
* `-` subtract
* `*` multiply
* `/` divide
* `%` mod


e.g. `int num = a + (b – c);`

## Operators  
* Comparison operators (`<`, `>`, `<=`, `>=`, `==`, `!=`) return a  Boolean (true/false).
* Logical operators: AND (`&&`), OR (`||`), and NOT (`!`).


## Code Formatting
* `{Braces}` group statements e.g. if, for and declarations e.g. class and methods

* `[Brackets]` let you get an item from a list

* `(Parentheses)` control the order of operation as in maths, and are used to give things as parameters to methods/functions


## Some code to start
```java
public class SillyEquation {
  public static void main(String[] args) {
  	int that = 2;
  	int theOther = 4;
  	int result = that + theOther;
  	System.out.println("The result is " + result);
  }
}
```

## Running your Code
Right-click and run, the editor makes this really easy!


# Naming Conventions and Rules
Naming conventions make programs more understandable and easier to read, partly just through consistency.

## Class Naming
You can only have one `public class` per file.  
The name of this class must match the file name (e.g. `public class Bob {...}` will only work in the file `Bob.java`).

## Variable Naming

Variables use lowerCamelCase (e.g. `runAway`). They should only start with a letter.

Constants use all uppercase characters separated by underscores (e.g. `MAX_PARTY_SIZE`).  
Constant names may also contain digits if appropriate, but not as the first character.

## Reserved Words in Java
There are some words that you cannot use as object or variable names in a Java program. These words are known as "reserved" words; they are keywords that are already used by the syntax of the Java programming language.

```java
int int = 1; 	     //ILLEGAL		
int intValue = 1; 	//LEGAL
```


## Collections
Collections represent a bunch of things of the same type grouped together.  
There are many types of collections (e.g. `list`, `set`, `map`).

A list holds objects in the order you pass them to it.

```java
List<Card> myCards = new ArrayList<Card>();

Card ace = new Card(11);
myCards.add(ace);

Card queen = new Card(10);
myCards.add(queen);

Card nine = new Card(9);
myCards.add(nine);
```
The example `myCards` list would contain `ace`, `queen`, and `nine` in that order.

## The `for` Loop
Lets us do the same code block for every item in a collection, without duplicating code.
This in particular is known as a for-each loop.
```java
for (Card card: myCards) {
  System.out.println(card.getValue());
}
```

A set contains no duplicate elements and does not provide any ordering guarantees.
```java
Set<Integer> myNumbers = new HashSet<Integer>();

myCards.add(5);
myCards.add(7);
myCards.add(7);
```
The example 'myNumbers' set would contain two elements only: 5 and 7.



A map is an object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value.
```java
Map<String, Double> studentsMarks = new HashMap<String, Double>();

studentsMarks.put("Bob", 98.8);
studentsMarks.put("Ali", 94.8);
studentsMarks.put("Bob", 96.1);
```
The example 'studentsMarks' set would contain two pairs only: `Bob` and `Ali`. 
But what is the value for the key `Bob`? 


## Classes
A class is a representation of a type of an object in your program.

It is a blueprint you can use to create objects of that type with unique values.

For example, a Car could be represented as:

```java
class Car {

  String brand;
  String color;
  final int maxSpeed = 160;
  int currentSpeed;

  Car(String carBrand, String carColor) {
    brand = carBrand;
    color = carColor;
    currentSpeed = 0;
  }
  
  public void speedUp(){
      if(currentSpeed < maxSpeed){
        currentSpeed = currentSpeed + 10;
      }
  }
  
  public void slowDown(){
      if(currentSpeed >= 10){
        currentSpeed = currentSpeed - 10;    
      }
  }
  
  public int getNumberOfDoors(){
      return 4;
  }
}
```

### Using Constructors
To create an object you must use the `new` keyword, e.g.
`Car myCar = new Car("BMW", "Red");`  
This results in a new instance of `Car` stored in the variable `myCar`.

## Encapsulation?
`Encapsulation is one of the fundamentals of OOP (object-oriented programming). It refers to the bundling of data with the methods that operate on that data.[5] Encapsulation is used to hide the values or state of a structured data object inside a 
class, preventing unauthorized parties' direct access to them. `
[Wikipedia](https://en.wikipedia.org/wiki/Encapsulation_(computer_programming)) 


## Java Access Modifiers

1. private
2. default (package)
3. protected
4. public

## Time for an Exercise
* What is missing in `Car` class?*
* `maxSpeed` value can't be changed, should it be shared among all `Car` objects? *


## Methods
A Method is a code block you can use elsewhere in your code without duplication. For example:
```java
int getCurrentSpeed() {
  return currentSpeed;
}
```
A method has a return type, the type of object that the method will generate and give to the caller (in this case `String`).  
Methods are given a name used to call them (in this case `getCurrentSpeed`).

*If you don't want to return anything from a method, use the `void` return type.*

Preferably you should use meaningful names for your methods so that you can understand the method will do from its name.


### Let's Create `toString()` Too
```java
public String toString() {
  //Print detailed information about your object
}
```
As an example, it can be implemented like this:
```java
public String toString() {
  return name + " (Car: " + color + " " brand + ")";
}
```
## Inheritance
`inheritance enables new objects to take on the properties of existing objects. A class that is used as 
the basis for inheritance is called a superclass or base class. A class that inherits from a superclass is called a subclass or derived class.`
[Adobe](http://www.adobe.com/devnet/actionscript/learning/oop-concepts/inheritance.html) 

The syntax for creating a subclass is simple. At the beginning of your class declaration, use the extends keyword, followed by the name of the class to inherit from.


## Time for an Exercise
Create a new class, `CoupeCar`. A coupe car has the same functionality of a car except 
it always has two doors.

```java
class CoupeCar ...
```
## super keyword

## Object class


## Polymorphisim

```java
public static void main(String[] args){
    //what is the result?
    Car c1 = new Car("KIA", "Red");
    System.out.println(c1.getNumberOfDoors());
    
    //what is the result?
    Car c2 = new CoupeCar("Opel", "Black");
    System.out.println(c2.getNumberOfDoors());
    
    //what is the result?
    CoupeCar c3 = new CoupeCar("Mitsubishi", "White");
    System.out.println(c3.getNumberOfDoors());
    
    //what is the result?
    CoupeCar c4 = new Car("Toyota", "Green");
    System.out.println(c4.getNumberOfDoors());
}
```

## Time for an Exercise
In the context of Black jack game, implement the `Card` and `Player` Classes
```java
class Card {
  // name - can't be changed
  // value - can't be changed

  // constructor that takes the card’s name and value 

  // getters for all attributes
  
  // override toString method    
}

class Player {
  // name - can't be changed
  // list of cards

  // constructor that takes the player’s name 

  // getters for all attributes
  // get total card's value 
  // add `hit` method, which accepts a Card object and it to the cards list. 
  
  // override toString method
}
```

Done? can you check if two cards are equal?
```java
public static void main(String[] args){
    Card ace1 = new Card(11);
    Card ace2 = new Card(11);
    boolean sameValue = ace1 == ace2; // true or false?
}
```

## The Object class
The Object class is the parent class of all the classes in java by default. In other words, it is the topmost class of java.

## equals and hashcode methods

## Time for an Exercise
Implement equals and hashcode methods in the `Card` class

```java
public class Deck {

    private List<Card> deckCards;

    public void initialize() {
        // initialize deck cards. a Deck should have 52 Cards which are 4 Aces, 4 Two Cards, .. 4 Kings
        // An ace value is 1. 
        // Each of jack, queen and king has a value of 1. 
    }

    public void shuffle(){
        // randomly re-arrange the cards.
        // tip: see java.util.Collections class
    }

    public Card withdraw() {
        // if deckCard is not null and not empty, remove and return the first Card
        // otherwise throw an Exception..
        // Bonus: create a custom exception
    }
}
```

Time to put it all together? create a Game class with a main method