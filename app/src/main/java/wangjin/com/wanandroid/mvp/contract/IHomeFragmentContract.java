package wangjin.com.wanandroid.mvp.contract;

import wangjin.com.wanandroid.base.ILoadingDataListener;
import wangjin.com.wanandroid.bean.ArticlesListBean;
import wangjin.com.wanandroid.mvp.base.IBaseMvpPresenter;
import wangjin.com.wanandroid.mvp.base.IBaseMvpView;

public interface IHomeFragmentContract {
    interface IFragmentHomeView extends IBaseMvpView {
        /**
         * 获取首页list成功
         * @param dataBean
         * @param type
         */
        void getMainListSuccess(ArticlesListBean dataBean,int type);

        /**
         * 获取首页list失败
         */
        void getMianListFail();

        /**
         * 获取当前加载页数
         * @return
         */
        int getPage();
    }
    interface IFragmentHomePresenter extends IBaseMvpPresenter {
         void getHomeList(int type);
    }

    interface IFrHomeModel {
        ArticlesListBean handleHomeList(int page, ILoadingDataListener iLoadingDataListener);
    }


}
