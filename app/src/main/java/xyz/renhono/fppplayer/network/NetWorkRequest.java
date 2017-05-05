package xyz.renhono.fppplayer.network;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import xyz.renhono.fppplayer.mvp.bean.BaseBean;
import xyz.renhono.fppplayer.mvp.bean.MusicBean;
import xyz.renhono.fppplayer.utils.RxUtils;

/**
 * Created by RenHono on 2017/4/24 0024.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public class NetWorkRequest {
    private static <M> void addObservable(Observable<M> observable, Subscriber<M> subscriber) {
        RxUtils.getInstance().addSubscription(observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber));
    }

    public static void musicList(int id, Subscriber<BaseBean.BaseMusicListBean> subscriber) {
        addObservable(Network.getLocalApi().getMusicList(id), subscriber);
    }

    public static void musicTest(String s, Subscriber<MusicBean> subscriber) {
        addObservable(Network.getLocalApi().getMusicTest(s), subscriber);
    }

    public static void videoList(int id, Subscriber<BaseBean.BaseVideoListBean> subscriber) {
        addObservable(Network.getLocalApi().getVideoList(id), subscriber);
    }
}
