package org.itcamp.ucsy.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;

import org.itcamp.ucsy.R;
import org.itcamp.ucsy.data.ITcampVideo;
import org.itcamp.ucsy.viewholder.ScheduleViewHolder;
import org.itcamp.ucsy.viewholder.VideoViewHolder;

public class VideoAdapter extends BaseRecyclerAdapter<VideoViewHolder, ITcampVideo> {
    public VideoAdapter(Context context) {
        super(context);
    }

    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.view_item_video_page,parent,false);
        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
