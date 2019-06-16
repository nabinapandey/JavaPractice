/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayListExample;

/**
 *
 * @author nabina
 */
import java.util.*;
public class ArrayListOfInteger 
{
  public static void main(String[]args) 
  {
     List <Integer> nabina=new ArrayList<>();
     nabina.add(6);
     nabina.add(11);
     nabina.add(5);
     nabina.add(4);
     nabina.add(2);
     nabina.add(9);
     System.out.println("Before Sorting");
     for(Integer intr:nabina)
      {
         System.out.println(intr);
      }
     Collections.sort(nabina); // Sorting of arraylist using Collections.sort
      System.out.println("After Sorting");
      for(Integer intr:nabina)
      {
          System.out.println(intr);
      }
  }
}
