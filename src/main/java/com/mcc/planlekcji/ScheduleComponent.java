package com.mcc.planlekcji;

public class ScheduleComponent {
    private String hour;
    private String lesson;

    public ScheduleComponent(String hour, String lesson) {
        this.hour = hour;
        this.lesson = lesson;
    }
    public String getHour() {
        return hour;
    }

    public String getLesson() {
        return lesson;
    }
}
