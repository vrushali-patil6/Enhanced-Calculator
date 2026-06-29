# Enhanced Calculator

A Java-based console application developed as part of the ShadowFox Java Development Internship. This project performs basic and advanced mathematical calculations through a simple menu-driven interface.

---

## Features

- Addition
- Subtraction
- Multiplication
- Division
- Power Calculation
- Square Root Calculation
- Menu-driven interface
- Handles divide-by-zero exceptions

---

## Technologies Used

- Java
- Maven
- IntelliJ IDEA
- Git
- GitHub

---

## Project Structure

```
EnhancedCalculator
│
├── src
│   └── com
│       └── shadowfox
│           └── calculator
│               ├── Main.java
│               └── service
│                   └── Calculator.java
│
├── pom.xml
├── README.md
└── .gitignore
```

---

## Prerequisites

- JDK 21 or above
- IntelliJ IDEA
- Maven

---

## How to Run

### Using IntelliJ IDEA

1. Clone or download the repository.
2. Open the project in IntelliJ IDEA.
3. Allow Maven to download the required dependencies.
4. Open **Main.java**.
5. Click the **Run** button.
6. Select the desired calculator operation from the menu.

---

## Using Maven

Open terminal inside the project folder and run:

```bash
mvn clean compile
mvn exec:java
```

---

## Database Setup

This project is a standalone Java console application and does not require any database setup.

---

## Sample Output

```
========== ENHANCED CALCULATOR ==========
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Power
6. Square Root
7. Exit

Enter your choice:
```

---

## Future Enhancements

- Scientific Calculator
- Calculation History
- GUI using JavaFX or Swing
- Unit Converter
- Expression Evaluation

---

## Author

**Vrushali Patil**

Developed as part of the **ShadowFox Java Development Internship**.