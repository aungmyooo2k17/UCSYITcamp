package org.itcamp.ucsy.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.itcamp.ucsy.R;
import org.itcamp.ucsy.adapter.SpeakerListAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SpeakerFragment extends BaseFragment {

    @BindView(R.id.rv_speaker_list)
    RecyclerView rvSpeakerList;

    private SpeakerListAdapter mSpeakerListAdapter;

    public SpeakerFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_speaker, container, false);
        ButterKnife.bind(this, v);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        mSpeakerListAdapter = new SpeakerListAdapter(getContext());
        rvSpeakerList.setLayoutManager(linearLayoutManager);
        rvSpeakerList.setAdapter(mSpeakerListAdapter);

        return v;
    }
}
