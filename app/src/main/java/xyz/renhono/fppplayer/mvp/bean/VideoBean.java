package xyz.renhono.fppplayer.mvp.bean;

import java.util.List;

/**
 * Created by RenHono on 2017/4/24 0024.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public class VideoBean {

    public List<VideoListBean> video;

    public static class VideoListBean {
        /**
         * fileName : 2b.MP4
         * fileSize : 5885kb
         */

        public String fileName;
        public String fileSize;
    }
}
