# Session 05: Binary Numbers

Practice binary-to-decimal conversion, decimal-to-binary conversion, and binary addition. Folder numbers show the suggested learning order.

| Folder | Java file | Purpose |
| --- | --- | --- |
| [01-Binary-To-Decimal-Using-Integer](./01-Binary-To-Decimal-Using-Integer/) | [BinaryIntegerToDecimal.java](./01-Binary-To-Decimal-Using-Integer/BinaryIntegerToDecimal.java) | Read binary digits as an integer and calculate their decimal value. |
| [02-Binary-To-Decimal-Using-String](./02-Binary-To-Decimal-Using-String/) | [BinaryStringToDecimal.java](./02-Binary-To-Decimal-Using-String/BinaryStringToDecimal.java) | Convert the binary string `101000` to `40`. |
| [03-Decimal-To-Binary](./03-Decimal-To-Binary/) | [DecimalToBinary.java](./03-Decimal-To-Binary/DecimalToBinary.java) | Convert decimal `10` to the binary string `1010`. |
| [04-Binary-Number-Assignments](./04-Binary-Number-Assignments/) | [Question1BinaryToDecimal.java](./04-Binary-Number-Assignments/Question1BinaryToDecimal.java) | Assignment 1: binary to decimal. |
| [04-Binary-Number-Assignments](./04-Binary-Number-Assignments/) | [Question2DecimalToBinary.java](./04-Binary-Number-Assignments/Question2DecimalToBinary.java) | Assignment 2: decimal to binary. |
| [04-Binary-Number-Assignments](./04-Binary-Number-Assignments/) | [Question3BinaryAddition.java](./04-Binary-Number-Assignments/Question3BinaryAddition.java) | Assignment 3: add two binary strings. |

## Compile and run

Open PowerShell in this Session-05 folder with a JDK installed:

```powershell
New-Item -ItemType Directory -Force build | Out-Null
$sources = Get-ChildItem -Path . -Recurse -Filter *.java
javac -encoding UTF-8 -d build $sources.FullName
java -cp build BinaryIntegerToDecimal
```

Enter `1010` for a decimal result of `10`. Replace the class name in the last command to run another example or assignment.

The examples assume valid, non-negative inputs within their numeric limits. Assignments 1 and 2 read integer tokens: enter a nonnumeric token such as `q` to exit (their original prompts incorrectly suggest pressing Enter). Assignment 3 exits on an empty first input.

## Naming and generated files

- Topic folders use numbered, hyphen-separated names.
- Java files use PascalCase and match their public class names.
- Assignment names retain their question numbers.
- Compiled output belongs in `build/`; pre-cleanup class files are preserved in `build/legacy/` and are not used by the run command above.

The original conversion algorithms are preserved.
