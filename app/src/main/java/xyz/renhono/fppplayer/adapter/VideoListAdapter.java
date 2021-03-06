package xyz.renhono.fppplayer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import xyz.renhono.fppplayer.App;
import xyz.renhono.fppplayer.R;
import xyz.renhono.fppplayer.mvp.bean.MusicInfo;
import xyz.renhono.fppplayer.mvp.bean.VideoInfo;

/**
 * Created by RenHono on 2017/5/3 0003.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public class VideoListAdapter extends BaseAdapter {

    private LinkedList<VideoInfo> list;
    private Context context;

    public VideoListAdapter(LinkedList<VideoInfo> list) {
//        this.context = context;
        this.list = list;

//        LogUtils.i("adapter",list.get(0).songName);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view != null) {
            holder = (ViewHolder) view.getTag();
        } else {
            view = LayoutInflater.from(App.getContext()).inflate(R.layout.video_item, parent, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }

        holder.tv2.setText(list.get(position).getFileName());


//        view=LayoutInflater.from(context).inflate(R.layout.music_item,null);
//        TextView textView= (TextView) view.findViewById(R.id.tv2);
//        textView.setText("测试2222");

        return view;
    }


    public void addAll(List<VideoInfo> datas) {
        list.addAll(datas);
        notifyDataSetChanged();
    }

    static class ViewHolder {
        @Bind(R.id.tv1)
        TextView tv1;
        @Bind(R.id.tv2)
        TextView tv2;


        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
