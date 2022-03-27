/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author ahmariss
 */
public class Administration_Staff extends Employee {
public String position;
 public  Administration_Staff()
    {
       super.ID=0;
       super.Name=""; 
      super.Address="";
      super.Mobile_Phone_Number="";
      super.Email="";
     super.Salary=0.0;
     position="";
      
    }
    public  Administration_Staff(int id,String n,String a,String m,String e,double s,String p)
    {
       super.ID=id;
      super.Name=n; 
      super.Address=a;
      super.Mobile_Phone_Number=m;
      super.Email=e;
     super.Salary=s;
     position=p;
      
    }
public void setposition(String p) {
      position=p;
     }
      public String getposition() {
        return position;
     }
     
    @Override
    public String getName() {
       return  Name;
    
}
    @Override
    public String Print_Employee_Info()
    {
      
return ID+"   "+Name+"   "+Address+"   "+Mobile_Phone_Number+"   "+Email+"   "+Salary+"   "+position;
    }

}