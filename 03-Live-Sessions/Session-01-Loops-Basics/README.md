# Session 01: Loop basics

[All sessions](../README.md)

| Program | What it demonstrates | Input |
| --- | --- | --- |
| [Continue.java](./Continue.java) | Skips multiples of three and prints `1, 2, 4, 5, 7, 8, 10`, one per line. | None |
| [DoNothing.java](./DoNothing.java) | An initially false loop condition produces no output. | None |
| [LoopOverflowDemo.java](./LoopOverflowDemo.java) | Increments a non-negative integer until it overflows. | None |

Compile using the [root instructions](../../README.md#compile-all-programs), then run from the repository root:

```sh
java -cp build/classes Continue
```

Read the overflow example before running it: it prints integers from `0` through `2147483647` (2,147,483,648 lines). When the counter overflows to a negative value, the condition becomes false. Use Ctrl+C to stop it early.
