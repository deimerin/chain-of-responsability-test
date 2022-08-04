package com.example;

public class Operation {

    private int operand1;
    private int operand2;
    private Character operator;

    public Operation(int newOperand1, int newOperand2, Character newOperator){
        operand1 = newOperand1;
        operand2 = newOperand2;
        operator = newOperator;
    }

    public int getOperand1(){
        return operand1;
    }

    public int getOperand2(){
        return operand2;
    }

    public Character getOperator(){
        return operator;
    }
  
}
