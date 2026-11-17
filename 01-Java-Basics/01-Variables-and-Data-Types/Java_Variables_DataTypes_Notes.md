# Java Variables & Data Types - Complete Notes

## 1. What are Variables?

A **variable** is a named storage location in memory that holds a value. Think of it as a labeled box where you can store data.

### Key Concepts:
- **Name**: Identifier to access the variable
- **Type**: Determines what kind of data it can hold
- **Value**: The actual data stored
- **Memory**: Each variable occupies space in RAM

---

## 2. Data Types in Java

Java has two categories of data types:

### A. Primitive Data Types (8 types)

| Type | Size | Range/Description | Default Value | Example |
|------|------|-------------------|---------------|---------|
| `byte` | 1 byte | -128 to 127 | 0 | `byte age = 25;` |
| `short` | 2 bytes | -32,768 to 32,767 | 0 | `short year = 2024;` |
| `int` | 4 bytes | -2³¹ to 2³¹-1 | 0 | `int count = 100;` |
| `long` | 8 bytes | -2⁶³ to 2⁶³-1 | 0L | `long population = 7000000000L;` |
| `float` | 4 bytes | Decimal numbers (6-7 digits) | 0.0f | `float price = 19.99f;` |
| `double` | 8 bytes | Decimal numbers (15-16 digits) | 0.0d | `double pi = 3.14159265358979;` |
| `char` | 2 bytes | Single Unicode character | '\u0000' | `char grade = 'A';` |
| `boolean` | 1 bit | true or false | false | `boolean isActive = true;` |

### B. Non-Primitive (Reference) Data Types

- **String**: Sequence of characters (`String name = "John";`)
- **Arrays**: Collection of same-type elements
- **Classes**: User-defined types
- **Interfaces**: Abstract types

---

## 3. Variable Declaration & Initialization

```java
// Declaration only
int age;

// Declaration + Initialization
int age = 25;

// Multiple variables
int x = 10, y = 20, z = 30;
```

---

## 4. Pseudocode Examples

### Example 1: Basic Variable Operations
```
BEGIN
    // Declare variables
    DECLARE integer studentCount
    DECLARE double averageScore
    DECLARE char classGrade
    DECLARE boolean isPassed
    
    // Initialize variables
    SET studentCount = 45
    SET averageScore = 85.5
    SET classGrade = 'A'
    SET isPassed = true
    
    // Display values
    PRINT "Students: " + studentCount
    PRINT "Average: " + averageScore
    PRINT "Grade: " + classGrade
    PRINT "Passed: " + isPassed
END
```

### Example 2: Type Conversion
```
BEGIN
    DECLARE integer wholeNumber = 10
    DECLARE decimal floatingNumber = 3.14
    DECLARE text message = "Result: "
    
    // Implicit conversion (widening)
    DECLARE decimal result = wholeNumber + floatingNumber
    
    // Explicit conversion (narrowing)
    DECLARE integer truncated = (integer)floatingNumber
    
    PRINT message + result
    PRINT "Truncated: " + truncated
END
```

### Example 3: Finding Maximum of Two Numbers
```
BEGIN
    DECLARE integer num1 = 25
    DECLARE integer num2 = 40
    DECLARE integer maximum
    
    IF num1 > num2 THEN
        SET maximum = num1
    ELSE
        SET maximum = num2
    END IF
    
    PRINT "Maximum: " + maximum
END
```

---

## 5. Flowchart Diagrams

### Flowchart 1: Variable Declaration and Usage
```
┌─────────────────────┐
│     START           │
└─────────┬───────────┘
          │
          ▼
┌─────────────────────┐
│ Declare Variables:  │
│ - int age           │
│ - double salary     │
│ - String name       │
└─────────┬───────────┘
          │
          ▼
┌─────────────────────┐
│ Initialize Values:  │
│ age = 25            │
│ salary = 50000.50   │
│ name = "John"       │
└─────────┬───────────┘
          │
          ▼
┌─────────────────────┐
│ Process Data:       │
│ Calculate bonus     │
│ bonus = salary * 0.1│
└─────────┬───────────┘
          │
          ▼
┌─────────────────────┐
│ Display Results:    │
│ Print all values    │
└─────────┬───────────┘
          │
          ▼
┌─────────────────────┐
│      END            │
└─────────────────────┘
```

