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
        adapter = new VideosAdapter(items);
        recyclerView.setAdapter(adapter);


    }
    public void setItems()
    {

    }



}
