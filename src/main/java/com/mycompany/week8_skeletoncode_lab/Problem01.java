/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){ // Time= O(N^2) Complexity = O(1)
        
        
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time  
        
        int x, y, check, sum = 0;
        for (x = 1; x <= n; x++) {
 
            if (x == 1 || x == 0)
                continue;
 
            
            check = 1;
 
            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    check = 0;
                    break;
                }
            }
 
            
            if (check == 1)
                sum = sum + x;
        }
        
       return sum;
    
}

}