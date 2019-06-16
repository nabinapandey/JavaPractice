/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nabina
 */
class Animal
{
    void eat()
    {
        System.out.println( " eating");
    }
}
class Dog extends Animal
{
  void bark()
   {
       System.out.println(" barking");   
   }  
}
class BabyDog extends Dog
  {
      void weep()
      {
          System.out.println(" Weeiping");
      }
  }
public class InheritanceN
{
  public static void main(String[]args)
  {
      BabyDog obj= new BabyDog();
      obj.weep();
      obj.bark();
      obj.eat();    
   }                  
}
