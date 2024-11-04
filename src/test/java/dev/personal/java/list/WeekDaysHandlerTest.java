package dev.personal.java.list;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

import org.junit.jupiter.api.Test;

public class WeekDaysHandlerTest {
    @Test
    void testCreateList() {

        WeekDaysHandler weekDaysHandler = new WeekDaysHandler();
        assertThat(weekDaysHandler.days.size(), is(7));
    }

    @Test
    void testGetDays(){
        WeekDaysHandler weekDaysHandler = new WeekDaysHandler();
        assertThat(weekDaysHandler.getDays(), contains( "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
        "Sunday"));
    }

    @Test
    void sizeOfList() {
        WeekDaysHandler weekDaysHandler = new WeekDaysHandler();
        assertThat(weekDaysHandler.sizeOfList(), is(7));
    }

    @Test 
    void testDeleteDay (){
        WeekDaysHandler weekDaysHandler = new WeekDaysHandler();

        assertThat(weekDaysHandler.getDays().contains("Monday"), is(true));
        weekDaysHandler.deleteDay("Monday"); 
        assertThat(weekDaysHandler.getDays().contains("Monday"), is(false));
        assertThat(weekDaysHandler.sizeOfList(), is(6));
    }

    @Test 
    void testRequestDay() {

        WeekDaysHandler weekDaysHandler = new WeekDaysHandler();

        assertThat(weekDaysHandler.requestDay(1), is("Tuesday"));
        assertThat(weekDaysHandler.requestDay(0), is("Monday"));
        assertThat(weekDaysHandler.requestDay(6), is("Sunday"));
        assertThat(weekDaysHandler.requestDay(7), is(nullValue()));


    }
}
