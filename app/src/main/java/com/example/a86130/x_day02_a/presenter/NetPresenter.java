package com.example.a86130.x_day02_a.presenter;

import com.example.a86130.x_day02_a.bean.DatasBean;
import com.example.a86130.x_day02_a.model.NetModel;
import com.example.a86130.x_day02_a.view.NetView;

import java.util.ArrayList;

/**
 * Created by 86130 on 2019/9/20.
 */

public class NetPresenter implements NetModel.NetCallBack {
    private NetView netView;
    private NetModel netModel;

    public NetPresenter(NetView netView) {
        this.netView = netView;
        this.netModel = new NetModel();
    }

    public void loadData() {
        netModel.loadData(this);
    }

    @Override
    public void onSccess(ArrayList<DatasBean> datasBean) {
        netView.addDatas(1,datasBean);
    }

    @Override
    public void onFlia(String str) {
        netView.showToast(1,str);
    }
}
