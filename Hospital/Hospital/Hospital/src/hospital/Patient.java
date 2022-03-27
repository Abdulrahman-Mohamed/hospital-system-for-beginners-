/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;


public class Patient {
    
     public int ID;
     public String Name;
     public String Address;
     public String Mobile_Phone_Number;
     public String Email ;
     char type ;
     ArrayList<Services> services_list;
     int docId;

    public Patient(int ID, String Name, String Address, String Mobile_Phone_Number, String Email, char type, ArrayList<Services> services_list, int docId) {
        this.ID = ID;
        this.Name = Name;
        this.Address = Address;
        this.Mobile_Phone_Number = Mobile_Phone_Number;
        this.Email = Email;
        this.type = type;
        this.services_list = services_list;
        this.docId = docId;
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }
     

   
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getMobile_Phone_Number() {
        return Mobile_Phone_Number;
    }

    public void setMobile_Phone_Number(String Mobile_Phone_Number) {
        this.Mobile_Phone_Number = Mobile_Phone_Number;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public ArrayList<Services> getServices_list() {
        return services_list;
    }

    public void setServices_list(ArrayList<Services> services_list) {
        this.services_list = services_list;
    }
    
    public String print_Patient()
    {
      
return ID+"   "+Name+"   "+Address+"   "+Mobile_Phone_Number+"   "+Email+"   "+type+"   "+services_list;
    }
    
     
     
    
}
