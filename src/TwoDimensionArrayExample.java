/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nabina
 */
public class TwoDimensionArrayExample 
{
    public static void main ( String []args)
          {
           int a[][] = new int[4][5] ;
           int b[][] = new int [4][5];
           int c[][] = new int [4][5];
           int i,j,k = 0;
           int m=19;
           for ( i=0;i<4;i++)
                {
                  for (j=0;j<5;j++)
                     {
                         a[i][j]=k;
                         k++;
                      }
                 }  
                for (i=0;i<4;i++)
                      {
                        for(j=0;j<5;j++)
                              {
                               System.out.print(a[i][j]+ " ");
                               }
                           System.out.println ( );
                           
                      }
            for ( i=0;i<4;i++)
                {
                  for (j=0;j<5;j++)
                     {
                         b[i][j]=m;
                         m--;
                      }
                 }    
           
            for ( i=0;i<4;i++)
                {
                  for (j=0;j<5;j++)
                     {
                        c[i][j]=a[i][j]+b[i][j];
                     }
                 }  
          System.out.println("After adding two matrices the final matrix is given below:");
          for (i=0;i<4;i++)
                      {
                        for(j=0;j<5;j++)
                              {
                               System.out.print(c[i][j]+ " ");
                               }
                           System.out.println ( );
                           
                      }
          }
    
}
