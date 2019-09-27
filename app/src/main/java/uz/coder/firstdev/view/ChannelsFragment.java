package uz.coder.firstdev.view;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import uz.coder.firstdev.R;
import uz.coder.firstdev.controller.ChannelsAdapter;
import uz.coder.firstdev.model.ChannelItem;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChannelsFragment extends Fragment {
    private Context context;
    private RecyclerView recyclerView;
    private ChannelsAdapter adapter;
    private ArrayList<ChannelItem> items=new ArrayList<>();

    public ChannelsFragment() {
    }

    public ChannelsFragment(Context context) {
        // Required empty public constructor
        this.context =context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_channels, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.channels_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        setItems();

        adapter =  new ChannelsAdapter(items);
        recyclerView.setAdapter(adapter);
    }
    public void setItems(){
        items.add(new ChannelItem("https://cdn130.picsart.com/257866574003202.jpg?c256x256",
                "Picasso image",125,354));
        items.add(new ChannelItem("https://static-s.aa-cdn.net/img/gp/20600000686979/LkqdNmFQ2fRtGmXy7b7JoBrm97s-KcS_HIsLmHZkJaGiSRJQyjp5NnfssQJGBkqlj0GZ=w300?v=1",
                "Every morning",456,963));
        items.add( new ChannelItem("https://cdn79.picsart.com/184182002000202.jpg?c256x256",
                "Mountown",102,200));
        items.add(new ChannelItem("https://is2-ssl.mzstatic.com/image/thumb/Purple20/v4/bf/95/cd/bf95cda2-e022-9f68-1235-93db6cf35bcd/source/256x256bb.jpg",
                "Pretty girl",987,789));
        items.add(new ChannelItem("https://myrealdomain.com/images/beautiful-girls-photos-4.png",
                "English learning",456,125));
        items.add(new ChannelItem("https://cdn130.picsart.com/257866574003202.jpg?c256x256",
                "Picasso image",125,354));
        items.add(new ChannelItem("https://static-s.aa-cdn.net/img/gp/20600000686979/LkqdNmFQ2fRtGmXy7b7JoBrm97s-KcS_HIsLmHZkJaGiSRJQyjp5NnfssQJGBkqlj0GZ=w300?v=1",
                "Every morning",456,963));
        items.add( new ChannelItem("https://cdn79.picsart.com/184182002000202.jpg?c256x256",
                "Mountown",102,200));
        items.add(new ChannelItem("https://is2-ssl.mzstatic.com/image/thumb/Purple20/v4/bf/95/cd/bf95cda2-e022-9f68-1235-93db6cf35bcd/source/256x256bb.jpg",
                "Pretty girl",987,789));
        items.add(new ChannelItem("https://myrealdomain.com/images/beautiful-girls-photos-4.png",
                "English learning",456,125));
        items.add(new ChannelItem("https://cdn130.picsart.com/257866574003202.jpg?c256x256",
                "Picasso image",125,354));
        items.add(new ChannelItem("https://static-s.aa-cdn.net/img/gp/20600000686979/LkqdNmFQ2fRtGmXy7b7JoBrm97s-KcS_HIsLmHZkJaGiSRJQyjp5NnfssQJGBkqlj0GZ=w300?v=1",
                "Every morning",456,963));
        items.add( new ChannelItem("https://cdn79.picsart.com/184182002000202.jpg?c256x256",
                "Mountown",102,200));
        items.add(new ChannelItem("https://is2-ssl.mzstatic.com/image/thumb/Purple20/v4/bf/95/cd/bf95cda2-e022-9f68-1235-93db6cf35bcd/source/256x256bb.jpg",
                "Pretty girl",987,789));
        items.add(new ChannelItem("https://myrealdomain.com/images/beautiful-girls-photos-4.png",
                "English learning",456,125));
    }
}
