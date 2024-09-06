/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EDSON
 */
public class Main {

    public static void main(String[] args) throws IOException {
//        helloWorld();
//        getSamllestAndLargestNumber();
//        getPrimeNumbers(100);
        Form window = new Form();
        window.show();
    }
    
    public static void getSamllestAndLargestNumber() throws IOException{
        System.out.println("Enter the first number");
        int number1 = loadNumber();
        
        System.out.println("Enter the second number");
        int number2 = loadNumber();
        
        System.out.println("Enter the third number");
        int number3 = loadNumber();
        
        int largest = findLargestNumber(number1, number2, number3);
        int smallest = findSmallestNumber(number1, number2, number3);
        
        System.out.println("The largest number is: " + largest);
        System.out.println("The shortest number is: " + smallest);
    }
    
    private static int loadNumber() throws IOException{
        InputStreamReader getNumber = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(getNumber);
        String strNumber = buffer.readLine();
        Integer number = Integer.parseInt(strNumber);
        return number;
    }
    
    public static int findLargestNumber(int number1, int number2, int number3) {
        return Math.max(number1, Math.max(number2, number3));
    }
    
    public static int findSmallestNumber(int number1, int number2, int number3) {
        return Math.min(number1, Math.min(number2, number3));
    }
    
    private static void getPrimeNumbers(int amount){
        int counter = 0;
        int number = 2;

        while (counter < amount) {
            if (isPrime(number)) {
                System.out.println(number);
                counter++;
            }
            number++;
        }
    }
    
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    private static void helloWorld(){
        String name = "Edson";
        
        System.out.println("Hello World in Java!");
        System.out.println("Welcome!!! " + name);
    }
}
