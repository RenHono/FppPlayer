package xyz.renhono.fppplayer.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import xyz.renhono.fppplayer.R;
import xyz.renhono.fppplayer.mvp.bean.BaseBean;
import xyz.renhono.fppplayer.mvp.bean.MusicBean;
import xyz.renhono.fppplayer.network.NetWorkRequest;
import xyz.renhono.fppplayer.network.NetWorkSubscriber;
import xyz.renhono.fppplayer.utils.LogUtils;

public class TestActivity extends AppCompatActivity {

    @Bind(R.id.tvxxx)
    TextView tvxxx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);


        NetWorkRequest.musicTest("1", new NetWorkSubscriber<MusicBean>() {
            @Override
            public void onCompleted() {
                LogUtils.i("musicImpl", "musicdata完成");
            }

            @Override
            public void onError(Throwable e) {
                LogUtils.i("local", e.toString());

            }

            @Override
            public void onNext(MusicBean musicBean) {

                LogUtils.i("local", musicBean.music.get(0).getSongArtist());


            }
        });
    }
}