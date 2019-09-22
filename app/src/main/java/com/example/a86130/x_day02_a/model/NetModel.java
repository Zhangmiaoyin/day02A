package com.example.a86130.x_day02_a.model;


import android.util.Log;

import com.example.a86130.x_day02_a.ApiService;
import com.example.a86130.x_day02_a.bean.DatasBean;
import com.example.a86130.x_day02_a.bean.ProjectBean;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 86130 on 2019/9/20.
 */

public class NetModel {
    public void loadData(final NetCallBack netCallBack) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiService.url)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiService apiService = retrofit.create(ApiService.class);
        Observable<ProjectBean> geturl = apiService.geturl();
        geturl.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ProjectBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ProjectBean projectBean) {
                        if(projectBean!=null&&projectBean.getDatas()!=null){
                            ArrayList<DatasBean> datas = (ArrayList<DatasBean>) projectBean.getDatas();
                            Log.i("1111",datas.toString());
                            netCallBack.onSccess(datas);
                        }else{
                            netCallBack.onFlia("请求数据失败");
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                         netCallBack.onFlia("数据请求异常");
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }

    public interface  NetCallBack{
      void onSccess(ArrayList<DatasBean> datasBean);
      void onFlia(String str);
    }
}
