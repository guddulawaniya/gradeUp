package com.example.gradeup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentsAdapter extends FragmentPagerAdapter {
    public FragmentsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0: return new debitCardFragment();
            case 1: return new walletFragment();
            default: return new debitCardFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position){
        String title =null;
        if(position==0)
        {
            title = "CHATS";

        }
        if(position==1)
        {
            title = "STATUS";

        }
        return title;
    }

}
