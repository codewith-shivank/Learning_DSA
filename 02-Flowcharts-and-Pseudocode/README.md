# FlowChart Programs

Each question has its own folder containing:

- `pseudocode.txt` — step-by-step pseudocode
- `flowchart.mmd` — Mermaid flowchart diagram source
- `flowchart.md` — Markdown file that renders the Mermaid diagram as a visual image in VS Code preview
- Java source code

## Folder Structure

```text
FlowChart/
├── README.md
├── flowchart_solutions.md
├── Question1_Circle_Area/
│   ├── pseudocode.txt
│   ├── flowchart.mmd
│   └── Question1CircleArea.java
├── Question2_Greatest_Of_Two/
│   ├── pseudocode.txt
│   ├── flowchart.mmd
│   └── Question2GreatestOfTwo.java
├── Question3_Even_Numbers/
│   ├── pseudocode.txt
│   ├── flowchart.mmd
│   └── Question3EvenNumbers.java
└── Question4_Average_Of_25_Scores/
    ├── pseudocode.txt
    ├── flowchart.mmd
    └── Question4AverageOf25Scores.java
```

## How to Use the Mermaid Flowcharts

Open any `.mmd` file in a Mermaid-compatible previewer or paste its contents into the Mermaid Live Editor.

## How to Run the Java Programs

From the `FlowChart` folder, compile a program with:

```text
javac Question1_Circle_Area\Question1CircleArea.java
```

Then run it with:

```text
java -cp Question1_Circle_Area Question1CircleArea
```

Use the matching folder and class name for the other questions. Java compilation requires the JDK and the `javac` command in the system PATH.
