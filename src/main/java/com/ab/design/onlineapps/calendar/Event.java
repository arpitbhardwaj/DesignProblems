package com.ab.design.onlineapps.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Event implements Comparable<Event>{
    public String title;
    public String inputDate;
    public String startTime;
    public String endTime;
    public Date userInputStringToDate;

    public Event(String title,String inputDate,String startTime,String endTime)
    {
        this.title=title;
        this.inputDate=inputDate;
        this.startTime=startTime;
        this.endTime=endTime;
        dateObjectConverter();
    }

    /**
     * Function to convert String input date to date object
     * and parse it into userInputStringToDate
     */
    public void dateObjectConverter()
    {
        String concatenated = this.inputDate;
        SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy");
        try {
            userInputStringToDate = dateFormatter.parse(concatenated);
        }
        catch(ParseException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Equals to function
     */
    public boolean equals(Object other){
        Event that = (Event) other;
        return this.compareTo(that) == 0;
    }

    /**
     * Compare to function for sorting the events
     */
    public int compareTo(Event other){
        //comparing by date
        int dateCmp = this.userInputStringToDate.compareTo(other.userInputStringToDate);
        if(dateCmp != 0)
            return dateCmp;

        //compare by Start Time
        // retrieve stringStartTime -> convert to int -> compare
        String thisTimeString="",otherTimeString="";
        String thisTime= this.getStartTime();
        String otherTime= other.getStartTime();
        SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm");
        try{
            Date thisTimeHHmm= timeFormatter.parse(thisTime);
            Date otherTimeHHmm= timeFormatter.parse(otherTime);

            thisTimeString =timeFormatter.format(thisTimeHHmm);
            otherTimeString =timeFormatter.format(otherTimeHHmm);

        }catch(ParseException e){e.printStackTrace();}

        int timeCmp = thisTimeString.compareTo(otherTimeString);
        if(timeCmp!=0)
            return timeCmp;

        return 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInputDate() {
        return inputDate;
    }

    public void setInputDate(String inputDate) {
        this.inputDate = inputDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Date getUserInputStringToDate() {
        return userInputStringToDate;
    }

    public void setUserInputStringToDate(Date userInputStringToDate) {
        this.userInputStringToDate = userInputStringToDate;
    }
}
