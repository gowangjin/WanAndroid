package wangjin.com.wanandroid.mvp.base;

import java.lang.ref.WeakReference;

/**
 * 创建一个基类的Presenter，在类上规定View泛型，然后定义绑定和解绑的抽象方法，让子类去实现，对外在提供一个获取View的方法，
 * 让子类直接通过方法来获取View
 * @param <V>
 */
public abstract class BaseMvpPresenter<V extends IBaseMvpView> implements IBaseMvpPresenter{
    private V mMvpView;
    private WeakReference<IBaseMvpView> weakReferenceView;
    /**
     * 绑定view
     * @param view
     */
    @Override
    public void attachMvpView(IBaseMvpView view){
        if(view != null) {
            //使用软引用,防止内存泄漏
            weakReferenceView = new WeakReference<>(view);
            this.mMvpView = (V)weakReferenceView.get();
        }
    }

    /**
     * 解除绑定V层
     */
    @Override
    public void detachMvpView() {
        weakReferenceView.clear();
        weakReferenceView = null;
        mMvpView = null;
    }

    /**
     * 获取V层 ,防止空指针
     * @return
     */
    @Override
    public V getMvpView() {
        if(mMvpView == null) {
            throw new IllegalStateException("view not attached");
        } else{
            return mMvpView;
        }
    }

}
