package xyz.renhono.fppplayer.mvp.presenter;

import java.util.List;

import xyz.renhono.fppplayer.mvp.bean.ListInfo;
import xyz.renhono.fppplayer.mvp.model.BaseDataBridge;
import xyz.renhono.fppplayer.mvp.model.BaseModel;
import xyz.renhono.fppplayer.mvp.model.ListModelImpl;
import xyz.renhono.fppplayer.mvp.view.BaseView;

/**
 * Created by RenHono on 2017/5/3 0003.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public class ListPresenterImpl extends BasePresenterImpl<BaseView.TabListView> implements BasePresenter.ListPresenter, BaseDataBridge.ListData {

    private final BaseModel.ListModel listModel;

    public ListPresenterImpl(BaseView.TabListView view) {
        super(view);
        this.listModel = new ListModelImpl();
    }

    @Override
    public void listInit() {
        listModel.local(this);
    }

    @Override
    public void addData(List<ListInfo> datas) {


        view.setData(datas);
    }

    @Override
    public void error() {

    }
}
