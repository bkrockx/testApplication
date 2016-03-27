package com.test.testapplication.model;

import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by bablu on 19/03/16.
 */
public class Slot {
    String startTime;
    String endTime;
    boolean isBooked;
    boolean isExpired;
    private long id;

    public Slot(JSONObject jsonObject) {
        this.startTime = jsonObject.optString("start_time", "NA");
        this.endTime = jsonObject.optString("end_time", "NA");
        ;
        this.isBooked = jsonObject.optBoolean("is_booked", false);
        this.isExpired = jsonObject.optBoolean("is_expired", false);
        this.id = jsonObject.optLong("slot_id");
        ;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInterval() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm");

        String timeStart, timeEnd;

        try {
            Date dateEnd =  simpleDateFormat.parse(endTime);;
            Date dateStart =  simpleDateFormat.parse(startTime);;
            timeEnd = new SimpleDateFormat("K:mm aa").format(dateEnd);
            timeStart = new SimpleDateFormat("K:mm aa").format(dateStart);
        } catch (ParseException ex) {
            return "NA";
        }
        return timeStart + " - " + timeEnd;
    }
}
