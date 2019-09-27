package uz.coder.firstdev.controller;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import uz.coder.firstdev.R;
import uz.coder.firstdev.model.VideosItem;

public class VideosAdapter extends RecyclerView.Adapter<VideosAdapter.ViewHolder> {
    private ArrayList<VideosItem> videos;

    public VideosAdapter(ArrayList<VideosItem> videos) {
        this.videos = videos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_item,parent,false);

        return new ViewHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.title.setText(videos.get(position).getTitle());
            holder.countView.setText(videos.get(position).getviews()+"  views");
            holder.uploadTime.setText(videos.get(position).getUploadTime()+ "  week");// write code;

        String url = videos.get(position).getVideoUrl();
        if (url !=null && !url.isEmpty()){
            Picasso.get().load(url).into(holder.videoView);
        }

    }

    @Override
    public int getItemCount() {
        return videos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        private TextView title;
        private TextView uploadTime;
        private TextView countView;
        private ImageView videoView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.video_title);
            uploadTime = itemView.findViewById(R.id.upload_time);
            countView = itemView.findViewById(R.id.view_count);
            videoView = itemView.findViewById(R.id.videView);
        }


    }
}
