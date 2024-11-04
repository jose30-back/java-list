package dev.personal.java.list;

import java.util.ArrayList;
import java.util.List;

public class WeekDaysHandler {

    public List<String> days;

    public WeekDaysHandler() {
        createList();
    }

    public void createList() {
        days = new ArrayList<String>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
    }

    public List<String> getDays() {
        return new ArrayList<>(days);
    }

    public int sizeOfList(){
        return days.size(); 
    }

    public void deleteDay(String day) {
        days.remove(day);
    }
    
}
