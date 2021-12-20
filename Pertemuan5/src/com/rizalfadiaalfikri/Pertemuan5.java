/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rizalfadiaalfikri;
import org.apache.commons.math3.stat.StatUtils;

/**
 *
 * @author ASUS
 */
public class Pertemuan5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double data[] = {34, 17, 68, 39, 40, 50, 79, 10, 88, 45};
        
        System.out.printf("Mean : %7.3f\n", StatUtils.mean(data));
        System.out.printf("Sum : %7.3f\n", StatUtils.sum(data));
        System.out.printf("Mim : %7.3f\n", StatUtils.min(data));
        System.out.printf("Max : %7.3f\n", StatUtils.max(data));
        System.out.printf("Var : %7.3f\n", StatUtils.variance(data));
        
    }
    
}
