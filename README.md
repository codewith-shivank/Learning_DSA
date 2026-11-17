# Learning DSA with Java

My Java and data structures and algorithms learning repository. It currently contains **33 Java programs** covering language fundamentals, flowcharts, conditionals, loops, patterns, and binary numbers, alongside notes and diagrams.

## Learning path

| Order | Section | What to study |
| --- | --- | --- |
| 1 | [Java basics](./01-Java-Basics/README.md) | Variables, data types, arithmetic operators, and type casting. |
| 2 | [Flowcharts and pseudocode](./02-Flowcharts-and-Pseudocode/README.md) | Translate a problem into steps, a diagram, and Java code. |
| 3 | [Live sessions](./03-Live-Sessions/README.md) | Practice conditionals, loops, FizzBuzz, patterns, and binary arithmetic. |

## Repository structure

```text
Learning_DSA/
├── 01-Java-Basics/
│   ├── 01-Variables-and-Data-Types/
│   └── 02-Operators/
│       └── 01-Arithmetic/
├── 02-Flowcharts-and-Pseudocode/
│   ├── 01-Circle-Area/
│   ├── 02-Greatest-of-Two/
│   ├── 03-Square-Area/
│   ├── 04-Even-Numbers/
│   └── 05-Average-of-25-Scores/
└── 03-Live-Sessions/
    ├── Session-01-Loops-Basics/
    ├── Session-02-Conditionals/
    ├── Session-03-HackerRank-FizzBuzz/
    ├── Session-04-Pattern-Questions/
    ├── Session-05-Binary-Numbers/
    └── Session-06-Number-Triangles/
```

Each section has an index linking to its exercises. The square-area exercise currently contains diagrams only.

## Getting started

Install **JDK 17 or newer** and make sure both `java` and `javac` are on your PATH. This repository has been checked with JDK 21. No external libraries or build tools are required.

```sh
git clone https://github.com/codewith-shivank/Learning_DSA.git
cd Learning_DSA
java -version
javac -version
```

### Compile all programs

Run these commands from the repository root.

**PowerShell (Windows):**

```powershell
New-Item -ItemType Directory -Force build/classes | Out-Null
$sources = Get-ChildItem -LiteralPath '01-Java-Basics', '02-Flowcharts-and-Pseudocode', '03-Live-Sessions' -Recurse -Filter *.java
javac -encoding UTF-8 -d build/classes $sources.FullName
```

**Bash (macOS / Linux):**

```bash
mkdir -p build/classes
find 01-Java-Basics 02-Flowcharts-and-Pseudocode 03-Live-Sessions -name '*.java' -print0 | xargs -0 javac -encoding UTF-8 -d build/classes
```

After compilation succeeds, run one class at a time:

```sh
java -cp build/classes JavaVariablesDemo
java -cp build/classes HackerRankFizzBuzz
java -cp build/classes Question3BinaryAddition
```

The [binary addition assignment](./03-Live-Sessions/Session-05-Binary-Numbers/04-Binary-Number-Assignments/Question3BinaryAddition.java) first demonstrates `10 + 11 = 101`, then accepts input. Press Enter at its first-number prompt to exit. Other programs may require numeric input; check their session index.

### Compile one exercise

From the repository root, after creating the output directory above:

```sh
javac -encoding UTF-8 -d build/classes "03-Live-Sessions/Session-02-Conditionals/LeapYear.java"
java -cp build/classes LeapYear
```

These exercises use Java's default package, so the run command takes the class name without a folder or filename extension.

## Adding new exercises

- Keep each exercise in the section or session that matches its topic; keep its notes, pseudocode, and diagrams beside it.
- Use numbered, hyphen-separated topic folders and `Session-NN-Topic` session folders.
- Use PascalCase Java filenames matching their class names. Keep class names unique while using the default package.
- Preserve assignment question numbers even when they differ from folder ordering.
- Update the relevant section or session index when adding an exercise.
- Keep generated output in ignored build directories. Commit source and notes, not compiled class files; see [.gitignore](./.gitignore).

The [loop overflow demonstration](./03-Live-Sessions/Session-01-Loops-Basics/LoopOverflowDemo.java) prints over two billion lines before integer overflow stops it. Read it first; use Ctrl+C if you run it and want to stop early.
