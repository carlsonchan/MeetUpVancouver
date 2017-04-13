package meetupvancouver.com.meetupvancouver;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


//@JsonIgnoreProperties({"Date","EventDescription","HostName","Time","Location"})
public class Event {
    String EventName;
    String Date;
    String EventDescription;
    String EventID;
    String HostName;
    String LocationLat;
    String LocationLon;
    String Time;

    public String getEventName() { return EventName; }

    public String getLocationLat(){
        return LocationLat;
    }

    public String getLocationLon(){
        return LocationLon;
    }

    public String getEventID(){
        return EventID;
    }

    public String toString() { return EventName+"$"+Date+"$"+EventDescription+"$"+HostName+"$"+Time+"$";}

    }
