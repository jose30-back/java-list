package dev.personal.java.list;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class WeekDaysHandlerTest {
    @Test
    void testCreateList() {

        WeekDaysHandler weekDaysHandler = new WeekDaysHandler();
        assertThat(weekDaysHandler.days.size(), is(7));
    }
}
