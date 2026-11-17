# Flowcharts and pseudocode

[Repository home](../README.md)

Practice turning a problem statement into an algorithm, a flowchart, and a Java program. Folder numbers show the study order; Java filenames retain the original assignment question numbers.

| Exercise | Java solution | Pseudocode | Flowchart |
| --- | --- | --- | --- |
| 01: Circle area | [Question1CircleArea.java](./01-Circle-Area/Question1CircleArea.java) | [Steps](./01-Circle-Area/pseudocode.txt) | [Diagram](./01-Circle-Area/flowchart.md) |
| 02: Greatest of two | [Question2GreatestOfTwo.java](./02-Greatest-of-Two/Question2GreatestOfTwo.java) | [Steps](./02-Greatest-of-Two/pseudocode.txt) | [Diagram](./02-Greatest-of-Two/flowchart.md) |
| 03: Square area | Not added yet | Not added yet | [Diagram](./03-Square-Area/flowchart.md) |
| 04: Even numbers | [Question3EvenNumbers.java](./04-Even-Numbers/Question3EvenNumbers.java) | [Steps](./04-Even-Numbers/pseudocode.txt) | [Diagram](./04-Even-Numbers/flowchart.md) |
| 05: Average of 25 scores | [Question4AverageOf25Scores.java](./05-Average-of-25-Scores/Question4AverageOf25Scores.java) | [Steps](./05-Average-of-25-Scores/pseudocode.txt) | [Diagram](./05-Average-of-25-Scores/flowchart.md) |

The [solution notes](./flowchart_solutions.md) collect explanations for the four implemented assignments. Each exercise also has a Mermaid diagram source beside its Markdown diagram. GitHub renders the Mermaid blocks in the Markdown files; VS Code preview may need a Mermaid-compatible extension.

## Run an exercise

First follow the [compile instructions](../README.md#compile-all-programs). From the repository root:

```sh
java -cp build/classes Question1CircleArea
```

Enter the circle's radius when prompted. The greatest-of-two exercise takes two numbers, the average exercise takes 25 scores, and the even-number exercise takes no input.

Next: [live sessions](../03-Live-Sessions/README.md).
