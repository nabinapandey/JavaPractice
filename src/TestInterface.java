  interface Bank
   {  
   float rateofinterest(); 
    }  
  class SBI implements Bank
  {  
  public float rateofinterest()
    {
    return 9.15f;
    }  
   }  
  class PNB implements Bank
  {  
  public float rateofinterest()
     {
    return 9.7f;
     }  
  }  
  class TestInterface
  {  
   public static void main(String[] args)
      {  
    Bank obj=new SBI(); 
    Bank obj2=new PNB();
    System.out.println("ROI: "+ obj.rateofinterest()); 
    System.out.println("ROI: "+ obj2.rateofinterest());  
       }
   }  
