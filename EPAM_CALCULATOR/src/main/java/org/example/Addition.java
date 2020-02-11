package org.example;

public class Addition extends Calculator
{
    Addition(double a, double b)
    {
        first_operand = a;
        second_operand = b;
    }

    double calculate()
    {
        return first_operand+second_operand;
    }
}