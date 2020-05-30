/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0004;

import java.util.Random;

/**
 *
 * @author phanh
 */
public class J1SP0004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arrLength;
        EnterNumber enter = new EnterNumber();
        DisplayArray display = new DisplayArray();
        System.out.println("Enter number of array:");
        arrLength = enter.enterInt(0, 1000);
        
        int userArray[] = new int[arrLength];
        
        for(int i = 0; i < arrLength; i++){
            userArray[i] = new Random().nextInt(arrLength);
        }
        
        System.out.println("The unsorted array:");
        display.original(userArray);
        
//Sorting array:
        System.out.println("\nThe sorted array:");
        display.sorted(userArray);
    }
    
}
