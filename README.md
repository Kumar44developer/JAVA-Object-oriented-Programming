# ☕ Java Object-Oriented Programming

A console-based Java application demonstrating fundamental Object-Oriented Programming (OOP) principles and data structure management through an interactive Stack simulation.

---

## Overview

This project models a Last-In, First-Out (LIFO) stack data structure using standard Java classes and arrays. It provides a terminal-driven menu where users can push elements, pop elements, and inspect current stack contents with real-time boundary condition handling.

---

## OOP Concepts Demonstrated

- **Encapsulation**: The internal state (`stackArray`, `top`, `MAX_SIZE`) is declared `private` to safeguard data integrity against direct external mutation.
- **Abstraction**: Public methods (`push()`, `pop()`, `display()`) expose high-level operations while concealing low-level array manipulation and pointer logic.
- **Class and Object Interaction**: Separates data structure implementation (`Stack`) from application runtime execution (`Stack_simulation`).

---

## Features

- **Push Operation**: Inserts an integer onto the stack with automatic overflow detection (`Stack full`).
- **Pop Operation**: Removes the top element with underflow protection (`Stack empty`) and prints the current Top Of Stack (TOS).
- **Display Operation**: Traverses and lists all stack items from top to bottom.
- **Interactive Menu Loop**: Clean terminal interface accepting continuous user input until explicitly terminated.

---

## Tech Stack

| Component | Specification |
| --- | --- |
| Language | Java (JDK 8 or higher) |
| Paradigm | Object-Oriented Programming (OOP) |
| Architecture | Console Application (CLI) |

---

## Project Structure

```
JAVA-Object-oriented-Programming/
├── Stack_simulation.java  
├── Increment.java         
└── README.md             
```

---

## Getting Started

### Prerequisites

Ensure you have the Java Development Kit (JDK) installed and available in your environment:

```bash
javac -version
java -version
```

### Installation

Clone the repository to your local machine:

```bash
git clone https://github.com/Kumar44developer/JAVA-Object-oriented-Programming.git
```

### Compile & Run

1. Navigate to the project folder:

   ```bash
   cd JAVA-Object-oriented-Programming
   ```

2. Compile the Java source file:

   ```bash
   javac Stack_simulation.java
   ```

3. Execute the compiled application:

   ```bash
   java Stack_simulation
   ```

---

## Sample Console Session

```text
1. Push
2. Pop
3. Display
4. Exit
Choice: 1
Enter element to insert: 
10

1. Push
2. Pop
3. Display
4. Exit
Choice: 1
Enter element to insert: 
20

1. Push
2. Pop
3. Display
4. Exit
Choice: 3
Contents of stack are
20
10

1. Push
2. Pop
3. Display
4. Exit
Choice: 2
TOS is 20

1. Push
2. Pop
3. Display
4. Exit
Choice: 4
Exiting...
```

---

## Author

**Kumar44developer** — [GitHub Profile](https://github.com/Kumar44developer)
