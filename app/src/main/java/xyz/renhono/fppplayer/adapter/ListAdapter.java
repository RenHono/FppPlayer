package xyz.renhono.fppplayer.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import java.util.List;

import xyz.renhono.fppplayer.fragment.ListContentFragment;
import xyz.renhono.fppplayer.mvp.bean.ListInfo;
import xyz.renhono.fppplayer.widget.BaseFragmentPagerAdapter;

/**
 * Created by RenHono on 2017/5/3 0003.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public class ListAdapter extends BaseFragmentPagerAdapter<ListInfo> {
    public ListAdapter(FragmentManager fm, List<ListInfo> mDatas) {
        super(fm, mDatas);
    }

    @Override
    protected Fragment getFragmentItem(int position) {
        return ListContentFragment.newInstance(position);
    }

    @Override
    protected CharSequence getTitle(ListInfo data) {
        return data.getName();
    }
}
