
public class EncapTest
{
         private int ssn;
         private String empName;
         private int empAge;
    //Getter and Setter methods
    public int getEmpSSN()
       {
        return ssn;
        }
    public String getEmpName()
       {
        return empName;
        }

    public int getEmpAge()
       {
        return empAge;
        }

    public void setEmpAge(int newAge)
      {
        empAge = newAge;
      }

    public void setEmpName(String newName)
      {
        empName = newName;
      }

    public void setEmpSSN(int newSsn)
      {
        ssn = newSsn;
      }
    public static void main(String args[])
      {
         EncapTest obj = new EncapTest();
         obj.setEmpName("Steves");
         obj.setEmpAge(30);
         obj.setEmpSSN(112233);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee SSN: " + obj.getEmpSSN());
         System.out.println("Employee Age: " + obj.getEmpAge());
      } 
} 
