package xyz.renhono.fppplayer.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.LinkedList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import xyz.renhono.fppplayer.R;
import xyz.renhono.fppplayer.adapter.MusicListAdapter;
import xyz.renhono.fppplayer.mvp.bean.MusicInfo;
import xyz.renhono.fppplayer.mvp.presenter.BasePresenter;
import xyz.renhono.fppplayer.mvp.presenter.MusicListPresenterImpl;
import xyz.renhono.fppplayer.mvp.view.BaseView;
import xyz.renhono.fppplayer.utils.LogUtils;
import xyz.renhono.fppplayer.utils.UIUtils;
import xyz.renhono.fppplayer.widget.MVPLazyFragment;

/**
 * Created by RenHono on 2017/5/3 0003.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public class MusicFragment extends MVPLazyFragment implements BaseView.MusicView {

    @Bind(R.id.list_item_x)
    ListView listItemX;

    private MusicListAdapter adapter;
    private BasePresenter.MusicListPresenter musicListPresenter;
    private LinkedList<MusicInfo> list = new LinkedList<>();

    public static Fragment newInstance(int index) {
        Bundle bundle = new Bundle();
        MusicFragment fragment = new MusicFragment();
        bundle.putInt(FRAGMENT_INDEX, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    protected void initActivityCreated() {


        musicListPresenter = new MusicListPresenterImpl(this);
        musicListPresenter.requestNetWork(1);

//        LinkedList<MusicInfo> list = new LinkedList<>();


        adapter = new MusicListAdapter(list);
        listItemX.setAdapter(adapter);


        setLoad();

//        adapter.setOnItemClickListener(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.list_item;
    }


    @Override
    public void setData(List<MusicInfo> datasx) {

        LogUtils.i("frag", "setDATA");


        adapter.addAll(datasx);


        LogUtils.i("frag", datasx.get(1).getSongName());

        listItemX.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                musicListPresenter.onClick(datasx.get(position));
            }
        });

    }

    @Override
    public void netWorkError() {
        Toast(UIUtils.getString(R.string.network_error));
    }
}
