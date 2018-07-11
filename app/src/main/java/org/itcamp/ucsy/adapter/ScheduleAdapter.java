package org.itcamp.ucsy.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;

import org.itcamp.ucsy.R;
import org.itcamp.ucsy.data.ITcampSchedule;
import org.itcamp.ucsy.viewholder.ScheduleViewHolder;

public class ScheduleAdapter extends BaseRecyclerAdapter<ScheduleViewHolder, ITcampSchedule> {


    public ScheduleAdapter(Context context) {
        super(context);
    }

    @NonNull
    @Override
    public ScheduleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.view_item_schedule,parent,false);
        return new ScheduleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ScheduleViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
