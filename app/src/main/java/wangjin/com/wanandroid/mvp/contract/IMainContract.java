package wangjin.com.wanandroid.mvp.contract;

import wangjin.com.wanandroid.mvp.base.IBaseMvpPresenter;
import wangjin.com.wanandroid.mvp.base.IBaseMvpView;

/**
 * 契约接口,方便观察M.V.P层接口提供的方法
 */
public interface IMainContract {
    interface IMainModel {}
    interface IMainView extends IBaseMvpView {}
    interface IMainPresenter extends IBaseMvpPresenter {}
}
