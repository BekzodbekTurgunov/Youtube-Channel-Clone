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
import uz.coder.firstdev.controller.VideosAdapter;
import uz.coder.firstdev.model.VideosItem;

/**
 * A simple {@link Fragment} subclass.
 */
public class VideosFragment extends Fragment {
    private Context context;
    private RecyclerView recyclerView;
    private VideosAdapter adapter;
    private ArrayList<VideosItem> items = new ArrayList<>();

    public VideosFragment() {

    }

    public VideosFragment(Context context) {
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_videos, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.videos_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        setItems();
        adapter = new VideosAdapter(items);
        recyclerView.setAdapter(adapter);


    }
    public void setItems()
    {
        items.add(new VideosItem("https://www.billboard.com/files/styles/article_main_image/public/media/bazzi-beautiful-vid-2018-billboard-1548.jpg",
                "Heror film hd",1,456));
        items.add(new VideosItem("https://i.pinimg.com/564x/0a/f7/6d/0af76df6bff95e6a65d5592d7a48950d.jpg",
                "The life balance ",2,478));
        items.add(new VideosItem("https://i.ytimg.com/vi/pVBdF2QU3Kk/hqdefault.jpg",
                " Flowers type ",3,456));
        items.add(new VideosItem("https://www.billboard.com/files/styles/article_main_image/public/media/Bazzi-Camila-cabello-Beautiful-vid-2018-billboard-1548.jpg",
                "Bazzi & Camila Cabello's 'Beautiful'",4,963));
        items.add(new VideosItem("https://www.billboard.com/files/styles/article_main_image/public/media/bazzi-beautiful-vid-2018-billboard-1548.jpg",
                "Ed Sheeran Releases New Song",4,987));
        items.add(new VideosItem("https://y6auj24xr4y3qq95tz7io6uu-wpengine.netdna-ssl.com/wp-content/uploads/2017/07/ori_and_the_blind_forest_17-900x600.jpg",
                "7 Beautiful, Nature-Filled Video Games",5,324));
        items.add(new VideosItem("https://qph.fs.quoracdn.net/main-qimg-8dc482f7f9de0f27735cf2f6661c6edb.webp",
                "What is the most beautiful location in a video ",6,987));
        items.add(new VideosItem("https://m2.mbl.is/4UAwRaq5VPU3w269ePidcnwih4M=/758x505/smart/frimg/9/44/944698.jpg",
                "Iceland Monitor",6,1203));
        items.add(new VideosItem("https://images2.minutemediacdn.com/image/upload/c_crop,h_1190,w_2120,x_0,y_178/f_auto,q_auto,w_1100/v1554992829/shape/mentalfloss/istock-614127332.jpg",
                "Even in Real Time, the Northern Lights Look Like a Beautiful ...",6,789));
    }



}
