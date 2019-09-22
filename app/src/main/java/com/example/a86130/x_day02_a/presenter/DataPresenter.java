package com.example.a86130.x_day02_a.presenter;

import com.example.a86130.x_day02_a.bean.DatasBean;
import com.example.a86130.x_day02_a.model.DataModel;
import com.example.a86130.x_day02_a.view.NetView;

import java.util.List;

/**
 * Created by 86130 on 2019/9/22.
 */

public class DataPresenter implements DataModel.DataCallBack{
    private NetView netView;
    private DataModel dataModel;

    public DataPresenter(NetView netView) {
        this.netView = netView;
        this.dataModel=new DataModel();
    }

    public void insert(DatasBean datasBean) {
        dataModel.insert(datasBean,this);
    }

    public void delete(DatasBean datasBean) {
        dataModel.delete(datasBean,this);
    }

    @Override
    public void onsuccess(List<DatasBean> db) {
        netView.addDatas(2,db);
    }

    @Override
    public void showToast(String str) {
        netView.showToast(2,str);
    }

    public void loadAll() {
        dataModel.loadAll(this);
    }
}
