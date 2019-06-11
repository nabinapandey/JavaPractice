/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nabina
 */
public class LogicalOperator 
 {
    public static void main (String[] args)
    {
    int percentage=65;
    if(percentage>=45 && percentage <=59)
        System.out.println("Second Division");
    if(percentage>=60 && percentage<=100)
        System.out.println("First Divison");
    if(percentage<=44 && percentage>=32)
        System.out.println("Third Division");
    if(percentage<32 && percentage>=0)
        System.out.println("Failed");
    if(percentage>100 || percentage<0)
        System.out.println("Invalid value");
      }
   }
