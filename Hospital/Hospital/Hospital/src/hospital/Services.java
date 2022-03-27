/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author hema
 */
class Services {
    
    public int ID;
    public String Name;
    public double  price ;

    public Services(int ID, String Name, double price) {
        this.ID = ID;
        this.Name = Name;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
     public String Print_Services()
    {
      
return ID+"   "+Name+"   "+price;
    }
    
    
    
    
    
}
