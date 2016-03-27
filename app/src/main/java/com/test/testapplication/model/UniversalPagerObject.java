package com.test.testapplication.model;

import android.util.SparseArray;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/**
 * Created by bablu on 19/03/16.
 */
public class UniversalPagerObject {



    List<QuarterlySlot> quarterlySlotList = new ArrayList<>(); //If I take list of jsonobjects I can use it anywhere

    String title;
    Date daySlotDate;
    private  static SparseArray<String> sMap = new SparseArray<>();
    static {
        sMap.put(2,"Sat");
        sMap.put(3,"Sun");
        sMap.put(4,"Mon");
        sMap.put(5,"Tue");
        sMap.put(6,"Wed");
        sMap.put(0,"Thr");
        sMap.put(1,"Fri");

    }

    public void setTitle(String title) {
        this.title = title;
        if (title != null){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            try {
                daySlotDate = simpleDateFormat.parse(title);
            } catch (ParseException ex) {
            }
        }
    }

    public List<QuarterlySlot> getQuarterlySlotList() {
        return quarterlySlotList;
    }

    public void setQuarterlySlotList(List<QuarterlySlot> quarterlySlotList) {

        this.quarterlySlotList = quarterlySlotList;
    }


    public UniversalPagerObject(JSONObject dayJson){
        if (dayJson == null) return;
        Iterator<?> keysInQuarter = dayJson.keys();
        while (keysInQuarter.hasNext()){
            String key = (String)keysInQuarter.next();
            QuarterlySlot quarterlySlot = new QuarterlySlot();
            quarterlySlot.setTitle(key);
            JSONArray jsonArray = dayJson.optJSONArray(key);
            for (int i = 0 ; jsonArray != null && i <  jsonArray.length() ; i++){
                try {
                    Slot slot = new Slot((JSONObject) jsonArray.get(i));
                    quarterlySlot.add(slot);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            quarterlySlotList.add(quarterlySlot);
        }
    }

    public String getTitle() {
        //TODO convert date to title
        if (daySlotDate != null){
            return daySlotDate.getDate()+"-"+sMap.get(daySlotDate.getDay());
        }else {
            return "NA";
        }
    }

    public String getMonth() {
        if (daySlotDate != null){
            return daySlotDate.getMonth()+"";
        }else {
            return "NA";
        }
    }

    public Date getDate() {
        return daySlotDate;
    }
}
