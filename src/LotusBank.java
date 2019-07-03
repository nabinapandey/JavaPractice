/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Author: Nabina Pandey 
package databaseconnectivity;

import java.sql.*;
import java.util.Scanner;
class AccountManagement
{
//AccountNo int(15) not null primary key, Balance double(16,08), Branch varchar(50)
    int accountNo;
    double balance;
    String Branch;
    void withDraw(int x)
    {
     balance=balance-x; 
    }
    void deposit(int x)
    {
        balance=balance+x;
    }   
}
public class LotusBank 
{
  public static void main(String[]args)  
  {
      String url="jdbc:mysql://localhost:3306/lotusbank"; //lotusbank is the name of database
      String user="root";
      String pass="root";
      Scanner scn=new Scanner(System.in);
      int choice,amount;
      do
      {
        System.out.println("WELCOME TO LOTUSBANK");  
        System.out.println("********************************");  
        System.out.println("1. Cash Withdraw");  
        System.out.println("2. Cash Deposit");  
        System.out.println("3. Balance Transfer");  
        System.out.println("4. Exit");  
        choice=scn.nextInt();
        AccountManagement customer = new AccountManagement();
         AccountManagement customer1 = new AccountManagement(); 
                
        switch(choice)
                {
            case 1: 
                System.out.println("Welcome to cash withdraw process"); 
                System.out.println("Enter your AccountNo:");
                customer.accountNo=scn.nextInt();
                try{ 
                Class.forName("com.mysql.jdbc.Driver");  
                Connection con=DriverManager.getConnection(url,user,pass); 
                Statement stmt=con.createStatement();  
                ResultSet rs=stmt.executeQuery("select * from account where AccountNo="+customer.accountNo);
                System.out.println("Your current Details is as below:");
                while(rs.next())
                {
                System.out.println(rs.getInt(1)+" "+rs.getDouble(2)+" "+rs.getString(3));
                //customer.accountNo=rs.getInt(1);
               customer.balance=rs.getDouble(2);
               customer.Branch=rs.getString(3);
                }
                System.out.println("How much would you like to withdraw:");
                amount=scn.nextInt();
                customer.withDraw(amount);
                //customer.balance=customer.balance-amount;
                String update = "update account set balance="+customer.balance+ "where AccountNo="+customer.accountNo;
                stmt.executeUpdate(update); 
                System.out.println("Your Updated record is:");
                ResultSet rs2=stmt.executeQuery("select * from account where AccountNo="+customer.accountNo);
                while(rs2.next())
                System.out.println(rs2.getInt(1)+" "+rs2.getDouble(2)+" "+rs2.getString(3));
                con.close();
                }catch(Exception e)
                {
                    System.out.println(e);
                } 
                break;
            case 2: 
                System.out.println("Welcome to cash deposit process");
                System.out.println("Enter your accountNo:");
                customer.accountNo=scn.nextInt();
                try
               {
                Class.forName("com.mysql.jdbc.Driver");  
                Connection con=DriverManager.getConnection(url,user,pass); 
                Statement stmt=con.createStatement();  
                ResultSet rs =stmt.executeQuery(" select * from account where AccountNo="+ customer.accountNo);
                System.out.println("Your current details is as below:");
                  while(rs.next())
                  {
                    System.out.println(rs.getInt(1)+" " +rs.getDouble(2)+" "+rs.getString(3));
                    customer.balance=rs.getDouble(2);
                    customer.Branch=rs.getString(3);
                  }
                    System.out.println("How much would you like to deposit cash:");
                    amount=scn.nextInt();
                    customer.deposit(amount);
                    String update = "update account set balance="+customer.balance+"where AccountNo="+customer.accountNo;
                    stmt.executeUpdate(update);
                    System.out.println("Your updated record is:");
                    ResultSet rs2= stmt.executeQuery(" select * from account where AccountNo="+customer.accountNo);
                     while(rs2.next()) 
                       System.out.println(rs2.getInt(1)+" "+rs2.getDouble(2)+" "+rs2.getString(3));
                    con.close();   
                  }
                  catch(Exception e)
                          {
                          System.out.println(e);
                          }
                   break;
            case 3: 
                System.out.println("Welcome to cash transfer process"); 
                System.out.println("Enter your accountNo:");
                customer.accountNo=scn.nextInt();
                System.out.println("How much would you like to transfer:");
                amount=scn.nextInt();
                System.out.println("What is the account number you would like to transfer to:");
                customer1.accountNo=scn.nextInt();
                 try
                 {
                Class.forName("com.mysql.jdbc.Driver"); 
                Connection con=DriverManager.getConnection(url,user,pass); 
                Statement stmt=con.createStatement();  
                ResultSet rs =stmt.executeQuery(" select * from account where AccountNo="+ customer.accountNo ); 
                System.out.println("Your current Details before the transfer:");
                while(rs.next())
                {
                System.out.println(rs.getInt(1)+" "+rs.getDouble(2)+" "+rs.getString(3));
                customer.balance=rs.getDouble(2);
                }
                customer.withDraw(amount);
                String update = "update account set balance="+customer.balance+"where AccountNo="+customer.accountNo;
                stmt.executeUpdate(update);
                
                 ResultSet rs2 =stmt.executeQuery(" select * from account where AccountNo="+ customer1.accountNo ); 
                 while(rs2.next())
                     {
                     customer1.balance=rs2.getDouble(2);
                     }
                 customer1.deposit(amount);
                //System.out.print("Customer1 balance="+customer1.balance);
                 String update2 = "update account set balance="+customer1.balance+"where AccountNo="+customer1.accountNo;
                 stmt.executeUpdate(update2);
                 con.close();  
                }
                  catch(Exception e)
                          {
                          System.out.println(e);
                          }
                   break;
            default: 
                   System.out.print("Invalid entry");
                   break;
        }
      }
       while (choice!=4);    
    }
}
