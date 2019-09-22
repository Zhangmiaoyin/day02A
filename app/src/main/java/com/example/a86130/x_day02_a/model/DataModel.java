package com.example.a86130.x_day02_a.model;

import com.example.a86130.x_day02_a.BaseApp;
import com.example.a86130.x_day02_a.bean.DatasBean;
import com.example.a86130.x_day02_a.db.DatasBeanDao;
import java.util.List;

/**
 * Created by 86130 on 2019/9/22.
 */

public class DataModel {
    public void insert(DatasBean db, DataCallBack dataCallBack) {
        try {
            DatasBeanDao datasBeanDao = BaseApp.getInstance().getDaoSession().getDatasBeanDao();
            datasBeanDao.insertOrReplace(db);
            dataCallBack.showToast("插入成功");
        } catch (Exception e) {
            e.printStackTrace();
            dataCallBack.showToast("插入异常");
        }
    }

    public void delete(DatasBean datasBean, DataCallBack dataCallBack) {
        try {
            DatasBeanDao datasBeanDao = BaseApp.getInstance().getDaoSession().getDatasBeanDao();
            datasBeanDao.delete(datasBean);
            dataCallBack.showToast("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            dataCallBack.showToast("删除异常");
        }
    }

    public void loadAll(DataCallBack dataCallBack) {
        DatasBeanDao datasBeanDao = null;
        try {
            datasBeanDao = BaseApp.getInstance().getDaoSession().getDatasBeanDao();
            List<DatasBean> beans = datasBeanDao.loadAll();
            dataCallBack.onsuccess(beans);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public interface DataCallBack{
        void onsuccess(List<DatasBean> datasBeans);
        void showToast(String str);
    }
}
