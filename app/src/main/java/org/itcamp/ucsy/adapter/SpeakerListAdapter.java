package org.itcamp.ucsy.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;

import org.itcamp.ucsy.R;
import org.itcamp.ucsy.data.ITCampSpeaker;
import org.itcamp.ucsy.viewholder.SpeakerListViewHolder;

public class SpeakerListAdapter extends BaseRecyclerAdapter<SpeakerListViewHolder, ITCampSpeaker>{

    public SpeakerListAdapter(Context context) {
        super(context);
    }

    @NonNull
    @Override
    public SpeakerListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.view_item_speaker_list,parent,false);
        return new SpeakerListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SpeakerListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
