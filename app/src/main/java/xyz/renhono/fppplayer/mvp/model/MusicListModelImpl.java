package xyz.renhono.fppplayer.mvp.model;

import xyz.renhono.fppplayer.mvp.bean.BaseBean;
import xyz.renhono.fppplayer.mvp.bean.MusicBean;
import xyz.renhono.fppplayer.mvp.bean.MusicInfo;
import xyz.renhono.fppplayer.network.NetWorkRequest;
import xyz.renhono.fppplayer.network.NetWorkSubscriber;
import xyz.renhono.fppplayer.utils.LogUtils;

/**
 * Created by RenHono on 2017/4/24 0024.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public class MusicListModelImpl implements BaseModel.MusicListModel {

    @Override
    public void netWorkMusicList(int id, final BaseDataBridge.MusicListData musicListData) {

        NetWorkRequest.musicList(id, new NetWorkSubscriber<BaseBean.BaseMusicListBean>() {
            @Override
            public void onCompleted() {
                LogUtils.i("musicImpl", "musicdata完成");
            }

            @Override
            public void onError(Throwable e) {
                musicListData.error();
            }

            @Override
            public void onNext(BaseBean.BaseMusicListBean baseMusicListBean) {


//                LogUtils.i("local",baseMusicListBean.getInfo());
                musicListData.addData(baseMusicListBean.getInfo());

            }
        });
    }
}
