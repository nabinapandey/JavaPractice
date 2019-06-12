/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nabina
 */
   import java.util.*;
   public class operators 
  {
  public static void main (String [] args) 
     {
      String name= "Salina";
      String pass= "ABC4salina";
      
      Scanner s= new Scanner (System.in);
      System.out.println("Enter Username");
      String a= s.next();
      System.out.println("Enter Password");
      String b= s.next();
      if(name.equals(a) && pass.equals(b))
          {
          System.out.println ("Welcome User");
           }
      else 
          {
          System.out.println("wrong user id or password");
           }
        }
     }
   
