package com.example.a86130.x_day02_a;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.a86130.x_day02_a.adapter.MyAdapter;
import com.example.a86130.x_day02_a.bean.DatasBean;
import com.example.a86130.x_day02_a.bean.ProjectBean;
import com.example.a86130.x_day02_a.presenter.DataPresenter;
import com.example.a86130.x_day02_a.presenter.NetPresenter;
import com.example.a86130.x_day02_a.view.NetView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NetView {

    private Toolbar mToolbar;
    private RecyclerView mRecycler;
    private ArrayList<DatasBean> projectBeans;
    private ArrayList<DatasBean> collectDatas;
    private MyAdapter myAdapter;
    private NetPresenter netPresenter;
    private DataPresenter dataPresenter;
    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        netPresenter = new NetPresenter(this);//请求数据
        dataPresenter = new DataPresenter(this);//查询数据库
        collectDatas = new ArrayList<>();//数据库查询出来的数据
        dataPresenter.loadAll();//数据库查询数据
        initView();
        initRecy();
        initData();
    }

    private void initData() {
        netPresenter.loadData();//请求数据
    }

    //初始化recycler
    private void initRecy() {
        mRecycler.setLayoutManager(new LinearLayoutManager(this));
        projectBeans = new ArrayList<>();//請求昂儸的數據
        myAdapter = new MyAdapter(projectBeans, collectDatas,this);
        mRecycler.setAdapter(myAdapter);
        myAdapter.setOnclick(new MyAdapter.Onclick() {
            @Override
            public void onclick(int position, String bt) {
                if (bt.equals("取消")) {//关注后，变成取消
                    Log.i(TAG, "onclick: " + position + bt);
                    DatasBean datasBean = projectBeans.get(position);
                    dataPresenter.insert(datasBean);
                    Toast.makeText(MainActivity.this, "插入成功", Toast.LENGTH_SHORT).show();
                } else {
                    Log.i(TAG, "onclick: " + position + bt);
                    DatasBean datasBean = projectBeans.get(position);
                    dataPresenter.delete(datasBean);
                    Toast.makeText(MainActivity.this, "取消關注", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void initView() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mRecycler = (RecyclerView) findViewById(R.id.recycler);
        //toolbar
        mToolbar.setTitle("列表");
        mToolbar.setTitleMarginStart(440);
        setSupportActionBar(mToolbar);
    }


    @Override
    public void addDatas(int tag, List<DatasBean> db) {
        if (tag==1){//请求的数据
            Log.i(TAG, "addDatas: "+db.size());
            projectBeans.addAll(db);
        }else{//查询数据库的数据
            Log.i(TAG, "addDatas: "+db.size());
            collectDatas.addAll(db);
        }
        myAdapter.notifyDataSetChanged();
    }

    @Override
    public void showToast(int tag, String str) {
        if (tag==1){
            Toast.makeText(this, "请求网络数据："+str, Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "查询数据库："+str, Toast.LENGTH_SHORT).show();
        }
    }
}
