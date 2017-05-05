package xyz.renhono.fppplayer.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.LinkedList;
import java.util.List;

import butterknife.Bind;
import xyz.renhono.fppplayer.R;
import xyz.renhono.fppplayer.adapter.MusicListAdapter;
import xyz.renhono.fppplayer.adapter.VideoListAdapter;
import xyz.renhono.fppplayer.mvp.bean.MusicInfo;
import xyz.renhono.fppplayer.mvp.bean.VideoInfo;
import xyz.renhono.fppplayer.mvp.presenter.BasePresenter;
import xyz.renhono.fppplayer.mvp.presenter.MusicListPresenterImpl;
import xyz.renhono.fppplayer.mvp.presenter.VideoListPresenterImpl;
import xyz.renhono.fppplayer.mvp.view.BaseView;
import xyz.renhono.fppplayer.utils.LogUtils;
import xyz.renhono.fppplayer.utils.UIUtils;
import xyz.renhono.fppplayer.widget.MVPLazyFragment;

/**
 * Created by RenHono on 2017/5/3 0003.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public class VideoFragment extends MVPLazyFragment implements BaseView.VideoView {

    @Bind(R.id.list_item_x)
    ListView listItemX;

    private VideoListAdapter adapter;
    private BasePresenter.VideoListPresenter videoListPresenter;
    private LinkedList<VideoInfo> list = new LinkedList<>();

    public static Fragment newInstance(int index) {
        Bundle bundle = new Bundle();
        VideoFragment fragment = new VideoFragment();
        bundle.putInt(FRAGMENT_INDEX, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    protected void initActivityCreated() {


        videoListPresenter = new VideoListPresenterImpl(this);
        videoListPresenter.requestNetWork(2);

//        LinkedList<MusicInfo> list = new LinkedList<>();


        adapter = new VideoListAdapter(list);
        listItemX.setAdapter(adapter);


        setLoad();

//        adapter.setOnItemClickListener(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.list_item;
    }


    @Override
    public void setData(List<VideoInfo> datasx) {

        LogUtils.i("frag", "setDATA");


        adapter.addAll(datasx);


        LogUtils.i("frag", datasx.get(1).getFileName());

        listItemX.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                videoListPresenter.onClick(datasx.get(position));
            }
        });

    }

    @Override
    public void netWorkError() {
        Toast(UIUtils.getString(R.string.network_error));
    }
}
