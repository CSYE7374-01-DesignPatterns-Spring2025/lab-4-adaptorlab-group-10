package edu.neu.csye7374;

public interface CalculatableAPI {
    enum OPERATION {ADD, SUB}
    double operation(OPERATION op, double a, double b);
}