/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nabina
 */
import java.util.Scanner;
  class Abcd
{
  int empid;
  String name;
  float salary;
 void input()
  {
    Scanner in = new Scanner(System.in) ;
    System.out.print( " Enter the empid");
    empid= in.nextInt();
    System.out.print(" Enter the Name");
    name= in.next();
    System.out.print(" Enter the Salary");
    salary= in.nextFloat();   
  }
 void display()
  {
      System.out.println(" Employee id is " + empid);
      System.out.println(" Employee Name is " +  name);
      System.out.println( " Employee salary is "+ salary);     
  } 
}
public class Employee 
{
  public static void main(String[] args)  
  {
      Abcd e= new Abcd();
      e.input();
      e.display();     
  }
}
