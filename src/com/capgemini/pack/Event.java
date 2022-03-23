package com.capgemini.pack;

abstract class Event {
    protected String name;
    protected String detail;
    protected Double costPerDay;
    protected Integer noOfDays;

    public Event(String name, String detail, Double costPerDay, Integer noOfDays) {
        this.name = name;
        this.detail = detail;
        this.costPerDay = costPerDay;
        this.noOfDays = noOfDays;
    }
}

class Exhibition extends Event{
    Integer noOfStalls;
    static int gst = 5;

    public Exhibition(String name, String detail, Double costPerDay, Integer noOfDays, Integer noOfStalls) {
        super(name, detail, costPerDay, noOfDays);
        this.noOfStalls = noOfStalls;
    }

    public Integer getNoOfStalls() {
        return noOfStalls;
    }

    public void setNoOfStalls(Integer noOfStalls) {
        this.noOfStalls = noOfStalls;
    }

    public static int getGst() {
        return gst;
    }

    public static void setGst(int gst) {
        Exhibition.gst = gst;
    }
    Double total = super.costPerDay*super.noOfDays;
    Double tgst = total*gst/100;
    Double tamt = total+tgst;
    public String toString(){
        return "Event Details\nName: "+super.name+"\nType: "+super.detail+"\nNumber of Stalls: "+noOfStalls+"\nTotal amount: "+tamt;
    }
}

class StageEvent extends Event{

    Integer noOfShows;
    static int gst = 15;

    public StageEvent(String name, String detail, Double costPerDay, Integer noOfDays, Integer noOfShows) {
        super(name, detail, costPerDay, noOfDays);
        this.noOfShows = noOfShows;
    }

    public Integer getNoOfShows() {
        return noOfShows;
    }

    public void setNoOfShows(Integer noOfShows) {
        this.noOfShows = noOfShows;
    }

    public static int getGst() {
        return gst;
    }

    public static void setGst(int gst) {
        StageEvent.gst = gst;
    }
    Double total = super.costPerDay*super.noOfDays;
    Double tgst = total*gst/100;
    Double tamt = total+tgst;
    public String toString(){
        return "Event Details\nName: "+super.name+"\nType: "+super.detail+"\nNumber of Seats: "+noOfShows+"\nTotal amount: "+tamt;
    }
}