package xyz.renhono.fppplayer.mvp.presenter;

import java.util.List;

import xyz.renhono.fppplayer.activity.JieCaoActivity;
import xyz.renhono.fppplayer.mvp.bean.MusicInfo;
import xyz.renhono.fppplayer.mvp.bean.VideoInfo;
import xyz.renhono.fppplayer.mvp.model.BaseDataBridge;
import xyz.renhono.fppplayer.mvp.model.BaseModel;
import xyz.renhono.fppplayer.mvp.model.MusicListModelImpl;
import xyz.renhono.fppplayer.mvp.model.VideoListModelImpl;
import xyz.renhono.fppplayer.mvp.view.BaseView;

/**
 * Created by RenHono on 2017/5/4 0004.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public class VideoListPresenterImpl extends BasePresenterImpl<BaseView.VideoView>
        implements BasePresenter.VideoListPresenter, BaseDataBridge.VideoListData {

    private final BaseModel.VideoListModel videoListModel;

    public VideoListPresenterImpl(BaseView.VideoView view) {
        super(view);
        this.videoListModel = new VideoListModelImpl();
    }

    @Override
    public void requestNetWork(int id) {


        videoListModel.netWorkVideoList(id, this);
    }

    @Override
    public void onClick(VideoInfo info) {
        JieCaoActivity.startIntent(2, info.getFileName());

    }

    @Override
    public void addData(List<VideoInfo> datas) {

        view.setData(datas);
    }

    @Override
    public void error() {

    }
}
