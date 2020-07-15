package wangjin.com.wanandroid.mvp.base;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.ButterKnife;

/**
 *
 * @param <V> 指定子类具体的View必须继承IBaseMvpView
 * @param <P> 指定子类的Presenter必须继承自BaseMvpPresenter
 */
public abstract class BaseMvpActivity<V extends IBaseMvpView,P extends BaseMvpPresenter<V>> extends AppCompatActivity implements IBaseMvpView {
    private P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);//这种是继承了AppCompatActivity使用
        setContentView(getLayout());
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        //绑定初始化ButterKnife
        ButterKnife.bind(this);
        //创建Presenter
        if(presenter == null) {
            presenter = createPresenter();
        }

        if(presenter == null) {
            throw new NullPointerException("presenter 不能为空!");
        }
        //绑定view
        presenter.attachMvpView((V) this);

        initView();
        initData(savedInstanceState);
    }

    protected abstract P createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //解除绑定
        if(presenter != null) {
            presenter.detachMvpView();
        }
    }
}
