/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nabina
 */
 class Student
 {
     int rollno;
     String name;
     static String college= "Oxford";
     Student(int r, String n)
     {
         rollno=r;
         name=n;    
     }                         
       void display()
       {
           System.out.println(rollno+" "  + name+ " " + college);
        }
 }
public class TestStaticVariable
{
  public static void main(String[]args) 
  {
      Student s2=new Student( 23,"Nishu");
      Student s3=new Student( 25,"Shiva");
      s2.display();
      s3.display();
  }
}
