```groovy
def myMethod(a, b) {
  if (a instanceof List && b instanceof List) {
    if (a.size() > b.size()) {
      return a
    } else {
      return b
    }
  } else if (a > b) {
    return a
  } else {
    return b
  }
}

println myMethod(5, 2)
println myMethod(2, 5)
println myMethod([1,2], [3,4]) // Now correctly returns [3,4]
println myMethod([1,2,3], [3,4]) // Correctly returns [1,2,3]
```