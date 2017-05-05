package xyz.renhono.fppplayer.mvp.model;

import java.util.List;

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

public interface BaseDataBridge<T> {

    void addData(List<T> datas);

    void error();

    interface MusicListData extends BaseDataBridge<MusicInfo> {

    }

    interface VideoListData extends BaseDataBridge<VideoInfo> {
    }

    interface ListData extends BaseDataBridge<ListInfo> {
    }
}
