package xyz.renhono.fppplayer.mvp.model;

/**
 * Created by RenHono on 2017/4/24 0024.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public interface BaseModel<T> {
    void netWork(T model);

    void local(T model);

    interface MusicListModel {
        void netWorkMusicList(int id, BaseDataBridge.MusicListData musicListData);
    }

    interface VideoListModel {
        void netWorkVideoList(int id, BaseDataBridge.VideoListData videoListData);
    }

    interface ListModel extends BaseModel<BaseDataBridge.ListData> {
    }
}
