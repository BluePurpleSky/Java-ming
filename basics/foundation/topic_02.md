
### Java Strings are objects that contain a sequence of characters and can be created using the new operator or string literals.
### Strings can be represented internally using bytes (UTF-16) or compact strings (1 byte per character for ISO-8859-1/Latin-1 characters).
----------
Java provides various methods for searching, comparing, and manipulating strings, such as indexOf(), matches(), startsWith(), and replace().


---------
### String Representation: 
Java Strings are represented internally as a sequence of characters, using either 2 bytes per character (UTF-16) or 1 byte per character (compact strings) if the string only contains ISO-8859-1/Latin-1 characters.

### Creating Strings: 
Strings can be created using the new operator or string literals. String literals are a shorthand way of creating a new String object, where the text is enclosed in double quotes.

### Escape Characters: 
String literals accept escape characters, which are translated into special characters in the resulting String. Examples include \t for a tab character and \n for a new line character.

### String Pool: 
Java maintains a string pool, which is a collection of String objects that have already been created. When a String literal is used, it is first checked if a matching String object already exists in the pool. If it does, the existing object is used; otherwise, a new object is created.

### String Methods: 
The webpage explains various methods for searching, comparing, and manipulating strings, including indexOf(), matches(), startsWith(), replace(), and trim().

### Text Blocks: 
The webpage also covers Java text blocks, which are a feature introduced in Java 13 that allows for multi-line string literals.



-----

 <span style="color: #4C996B;">
 ## What's Happening with String Concatenation?
 </span>
 
When you try to join or combine (concatenate) two Strings together in Java, the process is not as simple as just adding them. Behind the scenes, Java does a bit more work.

### Basic String Concatenation:
If you do something like this:
```java
String one = "Hello";
String two = " World";
String result = one + two;
```

In the background, Java doesn't directly join the Strings together. It uses something called a **StringBuilder** to help with the concatenation. The StringBuilder is faster and more efficient for this task.

It’s roughly translated into this code:
```java
String result = new StringBuilder(one).append(two).toString();
```

### Problem with Using String Concatenation in Loops:
Now, let’s say you’re concatenating Strings inside a **loop**, which repeats many times. This is where the problem shows up.

Consider this loop:
```java
String[] strings = {"one", "two", "three", "four", "five"};
String result = null;
for (String string : strings) {
    result = result + string;
}
```

Here’s what happens under the hood:
```java
String result = null;
for (String string : strings) {
    result = new StringBuilder(result).append(string).toString();
}
```

- **Every iteration** of the loop creates a new `StringBuilder` object and a new String object.
- Each time, Java takes all the characters from the current result, copies them into the `StringBuilder`, adds the next string, and then converts it back into a String.

The big problem is this:
- The `StringBuilder` has to **copy** the characters from the existing String into itself each time.
- As the `result` grows, it takes **longer and longer** to copy all those characters into the StringBuilder. So, with each iteration, the process becomes slower.

### The Solution:
A better way is to create the **StringBuilder once** before the loop starts, and then **reuse it** during each iteration of the loop. This avoids the need to create new `StringBuilder` and `String` objects inside the loop.

Here’s the optimized way:
```java
String[] strings = {"one", "two", "three", "four", "five"};
StringBuilder temp = new StringBuilder();
for (String string : strings) {
    temp.append(string);
}
String result = temp.toString();
```

Now, instead of creating a new StringBuilder and copying the characters every time, we create one StringBuilder at the start and **keep appending** to it. This makes the process much faster, especially with many iterations.

### In Summary:
- **Without optimization**: In a loop, creating a new `StringBuilder` and copying characters every time makes the process slower as the `result` grows.
- **With optimization**: Reusing the same `StringBuilder` makes the concatenation much faster because we avoid the unnecessary copying of characters.


-----

### What is `matches()`?
The `matches()` method in Java is used to check if a string follows a certain pattern, called a **regular expression**. A regular expression (regex) is like a special search pattern that defines a set of rules to match text.

### How it works:
- The `matches()` method takes a **regular expression** (regex) as its input and checks if the string **completely matches** that pattern.
- If the string matches the pattern, `matches()` returns **`true`**. Otherwise, it returns **`false`**.

### Example:
Let’s look at your example:

```java
String text = "one two three two one";
boolean matches = text.matches(".*two.*");
```

### Explanation:
- `text.matches(".*two.*")` checks if the string `"one two three two one"` contains the word **"two"**.
- The regular expression `".*two.*"` can be broken down like this:
  - `.*`: This part means "any sequence of characters" (it could be anything before or after the word "two").
  - `two`: This is the exact word you're looking for.
  - `.*`: This part again means "any sequence of characters" after the word "two".
  
