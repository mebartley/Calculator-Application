# MathLibrary

## Overview

MathLibrary is a Java library providing a set of mathematical operations to work with integers and floating-point numbers. The library is designed with simplicity and efficiency in mind, offering a straightforward API to perform basic mathematical operations such as addition, subtraction, multiplication, and division.

## Features

- **Addition**: Adds two numbers.
- **Subtraction**: Subtracts the second number from the first number.
- **Multiplication**: Multiplies two numbers.
- **Division**: Divides the first number by the second number. Throws an `ArithmeticException` if attempted to divide by zero.

## Usage

To use the MathLibrary in your Java project, first create an instance of the `MathLibraryImpl` class. Then, call the desired method with the appropriate arguments:

```java
MathLibraryImpl mathLibrary = new MathLibraryImpl();
System.out.println("Addition test: " + mathLibrary.add(2, 3));
System.out.println("Subtraction test: " + mathLibrary.subtract(5, 3));
System.out.println("Multiplication test: " + mathLibrary.multiply(2, 3));
try {
    System.out.println("Division test: " + mathLibrary.divide(6, 3));
    System.out.println("Division by zero test: " + mathLibrary.divide(6, 0));
} catch (ArithmeticException e) {
    System.out.println(e.getMessage());
}
