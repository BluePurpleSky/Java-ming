Here is your provided content converted into a Git markdown format (`.md`):

```markdown
# Java Basic Concepts

## 1. Running Java Code
To run any line of code in **Java**, you need a class and a method. Here's a basic example:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Key Points:
- Each statement in Java is executed **line by line** in the order they are written.
- **Comments** are used for theoretical clarity or statements one can read but do not affect the code execution.

## 2. Comments in Java
Java supports two types of comments:
- **Single-line comments**: Prefixed with `//`
- **Multi-line comments**: Enclosed in `/* */`

Example:
```java
// Welcome message for users - is an example

/* 
   Multi
   Line
   Comment
*/
```

## 3. Variables in Java
Variables are like personal boxes, where you can store values. You define the **datatype** of the variable and assign a value to it.

Example:
```java
int num = 22;
```

- **Java uses camelCase** convention for naming variables, functions, and other identifiers.

### Common Primitive Data Types:
Here are the eight primitive types in Java:

- **Integer values**: `byte`, `short`, `int`, and `long`
- **Floating point values**: `float` and `double`
- **Boolean values**: `boolean`
- **Characters**: `char`

## 4. Taking Input from Users
To make dynamic programs, you can collect input from users using the **Scanner** class.

### Example:
In Java, we use the `Scanner` to collect input. First, we need to import the scanner library:

```java
import java.util.Scanner;
```

Then, we can create a **Scanner object** to read user input:

```java
Scanner scanner = new Scanner(System.in);
```

Once the scanner object is set up, we can use various methods to read different data types:

- `scanner.nextLine()` to read a string.
- `scanner.nextInt()` to read an integer.
- `scanner.nextDouble()` to read a floating-point number.
- `scanner.nextBoolean()` to read a boolean value.
```

### Explanation of Scanner:
The **`scanner.nextLine()`** method reads an entire line as a string. Similarly, you can use other `scanner.nextType()` methods to read different data types.

---

Now, the content is ready in markdown format for your Git repository!
