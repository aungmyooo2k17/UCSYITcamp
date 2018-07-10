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
import org.itcamp.ucsy.adapter.PdfAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PdfFragment extends BaseFragment {

    @BindView(R.id.rv_pdf_list)
    RecyclerView rvPdfList;

    private PdfAdapter mPdfAdapter;



    public PdfFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_pdf, container, false);
        ButterKnife.bind(this, v);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        mPdfAdapter = new PdfAdapter(getContext());
        rvPdfList.setLayoutManager(linearLayoutManager);
        rvPdfList.setAdapter(mPdfAdapter);



        return v;
    }
}
