package com.example;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

        Chain chain1 = new Addition();
        Chain chain2 = new Substraction();
        Chain chain3 = new Multiplication();
        Chain chain4 = new Division();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);      

        Operation request = new Operation(5, 6, "*");

        chain1.calculate(request);

    }
}
