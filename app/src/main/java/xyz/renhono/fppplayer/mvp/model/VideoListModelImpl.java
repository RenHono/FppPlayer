package xyz.renhono.fppplayer.mvp.model;

import xyz.renhono.fppplayer.mvp.bean.BaseBean;
import xyz.renhono.fppplayer.network.NetWorkRequest;
import xyz.renhono.fppplayer.network.NetWorkSubscriber;
import xyz.renhono.fppplayer.utils.LogUtils;

/**
 * Created by RenHono on 2017/4/24 0024.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public class VideoListModelImpl implements BaseModel.VideoListModel {

    @Override
    public void netWorkVideoList(int id, final BaseDataBridge.VideoListData videoListData) {

        NetWorkRequest.videoList(id, new NetWorkSubscriber<BaseBean.BaseVideoListBean>() {
            @Override
            public void onCompleted() {
                LogUtils.i("videoImpl", "videodata完成");
            }

            @Override
            public void onError(Throwable e) {
                videoListData.error();
            }

            @Override
            public void onNext(BaseBean.BaseVideoListBean baseVideoListBean) {


                videoListData.addData(baseVideoListBean.getInfo());

            }
        });
    }
}
