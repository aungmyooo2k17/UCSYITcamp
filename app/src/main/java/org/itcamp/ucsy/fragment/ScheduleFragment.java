package org.itcamp.ucsy.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;

import com.tomerrosenfeld.customanalogclockview.CustomAnalogClock;

import org.itcamp.ucsy.R;
import org.itcamp.ucsy.adapter.ScheduleAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ScheduleFragment extends BaseFragment {

    @BindView(R.id.analog_clock)
    CustomAnalogClock customAnalogClock;

    @BindView(R.id.hsv_time)
    HorizontalScrollView horizontalScrollView;

    @BindView(R.id.rv_schedule)
    RecyclerView rvSchedule;

    private ScheduleAdapter mScheduleAdapter;

    public ScheduleFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_schedule, container, false);

        ButterKnife.bind(this, v);
        customAnalogClock.setScale(0.26f);
        customAnalogClock.init(getContext(), R.drawable.clock_face, R.drawable.hour_hand, R.drawable.minute_hand, 0, false, false);
        customAnalogClock.setAutoUpdate(true);


        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setVerticalFadingEdgeEnabled(false);

        mScheduleAdapter = new ScheduleAdapter(getContext());
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 2);
        rvSchedule.setLayoutManager(layoutManager);
        rvSchedule.setAdapter(mScheduleAdapter);




        return v;
    }
}
