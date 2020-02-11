package org.example;

public class Multiplication extends Calculator
{
    Multiplication(double a, double b)
    {
        first_operand = a;
        second_operand = b;
    }

    double calculate()
    {
        return first_operand*second_operand;
    }
}