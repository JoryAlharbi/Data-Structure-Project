package com.mycompany.ds;

public class Event {
    private String title;
    private String date;
    private String time;
    private String location;
    private Contacts<T> contact;

    
public LinkedList<Event> eventList = new LinkedList<Event> ();

    public Event(String title, String date, String time, String location, Contacts contact) {
        this.title = title;
        this.date = date;
        this.time = time;
        this.location = location;
        this.contact = contact;
    }
    
  public  void setTitle ( String title) {
this.title = title;
  }

 public  void setDate ( String date) {
this.date = date;
  }

 public  void setTime ( String time) {
this.time = time;
  }

 public  void setLocation ( String location) {
this.location = location;
  }

public String getTitle () {

return title ;

}

public String getDate () {

return date ;

}

public String getTime () {

return time ;

}

public String getLocation() {

return location ;

}
    
    /* ??????????Chatgpt:
    public boolean equals(Object o){
        
        return true;
    }
    */
   
}
