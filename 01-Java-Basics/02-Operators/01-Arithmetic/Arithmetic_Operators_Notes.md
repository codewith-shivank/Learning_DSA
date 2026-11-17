# Java Arithmetic Operators

Arithmetic operators perform mathematical calculations on numeric values.

## 1. Arithmetic Operator Table

| Operator | Name | Example | Result |
|---|---|---|---:|
| `+` | Addition | `10 + 3` | `13` |
| `-` | Subtraction | `10 - 3` | `7` |
| `*` | Multiplication | `10 * 3` | `30` |
| `/` | Division | `10 / 3` | `3` for integers |
| `%` | Modulus/remainder | `10 % 3` | `1` |
| `++` | Increment | `x++` | Increases `x` by 1 |
| `--` | Decrement | `x--` | Decreases `x` by 1 |

## 2. Important Rules

### Integer division

When both operands are integers, Java returns an integer result and removes the decimal part:

```java
int result = 10 / 3;       // 3, not 3.333...
double exact = (double) 10 / 3; // 3.333...
```

At least one operand must be `double` or `float` to get a decimal result.

### Modulus (`%`)

The modulus operator returns the remainder after division:

```java
17 % 2  // 1: 17 is odd
20 % 5  // 0: 20 is divisible by 5
0 % 3   // 0
```

The divisor must not be zero. `10 % 0` and `10 / 0` cause an `ArithmeticException` at runtime.

### Operator precedence

Java evaluates operators in this order:

1. Parentheses: `()`
2. Multiplication, division, modulus: `*`, `/`, `%`
3. Addition and subtraction: `+`, `-`

Operators at the same level are evaluated from left to right.

```java
int answer = 2 + 3 * 4;     // 14
int grouped = (2 + 3) * 4;  // 20
```

## 3. Compound Assignment

```java
int value = 10;
value += 5; // same as value = value + 5; value is 15
value -= 2; // value is 13
value *= 2; // value is 26
value /= 2; // value is 13
value %= 5; // value is 3
```

For smaller types, compound assignment performs an automatic cast:

```java
byte x = 10;
x += 10; // works; similar to x = (byte)(x + 10)
// x = x + 10; // compile error: x + 10 is an int
x = (byte) (x + 10); // explicit cast is required
```

## 4. Increment and Decrement

```java
int a = 5;
int preIncrement = ++a;  // a becomes 6, then 6 is assigned
int postIncrement = a++; // 6 is assigned, then a becomes 7
int preDecrement = --a;  // a becomes 6, then 6 is assigned
int postDecrement = a--; // 6 is assigned, then a becomes 5
```

For beginners, use a separate statement when possible because it is easier to read.

## 5. DSA Uses

- `% 2` checks whether a number is even or odd.
- `% 10` extracts the last digit of a number.
- `/ 10` removes the last digit of an integer.
- `/` calculates counts, averages, and positions.
- `++` and `--` update loop counters and array indexes.

## 6. Pseudocode: Basic Arithmetic

```text
BEGIN
    SET a = 10
    SET b = 3

    PRINT a + b
    PRINT a - b
    PRINT a * b
    PRINT a / b
    PRINT a MOD b

    SET decimalDivision = a / 3.0
    PRINT decimalDivision
END
```

## 7. Pseudocode: Even or Odd

```text
BEGIN
    READ number

    IF number MOD 2 = 0 THEN
        PRINT "Even"
    ELSE
        PRINT "Odd"
    END IF
END
```

## 8. Pseudocode: Sum of Digits

```text
BEGIN
    SET number = 472
    SET sum = 0

    WHILE number > 0
        SET digit = number MOD 10
        SET sum = sum + digit
        SET number = number / 10
    END WHILE

    PRINT sum
END
```

## 9. Flowchart: Even or Odd

```text
       ┌─────────┐
       │ START   │
       └────┬────┘
            │
            ▼
   ┌────────────────┐
   │ Read number    │
   └───────┬────────┘
           │
           ▼
   ┌────────────────┐
   │ number % 2 = 0?│
   └───┬────────┬───┘
      Yes       No
       │         │
       ▼         ▼
┌──────────┐ ┌─────────┐
│ Print    │ │ Print   │
│ Even     │ │ Odd     │
└────┬─────┘ └────┬────┘
     │            │
     └──────┬─────┘
            ▼
       ┌─────────┐
       │ END     │
       └─────────┘
```

## 10. Common Mistakes

```java
// Wrong method name:
// System.out.print1n(value); // number 1, not lowercase letter l

// Correct:
System.out.println(value);
```

Remember that division by zero is invalid, and integer division does not preserve decimal values.
