package wangjin.com.wanandroid.mvp.model;

import wangjin.com.wanandroid.base.ILoadingDataListener;
import wangjin.com.wanandroid.bean.ArticlesListBean;
import wangjin.com.wanandroid.mvp.contract.IHomeFragmentContract;
import wangjin.com.wanandroid.network.okhttp.OkHttpFactory;

public class FragmentHomeModel implements IHomeFragmentContract.IFrHomeModel {
    @Override
    public ArticlesListBean handleHomeList(int page, ILoadingDataListener iLoadingDataListener) {
        return OkHttpFactory.getArticleList(page,iLoadingDataListener);
    }
}
