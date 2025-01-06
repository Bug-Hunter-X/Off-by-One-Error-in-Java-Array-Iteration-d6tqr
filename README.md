# Off-by-One Error in Java Array Iteration

This repository demonstrates a common, yet subtle, programming error in Java: the off-by-one error when iterating over arrays. The `Bug.java` file contains the erroneous code, while `BugSolution.java` provides the corrected version.

The bug lies in the for loop condition.  Using `i <= array.length` instead of `i < array.length` leads to an attempt to access an element beyond the array's bounds, resulting in an `ArrayIndexOutOfBoundsException`.

This example highlights the importance of careful attention to loop conditions when working with arrays in Java and other programming languages.