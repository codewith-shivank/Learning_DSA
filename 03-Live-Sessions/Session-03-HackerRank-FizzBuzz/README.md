# Session 03: HackerRank FizzBuzz

[All sessions](../README.md)

Both programs print FizzBuzz from `1` through `100` and take no input.

| Program | Approach |
| --- | --- |
| [HackerRankFizzBuzz.java](./HackerRankFizzBuzz.java) | Uses remainder checks for multiples of 15, 3, and 5. |
| [CounterBasedFizzBuzz.java](./CounterBasedFizzBuzz.java) | Uses counters that reset after three and five iterations. |

Compile using the [root instructions](../../README.md#compile-all-programs), then run from the repository root:

```sh
java -cp build/classes HackerRankFizzBuzz
java -cp build/classes CounterBasedFizzBuzz
```

Compare the outputs: every third number becomes `Fizz`, every fifth becomes `Buzz`, and every fifteenth becomes `FizzBuzz`.
