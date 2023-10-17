public class Event {
    private String title;
    private String timeAndDate;
    private String location;
    private Contacts contact;
    
    public LinkedList<Event> eventList = new LinkedList<Event> ();
    // need a display for all events
    public LinkedList<Contacts> event_ContactsList = new LinkedList<Contacts> ();

    public Event(String title, String TimeAndDate, String location, Contacts contact) {
        this.title = title;
        this.timeAndDate= TimeAndDate;
        this.location = location;
        this.contact = contact;
    }
    
  public  void setTitle ( String title) {
this.title = title;
  }


 public  void setLocation ( String location) {
this.location = location;
  }

public String getTitle () {

return title ;

}

public String getLocation() {

return location ;

}

    public void setTimeAndDate(String timeAndDate) {
        this.timeAndDate = timeAndDate;
    }

    public String getTimeAndDate() {
        return timeAndDate;
    }

    
    
    public LinkedList<Event> getEventList() {
        return eventList;
    }

    
    public LinkedList<Contacts> getEvent_ContactsList() {
        return event_ContactsList;
    }

   
}
    
