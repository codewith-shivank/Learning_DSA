# Even Numbers Between 9 and 100

```mermaid
flowchart TD
    A([Start]) --> B[Set number = 10]
    B --> C{Is number < 100?}
    C -- Yes --> D[/Display number/]
    D --> E[number = number + 2]
    E --> C
    C -- No --> F([End])
```
