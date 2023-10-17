
package ds.project;


public class Phonebook  {
    
   public LinkedList<Contacts> contactList= new LinkedList<Contacts>();
    public  LinkedList<Event> event_ContactsList = new LinkedList<Event> () ;
     
       public void AddContact(Contacts c) {
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
                   contactList.InsertFirst(c) ;
                   added= true ;
               }
               //case 3 : adding a contact with the same or greater  
                 if (p.getName().compareTo(c.getName())== 1 ||p.getName().compareTo(c.getName())==0 ){
                    contactList.Insert(c) ;
                    added= true ;
               }
               
               else
                   contactList.FindNext(); 
                 p=contactList.Retrive();
               
           }
           
          if (added)
               System.out.println("Contact not added");
       
       }
       
      
 public void AddEvent(Event e) {
     
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
                if ( p.compareToConflict(e )== -1 && p.getTitle().compareTo(e.getTitle())== -1){
                   event_ContactsList.InsertFirst(e) ;
                   added= true ;
               }
               //case 3 : adding a contact with the same or greater  
                if (p.getTitle().compareTo(e.getTitle())== 1 && p.compareToConflict(e )== 1 ){
                    event_ContactsList.Insert(e) ;
                    added= true ;
               }
                // there is time conflict
                if ( p.compareToConflict(e )==0 && p.getTitle().compareTo(e.getTitle())== 0){
                   
                    added= false ;
                    break;
               }
               else
                   event_ContactsList.FindNext(); 
                 p=event_ContactsList.Retrive();
           }
                 
                        if(added==false)
                            System.out.println("Event not added");
                        
 
           }
           
      


        
        
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
          if(event_ContactsList.Retrive().getName().equals(ContactName)){
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
  public boolean search(String n, int type){
    LinkedList<Contacts> Lsearch= new LinkedList<>(); 
    boolean found = false ;
    //if empty 
    if(contactList.isEmpty())
        found = false ;
    
            contactList.FindFirst();

    //while (for retrive all contacts if there)
    while(!contactList.Last()){  
        
        switch(type){ //name, phoneNum, emailAddress, birthday, address, notes
            
            case 1: //Search by name
             if(contactList.Retrive().getName().equals(n))
               Lsearch.Insert(contactList.Retrive());
             Lsearch.Insert(contactList.Retrive()); 
             found = true ;
             break;
             
            case 2: //Search by Phone 
              if(contactList.Retrive().getPhoneNum().equals(n))  
           Lsearch.Insert(contactList.Retrive());
             Lsearch.Insert(contactList.Retrive());
             found = true ;

             break;
             
            case 3: //Search by eamil
              if(contactList.Retrive().getEmail().equals(n))  
           Lsearch.Insert(contactList.Retrive());
             Lsearch.Insert(contactList.Retrive());
             found=true;
             break;  
            
             case 4: //Search by birthday
              if(contactList.Retrive().getBirthday().equals(n))  
           Lsearch.Insert(contactList.Retrive());
             Lsearch.Insert(contactList.Retrive());
             found=true ;
             break;
             
             case 5: //Search by address
              if(contactList.Retrive().getAddress().equals(n))  
           Lsearch.Insert(contactList.Retrive());
             Lsearch.Insert(contactList.Retrive());
             found=true ;
             break;     
             
             
        }
        
        contactList.FindNext();
    }//end while
    
      switch(type){ // this switch to check the last element in the list
            
            case 1: //Search by name
             if(contactList.Retrive().getName().equals(n))
               Lsearch.Insert(contactList.Retrive());
             Lsearch.Insert(contactList.Retrive()); 
             found = true ;
             break;
             
            case 2: //Search by Phone 
              if(contactList.Retrive().getPhoneNum().equals(n))  
           Lsearch.Insert(contactList.Retrive());
             Lsearch.Insert(contactList.Retrive());
             found = true ;

             break;
             
            case 3: //Search by eamil
              if(contactList.Retrive().getEmail().equals(n))  
           Lsearch.Insert(contactList.Retrive());
             Lsearch.Insert(contactList.Retrive());
             found=true;
             break;  
            
             case 4: //Search by birthday
              if(contactList.Retrive().getBirthday().equals(n))  
           Lsearch.Insert(contactList.Retrive());
             Lsearch.Insert(contactList.Retrive());
             found=true ;
             break;
             
             case 5: //Search by address
              if(contactList.Retrive().getAddress().equals(n))  
           Lsearch.Insert(contactList.Retrive());
             Lsearch.Insert(contactList.Retrive());
             found=true ;
             break;     
             
   }
    PrintContact(Lsearch);
    return found;

  }
  
  // in the main if (!searchEvent(event)) sop "not found" 
  
 public boolean searchEvent(String s,int i){
     LinkedList<Event> EventSearchList = new LinkedList<Event>() ;
     
     boolean found=false ;
     if (event_ContactsList.isEmpty())
         found=false ;
     
        Event p = null ;
     
         event_ContactsList.FindFirst(); 
         
         while(!event_ContactsList.Last()){
         p=event_ContactsList.Retrive() ;
         
         switch (i){
             case 1: // search by name
                 if(p.getName().equals(s))
                    found= true ;
                 EventSearchList.Insert(p);
                 
                 break; 
                 
             case 2: //search by title 
                 if(p.getTitle().equals(s))
                     found=true ;
                     EventSearchList.Insert(p);

                 
                 break;
                     }//end switch
         
         event_ContactsList.FindNext(); 
         }
         
         // this switch to check the last element in the list 
         
         switch (i){
             case 1: // search by name
                 if(p.getName().equals(s))
                    found= true ;
                 EventSearchList.Insert(p);
                 
                 break; 
                 
             case 2: //search by title 
                 if(p.getTitle().equals(s))
                     found=true ;
                     EventSearchList.Insert(p);

                 
                 break;
                     }//end switch
         
     
        PrintEvent(EventSearchList);
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
 }
     //PRINT ALL EVENTS 
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
    //PRINT ALL CONTACTS 

     
     public void PrintContact(){
   
     if(contactList.isEmpty())
         System.out.println("the contact list is empty");
     
     else{
     contactList.FindFirst(); 
     
     while(!contactList.Last()){
    
             contactList.Retrive().toString();
     
         System.out.println("-----------------------");
         contactList.FindNext(); 
     }//while
     
      contactList.Retrive().toString();

     }
     
 
 }
     
     //this method is for printing a list we recive from the search in the event list 

     public void PrintEvent(LinkedList<Event> EventSearchList){
   
     if(EventSearchList.isEmpty())
         System.out.println("the event list is empty");
     
     else{
     EventSearchList.FindFirst(); 
     
     while(!EventSearchList.Last()){
    
             EventSearchList.Retrive().toString();
     
         System.out.println("-----------------------");
         EventSearchList.FindNext(); 
     }//while
     
      EventSearchList.Retrive().toString();

     }
     }
     
  //this method is for printing a list we recive from the search in the contact list 
     
     public void PrintContact(LinkedList<Contacts> contactSearchList){
   
     if(contactSearchList.isEmpty())
         System.out.println("the event list is empty");
     
     else{
     contactSearchList.FindFirst(); 
     
     while(!contactSearchList.Last()){
    
             contactSearchList.Retrive().toString();
     
         System.out.println("-----------------------");
         contactSearchList.FindNext(); 
     }//while
     
      contactSearchList.Retrive().toString();

     }
 
 }

}//end class phonebook
