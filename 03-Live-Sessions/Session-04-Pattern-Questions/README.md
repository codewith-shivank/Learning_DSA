# Session 04: Star patterns

[All sessions](../README.md)

Use small positive dimensions, such as `5`, to trace how loop conditions determine each pattern.

| Topic | Program | Input |
| --- | --- | --- |
| Horizontal line | [HorizontallyPrint.java](./01-Horizontal-Print/HorizontallyPrint.java) | Number of stars. |
| Rectangle | [RowsXCol.java](./02-Rows-And-Columns/RowsXCol.java) | Number of rows, then columns. |
| X pattern | [PrintX.java](./03-Print-X/PrintX.java) | Grid size; an odd size gives a single center star. |
| Lower-left triangle | [LowerLeftTriangle.java](./04-Triangle-Patterns/LowerLeftTriangle.java) | Number of rows. |
| Lower-right triangle | [LowerRightTriangle.java](./04-Triangle-Patterns/LowerRightTriangle.java) | Number of rows. |
| Upper-left triangle | [UpperLeftTriangle.java](./04-Triangle-Patterns/UpperLeftTriangle.java) | Number of rows. |
| Upper-right triangle | [UpperRightTriangle.java](./04-Triangle-Patterns/UpperRightTriangle.java) | Number of rows. |

Compile using the [root instructions](../../README.md#compile-all-programs), then run from the repository root:

```sh
java -cp build/classes UpperRightTriangle
```

Continue with [number triangle patterns](../Session-06-Number-Triangles/README.md) to practice changing the values printed inside the loops.
