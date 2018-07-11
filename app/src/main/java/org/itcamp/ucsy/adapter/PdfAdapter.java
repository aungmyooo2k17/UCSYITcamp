package org.itcamp.ucsy.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;

import org.itcamp.ucsy.R;
import org.itcamp.ucsy.data.ITcampPdf;
import org.itcamp.ucsy.viewholder.PdfViewHolder;

public class PdfAdapter extends BaseRecyclerAdapter<PdfViewHolder, ITcampPdf> {


    public PdfAdapter(Context context) {
        super(context);
    }

    @NonNull
    @Override
    public PdfViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.view_item_pdf_page,parent,false);
        return new PdfViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PdfViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
