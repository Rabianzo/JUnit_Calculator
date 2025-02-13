# JUnit Calculator Project

## 📌 Overview
This project is a simple calculator implemented in Java, following a **Test-Driven Development (TDD)** approach using **JUnit 5**. The calculator supports basic arithmetic operations:
- **Addition**: Handles two or more integers.
- **Multiplication**: Handles two or more integers.

The project demonstrates the importance of writing unit tests before implementation, ensuring code reliability and correctness.

---

## 🛠️ Technologies Used
- **Java 11+** (Programming Language)
- **JUnit 5** (Testing Framework)
- **Maven** (Build & Dependency Management)
- **Visual Studio Code** (IDE)

---

## 🚀 Installation & Setup
### **1️⃣ Clone the Repository**
```sh
git clone https://github.com/your-username/junit-calculator.git
cd junit-calculator
```

### **2️⃣ Build the Project**
Ensure you have Maven installed, then run:
```sh
mvn clean install
```

### **3️⃣ Run Tests**
Execute all JUnit test cases:
```sh
mvn test
```

---

## 📂 Project Structure
```
JUnit_Calculator_Project/
│-- src/
│   ├── main/java/com/example/Calculator.java
│   ├── test/java/com/example/CalculatorTest.java
│-- pom.xml
│-- README.md
```

- `Calculator.java` → Contains the implementation of `add()` and `multiply()`.
- `CalculatorTest.java` → Contains unit tests using JUnit 5.
- `pom.xml` → Manages dependencies and build configurations.

---

## 📝 Usage
Example of using the calculator functions:
```java
int sum = Calculator.add(1, 2, 3, 4);  // Output: 10
int product = Calculator.multiply(2, 3, 4);  // Output: 24
```
---

### 📬 Contact
For any inquiries, reach out via **[morenamacheka@gmail.com](mailto:morenamacheka@gmail.com)** .
