   
package hospital;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class Hospital {
    
    
       static Scanner inn = new Scanner(System.in);
      
       
//this method show the options 
 public static int showMenu() {
   
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Welcome to Hospital:");
    //System.out.println("Entar Adminstration name");
    System.out.println("--------------");
    System.out.println("1. Add Doctor");
    System.out.println("2. Add Service");
    System.out.println("3. Add Patient");
    System.out.println("4. Print all doctors information");
    System.out.println("5. Print all patients information");
    System.out.println("6. Display specific doctor data");
    System.out.println("7. Display specific patient data ");
    System.out.println("8. Print a specific patient’s bill ");
    System.out.println("9. Quit ");
    System.out.println("--------------");
    System.out.println("Enter your choice:");
    int optionn = keyboard.nextInt();

    return optionn;

}
 
    public static void main(String[] args) {
 

    Administration_Staff admin1= new Administration_Staff(1,"Ola","Jeddah","05667777","ola@hotmail.com",5000,"Reciptionist");
    Administration_Staff admin2= new Administration_Staff(2,"Ahmad","Dammam","05433332","a@gmail.com",5500,"Manager");
    Administration_Staff admin3= new Administration_Staff(3,"Salwa","Riyadh","0522111","s@gmail.com",7000,"Administrator");  
    ArrayList<Administration_Staff> Admin_staff_list=new ArrayList<Administration_Staff>();
    Admin_staff_list.add(admin1);
    Admin_staff_list.add(admin2);
    Admin_staff_list.add(admin3);
    
   
    Services services1 = new Services(1,"services1",200);
    Services services2 = new Services(2,"services2",300);
    ArrayList<Services> Services_list=new ArrayList<Services>();
    Services_list.add(services1);
    Services_list.add(services2);
    
    Patient patient1= new Patient(1,"mohamed","Jeddah","05667777","mohamed@hotmail.com",'A',Services_list,1);
    Patient patient2= new Patient(2,"medhat","Jeddah","05667777","medhat@hotmail.com",'B',Services_list,2);
        Patient patient4
               = new Patient(4,"hema","cairo","010655649","hema@hotmail.com",'B',Services_list,1);

    Patient patient3= new Patient(3,"ahmed","Jeddah","05667777","ahmed@hotmail.com",'A',Services_list,2);  
    ArrayList<Patient> patient_list=new ArrayList<Patient>();
    patient_list.add(patient1);
    patient_list.add(patient2);
    patient_list.add(patient3);
    patient_list.add(patient4);
    ArrayList<Integer> idList=new ArrayList<>();
    idList.add(patient1.getID());
    idList.add(patient2.getID());
    

    
    Doctor doc1= new Doctor(1,"Mishary","Dammam","05876676","ola@gmail.com",20000,"Specialist","Othepidic",idList);
     idList.add(patient3.getID());
    idList.add(patient4.getID());
    Doctor doc2= new Doctor(2,"Danah","Jeddah","0543289777","dla@hotmail.com",25000,"Constltant","Pediatric",idList);
    ArrayList<Doctor> Doctor_list=new ArrayList<Doctor>();
    Doctor_list.add(doc1);
    Doctor_list.add(doc2);
    System.out.println("Enter Admin name ");
        
    
    String admin_name = inn.next();
    boolean start=false;
    
         for (Administration_Staff adminl : Admin_staff_list)                   
         {
             if (adminl.getName().equals(admin_name))
         {
             start=true;
            
         }
             
         }
         if(start)
         {
           menu(Doctor_list,Services_list,patient_list);
}
   
    }

    private static  void menu(ArrayList<Doctor> Doctor_list, ArrayList<Services> services_list, ArrayList<Patient> patient_list) {

      ArrayList<Integer> dId=new ArrayList<>();
      for (Doctor doc : Doctor_list)
          dId.add(doc.getID());
       ArrayList<Integer> sId=new ArrayList<>();
      for (Services ser : services_list)
          sId.add(ser.getID());
       ArrayList<Integer> pId=new ArrayList<>();
      for (Patient pir : patient_list)
          pId.add(pir.getID());
        int optionn = 0;
while (optionn!=9)
{
    optionn=showMenu();
    
   switch (optionn) {
       
       case 1:
            System.out.println("Enter ID:(number)");
            int idd = inn.nextInt();
            boolean dstate=check_id(dId,idd);
            if(!dstate)
            {
                System.out.println("Invalid doctor ID. This doctor ID is already used");
            
                            break;
}
             System.out.println("Enter Name:");
             String nn= inn.next();
              System.out.println("AEnter Address:");
              String aa= inn.next();
               System.out.println("Enter Mobile_Phone_Number");
               String mm= inn.next();
               System.out.println("Enter Email:");
               String ee= inn.next();
              System.out.println("AEnter Salary");
               Double ss = inn.nextDouble();
               System.out.println("Enter Rank ");
               String r= inn.next();
               System.out.println("Enter Specialty ");
               String sss= inn.next();
             Doctor doc= new Doctor(idd,nn,aa,mm,ee,ss,r,sss);
             Doctor_list.add(doc);
           System.out.println("Doctor info added succsuffuly");
            break;
       case 2:
            System.out.println("Enter ID:(number)");
            int id= inn.nextInt();
            boolean sstate=check_id(sId,id);

            if(!sstate)
            {
                System.out.println("Invalid service ID. This service ID is already used");
                           break;
 }
             System.out.println("Enter Name:");
             String name= inn.next();
              System.out.println("Enter Price");
              Double price= inn.nextDouble();
              Services ser= new Services(id,name,price);
             services_list.add(ser);
           System.out.println("Services info added succsuffuly");
            break;
      case 3:
            System.out.println("Enter ID:(number)");
            int id_patient = inn.nextInt();
             boolean pstate=check_id(pId,id_patient);

            if(!pstate)
            {
                System.out.println("Invalid service ID. This service ID is already used");
                break;
            }
             System.out.println("Enter Name:");
             String name_patient= inn.next();
              System.out.println("AEnter Address:");
              String address_patient= inn.next();
               System.out.println("Enter Mobile_Phone_Number");
               String phone_patient= inn.next();
               System.out.println("Enter Email:");
               String email_patient= inn.next();
               System.out.println("Enter type:(A or B)");
               String patient_type=inn.next();
               patient_type=patient_type.toUpperCase();
               System.out.println(patient_type);
               if(!patient_type.equals("A"))
               {
                System.out.println("invalid type");
                break;
               }else if(!patient_type.equals("A"))
                   {
                System.out.println("invalid type");
                break;
               }
                System.out.println("Enter number of services u wnat:");
               int ns=inn.nextInt();
                ArrayList<Services> arrayList=new ArrayList<Services>();
                int idsx=0;
               HashMap<Integer, Services> serveces = new HashMap<Integer, Services>();

               while(idsx<ns)
               {
               for(int index=0;index<services_list.size();index++)
               {
                   System.out.println((index+1)+": "+services_list.get(index).getName());
                   serveces.put(index+1,services_list.get(index));
               }
               System.out.println("Enter the servece number:");
               int sn=inn.nextInt();
               arrayList.add(serveces.get(sn));
              idsx++; 
               }
               char t=patient_type.charAt(0);
               int minim=100000;
               int tempid =0;
               int idx=0;
               for(int d=0; d<Doctor_list.size();d++)
               {
               if(minim<Doctor_list.get(d).getlist().size())
               {
               minim=Doctor_list.get(d).getlist().size();
               tempid=Doctor_list.get(d).getID();
               idx=d;
               }
               }
                ArrayList<Integer> patientList=new ArrayList<>(Doctor_list.get(idx).getlist());
                patientList.add(id_patient);
               
               Doctor_list.get(idx).setlist(patientList);
               
             Patient pat= new Patient(id_patient,name_patient,address_patient,phone_patient,email_patient,t,arrayList,tempid);
             patient_list.add(pat);
             System.out.println("patient info added succsuffuly");
            break;
      case 4:
     System.out.println(" Doctors  Members:");
    for(int i = 0; i < Doctor_list.size(); i++)
    {   
    System.out.println(Doctor_list.get(i).Print_Employee_Info());
            }
      break;
      case 5:
          System.out.println(" Patients  Members:");
            for(int i = 0; i < patient_list.size(); i++) {   
    System.out.print(patient_list.get(i).print_Patient());
     System.out.println("");
            }
      break;
     
      case 6:
          System.out.println("Enter Doctor ID(number)");
          int user_doctor_id= inn.nextInt();
          
          for(int i = 0; i < Doctor_list.size(); i++)
          {
              if(user_doctor_id==Doctor_list.get(i).getID())
              {
                  System.out.println("Doctor Info"+Doctor_list.get(i).Print_Employee_Info());
              }
          }
          break;
          case 7:
          System.out.println("Enter Patient ID(number)");
          int user_patient_id= inn.nextInt();
          
          for(int i = 0; i < patient_list.size(); i++)
          {
              if(user_patient_id==patient_list.get(i).getID())
              {
                  System.out.println("Patient Info"+patient_list.get(i).print_Patient());
              }
          }
          break;
          case 8:
              
           System.out.println("Enter Patient ID(number)");
          int user_patient_bill_id= inn.nextInt();
          
         char type;
         ArrayList serv;
         double prices;
         double total_prices=0;
         double discount=0;
         double total_bill=0;
         
         
         
           for(int i = 0; i < patient_list.size(); i++)
           {
               if(user_patient_bill_id==patient_list.get(i).getID())
               {
                   type=patient_list.get(i).getType();
                   serv=new ArrayList<>(patient_list.get(i).getServices_list());
                   
                   
                  for(int g = 0; g < services_list.size(); g++)
                  {
                      prices=services_list.get(g).getPrice();
                      total_prices += services_list.get(g).getPrice();
                      
                      if(type=='A')
                      {
                          discount += total_prices * 25/100;
                          
                      }
                      
                  }
                   total_bill=total_prices-discount;
                   System.out.println("Total Bill : "+total_bill);
                  
                   
                   
               }
           }
           break;
           
           case 9:
            System.out.println("Exit the programmar");
             exit(0);
               break;
               
        default:
            System.out.println("Sorry, please enter valid Option");
            break;
           
              
          
          
                 
   }   
   }
   }
    //this method check if the IDs in the ID list
    static boolean check_id(ArrayList<Integer> idList,int id)
    {
        boolean state=true;
        for(int i=0;i<idList.size();i++)
        {
        if(id==idList.get(i))
            state=false;
        }
return state;  
    }
    }
   
