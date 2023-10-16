package com.mycompany.ds;

public class Event {
    private String title;
    private String date;
    private String time;
    private String location;
    private Contacts<T> contact;

    public Event(String title, String date, String time, String location, Contacts contact) {
        this.title = title;
        this.date = date;
        this.time = time;
        this.location = location;
        this.contact = contact;
    }
    
    //seeters ang getters:
    
    /* ??????????Chatgpt:
    public boolean equals(Object o){
        
        return true;
    }
    */
   
}
