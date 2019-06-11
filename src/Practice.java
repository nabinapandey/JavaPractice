/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nabina
 */
class Abc
{
    int x,y;
    float sumTwo()
        {
        return x+y;
         }
    float diffTwo()
         {
        return x-y;
         }
  }
public class Practice
{
   public static void main(String[]args) 
   {
       Abc obj1= new Abc();
       Abc obj2= new Abc();
       float sum; 
       float diff;
       obj1.x=10;
       obj1.y=5;
       obj2.x=7;
       obj2.y=4;
       sum= obj1.sumTwo();
       System.out.println("sum is " + sum);
       diff= obj1.diffTwo();
       System.out.println("difference is " + diff);
       sum= obj2.sumTwo();
       System.out.println("sum is " + sum);
       diff= obj2.diffTwo();
       System.out.println("Difference is " + diff);      
    }
 }
