package com.example;

public interface Chain {
    
    public void setNextChain(Chain nextChain);
    public void calculate(Operation request);

}
