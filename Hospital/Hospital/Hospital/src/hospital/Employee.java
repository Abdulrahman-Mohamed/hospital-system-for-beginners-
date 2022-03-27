/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

  public  class Employee 
{
    public int ID;
    public String Name;
     public String Address;
      public String Mobile_Phone_Number;
      public String Email ;
     public double Salary;
    
   
   public Employee()
    {
        ID=0;
      Name=""; 
      Address="";
      Mobile_Phone_Number="";
      Email="";
     Salary=0.0;
     
    }
    
   public  Employee(int id,String n,String a,String m,String e,double s)
    {
       ID=id;
      Name=n; 
      Address=a;
      Mobile_Phone_Number=m;
      Email=e;
     Salary=s;
     
      
    }
  
  public void  setID(int id)
   {
       ID=id;
   }
  public int  getID()
   {
       
      return  ID;
   }
  public void  setName(String n)
   {
       if (n!="")
       Name=n;
   }
  public String  getName()
   {
       
      return  Name;
   }
  public void  setAddress(String a)
   {
       Address=a;
   }
  public String getAddress()
   {
      return Address;
   }
   public void  setMobile_Phone_Number(String m)
   {
      Mobile_Phone_Number=m;
   }
  public String getMobile_Phone_Number()
   {
      return Mobile_Phone_Number;
   }
   public void  setEmail(String e)
   {
       Email=e;
   }
  public String getEmail()
   {
      return Email;
   }
  public void  setSalary(double s)
   {
       if (s>=0)
       Salary=s;
   }
  public double getSalary()
   {
       return Salary;
   }
  
  public String Print_Employee_Info()
    {
      
return ID+"   "+Name+"   "+Address+"   "+Mobile_Phone_Number+"   "+Email+"   "+Salary;
    }
 

   
 
}
