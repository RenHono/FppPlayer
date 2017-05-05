package xyz.renhono.fppplayer.activity;

import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;
import xyz.renhono.fppplayer.R;
import xyz.renhono.fppplayer.constant.Constant;
import xyz.renhono.fppplayer.network.Api;
import xyz.renhono.fppplayer.utils.ActivityUtils;
import xyz.renhono.fppplayer.utils.LogUtils;
import xyz.renhono.fppplayer.widget.BaseActivity;

public class JieCaoActivity extends BaseActivity {


    @Bind(R.id.jiecao)
    JCVideoPlayerStandard jiecao;
    @Bind(R.id.tv_content)
    TextView tvContent;

    private int id;
    private String file;

    public static void startIntent(int id, String file) {
        Bundle bundle = new Bundle();
        bundle.putInt("id", id);
        bundle.putString("file", file);
        ActivityUtils.startActivity(JieCaoActivity.class, bundle);
    }


    @Override
    protected int getLayoutId() {
        return R.layout.activity_jie_cao;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getBundle();
        init();

    }

    private void init() {
        switch (id) {
            case 1:

                jiecao.setUp(Api.BASE_URL + Constant.MUSIC + file, JCVideoPlayer.SCREEN_LAYOUT_NORMAL);
                tvContent.setText(file);
                break;
            case 2:
                jiecao.setUp(Api.BASE_URL + Constant.VIDEO + file, JCVideoPlayer.SCREEN_LAYOUT_NORMAL);
                tvContent.setText(file);
                break;

            case 3:
                LogUtils.i("playurl", file);

                jiecao.setUp(file, JCVideoPlayer.SCREEN_LAYOUT_NORMAL);
        }

//        LogUtils.i("playurl", Api.BASE_URL + Constant.MUSIC + file);

    }

    private void getBundle() {
        Bundle bundle = getIntent().getExtras();
        if (null != bundle && !bundle.isEmpty()) {
            id = bundle.getInt("id");
            file = bundle.getString("file");
        }
    }


    @Override
    public void onBackPressed() {
        if (JCVideoPlayer.backPress()) {

            return;
        }
        super.onBackPressed();
    }

    @Override
    protected void onPause() {
        super.onPause();
        JCVideoPlayer.releaseAllVideos();
    }
}
