In Java, **data types** are used to define the type of data a variable can hold. Every variable in Java has a type, and this type determines what kind of data can be stored in that variable, as well as what operations can be performed on it. Java has two main types of data types:

### 1. **Primitive Data Types**
These are the basic data types provided by Java. There are 8 primitive data types:

#### a) **int** (Integer type)
Used to store whole numbers (without decimals).

**Example:**
```java
int age = 25;
```
- Here, `age` is an integer variable that stores the value `25`.

#### b) **double** (Floating-point type)
Used to store numbers with decimals (floating-point numbers).

**Example:**
```java
double price = 19.99;
```
- Here, `price` is a variable that stores a decimal number `19.99`.

#### c) **char** (Character type)
Used to store a single character (like 'a', '1', or '%').

**Example:**
```java
char grade = 'A';
```
- Here, `grade` is a variable that stores a single character `'A'`.

#### d) **boolean** (Boolean type)
Used to store a true or false value.

**Example:**
```java
boolean isRaining = true;
```
- Here, `isRaining` is a boolean variable that can either be `true` or `false`.

#### e) **byte** (Integer type)
Used to store smaller integers (from -128 to 127). Takes up less memory (1 byte).

**Example:**
```java
byte level = 100;
```
- Here, `level` is a byte variable that stores the value `100`.

#### f) **short** (Integer type)
Used to store whole numbers, similar to `int`, but with a smaller range (from -32,768 to 32,767).

**Example:**
```java
short temperature = 25;
```
- Here, `temperature` is a short variable that stores the value `25`.

#### g) **long** (Integer type)
Used to store larger whole numbers (bigger than `int`).

**Example:**
```java
long distance = 100000L;
```
- Here, `distance` is a long variable that stores a large number `100000L`.

#### h) **float** (Floating-point type)
Used to store decimal numbers (similar to `double`, but takes up less memory).

**Example:**
```java
float weight = 56.75f;
```
- Here, `weight` is a float variable that stores a decimal number `56.75`.

### 2. **Non-Primitive Data Types**
These are more complex data types, and they are objects in Java. Some of the most commonly used non-primitive types are:

#### a) **String** (Sequence of characters)
Used to store a sequence of characters (text). Strings are actually objects in Java.

**Example:**
```java
String name = "John";
```
- Here, `name` is a String variable that stores the text `"John"`.

#### b) **Arrays** (Collection of elements)
Arrays are used to store multiple values in a single variable. You can store elements of the same type in an array.

**Example:**
```java
int[] numbers = {1, 2, 3, 4, 5};
```
- Here, `numbers` is an array that stores multiple integer values: `1`, `2`, `3`, `4`, `5`.

#### c) **Classes and Objects**
In Java, you can create your own types using **classes**. These are used to define more complex data structures and objects.

**Example:**
```java
class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

Person person1 = new Person("Alice", 30);
```
- Here, `Person` is a class with two properties: `name` and `age`. `person1` is an object of the `Person` class.

### Summary:
- **Primitive data types** are simple, built-in types like `int`, `double`, `char`, etc.
- **Non-primitive data types** are more complex, like `String`, `Arrays`, and custom **Classes**.

These data types help Java understand what kind of data you're working with, so it knows how to store, manipulate, and process that data.
