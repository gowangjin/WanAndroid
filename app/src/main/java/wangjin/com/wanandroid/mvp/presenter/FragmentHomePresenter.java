package wangjin.com.wanandroid.mvp.presenter;

import wangjin.com.wanandroid.base.ILoadingDataListener;
import wangjin.com.wanandroid.bean.ArticlesListBean;
import wangjin.com.wanandroid.fragment.HomeFragment;
import wangjin.com.wanandroid.mvp.base.BaseMvpPresenter;
import wangjin.com.wanandroid.mvp.base.IBaseMvpView;
import wangjin.com.wanandroid.mvp.contract.IHomeFragmentContract;
import wangjin.com.wanandroid.mvp.model.FragmentHomeModel;
import wangjin.com.wanandroid.network.okhttp.OkHttpFactory;
import wangjin.com.wanandroid.utils.ConstantUtils;
import wangjin.com.wanandroid.utils.LogUtils;

public class FragmentHomePresenter extends BaseMvpPresenter implements IHomeFragmentContract.IFragmentHomePresenter {
    IHomeFragmentContract.IFrHomeModel homeModel;
    @Override
    public void attachMvpView(IBaseMvpView view) {
        super.attachMvpView(view);
        homeModel = new FragmentHomeModel();
    }

    @Override
    public void detachMvpView() {
        super.detachMvpView();
    }

    @Override
    public void getHomeList(int type) {
        HomeFragment homeFragment = (HomeFragment)getMvpView();
       homeModel.handleHomeList(((HomeFragment) getMvpView()).getPage(), new ILoadingDataListener<ArticlesListBean>() {
           @Override
           public void onSuccess(ArticlesListBean bean) {
               LogUtils.d(bean.getData().getDatas().toString());
               homeFragment.getMainListSuccess(bean,type);
           }

           @Override
           public void onFailure(String error) {
               LogUtils.d("failure::::" + error);
           }
       });
    }
}
