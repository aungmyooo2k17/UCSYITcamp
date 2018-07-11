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
import org.itcamp.ucsy.adapter.VideoAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VideoFragment extends BaseFragment {

    @BindView(R.id.rv_video_list)
    RecyclerView rvVideoList;

    private VideoAdapter mVideoAdapter;

    public VideoFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_video, container, false);

        ButterKnife.bind(this, v);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        mVideoAdapter = new VideoAdapter(getContext());
        rvVideoList.setLayoutManager(linearLayoutManager);
        rvVideoList.setAdapter(mVideoAdapter);


        return v;
    }
}
