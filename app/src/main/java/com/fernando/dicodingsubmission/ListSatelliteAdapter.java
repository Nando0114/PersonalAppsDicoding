package com.fernando.dicodingsubmission;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListSatelliteAdapter extends RecyclerView.Adapter<ListSatelliteAdapter.ListViewHolder>{
    private ArrayList<Satellite> listSatellite;
    private Context context;
    public ListSatelliteAdapter(ArrayList<Satellite> list) {
        this.listSatellite = list;
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_picture);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_satellite, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Satellite satellite= listSatellite.get(position);
        Glide.with(holder.itemView.getContext())
                .load(satellite.getPicture_satellite())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(satellite.getNama_satellite());
        holder.tvDetail.setText(satellite.getDetail_satellite());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context = view.getContext();
                Intent detailIntent = new Intent(context, DetailActivity.class);
                detailIntent.putExtra(DetailActivity.DETAIL_SATELLITE, listSatellite.get(holder.getAdapterPosition()));
                context.startActivity(detailIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listSatellite.size();
    }
}
