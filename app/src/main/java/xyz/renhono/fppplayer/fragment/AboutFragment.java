package xyz.renhono.fppplayer.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.OnClick;
import xyz.renhono.fppplayer.R;
import xyz.renhono.fppplayer.activity.JieCaoActivity;
import xyz.renhono.fppplayer.utils.LogUtils;
import xyz.renhono.fppplayer.widget.MVPLazyFragment;

/**
 * Created by RenHono on 2017/5/3 0003.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public class AboutFragment extends MVPLazyFragment {


    public static Fragment newInstance(int index) {
        Bundle bundle = new Bundle();
        AboutFragment fragment = new AboutFragment();
        bundle.putInt(FRAGMENT_INDEX, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    protected void initActivityCreated() {


        setLoad();

    }

    @Override
    protected int getLayoutId() {
        return R.layout.about_main;
    }


}
