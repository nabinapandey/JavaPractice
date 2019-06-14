/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nabina
 */
public class TwoDimensionA
{
   public static void main ( String [] args )
    {
        int a[][] = new int[4][5];
        int i,j,Total = 0;
        for (i=0;i<4;i++)
        {
         for (j=0;j<5;j++)
          { 
             a[i][j] = Total;
             Total++;
          }
        }
        for (i=0;i<4;i++) 
        {
         for (j=0;j<5;j++)
           System.out.print (a[i][j]+ " ");
         System.out.println();       
        }       
    }
    
}
