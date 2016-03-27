package com.test.testapplication.viewholder;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.test.testapplication.R;
import com.test.testapplication.model.Slot;
import com.test.testapplication.util.ActivitySwitchHelper;

/**
 * Created by balbu on 26/03/16.
 */
public  class MyChildViewHolder extends MyBaseViewHolder {
    TextView slotTimeInterval;
    TextView bookButton;
    public MyChildViewHolder(View v) {
        super(v);
        slotTimeInterval = (TextView) v.findViewById(R.id.slot_time);
        bookButton  = (TextView) v.findViewById(R.id.book_button);
    }
    public void fillData(Slot slot){
        if (slot == null) return;
        slotTimeInterval.setText(slot.getInterval());

        if (slot.isBooked() || slot.isExpired()){
            bookButton.setVisibility(View.GONE);
            slotTimeInterval.setClickable(false);
            slotTimeInterval.setBackgroundColor(ActivitySwitchHelper.getContext()
                    .getResources().getColor(R.color.grey));
        }else {
            bookButton.setVisibility(View.VISIBLE);
            slotTimeInterval.setBackgroundColor(ActivitySwitchHelper.getContext()
                    .getResources().getColor(R.color.white));
            slotTimeInterval.setClickable(true);
            bookButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(ActivitySwitchHelper.getContext(), "Slot has been picked for you, make payment.", Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}
