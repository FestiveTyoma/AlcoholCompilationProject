package com.compil.alcohocompilation.ui.main;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.compil.alcohocompilation.R;
import com.compil.alcohocompilation.Tab1aboutActivity;
import com.compil.alcohocompilation.Tab2CompilationActivity;
import com.compil.alcohocompilation.Tab3MoodActivity;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    //private static final int[] TAB_TITLES = new int[]{R.string.tab_about_1, R.string.tab_compilation_2, R.string.tab_mood_3};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Tab1aboutActivity();
            case 1:
                return new Tab2CompilationActivity();
            case 2:
                return new Tab3MoodActivity();
            default:
                return null;

        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "О бренде";
            case 1:
                return "Сочетания";
            case 2:
                return "Под настроение";
        }

                return null;
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 3;
    }
}