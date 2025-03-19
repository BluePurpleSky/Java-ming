
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
