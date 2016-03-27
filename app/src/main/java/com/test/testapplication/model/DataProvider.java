package com.test.testapplication.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/**
 * Created by bablu on 25/03/16.
 */

/*
* As I was not able to get data using retrofit in your format,I created this fixed data.
* */
public class DataProvider {
    static String JSON_RESPONSE = "{\n" +
            "2016-03-30: {\n" +
            "afternoon: [\n" +
            "{\n" +
            "end_time: \"2016-03-26 13:15:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: true,\n" +
            "slot_id: 1867,\n" +
            "start_time: \"2016-03-26 13:00:00+00:00\"\n" +
            "},\n" +
            "{\n" +
            "end_time: \"2016-03-26 13:40:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: true,\n" +
            "slot_id: 1868,\n" +
            "start_time: \"2016-03-26 13:25:00+00:00\"\n" +
            "}\n" +
            "],\n" +
            "evening: [\n" +
            "{\n" +
            "end_time: \"2016-03-26 14:05:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: true,\n" +
            "slot_id: 1869,\n" +
            "start_time: \"2016-03-26 13:50:00+00:00\"\n" +
            "},\n" +
            "{\n" +
            "end_time: \"2016-03-26 14:30:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: true,\n" +
            "slot_id: 1870,\n" +
            "start_time: \"2016-03-26 14:15:00+00:00\"\n" +
            "},\n" +
            "{\n" +
            "end_time: \"2016-03-26 14:55:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: true,\n" +
            "slot_id: 1871,\n" +
            "start_time: \"2016-03-26 14:40:00+00:00\"\n" +
            "},\n" +
            "{\n" +
            "end_time: \"2016-03-26 15:20:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: true,\n" +
            "slot_id: 1872,\n" +
            "start_time: \"2016-03-26 15:05:00+00:00\"\n" +
            "},\n" +
            "{\n" +
            "end_time: \"2016-03-26 15:45:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: true,\n" +
            "slot_id: 1873,\n" +
            "start_time: \"2016-03-26 15:30:00+00:00\"\n" +
            "},\n" +
            "{\n" +
            "end_time: \"2016-03-26 16:10:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: true,\n" +
            "slot_id: 1874,\n" +
            "start_time: \"2016-03-26 15:55:00+00:00\"\n" +
            "},\n" +
            "{\n" +
            "end_time: \"2016-03-26 16:35:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: true,\n" +
            "slot_id: 1875,\n" +
            "start_time: \"2016-03-26 16:20:00+00:00\"\n" +
            "}\n" +
            "],\n" +
            "morning: [\n" +
            "{\n" +
            "end_time: \"2016-03-26 20:45:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: false,\n" +
            "slot_id: 1876,\n" +
            "start_time: \"2016-03-26 20:30:00+00:00\"\n" +
            "},\n" +
            "{\n" +
            "end_time: \"2016-03-26 21:10:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: false,\n" +
            "slot_id: 1877,\n" +
            "start_time: \"2016-03-26 20:55:00+00:00\"\n" +
            "},\n" +
            "{\n" +
            "end_time: \"2016-03-26 21:35:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: false,\n" +
            "slot_id: 1878,\n" +
            "start_time: \"2016-03-26 21:20:00+00:00\"\n" +
            "},\n" +
            "{\n" +
            "end_time: \"2016-03-26 22:00:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: false,\n" +
            "slot_id: 1879,\n" +
            "start_time: \"2016-03-26 21:45:00+00:00\"\n" +
            "},\n" +
            "{\n" +
            "end_time: \"2016-03-26 22:25:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: false,\n" +
            "slot_id: 1880,\n" +
            "start_time: \"2016-03-26 22:10:00+00:00\"\n" +
            "},\n" +
            "{\n" +
            "end_time: \"2016-03-26 22:50:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: false,\n" +
            "slot_id: 1881,\n" +
            "start_time: \"2016-03-26 22:35:00+00:00\"\n" +
            "},\n" +
            "{\n" +
            "end_time: \"2016-03-26 23:15:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: false,\n" +
            "slot_id: 1882,\n" +
            "start_time: \"2016-03-26 23:00:00+00:00\"\n" +
            "}\n" +
            "]\n" +
            "},\n" +
            "2016-03-31: {\n" +
            "afternoon: [\n" +
            "{\n" +
            "end_time: \"2016-03-27 13:15:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: false,\n" +
            "slot_id: 1915,\n" +
            "start_time: \"2016-03-27 13:00:00+00:00\"\n" +
            "},\n" +
            "{\n" +
            "end_time: \"2016-03-27 13:40:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: false,\n" +
            "slot_id: 1916,\n" +
            "start_time: \"2016-03-27 13:25:00+00:00\"\n" +
            "}\n" +
            "],\n" +
            "evening: [\n" +
            "{\n" +
            "end_time: \"2016-03-27 14:05:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: false,\n" +
            "slot_id: 1917,\n" +
            "start_time: \"2016-03-27 13:50:00+00:00\"\n" +
            "},\n" +
            "{\n" +
            "end_time: \"2016-03-27 14:30:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: false,\n" +
            "slot_id: 1918,\n" +
            "start_time: \"2016-03-27 14:15:00+00:00\"\n" +
            "},\n" +
            "{\n" +
            "end_time: \"2016-03-27 14:55:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: false,\n" +
            "slot_id: 1919,\n" +
            "start_time: \"2016-03-27 14:40:00+00:00\"\n" +
            "},\n" +
            "{\n" +
            "end_time: \"2016-03-27 15:20:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: false,\n" +
            "slot_id: 1920,\n" +
            "start_time: \"2016-03-27 15:05:00+00:00\"\n" +
            "},\n" +
            "{\n" +
            "end_time: \"2016-03-27 15:45:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: false,\n" +
            "slot_id: 1921,\n" +
            "start_time: \"2016-03-27 15:30:00+00:00\"\n" +
            "},\n" +
            "{\n" +
            "end_time: \"2016-03-27 16:10:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: false,\n" +
            "slot_id: 1922,\n" +
            "start_time: \"2016-03-27 15:55:00+00:00\"\n" +
            "},\n" +
            "{\n" +
            "end_time: \"2016-03-27 16:35:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: false,\n" +
            "slot_id: 1923,\n" +
            "start_time: \"2016-03-27 16:20:00+00:00\"\n" +
            "}\n" +
            "],\n" +
            "morning: [ ]\n" +
            "},\n" +
            "2016-04-01: {\n" +
            "afternoon: [\n" +
            "{\n" +
            "end_time: \"2016-03-28 13:15:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: false,\n" +
            "slot_id: 1924,\n" +
            "start_time: \"2016-03-28 13:00:00+00:00\"\n" +
            "},\n" +
            "{\n" +
            "end_time: \"2016-03-28 13:40:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: false,\n" +
            "slot_id: 1925,\n" +
            "start_time: \"2016-03-28 13:25:00+00:00\"\n" +
            "}\n" +
            "],\n" +
            "evening: [\n" +
            "{\n" +
            "end_time: \"2016-03-28 14:05:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: false,\n" +
            "slot_id: 1926,\n" +
            "start_time: \"2016-03-28 13:50:00+00:00\"\n" +
            "},\n" +
            "{\n" +
            "end_time: \"2016-03-28 14:30:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: false,\n" +
            "slot_id: 1927,\n" +
            "start_time: \"2016-03-28 14:15:00+00:00\"\n" +
            "},\n" +
            "{\n" +
            "end_time: \"2016-03-28 14:55:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: false,\n" +
            "slot_id: 1928,\n" +
            "start_time: \"2016-03-28 14:40:00+00:00\"\n" +
            "},\n" +
            "{\n" +
            "end_time: \"2016-03-28 15:20:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: false,\n" +
            "slot_id: 1929,\n" +
            "start_time: \"2016-03-28 15:05:00+00:00\"\n" +
            "},\n" +
            "{\n" +
            "end_time: \"2016-03-28 15:45:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: false,\n" +
            "slot_id: 1930,\n" +
            "start_time: \"2016-03-28 15:30:00+00:00\"\n" +
            "},\n" +
            "{\n" +
            "end_time: \"2016-03-28 16:10:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: false,\n" +
            "slot_id: 1931,\n" +
            "start_time: \"2016-03-28 15:55:00+00:00\"\n" +
            "},\n" +
            "{\n" +
            "end_time: \"2016-03-28 16:35:00+00:00\",\n" +
            "is_booked: false,\n" +
            "is_expired: false,\n" +
            "slot_id: 1932,\n" +
            "start_time: \"2016-03-28 16:20:00+00:00\"\n" +
            "}\n" +
            "],\n" +
            "morning: [ ]\n" +
            "}}";

