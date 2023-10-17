public class Event implements Comparable<Event> {
    private String title;
    private String timeAndDate;
    private String location;
    private String name ;
    

    public Event(String title, String TimeAndDate, String location, String name) {
        this.title = title;
        this.timeAndDate= TimeAndDate;
        this.location = location;
        this.name = name;
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
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //comparing the name with 
    public int compareTo (Event o) {
    return this.name.compareTo(o.name);

        }

        public int compareToConflict(Event o) {
    return this.timeAndDate.compareTo(o.timeAndDate);

        }
    
}

