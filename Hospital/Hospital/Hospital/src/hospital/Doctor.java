/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;

/**
 *
 * @author ahmariss
 */
public class Doctor extends Employee {
  
      public String rank;
      public String specialty;
      ArrayList<Integer> patientList=new ArrayList<>();
      public  Doctor()
    {
       super.ID=0;
       super.Name=""; 
       super.Address="";
       super.Mobile_Phone_Number="";
       super.Email="";
       super.Salary=0.0;
       rank="";
       specialty="";
       
      
    }
       public Doctor(int id,String n,String a,String m,String e,double s,String r,String ss,ArrayList<Integer> patientList)
    {
       super.ID=id;
      super.Name=n; 
      super.Address=a;
      super.Mobile_Phone_Number=m;
      super.Email=e;
     super.Salary=s;
    rank=r;
     specialty=ss;
     this.patientList=this.patientList;
      
    }
       
    public Doctor(int id,String n,String a,String m,String e,double s,String r,String ss)
    {
       super.ID=id;
      super.Name=n; 
      super.Address=a;
      super.Mobile_Phone_Number=m;
      super.Email=e;
     super.Salary=s;
    rank=r;
     specialty=ss;
      
    }
      public void setlist(ArrayList<Integer> l) {
       patientList=l;
     }
      public ArrayList getlist() {
        return patientList;
     }
     public void setrank(String r) {
       rank=r;
     }
      public String getrank() {
        return rank;
     }
     public void setspecialty(String s) {
       specialty=s;
     }
      public String getspecialty() {
        return specialty;
     }
     
    @Override
    public String getName() {
       return "Doctor Name"+ Name;
    
}
     @Override
    public String Print_Employee_Info()
    {
      
return ID+"   "+Name+"   "+Address+"   "+Mobile_Phone_Number+"   "+Email+"   "+Salary+"   "+rank+"  "+specialty+" "+patientList;
    }
  
}
