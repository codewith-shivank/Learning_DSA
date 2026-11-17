# Session 06: Number Triangle Patterns

[All sessions](../README.md)

Five left-aligned triangle patterns using nested loops. Each example prints five rows (`n = 5`). The original loop logic and output are preserved.

## Learning order

| Topic | Source | Previous name | Printed value |
| --- | --- | --- | --- |
| 01: Increasing numbers from 1 | [IncreasingNumberTriangle.java](./01-Increasing-Number-Triangle/IncreasingNumberTriangle.java) | LowerLeft.java | `j` |
| 02: Repeat the row number | [RepeatedRowNumberTriangle.java](./02-Repeated-Row-Number-Triangle/RepeatedRowNumberTriangle.java) | LowerLeft2.java | `i` |
| 03: Descend to zero | [DescendingToZeroTriangle.java](./03-Descending-To-Zero-Triangle/DescendingToZeroTriangle.java) | type3.java | `i - j` |
| 04: Increase from the row number | [RowStartingNumberTriangle.java](./04-Row-Starting-Number-Triangle/RowStartingNumberTriangle.java) | type4.java | `i + j - 1` |
| 05: Continue counting across rows | [ContinuousNumberTriangle.java](./05-Continuous-Number-Triangle/ContinuousNumberTriangle.java) | type5.java | `counter++`, starting at 0 |

## Expected output

### 01: Increasing numbers from 1

```text
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

### 02: Repeat the row number

```text
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
```

### 03: Descend to zero

```text
0
1 0
2 1 0
3 2 1 0
4 3 2 1 0
```

### 04: Increase from the row number

```text
1
2 3
3 4 5
4 5 6 7
5 6 7 8 9
```

### 05: Continue counting across rows

```text
0
1 2
3 4 5
6 7 8 9
10 11 12 13 14
```

The programs also print a trailing space after each number.

## Compile and run

Open PowerShell in this session folder with a JDK installed:

```powershell
New-Item -ItemType Directory -Force build | Out-Null
$sources = Get-ChildItem -Path . -Recurse -Filter *.java
javac -encoding UTF-8 -d build $sources.FullName
java -cp build ContinuousNumberTriangle
```

Replace `ContinuousNumberTriangle` with any class name from the table to run a different pattern. Change `n` inside an example to change its row count.

## Organization

Topic folders use numbered, hyphen-separated names. Java filenames use PascalCase and match their public class names. Compiled output belongs in `build/`; the pre-cleanup class file is preserved in `build/legacy/` and is not used by the run command above.
