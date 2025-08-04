# SOLUTIONS.md

This document summarizes the key Java concepts and skills learned through a series of functional, string, array, and map-based coding exercises. It focuses only on the most valuable insights that are worth remembering and applying in future Java development.

---

## ✅ Core Java Concepts Worth Revisiting

### 1. String Manipulation & Logic
- **`substring(start, end)`**: end is exclusive; used to extract parts of a string.
- **`.equals()` vs `==`**: use `.equals()` for comparing strings; `==` only compares references.
- **Character logic**: `'x'` is a `char`, cannot be used with `.equals()` — use `==` instead.
- **Common pitfalls**:
  - `char + String` can behave like `int + String` if not handled properly.
  - Always guard `substring()` calls with a length check to avoid `IndexOutOfBoundsException`.

---

### 2. Looping and Indexing
- Use `for (int i = 0; i < list.size(); i++)` when you need index access.
- Enhanced `for (String s : list)` is clean but doesn't give you the index.
- `i += n` is ideal for "every nth" logic.
- Always check boundaries like `str.length() - 1` or `nums.length - 2` before accessing `i+1`, `i+2`.

---

### 3. Functional Programming (Java 8+)

#### In-place list modification:
```java
list.replaceAll(s -> s.replace("x", ""));
```
- Transforms each element of a list based on a lambda expression.
- Mutates the list directly.

#### Conditional removal:
```java
list.removeIf(n -> n < 0);
```
- Removes all elements where the condition is `true`.

---

### 4. Java Streams (Declarative Logic)
```java
List<Integer> result = nums.stream()
    .map(n -> n * 2)
    .filter(n -> n >= 0)
    .collect(Collectors.toList());
```
- **`.map()`** transforms each item.
- **`.filter()`** keeps only items where the condition is true.
- **`.collect()`** converts the stream back into a list.

---

### 5. HashMap Use Cases
- **Storing first occurrence** for problems like `firstSwap`.
- Using `map.containsKey()` and `map.get()` to implement controlled logic.
- Using flags like `map.put(key, -1)` to disable future actions on a key.
- Real-world patterns: grouping, frequency counts, conditional operations.

---

## 💡 Why These Concepts Matter
These techniques go beyond just solving puzzles:
- They teach **clear, scalable thinking**
- Improve **code readability**
- Are **frequently tested in interviews**
- Show up in real-world systems and enterprise codebases

---