So, the pattern `".*two.*"` is looking for the word "two" **anywhere** in the string. If it finds "two", it returns `true`. If it doesn't, it returns `false`.

### In this case:
- The string `"one two three two one"` contains the word "two" twice, so the `matches()` method will return **`true`**.

### Summary:
- **`matches()`** checks if a string fits a pattern defined by a regular expression.
- In the example, it checks if the word "two" appears anywhere in the string `"one two three two one"`. Since it does, it returns `true`.

--------

## Comparing Strings in Java
Java provides several methods to compare Strings. These methods help you check if two Strings are the same, if one String comes before another, or if they start or end with certain text. Here’s a rundown of the common methods used for comparing Strings:

### 1. **equals() Method**
The `equals()` method checks if two Strings are **exactly the same** (including case). It returns `true` if the Strings are the same and `false` if they are not.

**Example:**
```java
String one   = "abc";
String two   = "def";
String three = "abc";
String four  = "ABC";

System.out.println(one.equals(two));   // false
System.out.println(one.equals(three)); // true
System.out.println(one.equals(four));  // false
```

- **Explanation**: 
  - `"abc"` is not equal to `"def"`, so the first result is `false`.
  - `"abc"` is equal to `"abc"`, so the second result is `true`.
  - `"abc"` is not equal to `"ABC"` because Java is case-sensitive, so the third result is `false`.

### 2. **equalsIgnoreCase() Method**
The `equalsIgnoreCase()` method works like `equals()`, but it **ignores case**. It compares Strings without considering whether the characters are in uppercase or lowercase.

**Example:**
```java
String one = "abc";
String four = "ABC";

System.out.println(one.equalsIgnoreCase(four)); // true
```

- **Explanation**: Here, `"abc"` and `"ABC"` are considered the same because the case (uppercase vs lowercase) doesn't matter.

### 3. **startsWith() and endsWith() Methods**
- `startsWith()` checks if a String **starts** with a given substring.
- `endsWith()` checks if a String **ends** with a given substring.

**Examples:**
```java
String one = "This is a good day to code";

System.out.println(one.startsWith("This"));    // true
System.out.println(one.startsWith("This", 5)); // false
System.out.println(one.endsWith("code"));      // true
System.out.println(one.endsWith("shower"));    // false
```

- **Explanation**:
  - `"This is a good day to code"` starts with `"This"`, so `startsWith("This")` returns `true`.
  - If you start checking from index 5, it starts with `" is"`, so the result is `false`.
  - `"This is a good day to code"` ends with `"code"`, so `endsWith("code")` returns `true`.
  - `"This is a good day to code"` does **not** end with `"shower"`, so `endsWith("shower")` returns `false`.

### 4. **compareTo() Method**
The `compareTo()` method compares two Strings based on their **lexical (alphabetical) order**. It returns:
- A **negative number** if the first String is earlier (comes before) the second String.
- **0** if the Strings are **equal**.
- A **positive number** if the first String comes **after** the second String.

**Example:**
```java
String one = "abc";
String two = "def";
String three = "abd";

System.out.println(one.compareTo(two));   // -3
System.out.println(one.compareTo(three)); // -1
```

- **Explanation**:
  - `"abc"` comes **before** `"def"` in alphabetical order, so `compareTo("def")` returns `-3`.
  - `"abc"` comes **before** `"abd"`, but just by one character (the third character), so `compareTo("abd")` returns `-1`.

### Key Points:
- **equals()**: Checks if Strings are exactly equal (including case).
- **equalsIgnoreCase()**: Checks if Strings are equal, ignoring case.
- **startsWith()**: Checks if a String starts with a specific substring.
- **endsWith()**: Checks if a String ends with a specific substring.
- **compareTo()**: Compares Strings lexicographically and gives an integer value based on alphabetical order.

### When to Use:
- Use **`equals()`** when you need an **exact match**, including case.
- Use **`equalsIgnoreCase()`** when you want to **ignore case differences**.
- Use **`startsWith()`** or **`endsWith()`** to check if a String begins or ends with a certain substring.
- Use **`compareTo()`** when you need to compare two Strings and figure out their **alphabetical order**.

### Important Note about **`compareTo()`**:
The `compareTo()` method may not work perfectly for Strings in different languages, as it uses **lexical order** (like sorting words in a dictionary). For sorting Strings in a specific language, use **`Collator`**, which is more accurate for handling different languages and their rules for ordering words.

