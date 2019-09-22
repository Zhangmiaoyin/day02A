package com.example.a86130.x_day02_a.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.a86130.x_day02_a.BaseApp;
import com.example.a86130.x_day02_a.R;
import com.example.a86130.x_day02_a.bean.DatasBean;
import com.example.a86130.x_day02_a.db.DatasBeanDao;

import java.util.ArrayList;

/**
 * Created by 86130 on 2019/9/20.
 */

public class MyAdapter extends RecyclerView.Adapter {
    private ArrayList<DatasBean> collectBeans;
    private ArrayList<DatasBean> projectBeans;
    private Context context;
    private String TAG = "MyAdapter";

    public MyAdapter(ArrayList<DatasBean> projectBeans, ArrayList<DatasBean> collectBeans, Context context) {
        this.collectBeans = collectBeans;
        this.projectBeans = projectBeans;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(context,R.layout.recycler_layout,null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((MyViewHolder)holder).title.setText(projectBeans.get(position).getTitle());
        ((MyViewHolder)holder).anouth.setText(projectBeans.get(position).getAuthor());
        RequestOptions options = new RequestOptions().circleCrop();
        Glide.with(context).load(projectBeans.get(position).getAvatar()).apply(options).into(((MyViewHolder) holder).iv);
        MyViewHolder holder1 = (MyViewHolder) holder;
        final Button mbt = holder1.bt;
        Log.i(TAG, "onBindViewHolder:  collectBeans.size() :  "+collectBeans.size());
        for (int i = 0; i <collectBeans.size() ; i++) {
            if(collectBeans.get(i).getId().equals(projectBeans.get(position).getId())){
                Log.i(TAG, "onBindViewHolder:   position:  "+position);
                mbt.setText("取消");
            }
        }
        mbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 if(mbt.getText().toString().equals("关注")){
                     mbt.setText("取消");
                 }else{
                     mbt.setText("关注");
                 }
                Log.i(TAG, "onClick: "+position+"___"+mbt.getText().toString());
                onclick.onclick(position, mbt.getText().toString());
            }
        });
    }

    @Override
    public int getItemCount() {
        return projectBeans.size();
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView iv;
        private TextView title;
        private TextView anouth;
        private Button bt;

        public MyViewHolder(View view) {
            super(view);
            iv = view.findViewById(R.id.iv);
            title = view.findViewById(R.id.title);
            anouth = view.findViewById(R.id.anouth);
            bt = view.findViewById(R.id.bt);
        }
    }
    public interface Onclick{
        void onclick(int position,String bt);
    }
    private Onclick onclick;

    public void setOnclick(Onclick onclick) {
        this.onclick = onclick;
    }

}
