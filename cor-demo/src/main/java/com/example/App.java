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
        
        System.out.println("Operand 1:");
        Scanner scanInt = new Scanner(System.in);             
        int op1 = scanInt.nextInt();
        System.out.println("Operand 2:");
        int op2 = scanInt.nextInt();
        
        System.out.println("Operator: ");
        Scanner scanStr = new Scanner(System.in);
        String opr = scanStr.nextLine();
        
        Operation request = new Operation(op1, op2, opr.charAt(0));
        
        chain1.calculate(request);

    }
}
