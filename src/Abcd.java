/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreateArrayListExample;
/**
 *
 * @author nabina
 * 
 */  //Creating an ArrayList and adding new elements to it.
import java.util.ArrayList;
import java.util.List;
public class Abcd 
{
    public static void main(String[]args)
    {
     List <String> birds=new ArrayList<>();  //creating an ArrayList of String.
     // Adding new elements to the ArrayList
     birds.add("Sparrow");
     birds.add("Pigeons");
     birds.add("Ducks");
     birds.add("Falcon");
     birds.add("Crane");
     System.out.println(birds);
     birds.add(3,"Eagle"); //Adding an element at a particular index in an ArrayList
     System.out.println(birds);
    }
}
