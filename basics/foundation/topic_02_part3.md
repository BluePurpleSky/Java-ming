### 1. **Converting Numbers to Strings with `valueOf()`**
The **`valueOf()`** method is used to convert various types of numbers into a **String**.

**Example:**
```java
String intStr = String.valueOf(10);  // Convert integer to string
System.out.println("intStr = " + intStr);  // Output: intStr = 10

String flStr = String.valueOf(9.99);  // Convert float to string
System.out.println("flStr = " + flStr);  // Output: flStr = 9.99
```
- This method converts **numbers** like integers or floats into strings. It’s a simple way to convert numbers to a **String** for display or other operations.

### 2. **Converting Objects to Strings using `toString()`**
Every object in Java has a **`toString()`** method, inherited from the `Object` class. This method returns a **String representation** of the object.

**Example:**
```java
Integer integer = new Integer(123);
String intStr = integer.toString();  // Convert Integer object to string
System.out.println(intStr);  // Output: 123
```
- **Note**: The default `toString()` method provides only basic info. Many classes override it to provide meaningful details about the object (e.g., `Integer` class gives you the number as a string).
- If a class doesn’t override `toString()`, the default method just shows the class name and memory address.

### 3. **Getting Characters and Bytes from a String**

#### a) **Getting a Character at a Specific Index**
The **`charAt()`** method retrieves a character at a specific index of a string.

**Example:**
```java
String theString = "This is a good day to code";
System.out.println(theString.charAt(0));  // Output: T
System.out.println(theString.charAt(3));  // Output: s
```
- It gives the **character** at the specified **index** in the string. Indexing starts from 0.

#### b) **Getting Bytes of a String**
The **`getBytes()`** method returns the byte representation of the string in the system's default character encoding or the specified encoding.

**Example:**
```java
String theString = "This is a good day to code";
byte[] bytes1 = theString.getBytes();  // Default encoding
byte[] bytes2 = theString.getBytes(Charset.forName("UTF-8"));  // UTF-8 encoding
```
- **`getBytes()`** is useful when you need to work with **byte data**, for example, when saving to a file or sending over a network.

### 4. **Converting to Uppercase and Lowercase**
You can change the **case** of the entire string to **uppercase** or **lowercase** using `toUpperCase()` and `toLowerCase()`.

**Example:**
```java
String theString = "This IS a mix of UPPERcase and lowerCASE";

String uppercase = theString.toUpperCase();  // Converts to uppercase
String lowercase = theString.toLowerCase();  // Converts to lowercase

System.out.println(uppercase);  // Output: THIS IS A MIX OF UPPERCASE AND LOWERCASE
System.out.println(lowercase);  // Output: this is a mix of uppercase and lowercase
```
- These methods are helpful when you need to **standardize** the case of strings.

### 5. **String Formatting with `formatted()`** (Java 13 and newer)
The **`formatted()`** method in Java (introduced in Java 13) allows you to create a **formatted string** using placeholders like `%s`.

**Example:**
```java
String input = "Hello %s";  // A string with a placeholder
String output1 = input.formatted("World");  // Replace %s with "World"
System.out.println(output1);  // Output: Hello World

String output2 = input.formatted("Jakob");  // Replace %s with "Jakob"
System.out.println(output2);  // Output: Hello Jakob
```
- **Formatted strings** allow you to insert values dynamically into a template string. It's similar to using `String.format()`.

### 6. **Strip Indentation with `stripIndent()`** (Java 13 and newer)
The **`stripIndent()`** method (added in Java 13) removes indentation from multi-line strings, making it useful for formatting.

**Example:**
```java
String input  = "   Hey \n   This \n   is \n   indented.";
String output = input.stripIndent();  // Removes indentation

System.out.println(output);
```
**Output:**
```
Hey
This
is
indented.
```
- It removes the **indentation** (leading spaces) from each line, making the text more readable.

### 7. **Translate Escape Codes with `translateEscapes()`** (Java 13 and newer)
The **`translateEscapes()`** method (added in Java 13) converts escape codes like `\n` (new line) into actual control characters.

**Example:**
```java
String input = "Hey, \\n This is not normally a line break.";
System.out.println(input);  // Output: Hey, \n This is not normally a line break.

String output = input.translateEscapes();  // Translate escape sequences
System.out.println(output);  // Output: Hey,
                            //         This is not normally a line break.
```
- The **escape sequences** (like `\\n`) are **translated** into their actual meaning (like an actual **line break**), making the text behave as it would in code.

### Summary of Key Methods:
- **`valueOf()`**: Converts numbers (int, float, etc.) to **String**.
- **`toString()`**: Converts an object to its **String representation**.
- **`charAt()`**: Gets a **character** at a specific index.
- **`getBytes()`**: Converts a string into a **byte array**.
- **`toUpperCase()` / `toLowerCase()`**: Changes the **case** of a string.
- **`formatted()`**: Creates a **formatted** string by replacing placeholders.
- **`stripIndent()`**: Removes **indentation** from multi-line strings.
- **`translateEscapes()`**: Translates escape sequences (like `\n`) into actual control characters.

These methods are commonly used for **string manipulation**, making it easier to work with and format strings in Java!
