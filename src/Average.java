/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nabina
 */
public class Average
{
 public static void main ( String []args) 
 {
     double nums []= { 11.50,12.98,13,14,15};
     double  result = 0;
     int i;
     for (i=0;i<5;i++)
     {
         result = result + nums[i];
     }
         System.out.println ( "The average is " + result/5);
     }    
 }
    

