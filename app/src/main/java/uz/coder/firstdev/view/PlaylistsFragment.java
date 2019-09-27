package uz.coder.firstdev.view;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import uz.coder.firstdev.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlaylistsFragment extends Fragment {
private Context context;

    public PlaylistsFragment() {
        // Required empty public constructor
    }

    public PlaylistsFragment(Context context) {
        this.context =context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_playlists, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView txt = view.findViewById(R.id.txtPlaylists);
        txt.setText("No Playlists");
    }
}
