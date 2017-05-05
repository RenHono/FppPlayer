package xyz.renhono.fppplayer.mvp.bean;

import java.util.List;

/**
 * Created by RenHono on 2017/4/24 0024.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public class BaseBean<T> {

    private List<T> local;


    public List<T> getInfo() {
        return local;
    }

    public void setInfo(List<T> local) {
        this.local = local;
    }

    public class BaseMusicListBean extends BaseBean<MusicInfo> {
    }

    public class BaseVideoListBean extends BaseBean<VideoInfo> {
    }

}
