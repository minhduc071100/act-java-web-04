/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5.pkg11;

import java.util.Scanner;

/**
 *
 * @author linhb
 */
public class BAI511 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // TODO code application logic here
        double n, i, s = 0,gt=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap n= ");
        n = input.nextDouble();
        for(i=1; i<=n;i++)
            gt = gt + i;
            s  =  s+ 1/gt;
            System.out.println("giá trị của GT  là:" + s);
    }
    
}
