package xyz.renhono.fppplayer.mvp.presenter;

import xyz.renhono.fppplayer.R;
import xyz.renhono.fppplayer.mvp.view.BaseView;

/**
 * Created by RenHono on 2017/5/3 0003.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public class MainViewPresenterImpl extends BasePresenterImpl<BaseView.MainView> implements BasePresenter.MainViewPresenter {
    public MainViewPresenterImpl(BaseView.MainView view) {
        super(view);
    }

    @Override
    public void switchId(int id) {
        switch (id) {
            case R.id.navigation_item_music:
                view.switchMusic();
                break;
            case R.id.navigation_item_video:
                view.switchVideo();
                break;
            case R.id.navigation_item_url:
                view.switchLocal();
                break;
            case R.id.navigation_about:
                view.switchAbout();
                break;
        }
    }
}
