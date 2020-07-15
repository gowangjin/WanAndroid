package wangjin.com.wanandroid.fragment;

import android.os.Bundle;
import android.util.Log;


import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnLoadMoreListener;
import com.scwang.smart.refresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import wangjin.com.wanandroid.R;

import wangjin.com.wanandroid.adapter.ArticlesListRecyclerAdapter;
import wangjin.com.wanandroid.bean.ArticlesListBean;
import wangjin.com.wanandroid.mvp.base.BaseMvpFragment;
import wangjin.com.wanandroid.mvp.contract.IHomeFragmentContract;
import wangjin.com.wanandroid.mvp.presenter.FragmentHomePresenter;
import wangjin.com.wanandroid.utils.ConstantUtils;
import wangjin.com.wanandroid.utils.LogUtils;


public class HomeFragment extends BaseMvpFragment<IHomeFragmentContract.IFragmentHomeView,IHomeFragmentContract.IFragmentHomePresenter> implements IHomeFragmentContract.IFragmentHomeView  {
    @BindView(R.id.rl_main)
    RecyclerView mRecyclerView;
    @BindView(R.id.home_refreshLayout)
    RefreshLayout refreshLayout;
    private int totalPageCount = 0; //记录首页总共会返回多少页数据
    private int currPage = 0; //记录当前页面
    private List<ArticlesListBean.DataBean.DatasBean> mArticlesList = new ArrayList<>();  //转载首页数据
    private ArticlesListRecyclerAdapter articlesListRecyclerAdapter;
    @Override
    protected IHomeFragmentContract.IFragmentHomePresenter createPresenter() {
        return new FragmentHomePresenter();
    }

    @Override
    public int getLayout() {
        return R.layout.fragment_home;
    }

    @Override
    public void initView() {
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        LogUtils.e("initData");
        mPresenter.getHomeList(ConstantUtils.TYPE_FIRST);
        handleLoadData();
    }

    @Override
    public void getMainListSuccess(ArticlesListBean dataBean, int type) {
        if(dataBean != null) {
            totalPageCount = dataBean.getData().getPageCount();
            currPage = dataBean.getData().getCurPage();
            if(type == ConstantUtils.TYPE_REFRESH || type == ConstantUtils.TYPE_FIRST) {
                mArticlesList.clear();
                mArticlesList.addAll(dataBean.getData().getDatas());
                if(articlesListRecyclerAdapter == null) {
                    articlesListRecyclerAdapter = new ArticlesListRecyclerAdapter(mArticlesList);
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
                            mRecyclerView.setAdapter(articlesListRecyclerAdapter);
                        }
                    });
                } else {
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            articlesListRecyclerAdapter.setRefresh(dataBean.getData());
//
                        }
                    });
                }
                refreshLayout.finishRefresh();
            }
        }
    }

    /**
     *处理SmartRefreshLayout的上拉刷新,下拉加载数据事件
     */
    private void handleLoadData() {
        //下拉监听
        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                currPage = 0;
                LogUtils.d("下拉加载");
                mPresenter.getHomeList(ConstantUtils.TYPE_REFRESH);

            }
        });
        //上拉监听
        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                LogUtils.d("上拉刷新");
                if(currPage >= totalPageCount) {
                    refreshLayout.finishLoadMoreWithNoMoreData();
                    return;
                }
            }
        });
    }
    @Override
    public void getMianListFail() {
        refreshLayout.finishRefresh(false);

    }

    @Override
    public int getPage() {
        return currPage;
    }
}
