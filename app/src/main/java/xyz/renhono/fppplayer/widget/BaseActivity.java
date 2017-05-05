package xyz.renhono.fppplayer.widget;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import butterknife.ButterKnife;
import xyz.renhono.fppplayer.utils.ActivityCollector;
import xyz.renhono.fppplayer.utils.LogUtils;
import xyz.renhono.fppplayer.utils.RxUtils;

/**
 * Created by RenHono on 2017/4/20 0020.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        LogUtils.i("BaseActivity", getClass().getSimpleName());
        ButterKnife.bind(this);

    }

    protected void Toast(String content) {

        Toast.makeText(this, content, Toast.LENGTH_LONG).show();
    }

    protected abstract int getLayoutId();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
        RxUtils.getInstance().unSubscription();

    }
}
