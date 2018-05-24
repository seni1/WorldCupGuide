package com.example.android.worldcupguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link CategoryAdapter} is a {@link android.support.v4.app.FragmentPagerAdapter} that can provide
 * the layout for each list item based on data source which is a list of {@link Match} objects.
 */

public class CategoryAdapter extends FragmentPagerAdapter{

    /**Context of the app */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MoscowFragment();
        } else if (position == 1) {
            return new StPetersburgFragment();
        } else if (position == 2) {
            return new KazanFragment();
        } else if (position == 3) {
            return new SochiFragment();
        } else {
            return new SamaraFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_moscow);
        } else if (position == 1) {
            return mContext.getString(R.string.category_st_pete);
        } else  if (position == 2) {
            return mContext.getString(R.string.category_kazan);
        } else if (position == 3) {
            return mContext.getString(R.string.category_sochi);
        } else {
            return mContext.getString(R.string.category_samara);
        }
    }


}
