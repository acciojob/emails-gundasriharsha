package com.driver;

import java.time.LocalTime;

public class Meeting {
    private static LocalTime startTime;
    private static LocalTime endTime;

    public Meeting(LocalTime startTime, LocalTime endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public static boolean findSlot(Meeting meeting){
        if(meeting.startTime==endTime){
            return false;
        }
        return true;
    }
}
