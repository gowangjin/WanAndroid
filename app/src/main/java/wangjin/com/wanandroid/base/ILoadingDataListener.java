package wangjin.com.wanandroid.base;

public interface ILoadingDataListener<T> {
    void onSuccess(T t);
    void onFailure(String error);
}
