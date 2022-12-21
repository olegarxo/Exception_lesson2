package ru.gb.homework;

import java.io.FileNotFoundException;

public class Main {
    // Task3
    public static void main(String[] args){
        Main main = new Main();
        try {
            int a = 90, b = 3;
            try {
                System.out.println(a / b);
            }catch (ArithmeticException | IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            main.printSum(23, 234);
            int[] abc = { 1, 2, 3, 4 };
            abc[3] = 9;
        }  catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }
    public void printSum(Integer a, Integer b){
        try {
            System.out.println(a + b);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    //Task2
    public void task2(){
        int[] intArray = new int[10];
        try {
            int d = 2;
            double catchedRes1 = intArray[8] / (double) d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }

    }

}
