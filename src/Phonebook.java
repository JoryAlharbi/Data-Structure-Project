package com.mycompany.ds;

import java.util.Objects;

public class PhoneBook  {
    
     LinkedList<Contacts> contactList= new LinkedList<>();
     LinkedList<Event> event_ContactsList = new LinkedList<Event> () ;
       public boolean AddContact(Contacts c) {
           boolean added = false ; 
           
           //case 1 : empty list
           
           if (contactList.isEmpty()){
              contactList.Insert(c);
              added=true ; 
           } 
           
            contactList.FindFirst(); 
           Contacts p =contactList.Retrive() ; //a pointer to go through the list 
           
           while (!contactList.Last()){
               // must insure that the contact is unique before adding
               if (p.getName().equals(c.getName()) || p.getPhoneNum().equals(c.getPhoneNum())){
                   added = false ;
                   break ;
               }
                   
               //case 2 : adding a contact with the smaller letter
               if (p.getName().compareTo(c.getName())== -1){
                   contactList.Insert(c) ;
                   added= true ;
               }
               //case 3 : adding a contact with the same or greater  
                 if (p.getName().compareTo(c.getName())== 1 ||p.getName().compareTo(c.getName())==0 ){
                    contactList.FindNext(); 
                    contactList.Insert(c) ;
                    added= true ;
               }
               
               else
                   contactList.FindNext(); 
                 p=contactList.Retrive();
               
           }
           
          return added ;
       
       }
       //////// adding an event 
       /*
 public boolean AddEvent(Event e) {
           boolean added = false ; 
           
           //case 1 : empty list
           
           if (event_ContactsList.isEmpty()){
              event_ContactsList.Insert(e);
              added=true ; 
           } 
           
            event_ContactsList.FindFirst(); 
           Event p =event_ContactsList.Retrive() ; //a pointer to go through the list 
           /*
           while (!L1.Last()){
               // must insure that the contact is unique before adding
               if (p.getName().equals(e.getName()) || p.getPhoneNum().equals(c.getPhoneNum())){
                   added = false ;
                   break ;
               }
                   
               //case 2 : adding a contact with the smaller letter
               if (p.getName().compareTo(c.getName())== -1){
                   L1.Insert(c) ;
                   added= true ;
               }
               //case 3 : adding a contact with the same or greater  
                 if (p.getName().compareTo(c.getName())== 1 ||p.getName().compareTo(c.getName())==0 ){
                    L1.FindNext(); 
                    L1.Insert(c) ;
                    added= true ;
               }
               
               else
                   L1.FindNext(); 
                 p=L1.Retrive();
               
           }
           
          return added ;
       */
       


        
        
    // delete:
  public void delete(Contacts c){
      //public void delete(String name)
      
  }
  
   //search: 
  public LinkedList<Contacts> search(String n, int type){
    LinkedList<Contacts> Lsearch= new LinkedList<>(); 
    //if empty 
    if(contactList.isEmpty())
        return Lsearch;
    
    //while (for retrive all contacts if there)
    while(contactList.Last()){
        contactList.FindFirst();
        
        switch(type){ //name, phoneNum, emailAddress, birthday, address, notes
            
            case 1: //Search by name
             if(contactList.Retrive().getName().equals(n))
               Lsearch.Insert(contactList.Retrive());
             Lsearch.Insert(contactList.Retrive()); //??
             break;
             
            case 2: //Search by Phone 
              if(contactList.Retrive().getPhoneNum().equals(n))  
           Lsearch.Insert(contactList.Retrive());
             Lsearch.Insert(contactList.Retrive());
             break;
             
            case 3: //Search by eamil
              if(contactList.Retrive().getEmail().equals(n))  
           Lsearch.Insert(contactList.Retrive());
             Lsearch.Insert(contactList.Retrive());
             break;  
            
             case 4: //Search by birthday
              if(contactList.Retrive().getBirthday().equals(n))  
           Lsearch.Insert(contactList.Retrive());
             Lsearch.Insert(contactList.Retrive());
             break;
             
             case 5: //Search by address
              if(contactList.Retrive().getAddress().equals(n))  
           Lsearch.Insert(contactList.Retrive());
             Lsearch.Insert(contactList.Retrive());
             break;     
             
        }
    }
   return Lsearch;
  }
  
  
 public boolean searchEvent(String s){
     boolean found=false ;
     if (event_ContactsList.isEmpty())
         found=false ;
     else 
     {
         
         
         
     }
     
     
     
     return found ;
 }
  
  /* 
 public void printallContacts(LinkedList <Contacts> L2){
   
     if(L2.isEmpty())
         System.out.println("the phonebook is empty");
     else{
     L2.FindFirst(); 
     
     while(!L2.Last()){
         
       L2.Retrive().
         System.out.println("-----------------------");
         L1.FindNext(); 
     }//while
     
     L1.Retrive().display();
     
 }//else
     
 }
*/
    
 public void printallContacts_ByFisrtName(){
   
     if(contactList.isEmpty())
         System.out.println("the phonebook is empty");
     
     else{
     contactList.FindFirst(); 
     
     while(!contactList.Last()){
         
      contactList.Retrive().getName();
         System.out.println("-----------------------");
         contactList.FindNext(); 
     }//while
     
      contactList.Retrive().getName();     
     }
     
 
 }
 // boolean method for adding an event but check for conflict
 

}
