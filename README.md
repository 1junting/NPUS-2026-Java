# NPUS 2026 – Numerical Methods Programming Assignment  
## Nonlinear Equation Solver Using Newton-Raphson Method

---

## 1. Objective

The objective of this project is to implement the Newton-Raphson method in Java to approximate the root of a nonlinear equation.  
This assignment demonstrates understanding of iterative numerical methods and their implementation.

---

## 2. Problem Statement

We solve the nonlinear equation:

f(x) = x³ − x − 1

The derivative of the function is:

f'(x) = 3x² − 1

The goal is to approximate the real root of the equation using an initial guess and a specified number of iterations.

---

## 3. Methodology

The Newton-Raphson iteration formula is:

xₙ₊₁ = xₙ − f(xₙ) / f'(xₙ)

Where:

- xₙ = current approximation  
- f(xₙ) = function value  
- f'(xₙ) = derivative value  

The algorithm follows these steps:

1. Read initial guess (x₀)
2. Read number of iterations (n)
3. Apply Newton iteration n times
4. Output the approximate root

---

## 4. Implementation Details

- Language: Java  
- Development Environment: macOS Terminal / VS Code  
- JDK Version: 21  

Core methods implemented:

- `f(x)` → calculates function value  
- `df(x)` → calculates derivative  
- `newton(x0, iterations)` → performs iterative approximation  

---

## 5. Program Execution

### Compilation
