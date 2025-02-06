```groovy
def myMethod(a, b) {
  if (a > b) {
    return a
  } else {
    return b
  }
}

println myMethod(5, 2)
println myMethod(2, 5)
println myMethod([1,2], [3,4]) // Unexpected behavior
```