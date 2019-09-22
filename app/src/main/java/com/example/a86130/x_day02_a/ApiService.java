package com.example.a86130.x_day02_a;

import com.example.a86130.x_day02_a.bean.ProjectBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by 86130 on 2019/9/20.
 */

public interface ApiService {
    String url="http://static.owspace.com/";
    @GET("?c=api&a=getList&page_id=0")
    Observable<ProjectBean> geturl();
}
