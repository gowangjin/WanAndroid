package wangjin.com.wanandroid.mvp.base;

import android.os.Bundle;

/**
 * 创建基类View,对view进行约束
 */
public interface IBaseMvpView {
    int getLayout();

    void initView();

    void initData(Bundle savedInstanceState);
}
