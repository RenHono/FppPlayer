package xyz.renhono.fppplayer.mvp.presenter;

import java.util.List;

import xyz.renhono.fppplayer.activity.JieCaoActivity;
import xyz.renhono.fppplayer.mvp.bean.MusicInfo;
import xyz.renhono.fppplayer.mvp.model.BaseDataBridge;
import xyz.renhono.fppplayer.mvp.model.BaseModel;
import xyz.renhono.fppplayer.mvp.model.MusicListModelImpl;
import xyz.renhono.fppplayer.mvp.view.BaseView;

/**
 * Created by RenHono on 2017/5/4 0004.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public class MusicListPresenterImpl extends BasePresenterImpl<BaseView.MusicView>
        implements BasePresenter.MusicListPresenter, BaseDataBridge.MusicListData {

    private final BaseModel.MusicListModel musicListModel;

    public MusicListPresenterImpl(BaseView.MusicView view) {
        super(view);
        this.musicListModel = new MusicListModelImpl();
    }

    @Override
    public void requestNetWork(int id) {


        musicListModel.netWorkMusicList(id, this);
    }

    @Override
    public void onClick(MusicInfo info) {
        JieCaoActivity.startIntent(1, info.getFileName());

    }

    @Override
    public void addData(List<MusicInfo> datas) {

        view.setData(datas);
    }

    @Override
    public void error() {

    }
}
