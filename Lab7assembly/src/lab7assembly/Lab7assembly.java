/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7assembly;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Saahil Kumar
 */
public class Lab7assembly {

    /**
     * @param args the command line arguments
     */
    public static float Total(ArrayList<Float> List) {
        float total = 0;

        for (int i = 0; i < List.size(); i++) {
            Float currentNum = List.get(i);
            total += currentNum;
        }
        return (total);
    }

    public static float VarianceA(ArrayList<Float> List) {
        float total = Total(List);
        float temp = 0;
        for (int i = 0; i < List.size(); i++) {

            temp += Math.pow(List.get(i), 2) - (Math.pow((total), 2) / 3);
        }

        return (temp / 2);
    }

    public static float VarianceB(ArrayList<Float> List) {
        float total = Total(List);
        float temp = 0;
        for (int i = 0; i < List.size(); i++) {

            temp += Math.pow((List.get(i) - total / 3), 2);
        }

        return (temp / 2);
    }

    public static void main(String[] args) {

        ArrayList<Float> list = new ArrayList<Float>(10);
        System.out.println("Please Enter 3 Integers of Choice: ");
        Scanner Key = new Scanner(System.in);
        

        for (int i = 0; i < 3; i++) {
            list.add(Key.nextFloat());
        }
        System.out.println("The contents of ArrayList are: ");

        for (float y : list) {
            System.out.print(y + ",");
        }

        System.out.println();
        System.out.println("The Total is: " + Total(list));
        System.out.println("The Variance A is: " + VarianceA(list));
        System.out.println("The Variance B is: " + VarianceB(list));

        
    }

}
