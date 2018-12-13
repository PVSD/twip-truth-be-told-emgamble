package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner numberReader = new Scanner(System.in);
        System.out.println("How many boolean expressions would you like to input?");
        int index = numberReader.nextInt();


        String [] operations = new String [100];
        operations[0]= "A";
        operations[1]= "B";
        boolean [] tt = new boolean [operations.length];
        boolean [] tf = new boolean [operations.length];
        boolean [] ft = new boolean [operations.length];
        boolean [] ff = new boolean [operations.length];

        tt[0] = true; tt[1] = true;
        tf[0] = true;
        ft[1] = true;

        for(int i = 2; i < operations.length; i++){
            Scanner expressionReader = new Scanner(System.in);
            System.out.println("Input Boolean Expression");
            operations[i] = expressionReader.nextLine();



        }




    }
}
