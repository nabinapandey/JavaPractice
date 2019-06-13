/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 *
 * @author nabina
 */
import java.util.Scanner ;
public class Division
{
    public static void main ( String [] args)
    {
        Scanner np = new Scanner (System.in);
        System.out.println (" enter your math number ");
        int a = np.nextInt() ;
        System.out.println (" enter your science number");
        int b = np.nextInt () ;
        System.out.println (" enter your english number ");
        int c = np.nextInt () ;
        System.out.println (" enter your economics number ");
        int d = np.nextInt () ;
        System.out.println (" enter your sociology number ");
        int e = np.nextInt () ;
        int xyz = (a+b+c+d+e)/5 ;
        System.out.println ( "the average of five subjectsis = " + xyz);
        
        if(a<32 || b<32 || c<32 || d<32 || e<32)
        {
            System.out.println("Sorry you are failed");
        }
        else
        {
            System.out.println("Congratulations you have passed");
            if(xyz>=60)
                System.out.println("You have scored first division");
            else 
            {
                if(xyz>=45)
                System.out.println("You have scored second division");
                else 
                System.out.println("You have scored third division");
             }
         }
     }
    
 }
