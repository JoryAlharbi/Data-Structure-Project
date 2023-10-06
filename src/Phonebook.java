package com.mycompany.ds;

public class Phonebook{
  LinkedList<Contacts> L1= new LinkedList<>();
  //add:
  public void add(Contacts c){
      
  }
  
    // delete:
  public void delete(Contacts c){
      //public void delete(String name)
      
  }
  
  //search: 
  public LinkedList<Contacts> search(String n, int type){
    LinkedList<Contacts> Lsearch= new LinkedList<>(); 
    //if empty 
    if(L1.isEmpty())
        return Lsearch;
    
    //while (for retrive all contacts if there)
    while(L1.Last()){
        L1.FindFirst();
        
        switch(type){ //name, phoneNum, emailAddress, birthday, address, notes
            
            case 1: //Search by name
             if(L1.Retrive().getName().equals(n))
               Lsearch.Insert(L1.Retrive());
             Lsearch.Insert(L1.Retrive()); //??
             break;
             
            case 2: //Search by Phone 
              if(L1.Retrive().getPhoneNum().equals(n))  
           Lsearch.Insert(L1.Retrive());
             Lsearch.Insert(L1.Retrive());
             break;
             
            case 3: //Search by eamil
              if(L1.Retrive().getEmail().equals(n))  
           Lsearch.Insert(L1.Retrive());
             Lsearch.Insert(L1.Retrive());
             break;  
            
             case 4: //Search by birthday
              if(L1.Retrive().getBirthday().equals(n))  
           Lsearch.Insert(L1.Retrive());
             Lsearch.Insert(L1.Retrive());
             break;
             
             case 5: //Search by address
              if(L1.Retrive().getAddress().equals(n))  
           Lsearch.Insert(L1.Retrive());
             Lsearch.Insert(L1.Retrive());
             break;     
             
        }
    }
   return Lsearch;
  }
  
  /*
  public LinkedList<Contacts> searchBy_phoneNum(String P){
      //
    LinkedList<Contacts> Cname= new LinkedList<>(); 
    //if empty 
    if(L1.isEmpty())
        return Cname;
    
    //while (for retrive all contacts if there)
    while(L1.Last()){
        L1.FindFirst();
        if(L1.Retrive().getName().equals(p))
            Cname.Insert(L1.Retrive());
        
        L1.FindNext();
        
    }
   return Cname;
  }
  
public LinkedList<Contacts> searchBy_email(String e){
      //#####
    LinkedList<Contacts> Cname= new LinkedList<>(); 
    //if empty 
    if(L1.isEmpty())
        return Cname;
    
    //while (for retrive all contacts if there)
    while(L1.Last()){
        L1.FindFirst();
        if(L1.Retrive().getName().equals(e))
            Cname.Insert(L1.Retrive());
        
        L1.FindNext();
        
    }
   return Cname;
  }
  
 */
  
}
