package xyz.renhono.fppplayer.mvp.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import xyz.renhono.fppplayer.mvp.bean.ListInfo;

/**
 * Created by RenHono on 2017/5/3 0003.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public class ListModelImpl implements BaseModel.ListModel {


    @Override
    public void netWork(BaseDataBridge.ListData model) {

    }

    @Override
    public void local(BaseDataBridge.ListData model) {


        List<ListInfo> data = new LinkedList<>();
        ListInfo listInfo = new ListInfo();
        List<String> list = new ArrayList<>();

        list.add(0, "音乐列表");
        list.add(1, "视频列表");
        list.add(2, "连接访问");
        list.add(3, "版权页面");

        for (int i = 0; i < 4; i++) {

            listInfo.setId(i);
            listInfo.setName(list.get(i));
            data.add(i, listInfo);
        }
        ;

        model.addData(data);

    }
}
