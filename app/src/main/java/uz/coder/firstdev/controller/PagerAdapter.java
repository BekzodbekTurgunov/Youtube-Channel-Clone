package uz.coder.firstdev.controller;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

import uz.coder.firstdev.view.AboutFragment;
import uz.coder.firstdev.view.ChannelsFragment;
import uz.coder.firstdev.view.HomeFragment;
import uz.coder.firstdev.view.PlaylistsFragment;
import uz.coder.firstdev.view.VideosFragment;

public class PagerAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> fragments = new ArrayList<>();
    public PagerAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        fragments.add(new HomeFragment(context));
        fragments.add(new VideosFragment(context));
        fragments.add(new PlaylistsFragment(context));
        fragments.add(new ChannelsFragment(context));
        fragments.add(new AboutFragment(context));

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return fragments.get(0);
            case 1: return fragments.get(1);
            case 2: return fragments.get(2);
            case 3: return fragments.get(3);
            case 4: return fragments.get(4);
        }
        return null;
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "Home";
            case 1: return "Videos";
            case 2: return "Playlists";
            case 3: return "Channels";
            case 4: return "About";
        }
        return null;
    }
}
