package xyz.renhono.fppplayer.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;
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

public class UrlFragment extends MVPLazyFragment {


    @Bind(R.id.et_url)
    EditText etUrl;
    @Bind(R.id.btn_play)
    Button btnPlay;

    public static Fragment newInstance(int index) {
        Bundle bundle = new Bundle();
        UrlFragment fragment = new UrlFragment();
        bundle.putInt(FRAGMENT_INDEX, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    protected void initActivityCreated() {


        setLoad();

//        adapter.setOnItemClickListener(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.url_main;
    }


    @OnClick(R.id.btn_play)
    public void onViewClicked() {

        LogUtils.i("playurl", etUrl.getText().toString());

        JieCaoActivity.startIntent(3, etUrl.getText().toString());
    }
}
