package com.company;
import java.util.Scanner;
import java.io.*;
import javax.script.ScriptException;


public class Main {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ScriptException {

        Scanner numberReader = new Scanner(System.in);
        System.out.println("How many boolean expressions would you like to input?");
        int index = numberReader.nextInt();


        String [] operations = new String [index + 2];
        operations[0]= "A";
        operations[1]= "B";

        int [] spaceLength = new int[operations.length];
        spaceLength[0]=1;
        spaceLength[1]=1;

        int tracker = index;
        for(int i = 2; i < operations.length; i++){
            Scanner expressionReader = new Scanner(System.in);
            System.out.println("Input Boolean Expression");
            operations[i] = expressionReader.nextLine();
            spaceLength[i]= operations[i].length();
            tracker--;

        }

        TrueFalseTable table = new TrueFalseTable(operations);
        PrintWriter writer = new PrintWriter("outputTable.txt", "UTF-8");
        String row = "";

        for (String a : operations){
            row = row + a + " ";
        }
        row = row + "\n";
        String space = "";

        for(int j = 0; j < operations.length; j++ ) {
            for (int i = 0; i <= spaceLength[j]; i++) {
                space = space + " ";
            }
            row = row + table.makeTable(table.tt)[j] + space;
            space = " ";
        }
        row = row + "\n";

        for(int j = 0; j < operations.length; j++ ) {
            for (int i = 0; i <= spaceLength[j]; i++) {
                space = space + " ";
            }
            row = row + table.makeTable(table.tf)[j] + space;
            space = " ";
        }
        row = row + "\n";
        for(int j = 0; j < operations.length; j++ ) {
            for (int i = 0; i <= spaceLength[j]; i++) {
                space = space + " ";
            }
            row = row + table.makeTable(table.ft)[j] + space;
            space = " ";
        }
        row = row + "\n";
        for(int j = 0; j < operations.length; j++ ) {
            for (int i = 0; i <= spaceLength[j]; i++) {
                space = space + " ";
            }
            row = row + table.makeTable(table.ff)[j] + space;
            space = " ";
        }
        row = row + "\n";



        writer.println(row);
        writer.close();




    }
}
