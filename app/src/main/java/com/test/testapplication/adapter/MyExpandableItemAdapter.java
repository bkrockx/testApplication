package com.test.testapplication.adapter;

/**
 * Created by hchhabra on 26/03/16.
 */

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.h6ah4i.android.widget.advrecyclerview.utils.AbstractExpandableItemAdapter;
import com.test.testapplication.R;
import com.test.testapplication.model.QuarterlySlot;
import com.test.testapplication.viewholder.MyChildViewHolder;
import com.test.testapplication.viewholder.MyGroupViewHolder;

import java.util.ArrayList;
import java.util.List;

public class MyExpandableItemAdapter
        extends AbstractExpandableItemAdapter<MyGroupViewHolder, MyChildViewHolder> {
    // NOTE: Make accessible with short name
    List<QuarterlySlot> list = new ArrayList<>();

    public MyExpandableItemAdapter(List<QuarterlySlot> dataProvider) {
        this.list = dataProvider;
        setHasStableIds(true);
        notifyDataSetChanged();
    }

    @Override
    public int getGroupCount() {
        return list.size();

    }

    @Override
    public int getChildCount(int groupPosition) {
        return list.get(groupPosition).getSlotSize();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;

    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return  groupPosition+childPosition+1;

    }

    @Override
    public int getGroupItemViewType(int groupPosition) {
        return 0;
    }

    @Override
    public int getChildItemViewType(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public MyGroupViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        final LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        final View v = inflater.inflate(R.layout.group_slot_item, parent, false);
        return new MyGroupViewHolder(v);
    }

    @Override
    public MyChildViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        final LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        final View v = inflater.inflate(R.layout.slot_item, parent, false);
        return new MyChildViewHolder(v);
    }

    @Override
    public void onBindGroupViewHolder(MyGroupViewHolder holder, int groupPosition, int viewType) {
        ((MyGroupViewHolder) holder).fillData(list.get(groupPosition));
    }

    @Override
    public void onBindChildViewHolder(MyChildViewHolder holder, int groupPosition, int childPosition, int viewType) {
        ((MyChildViewHolder)holder).fillData(list.get(groupPosition).getList().get(childPosition));

    }

    @Override
    public boolean onCheckCanExpandOrCollapseGroup(MyGroupViewHolder holder, int groupPosition, int x, int y, boolean expand) {
        return true;
    }

}