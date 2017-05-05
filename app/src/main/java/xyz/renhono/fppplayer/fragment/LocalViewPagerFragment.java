package xyz.renhono.fppplayer.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import butterknife.Bind;
import butterknife.ButterKnife;
import xyz.renhono.fppplayer.R;
import xyz.renhono.fppplayer.adapter.ListAdapter;
import xyz.renhono.fppplayer.mvp.bean.ListInfo;
import xyz.renhono.fppplayer.mvp.bean.MusicBean;
import xyz.renhono.fppplayer.mvp.bean.MusicInfo;
import xyz.renhono.fppplayer.mvp.presenter.BasePresenter;
import xyz.renhono.fppplayer.mvp.presenter.ListPresenterImpl;
import xyz.renhono.fppplayer.mvp.view.BaseView;
import xyz.renhono.fppplayer.utils.LogUtils;
import xyz.renhono.fppplayer.widget.MVPLazyFragment;

/**
 * Created by RenHono on 2017/4/24 0024.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public class LocalViewPagerFragment extends MVPLazyFragment implements BaseView.TabListView {

    @Bind(R.id.tab_layout)
    TabLayout tabLayout;
    @Bind(R.id.viewPager)
    ViewPager viewPager;

    private List<ListInfo> data;
    private ListAdapter listAdapter;

    public static LocalViewPagerFragment getInstance() {
        return new LocalViewPagerFragment();
    }

    @Override
    protected void initActivityCreated() {
//        BasePresenter.ListPresenter listPresenter = new ListPresenterImpl(this);
//        listPresenter.listInit();

        data = new LinkedList<>();

        ListInfo listInfo = new ListInfo();
        List<String> list = new ArrayList<>();

        list.add(0, "音乐列表");
        list.add(1, "视频列表");
        list.add(2, "连接访问");
        list.add(3, "版权页面");
        for (int i = 0; i < 4; i++) {

            listInfo.setId(i);
            listInfo.setName(list.get(i));
            data.add(i, listInfo);
        }
        ;

        LogUtils.i("试试", data.get(3).getName());

        listAdapter = new ListAdapter(getChildFragmentManager(), data);
        viewPager.setAdapter(listAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_viewpager;
    }


    @Override
    public void setData(List<ListInfo> datas) {
//
//        datas = new LinkedList<>();
//        ListInfo listInfo = new ListInfo();
//        List<String> list = new ArrayList<>();
//
//        list.add(0, "音乐列表");
//        list.add(1, "视频列表");
//        list.add(2, "连接访问");
//        list.add(3, "版权页面");
//        for (int i = 0; i < 4; i++) {
//
//            listInfo.setId(i);
//            listInfo.setName(list.get(i));
//            datas.add(i, listInfo);
//        }
//        ;
//
//
//        if (!datas.isEmpty()) {
//
//
//            data.addAll(datas);
//            viewPager.setAdapter(listAdapter);
//            tabLayout.setupWithViewPager(viewPager);
//        }
    }

    @Override
    public void netWorkError() {

    }
}
