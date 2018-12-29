package com.mcc.planlekcji;

import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class Schedule{

    String scheduleName;
    Map<String, String> scheduleMap = new HashMap<String, String>();

    void Schedule(String name){
        this.scheduleName = name;
        LoadSchedule(name);
    }

    void LoadSchedule(String name) {
        if (name.equals("TOMEK")) {
            scheduleMap.put("08:00", "RELIGIA");
            scheduleMap.put("08:55", "EW");
            scheduleMap.put("09:55", "EW");
            scheduleMap.put("10:50", "EW");
            scheduleMap.put("11:45", "SZACHY");
        }
        if (name.equals("FRANEK")) {
            scheduleMap.put("08:00", "INFORMATYKA");
            scheduleMap.put("08:55", "J.POLSKI");
            scheduleMap.put("09:55", "GW");
            scheduleMap.put("10:50", "MATEMATYKA");
            scheduleMap.put("11:45", "WF");
            scheduleMap.put("12:50", "J.ANGIELSKI");
            scheduleMap.put("14:15", "J.ANG. Early Stage");
        }
    }

}
