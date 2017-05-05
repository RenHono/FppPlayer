package xyz.renhono.fppplayer.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import butterknife.Bind;
import xyz.renhono.fppplayer.R;
import xyz.renhono.fppplayer.fragment.AboutFragment;
import xyz.renhono.fppplayer.fragment.LocalViewPagerFragment;
import xyz.renhono.fppplayer.fragment.MusicFragment;
import xyz.renhono.fppplayer.fragment.UrlFragment;
import xyz.renhono.fppplayer.fragment.VideoFragment;
import xyz.renhono.fppplayer.mvp.presenter.BasePresenter;
import xyz.renhono.fppplayer.mvp.presenter.MainViewPresenterImpl;
import xyz.renhono.fppplayer.mvp.view.BaseView;
import xyz.renhono.fppplayer.utils.ActivityCollector;
import xyz.renhono.fppplayer.utils.RxUtils;
import xyz.renhono.fppplayer.utils.UIUtils;
import xyz.renhono.fppplayer.widget.BaseActivity;

public class MainActivity extends BaseActivity implements NavigationView.OnNavigationItemSelectedListener, BaseView.MainView {
    @Bind(R.id.toolBar)
    Toolbar toolBar;

    @Bind(R.id.navigation_view)
    NavigationView navigationView;

    @Bind(R.id.dl_layout)
    DrawerLayout drawerLayout;

    private long exitTime = 0;

    private BasePresenter.MainViewPresenter mainViewPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();

    }

    private void init() {
        toolBar.setTitle(UIUtils.getString(R.string.navigation_music));
        setSupportActionBar(toolBar);
        mainViewPresenter = new MainViewPresenterImpl(this);
        navigationView.setNavigationItemSelectedListener(this);
        switchMusic();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    void replaceFragment(Fragment fragmentx) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, fragmentx).commit();
    }

    @Override
    public void switchMusic() {

        replaceFragment(MusicFragment.newInstance(1));
    }


    @Override
    public void switchVideo() {
        replaceFragment(VideoFragment.newInstance(2));

    }

    @Override
    public void switchLocal() {
        replaceFragment(UrlFragment.newInstance(3));
    }

    @Override
    public void switchAbout() {
        replaceFragment(AboutFragment.newInstance(4));
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        toolBar.setTitle(item.getTitle());
        mainViewPresenter.switchId(item.getItemId());
        drawerLayout.closeDrawers();
        return true;
    }

    @Override
    public void onBackPressed() {


        if ((System.currentTimeMillis() - exitTime) > 2000) {
            Toast.makeText(getApplicationContext(), UIUtils.getString(R.string.exit_app), Toast.LENGTH_LONG).show();
            exitTime = System.currentTimeMillis();
        } else {
            ActivityCollector.removeAllActivity();
            RxUtils.getInstance().clearSubscription();
            super.onBackPressed();
        }
    }
}
