package com.mycompany.ds;

public class Contacts<T> implements Comparable {

private String name, phoneNum, emailAddress, birthday, address, notes; 
public LinkedList<Event> contactEvents = new LinkedList<Event> (); // to store all events for a contact object

public Contacts ( String name, String pnum, String email, String birthday, String address, String notes) { //copy and default constructors ??

this.name = name;
phoneNum = pnum;
emailAddress = email; 
this.birthday = birthday;
this.address = address;
this.notes = notes;  
}

// string or object
public int compareTo(String n){ // how to write the code to compare names
    int compareTo = name.compareTo(n);
    
    return compareTo;
}
/* -1 = name < n
0 = equals 
1 = name > n
*/

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public void searchContact(String search){
        boolean found=false;
        //if() found= true;
        
        if(!found){
            System.out.println("Sorry! ,no contacts found for: "+ search);    
        }
    }
    
    
public void setName ( String n ) {

name = n;

}

public void setPhoneNum ( String pnum ) {

phoneNum = pnum;

}

public void setEmail ( String email ) {

emailAddress = email;

}

public void setBirthday ( String b ) {

birthday = b;

}

public void setAddress ( String a ) {

address = a;

}

public void setNotes ( String n ) {

notes = n;

}
// display, tostring, getteers 
public String getName () {

return name;

}

public String getPhoneNum () {

return phoneNum ;

}

public String getEmail () {

return emailAddress;

}

public String getBirthday () {

return birthday;

}

public String getAddress () {

return address;

}

public String getNotes () {

return notes;

}
  
}
