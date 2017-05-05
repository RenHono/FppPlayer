package xyz.renhono.fppplayer.mvp.presenter;

import xyz.renhono.fppplayer.mvp.bean.MusicInfo;
import xyz.renhono.fppplayer.mvp.bean.VideoInfo;

/**
 * Created by RenHono on 2017/4/24 0024.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public interface BasePresenter {

    interface MusicListPresenter {
        void requestNetWork(int id);

        void onClick(MusicInfo info);
    }

    interface VideoListPresenter {
        void requestNetWork(int id);

        void onClick(VideoInfo info);
    }

    interface MainViewPresenter {
        void switchId(int id);
    }

    interface ListPresenter {
        void listInit();
    }
}
