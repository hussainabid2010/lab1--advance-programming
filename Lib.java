/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author habid.bscs13seecs
 */
public class Lib {
    
     public static void iterative()
     {
     int a;
     int b;
     int c;
     int d;
     int sum = 0;
     int  x;
     int  y;
     int k;
 
      Scanner in = new Scanner(System.in);
      System.out.println("Enter row and columns for MatA");
      a = in.nextInt();
      b = in.nextInt();
 
      int matA[][] = new int[a][b];
 
      System.out.println("Enter MatA");
 
      for ( x = 0 ; x < a ; x++ )
         for ( y = 0 ; y < b ; y++ )
            matA[x][y] = in.nextInt();
 
      System.out.println("Enter row and columns for MatB");
      c = in.nextInt();
      d = in.nextInt();
 
      if ( b != c )
         System.out.println("matA has no equal row to matB col");
      else
      {
         int matB[][] = new int[c][d];
         int matC[][] = new int[a][d];
 
         System.out.println("Enter MatB");
 
         for ( x = 0 ; x < c ; x++ )
            for ( y = 0 ; y < d ; y++ )
               matB[x][y] = in.nextInt();
 
         for ( x = 0 ; x < a ; x++ )
         {
            for ( y = 0 ; y < d ; y++ )
            {   
               for ( k = 0 ; k < c ; k++ )
               {
                  sum = sum + matA[x][k]*matB[k][y];
               }
 
               matC[x][y] = sum;
               sum = 0;
            }
         }
 
 System.out.print("\n");
 
         for ( x = 0 ; x < a ; x++ )
         {
             {
                 for ( y = 0 ; y < d ; y++ )
               System.out.print(matC[x][y]+" ");
             }
            System.out.print("\n");
         }
     }
     }
}
