package org.example;

public class Division extends Calculator
{
    Division(double a, double b)
    {
        first_operand = a;
        second_operand = b;
    }

    double calculate()
    {
        return first_operand/second_operand;
    }
}