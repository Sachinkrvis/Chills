package com.example.musicapp_from_youtube_learning;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.viewHolder> {
    ArrayList<audioModel>songList;
    Context context;

    public adapter(ArrayList<audioModel> songList, Context context) {
        this.songList = songList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recyclerview_main_interface,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
    holder.setDisplay(songList.get(position));
    }

    @Override
    public int getItemCount() {
        return songList.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.title_textView);
        }
        public void setDisplay(audioModel song){
         textView.setText(song.getTitle());
        }
    }
}
