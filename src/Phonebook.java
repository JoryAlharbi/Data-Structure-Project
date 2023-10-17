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

//adding an event that  ensures an event with the same title is not added
 public boolean AddEvent(Event e) {
     
           boolean added = false ; 
           
           //case 1 : empty list
           
           if (event_ContactsList.isEmpty()){
              event_ContactsList.Insert(e);
              added=true ; 
           } 
           
            event_ContactsList.FindFirst(); 
            
           Event p =event_ContactsList.Retrive() ; //a pointer to go through the list 
           while (!event_ContactsList.Last()){
               
               // must ensure that the event is unique before adding
               if (p.getTitle().equals(e.getTitle())){
                   added = false ;
                    break;
               }
               
                   
               //case 2 : adding a contact with the smaller letter
               if (p.getName().compareTo(e.getName())== -1){
                   event_ContactsList.Insert(e) ;
                   added= true ;
               }
               //case 3 : adding a contact with the same or greater  
                 if (p.getName().compareTo(e.getName())== 1 ||p.getName().compareTo(e.getName())==0 ){
                    event_ContactsList.FindNext(); 
                    event_ContactsList.Insert(e) ;
                    added= true ;
               }
               
               else
                   event_ContactsList.FindNext(); 
                 p=event_ContactsList.Retrive();
           }
                 
                        return added ;
 
           }
           
   // delete:
  public void delete( String ContactName){
      //for the massege 
      boolean msgC= false;

      contactList.FindFirst();
      while(contactList.Last()){
          if(contactList.Retrive().getName().equals(ContactName)){
              contactList.Remove();
              msgC= true;
          }
          else{
              contactList.FindNext();   
          }
      }
      
      if(msgC){
          //check if there an event with this contact to delete it:
      event_ContactsList.FindFirst();
      while(event_ContactsList.Last()){
          if(event_ContactsList.Retrive().getContactName().equals(ContactName)){
           event_ContactsList.Remove();     
          } 
          else
              event_ContactsList.FindNext();
      }
      } 
      
      if(msgC) 
          System.out.println("Contact with" + ContactName + "name is deleted successfuly , as well as all their related events if there is any");
      else
          System.out.println("there is no" + ContactName + "Contact to delete");    
      
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
  
  
 public boolean searchEvent(String s,int i){
     boolean found=false ;
     if (event_ContactsList.isEmpty())
         found=false ;
     else 
     {
         event_ContactsList.FindFirst(); 
         Event p=event_ContactsList.Retrive() ;
         switch (i){
             case 1: // search by name
                 if(p.getName().equals(s))
                    found= true ;
                 
                 break; 
                 
             case 2: //search by title 
                 if(p.getTitle().equals(s))
                     found=true ;
                 
                 break;
                     }
     }
       return found ;

 }

 public void printallContacts_ByFisrtName(String name){
   
     if(contactList.isEmpty())
         System.out.println("the phonebook is empty");
     
     else{
     contactList.FindFirst(); 
     
     while(!contactList.Last()){
         
     if( contactList.Retrive().getName().equals(name))
             contactList.Retrive().toString();
     
         System.out.println("-----------------------");
         contactList.FindNext(); 
     }//while
     
      contactList.Retrive().toString();

     }
     // printing all the event alphabaticaly , the event list is already sorted we just print it 
     
       public void PrintEvent(){
   
     if(event_ContactsList.isEmpty())
         System.out.println("the event list is empty");
     
     else{
     event_ContactsList.FindFirst(); 
     
     while(!event_ContactsList.Last()){
    
             event_ContactsList.Retrive().toString();
     
         System.out.println("-----------------------");
         event_ContactsList.FindNext(); 
     }//while
     
      event_ContactsList.Retrive().toString();

     }
     
 
 }
 
 }
 
 
