package com.example;

public class Addition implements Chain{

    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;
        
    }

    @Override
    public void calculate(Operation request) {
        if(request.getOperator() == '+'){
            int op1 = request.getOperand1();
            int op2 = request.getOperand2();
            System.out.println(op1 + " + " + op2 + " = "+(op1 + op2));
        }
        else{
            nextInChain.calculate(request);
        }
        
    }
    
}
