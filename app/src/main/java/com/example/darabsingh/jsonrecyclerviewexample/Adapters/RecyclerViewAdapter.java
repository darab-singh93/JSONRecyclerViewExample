package com.example.darabsingh.jsonrecyclerviewexample.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.darabsingh.jsonrecyclerviewexample.Models.MyAnime;
import com.example.darabsingh.jsonrecyclerviewexample.R;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{
private Context mContext;
private List<MyAnime> mData;
RequestOptions option;

    public RecyclerViewAdapter(Context mContext,List<MyAnime>mData)
    {
        this.mContext=mContext;
        this.mData=mData;

        option=new RequestOptions().centerCrop().placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater inflater=LayoutInflater.from(mContext);
        view=inflater.inflate(R.layout.anime_row_item,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.tv_name.setText(mData.get(i).getName());
        myViewHolder.tv_rating.setText(mData.get(i).getRating());
        myViewHolder.tv_studio.setText(mData.get(i).getStudio());
        myViewHolder.tv_category.setText(mData.get(i).getCategory());

        Glide.with(mContext).load(mData.get(i).getImage_url()).apply(option).into(myViewHolder.img_thumbnail);

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv_name,tv_rating,tv_studio,tv_category;
        ImageView img_thumbnail;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_name=itemView.findViewById(R.id.anime_name);
        tv_rating=itemView.findViewById(R.id.rating);
        tv_studio=itemView.findViewById(R.id.studio);
        tv_category=itemView.findViewById(R.id.categories);
        img_thumbnail=itemView.findViewById(R.id.thumbnail);
    }
}

}
