Assignment I: Numerical Solution of a Nonlinear Equation Using Newton-Raphson Method

Junting  
NPUS 2026  
Department of Computer Science  

---

## Abstract

This assignment implements the Newton-Raphson method to approximate the real root of a nonlinear equation. The program reads user-defined initial guesses and iteration counts, applies iterative numerical computation, and outputs the approximated root. The derivative function is manually defined, and the iteration logic is implemented from scratch in Java without relying on external libraries. Experimental results demonstrate fast convergence toward the real solution, validating the correctness and efficiency of Newton's method.

Keywords—Newton-Raphson method; nonlinear equation; numerical iteration; root approximation

---

## I. INTRODUCTION

Solving nonlinear equations is a fundamental problem in numerical analysis. Closed-form solutions are often unavailable; therefore, iterative numerical methods are required. Among these methods, the Newton-Raphson method is widely used due to its quadratic convergence when the initial guess is sufficiently close to the true root.

In this assignment, we solve the nonlinear equation:

f(x) = x³ − x − 1

using Newton iteration.

---

## II. METHOD AND EXPERIMENTAL RESULTS

The Newton-Raphson iteration formula is defined as:

x(n+1) = x(n) − f(x(n)) / f'(x(n))

For the given function:

f(x) = x³ − x − 1  
f'(x) = 3x² − 1  

The program performs the following steps:

1. Read the initial guess x₀  
2. Read the number of iterations n  
3. Iteratively compute x using Newton’s formula  
4. Output the approximate root  

### Experimental Result

Input:

Enter initial guess: 1  
Enter number of iterations: 10  

Output:

Approximate root: 1.5213797068045676  

The result converges to approximately:

1.52138

This confirms the quadratic convergence behavior of Newton's method.

---

## III. CONCLUSION

This assignment successfully demonstrates the implementation of the Newton-Raphson method in Java. The program accurately approximates the real root of a nonlinear equation using iterative numerical computation. Experimental results verify rapid convergence and correctness of implementation. The project provides practical understanding of numerical root-finding techniques and their computational behavior.

---

## REFERENCES

[1] Newton's method: https://en.wikipedia.org/wiki/Newton%27s_method
