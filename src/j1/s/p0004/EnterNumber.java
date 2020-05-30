/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0004;

import java.util.Scanner;

/**
 *
 * @author phanh
 */
public class EnterNumber {
    public int enterInt(int min, int max){
        Scanner sc = new Scanner(System.in);
        int num;
        
        while(true){
            while(!sc.hasNextInt()){
            String input = sc.next();
            System.out.println("Please enter an integer:");
            }
            num = sc.nextInt();
        
            if(num < min || num > max){
                System.out.println("Out of range " + min + " to " + max);
                System.out.println("Please re-enter an integer number");
                continue;
            }
            break;
        }
        return num;
    }
}
