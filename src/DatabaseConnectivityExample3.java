/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseconnectivity;

/**
 *
 * @author nabina
 */
import java.sql.*;
public class DatabaseConnectivityExample3 
{
    public static void main(String[]args)
    {   
        // xyzbank is a databaase name
        String url="jdbc:mysql://localhost:3306/xyzbank";
        String user="root";
        String pass="root";
        try
        {
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection(url,user,pass);  
        Statement stmt=con.createStatement();  
         ResultSet rs=stmt.executeQuery("select * from users");  
        while(rs.next())
        System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)); 
        con.close();
        }
        catch(Exception e)
        {
        System.out.println(e);
        }  
    }
}
    

