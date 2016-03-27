package com.test.testapplication.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bablu on 20/03/16.
 */
public class QuarterlySlot {
    public void setTitle(String title) {
        this.title = title;
    }

    public void setList(List<Slot> list) {
        this.list = list;
    }

    public String getTitle() {
        return title;
    }

    String title;

    public List<Slot> getList() {
        return list;
    }

    List<Slot> list = new ArrayList<>();
    private long groupId;

    public int getSlotSize(){
        return list.size();
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public long getChildId(int childPosition) {
        return list.get(childPosition).getId();
    }

    public void add(Slot slot) {
        list.add(slot);
    }

    public  String getId() {

        return title;
    }
}