    public static List<UniversalPagerObject> getNetworkResponse(){
        ArrayList<UniversalPagerObject> list = new ArrayList<>();
        try {
            JSONObject JSON_RESPONSE_OBJECT = new JSONObject(JSON_RESPONSE);
            Iterator<String> keys = JSON_RESPONSE_OBJECT.keys();
            ArrayList<String> sortedKey = new ArrayList<>();
                while (keys.hasNext()) {
                        sortedKey.add(keys.next());
                }
            Collections.sort(sortedKey, new DateCompare());

            for (int i =0 ; i < sortedKey.size(); i++){
                String key = sortedKey.get(i);
                if ( JSON_RESPONSE_OBJECT.get(key) != null && JSON_RESPONSE_OBJECT.get(key) instanceof JSONObject ) {
                      JSONObject dayJson = (JSONObject) JSON_RESPONSE_OBJECT.get(key);
                      UniversalPagerObject universalPagerObject = new UniversalPagerObject(dayJson);
                      universalPagerObject.setTitle(key);
                      list.add(universalPagerObject);
                }
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return list;
    }

        public static class DateCompare implements Comparator<String> {
                @Override
                public int compare(String date1, String date2) {
                        if (date1 != null && date2 != null){
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
                                try {   Date dateOne = simpleDateFormat.parse(date1);
                                        Date dateTwo = simpleDateFormat.parse(date2);
                                        return dateOne.compareTo(dateTwo);
                                } catch (ParseException ex) {
                                }
                        }
                        return 0;
                }
        }


}
