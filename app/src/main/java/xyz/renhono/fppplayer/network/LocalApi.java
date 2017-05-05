package xyz.renhono.fppplayer.network;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;
import xyz.renhono.fppplayer.mvp.bean.BaseBean;
import xyz.renhono.fppplayer.mvp.bean.MusicBean;
import xyz.renhono.fppplayer.mvp.bean.MusicInfo;
import xyz.renhono.fppplayer.mvp.bean.VideoInfo;

import static xyz.renhono.fppplayer.network.Api.MEDIA;

/**
 * Created by RenHono on 2017/4/24 0024.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public interface LocalApi {

    @GET(MEDIA)
    Observable<BaseBean.BaseMusicListBean> getMusicList(@Query("typex") int typex);

    @GET(MEDIA)
    Observable<MusicBean> getMusicTest(@Query("typex") String typex);

    @GET(MEDIA)
    Observable<BaseBean.BaseVideoListBean> getVideoList(@Query("typex") int typex);


}
