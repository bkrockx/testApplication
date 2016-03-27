package com.test.testapplication.viewholder;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.test.testapplication.R;
import com.test.testapplication.model.QuarterlySlot;

/**
 * Created by bablu on 26/03/16.
 */
public  class MyGroupViewHolder extends MyBaseViewHolder {
    TextView slotType;
    TextView slotsCount;
    RelativeLayout groupView;

    public MyGroupViewHolder(View v) {
        super(v);
        slotType = (TextView) v.findViewById(R.id.slot_type);
        slotsCount = (TextView) v.findViewById(R.id.slot_count);
        groupView = (RelativeLayout) v.findViewById(R.id.group_view);

    }
    public void fillData(final QuarterlySlot slot){
        slotType.setText(slot.getTitle());
        slotsCount.setText(slot.getSlotSize() + " Slots available");
    }
}
