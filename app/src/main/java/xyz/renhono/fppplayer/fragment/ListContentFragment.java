package xyz.renhono.fppplayer.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import butterknife.Bind;
import butterknife.ButterKnife;
import xyz.renhono.fppplayer.R;
import xyz.renhono.fppplayer.widget.MVPLazyFragment;

/**
 * Created by RenHono on 2017/5/3 0003.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public class ListContentFragment extends MVPLazyFragment {

    @Bind(R.id.list_item_x)
    ListView listItemX;

    public static Fragment newInstance(int index) {
        Bundle bundle = new Bundle();
        ListContentFragment fragment = new ListContentFragment();
        bundle.putInt(FRAGMENT_INDEX, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    protected void initActivityCreated() {


    }

    @Override
    protected int getLayoutId() {
        return R.layout.list_item;
    }


}
