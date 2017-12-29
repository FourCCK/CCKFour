package com.cck.FourTeam_Kotlin.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cck.FourTeam_Kotlin.R;
import com.cck.FourTeam_Kotlin.VideoActivity;
import com.cck.FourTeam_Kotlin.bean.find2Bean;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by C-PC on 2017/12/28.
 */

public class Find2Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private Context context;
    private List<find2Bean.ItemListBean> list;

    public Find2Adapter(Context context, List<find2Bean.ItemListBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.findxqitem,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder= (MyViewHolder) holder;
        final String playUrl = list.get(position).getData().getPlayUrl();
        final String title = list.get(position).getData().getTitle();
        final String description = list.get(position).getData().getDescription();
        Picasso.with(context).load(list.get(position).getData().getCover().getFeed()).into(myViewHolder.findxqtu);
//        Uri parse = Uri.parse(playUrl);
//           myViewHolder.findxqtu.setImageURI(parse);
        myViewHolder.findxqnamee.setText(list.get(position).getData().getTitle());
        myViewHolder.name.setText(list.get(position).getData().getCategory());
        myViewHolder.miao.setText(list.get(position).getData().getDuration()+"");
        myViewHolder.rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, VideoActivity.class);
                intent.putExtra("url",playUrl);
                intent.putExtra("title",title);
                intent.putExtra("description",description);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder {

        private final ImageView findxqtu;
        private final TextView findxqnamee;
        private final TextView name;
        private final TextView miao;
        private final RelativeLayout rl;

        public MyViewHolder(View itemView) {
            super(itemView);
            findxqtu = itemView.findViewById(R.id.findxqtu);
            findxqnamee = itemView.findViewById(R.id.findxqnamee);
            name = itemView.findViewById(R.id.name);
            miao = itemView.findViewById(R.id.miao);
            rl = itemView.findViewById(R.id.rl);
        }
    }
}
