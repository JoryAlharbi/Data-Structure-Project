
package ds.project;

public class Contacts implements Comparable<Contacts>{
    
    
private String name, phoneNum, emailAddress, birthday, address, notes; // private or public ?

public LinkedList <Event> ContactEvent = new LinkedList<Event>() ;

// constructor for only name and number
public Contacts ( String name, String pnum, String email, String birthday, String address, String notes) { //copy and default constructors ??

this.name = name;
phoneNum = pnum;
emailAddress = email; 
this.birthday = birthday;
this.address = address;
this.notes = notes; 

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


    @Override
    public String toString() {
        return "Contacts{" + "name=" + name + ", phoneNum=" + phoneNum + ", emailAddress=" + emailAddress + ", birthday=" + birthday + ", address=" + address + ", notes=" + notes + '}';
    }

    @Override
    //comparing the name with 
    public int compareTo(Contacts o) {
    return this.name.compareTo(o.name);

        }

  

    public void setContactEvent(LinkedList<Event> ContactEvent) {
        this.ContactEvent = ContactEvent;
    }
