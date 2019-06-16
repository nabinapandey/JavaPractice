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
public class ArrayListExample 
{
   public static void main(String[]args) 
   {
      List <String> obj=new ArrayList<>();
       obj.add("Ram");
       obj.add("Shyam");
       obj.add("Hari");
       obj.add("Gopal");
       obj.add("Krishna");
       System.out.println("Original ArrayList");
       for (String str : obj) 
          {
           System.out.println(str);
          }
       obj.add(5,"Madan");
       obj.add(0,"Ganesh");
       System.out.println("ArrayList after add Operation");
       for(String str:obj)
          {
           System.out.println(str);
          }
       obj.remove("Gopal");
       obj.remove("Madan");
       System.out.println("ArrayList after remove operation");
       for(String str:obj)
          { 
          System.out.println(str);
          }
   }
}
