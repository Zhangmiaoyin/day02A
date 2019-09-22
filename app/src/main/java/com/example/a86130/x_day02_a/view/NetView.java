package com.example.a86130.x_day02_a.view;

import com.example.a86130.x_day02_a.bean.DatasBean;
import java.util.List;

/**
 * Created by 86130 on 2019/9/20.
 */

public interface NetView {
    void addDatas(int tag,List<DatasBean> db);
    void showToast(int tag,String str);
}