### Flowchart 2: Type Selection Based on Data
```
┌─────────────────────┐
│     START           │
└─────────┬───────────┘
          │
          ▼
┌─────────────────────┐
│ What type of data?  │
└─────────┬───────────┘
          │
    ┌─────┼─────┬──────────┐
    │     │     │          │
    ▼     ▼     ▼          ▼
┌──────┐┌─────┐┌──────┐┌────────┐
│Whole ││Decimal││Single││True/   │
│Number││Number ││Char  ││False   │
└──┬───┘└──┬───┘└──┬───┘└───┬────┘
   │       │       │        │
   ▼       ▼       ▼        ▼
┌─────┐┌────────┐┌────┐┌─────────┐
│int  ││double  ││char││boolean  │
│long ││float   ││    ││         │
└──┬──┘└───┬────┘└─┬──┘└────┬────┘
   │       │       │        │
   └───────┴───────┴────────┘
           │
           ▼
┌─────────────────────┐
│ Declare variable    │
│ with chosen type    │
└─────────┬───────────┘
          │
          ▼
┌─────────────────────┐
│      END            │
└─────────────────────┘
```

### Flowchart 3: Finding Maximum of Three Numbers
```
┌─────────────────────┐
│     START           │
└─────────┬───────────┘
          │
          ▼
┌─────────────────────┐
│ Input: num1, num2,  │
│        num3         │
└─────────┬───────────┘
          │
          ▼
┌─────────────────────┐
│ Is num1 > num2?     │
└─────────┬───────────┘
          │
     ┌────┴────┐
     │         │
    YES       NO
     │         │
     ▼         ▼
┌────────┐┌──────────┐
│max=num1││max=num2  │
└───┬────┘└────┬─────┘
    │          │
    └────┬─────┘
         │
         ▼
┌─────────────────────┐
│ Is max > num3?      │
└─────────┬───────────┘
          │
     ┌────┴────┐
     │         │
    YES       NO
     │         │
     ▼         ▼
┌────────┐┌──────────┐
│Keep    ││max=num3  │
│max     ││          │
└───┬────┘└────┬─────┘
    │          │
    └────┬─────┘
         │
         ▼
┌─────────────────────┐
│ Print: Maximum =    │
│        max          │
└─────────┬───────────┘
          │
          ▼
┌─────────────────────┐
│      END            │
└─────────────────────┘
```

---

## 6. Important Rules

### Variable Naming Conventions:
1. Must start with letter, `$`, or `_`
2. Cannot start with a number
3. No spaces allowed
4. Case-sensitive (`age` ≠ `Age`)
5. Use camelCase: `studentName`, `totalMarks`

### Best Practices:
- Choose meaningful names: `studentAge` instead of `x`
- Initialize variables before use
- Use appropriate data type to save memory
- Follow Java naming conventions

---

## 7. Common Mistakes to Avoid

❌ **Wrong:**
```java
int 1stNumber = 10;      // Cannot start with number
int my number = 20;      // No spaces allowed
float price = 19.99;     // Missing 'f' suffix
```

✅ **Correct:**
```java
int firstNumber = 10;
int myNumber = 20;
float price = 19.99f;
```

---

## 8. Practice Exercises

1. Declare variables to store: your name, age, height, and whether you're a student
2. Write pseudocode to swap two numbers
3. Create a flowchart for calculating area of a rectangle
4. Convert temperature from Celsius to Fahrenheit using variables

---

## 9. Quick Reference Table

| Scenario | Best Data Type | Example |
|----------|---------------|---------|
| Counting items | `int` | `int count = 0;` |
| Money/Currency | `double` or `BigDecimal` | `double price = 99.99;` |
| Yes/No flags | `boolean` | `boolean isValid = true;` |
| Single letter/character | `char` | `char initial = 'S';` |
| Large numbers | `long` | `long distance = 9999999999L;` |
| Text/String | `String` | `String name = "Alice";` |

---

