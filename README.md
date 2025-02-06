# Groovy Implicit Type Conversion Bug

This repository demonstrates a subtle bug in Groovy related to implicit type conversion when comparing lists. The `myMethod` function is designed to return the larger of two numbers. However, due to Groovy's flexible type system, when lists are passed as arguments, the comparison behaves differently than expected.

## Bug Description

The core issue is Groovy's lexicographical comparison of lists. Instead of comparing the list lengths or some other custom comparison, Groovy compares the elements at each index. If one list is a prefix of the other (as in the example), it leads to an incorrect result.

## Solution

The solution involves explicitly checking for the list type and handling the comparison differently. A custom size comparison is used to achieve the intended behavior of determining which list is larger.