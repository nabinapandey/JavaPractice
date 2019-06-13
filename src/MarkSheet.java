/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;
import java.util.Scanner ;

public class Marksheet
{
    
    public static void main(String []args)
     {
       Scanner in = new Scanner (System.in ) ;
       System.out.println ("Enter your student name " )  ;
       String name = in.nextLine () ;
       System.out.println ("Enter your roll number" )  ;
       String roll = in.nextLine () ;
       System.out.println (" enter your math number ");
       int a = in.nextInt() ;
       System.out.println (" enter your science number");
       int b = in.nextInt () ;
       System.out.println (" enter your english number ");
       int c = in.nextInt () ;
       System.out.println (" enter your Economics number ");
       int d = in.nextInt () ;
       System.out.println (" enter your sociology number ");
       int e = in.nextInt() ;
       System.out.println("----------------------------------------------------");
       System.out.println("----------------------------------------------------");
       float total=a+b+c+d+e;
       float avg=(a+b+c+d+e)/5;
       System.out.println("Name: " + name);
       System.out.println ("roll" + roll);
       System.out.println (" -------------------------------------------------") ;
        
       System.out.println (" subjects                 obtained mark");
       System.out.println (" -------------------------------------------------") ;
       System.out.println (" Maths                         " + a);
       System.out.println (" Science                        " + b);
       System.out.println (" English                        " + c);
       System.out.println (" Nepali                          " + d) ;
       System.out.println  (" Sociology                      " + e) ;
       System.out.println  ( " Total                             " + total);
       System.out.println  (" Average                          " + avg+ "%");           
     }
}
