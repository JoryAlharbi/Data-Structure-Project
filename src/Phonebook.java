package com.mycompany.ds;

import java.util.Objects;

public class Phonebook{
  LinkedList<Contacts> Contact= new LinkedList<>();
  
  //search for event
  
  //add:
  public void add(Contacts c){
      //add event
      //add contact
  }
  
    // delete:
  public void delete(Contacts c){
      //public void delete(String name)
      
  }
  
  //search: 
  public LinkedList<Contacts> search(String n, int type){
    LinkedList<Contacts> Lsearch= new LinkedList<>(); 
    //if empty 
    if(Contact.isEmpty())
        return Lsearch;
    
    //while (for retrive all contacts if there)
    while(Contact.Last()){
        Contact.FindFirst();
        
        switch(type){ //name, phoneNum, emailAddress, birthday, address, notes
            
            case 1: //Search by name
             if(Contact.Retrive().getName().equals(n))
               Lsearch.Insert(Contact.Retrive());
             Lsearch.Insert(Contact.Retrive()); //??
             break;
             
            case 2: //Search by Phone 
              if(Contact.Retrive().getPhoneNum().equals(n))  
           Lsearch.Insert(Contact.Retrive());
             Lsearch.Insert(Contact.Retrive());
             break;
             
            case 3: //Search by eamil
              if(Contact.Retrive().getEmail().equals(n))  
           Lsearch.Insert(Contact.Retrive());
             Lsearch.Insert(Contact.Retrive());
             break;  
            
             case 4: //Search by birthday
              if(Contact.Retrive().getBirthday().equals(n))  
           Lsearch.Insert(Contact.Retrive());
             Lsearch.Insert(Contact.Retrive());
             break;
             
             case 5: //Search by address
              if(Contact.Retrive().getAddress().equals(n))  
           Lsearch.Insert(Contact.Retrive());
             Lsearch.Insert(Contact.Retrive());
             break;     
             
        }
    }
   return Lsearch;
  }
  
     
 public void printallContacts(){
    if(Contact.isEmpty()) 
        System.out.println("Phonebook is empthy!");   
        
    else{
        System.out.println("Contacts in Phonebook: "); 
        //for(){
           System.out.println(Contact); //?
            }
            
        }
    }
 
  
  //????????????????????????????????????????????
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
