package be.vdab.oef8;

import java.time.LocalTime;

public class Time {
    public final LocalTime tijd;

    public Time(int uur, int minuut) {
        this.tijd = LocalTime.of(uur, minuut);
    }

    public LocalTime getTijd() {
        return this.tijd;
    }

    public LocalTime subtract(Time tijd) {
        return this.getTijd().minusHours(tijd.getTijd().getHour()).minusMinutes(tijd.getTijd().getMinute());
    }

    public LocalTime add(Time tijd) {
        return this.getTijd().plusHours(tijd.getTijd().getHour()).plusMinutes(tijd.getTijd().getMinute());
    }
}
