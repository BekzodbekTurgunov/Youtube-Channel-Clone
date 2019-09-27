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
import uz.coder.firstdev.model.ChannelItem;

public class ChannelsAdapter extends RecyclerView.Adapter<ChannelsAdapter.ViewHolder> {
    private ArrayList<ChannelItem> channels;

    public ChannelsAdapter(ArrayList<ChannelItem> channels) {
        this.channels = channels;
    }

    @NonNull
    @Override
    public ChannelsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.channels_item,parent,false);
        return new ViewHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull ChannelsAdapter.ViewHolder holder, int position) {
        holder.title.setText(channels.get(position).getName());
        holder.count.setText(channels.get(position).getVideoCount()+ "  videos");
        holder.info.setText(channels.get(position).getSubscriberInfo()+" subscribers");
        String url = channels.get(position).getImgUrl();
        if (url !=null && !url.isEmpty()){
            Picasso.get().load(url).into(holder.img);
        }

    }

    @Override
    public int getItemCount() {
        return channels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView info;
        TextView count;
        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.channel_name);
            info = itemView.findViewById(R.id.channel_info);
            count = itemView.findViewById(R.id.video_count);
            img = itemView.findViewById(R.id.channel_image);

        }
    }
}
