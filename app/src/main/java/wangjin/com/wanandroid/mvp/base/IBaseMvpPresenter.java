package wangjin.com.wanandroid.mvp.base;

public interface IBaseMvpPresenter<V extends IBaseMvpView> {
    void attachMvpView(V view);
    void detachMvpView();
    V getMvpView();
}
