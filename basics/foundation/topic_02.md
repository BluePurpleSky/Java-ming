
## Java Strings are objects that contain a sequence of characters and can be created using the new operator or string literals.
## Strings can be represented internally using bytes (UTF-16) or compact strings (1 byte per character for ISO-8859-1/Latin-1 characters).
## Java provides various methods for searching, comparing, and manipulating strings, such as indexOf(), matches(), startsWith(), and replace().



String Representation: Java Strings are represented internally as a sequence of characters, using either 2 bytes per character (UTF-16) or 1 byte per character (compact strings) if the string only contains ISO-8859-1/Latin-1 characters.

Creating Strings: Strings can be created using the new operator or string literals. String literals are a shorthand way of creating a new String object, where the text is enclosed in double quotes.

Escape Characters: String literals accept escape characters, which are translated into special characters in the resulting String. Examples include \t for a tab character and \n for a new line character.

String Pool: Java maintains a string pool, which is a collection of String objects that have already been created. When a String literal is used, it is first checked if a matching String object already exists in the pool. If it does, the existing object is used; otherwise, a new object is created.

String Methods: The webpage explains various methods for searching, comparing, and manipulating strings, including indexOf(), matches(), startsWith(), replace(), and trim().

Text Blocks: The webpage also covers Java text blocks, which are a feature introduced in Java 13 that allows for multi-line string literals.
