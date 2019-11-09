/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment06.pkg1;

/**
 *
 * @author Mert Yacan
 */
public class Assignment6_1 {

public static double lowestdif = 100;
public static double number1;
public static int number1index;
public static double number2;
public static int number2index;
public static double[] array = new double[500];
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";

public static void calculate(double a, double b, int numloc1, int numloc2){
    if(Math.abs(a-b) < lowestdif){
        lowestdif = Math.abs(a-b);
        number1 = a;
        number1index = numloc1;
        number2 = b;
        number2index = numloc2;
    }
}
    
    public static void main(String[] args) {
        
        array[0] = Math.random()*100;
        for(int i = 1; i < 500; i++){
            array[i] = Math.random()*100;
            calculate(array[i-1], array[i], i-1, i);
        }
        
        System.out.println("In the sequence; ");
        for(int i = 0; i < 50; i++){
            for(int j = 0; j < 10; j++){
                if(((i*10+j) != number1index) && ((i*10+j) != number2index)){
                    System.out.print((int)array[i*10+j] + " ");
                }
                else{
                    System.out.print(ANSI_YELLOW_BACKGROUND + (int)array[i*10+j] + " " + ANSI_RESET);
                }
            }
            System.out.println("\n");
        }
        System.out.println("The minimum difference is " + lowestdif + " (between " + number1 + " and " + number2 + "). This exists between indexes " + number1index + " and " + number2index + ".");
        System.out.println("The numbers are colored in the sequence.");
    }
    
}
