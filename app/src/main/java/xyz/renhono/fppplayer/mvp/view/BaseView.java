package xyz.renhono.fppplayer.mvp.view;

import java.util.List;
import java.util.Map;

import xyz.renhono.fppplayer.mvp.bean.ListInfo;
import xyz.renhono.fppplayer.mvp.bean.MusicBean;
import xyz.renhono.fppplayer.mvp.bean.MusicInfo;
import xyz.renhono.fppplayer.mvp.bean.VideoBean;
import xyz.renhono.fppplayer.mvp.bean.VideoInfo;

/**
 * Created by RenHono on 2017/4/24 0024.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public interface BaseView<T> {
    void setData(List<T> datas);

    void netWorkError();

    interface MainView {


        void switchMusic();

        void switchVideo();

        void switchLocal();

        void switchAbout();

//        void switchMusic();
//
//        void switchVideo();
//
//        void switchUrl();
//
//        void switchAbout();
    }

    interface MusicView extends BaseView<MusicInfo> {

    }

    interface TabListView extends BaseView<ListInfo> {
    }

    interface VideoView extends BaseView<VideoInfo> {

    }

}
