
### 1. **Trimming Strings with `trim()`**
The **`trim()`** method is used to remove extra white spaces from **the beginning and the end** of a string. This includes spaces, tabs, and newline characters. 

- It **does not** remove spaces inside the string (between words), just at the start and end.
- **Important**: `trim()` does not modify the original string. Instead, it returns a new string with the extra spaces removed.

**Example:**
```java
String text = "  And he ran across the field   ";
String trimmed = text.trim();
System.out.println(trimmed);  // Output: "And he ran across the field"
```
- Here, `trim()` removes the spaces at the beginning and end, but the spaces between the words remain.

### 2. **Replacing Characters with `replace()`**
The **`replace()`** method in Java replaces **all occurrences** of a specified character in a string with another character. The original string is not modified; a new string is returned.

**Example:**
```java
String source = "123abc";
String replaced = source.replace('a', '@');
System.out.println(replaced);  // Output: "123@bc"
```
- Here, the character `'a'` is replaced by `'@'`, so the output becomes `"123@bc"`.

### 3. **Replacing the First Match with `replaceFirst()`**
The **`replaceFirst()`** method allows you to replace **only the first occurrence** of a pattern (using a regular expression) in a string with a specified replacement.

**Example:**
```java
String text = "one two three two one";
String s = text.replaceFirst("two", "five");
System.out.println(s);  // Output: "one five three two one"
```
- Here, only the **first** occurrence of `"two"` is replaced with `"five"`, so the result is `"one five three two one"`.

### 4. **Replacing All Matches with `replaceAll()`**
The **`replaceAll()`** method replaces **all occurrences** of a pattern (using a regular expression) in a string with a specified replacement.

**Example:**
```java
String text = "one two three two one";
String t = text.replaceAll("two", "five");
System.out.println(t);  // Output: "one five three five one"
```
- Here, **all** occurrences of `"two"` are replaced with `"five"`, resulting in `"one five three five one"`.

### 5. **Splitting a String with `split()`**
The **`split()`** method divides a string into **an array of strings** based on a delimiter (a character or regular expression) you provide. The delimiter is **not included** in the resulting strings.

**Example:**
```java
String source = "A man drove with a car.";
String[] occurrences = source.split("a");
```
- Here, the string `"A man drove with a car."` is split wherever the character `"a"` appears, resulting in an array of strings: `["A m", "n drove with ", " c", "r."]`.

### Using `split()` with a Limit
The **`split()`** method can also take a **limit** as the second argument. The limit controls how many parts the string can be split into. If there are more occurrences of the delimiter than the limit, the last part of the result will include everything after the last delimiter.

**Example with limit = 2:**
```java
String source = "A man drove with a car.";
int limit = 2;
String[] occurrences = source.split("a", limit);
```
- Here, the string is split at the first occurrence of `"a"`, so the result will be:
  - `["A m", "n drove with a car."]`
  - The second string contains the remaining part of the original string after the first `"a"`.

**Example with limit = 3:**
```java
String source = "A man drove with a car.";
int limit = 3;
String[] occurrences = source.split("a", limit);
```
- This will split the string at the first two occurrences of `"a"`, resulting in:
  - `["A m", "n drove with ", " car."]`

- Notice how the last part still contains the `"a"` because it represents everything remaining after the second `"a"`.

### Summary of Methods:
- **`trim()`**: Removes spaces from the beginning and end of the string.
- **`replace()`**: Replaces all occurrences of a character with another character.
- **`replaceFirst()`**: Replaces only the first occurrence of a pattern in the string.
- **`replaceAll()`**: Replaces all occurrences of a pattern in the string.
- **`split()`**: Splits a string into parts based on a delimiter (regular expression) and returns an array of substrings.

These methods are useful for handling and manipulating strings efficiently in Java.
