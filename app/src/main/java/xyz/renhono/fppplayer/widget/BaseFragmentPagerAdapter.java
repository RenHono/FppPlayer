package xyz.renhono.fppplayer.widget;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by RenHono on 2017/4/24 0024.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public abstract class BaseFragmentPagerAdapter<T> extends FragmentPagerAdapter {
    private List<T> mData;

    public BaseFragmentPagerAdapter(FragmentManager fm, List<T> mDatas) {
        super(fm);
        this.mData = mDatas;
    }

    @Override
    public Fragment getItem(int position) {
        return getFragmentItem(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return getTitle(mData.get(position));
    }


    @Override
    public int getCount() {
        return mData.size();
    }

    protected abstract Fragment getFragmentItem(int position);

    protected abstract CharSequence getTitle(T data);
}
