package wangjin.com.wanandroid.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import wangjin.com.wanandroid.R;
import wangjin.com.wanandroid.bean.ArticlesListBean;
import wangjin.com.wanandroid.utils.LogUtils;

public class ArticlesListRecyclerAdapter extends RecyclerView.Adapter<ArticlesListRecyclerAdapter.ArticlesRecyclerHolder> {
    private List<ArticlesListBean.DataBean.DatasBean> datasBeans;

    public ArticlesListRecyclerAdapter(List<ArticlesListBean.DataBean.DatasBean> bean) {
       this.datasBeans = bean;
    }

    @NonNull
    @Override
    public ArticlesListRecyclerAdapter.ArticlesRecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_articles_recycler_item,parent,false);
        ArticlesRecyclerHolder holder = new ArticlesRecyclerHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ArticlesListRecyclerAdapter.ArticlesRecyclerHolder holder, int position) {
        holder.title.setText(datasBeans.get(position).getTitle());
        holder.author.setText(datasBeans.get(position).getAuthor());
        holder.source.setText(datasBeans.get(position).getSuperChapterName());
        holder.time.setText(datasBeans.get(position).getNiceDate());
    }

    public void setRefresh(ArticlesListBean.DataBean beans) {
        if(datasBeans == null) {
            datasBeans = new ArrayList<>();
        }
        datasBeans.clear();
        datasBeans.addAll(beans.getDatas());
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return datasBeans.size();
    }

    class ArticlesRecyclerHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.iv_con)
        ImageView imageView;
        @BindView(R.id.tv_author)
        TextView author;
        @BindView(R.id.tv_title)
        TextView title;
        @BindView(R.id.tv_source)
        TextView source;
        @BindView(R.id.tv_time)
        TextView time;
        private ArticlesRecyclerHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
