package wangjin.com.wanandroid.mvp.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseMvpFragment<V extends IBaseMvpView,P extends IBaseMvpPresenter> extends Fragment implements IBaseMvpView {
    protected P mPresenter;
    private View rootView; //缓存Fragment的view
    private Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(rootView == null) {
            rootView = inflater.inflate(getLayout(),container,false);
        }
        if(mPresenter == null) {
            mPresenter = createPresenter();
        }
        mPresenter.attachMvpView((V) this);
        unbinder = ButterKnife.bind(this,rootView);
        initView();
        initData(savedInstanceState);
        return rootView;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(mPresenter != null) {
            mPresenter.detachMvpView();
        }
        if(unbinder != null) {
            unbinder.unbind();
        }
    }

    protected abstract P createPresenter();
}
