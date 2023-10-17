
public class Event implements Comparable<Event> {
    private String title;
    private String timeAndDate;
    private String location;
    private String contactName ;
    

    public Event(String title, String TimeAndDate, String location, String contactName) {
        this.title = title;
        this.timeAndDate= TimeAndDate;
        this.location = location;
        this.contactName = contactName;
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

    public String getName() {
        return contactName;
    }

    public void setName(String name) {
        this.contactName = name;
    }

    //comparing the title to sort the event list alphabticaly
    public int compareTo(Event o) {
    return this.title.compareTo(o.getTitle());
    

        }
    // comparing the time and date so we dont have conflict
    
    public int compareToConflict(Event o) {
    return this.timeAndDate.compareTo(o.getTimeAndDate());
    

        }
    
    
}
    
   
