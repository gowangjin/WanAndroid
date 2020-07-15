package wangjin.com.wanandroid;


import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import butterknife.BindView;
import wangjin.com.wanandroid.mvp.base.BaseMvpActivity;
import wangjin.com.wanandroid.fragment.FreeTimeFragment;
import wangjin.com.wanandroid.fragment.HomeFragment;
import wangjin.com.wanandroid.fragment.NavigateFragment;
import wangjin.com.wanandroid.fragment.ProjectFragment;
import wangjin.com.wanandroid.mvp.contract.IMainContract;
import wangjin.com.wanandroid.mvp.presenter.MainPresenter;
import wangjin.com.wanandroid.mvp.view.IMainView;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

public class MainActivity extends BaseMvpActivity<IMainView, MainPresenter> implements BottomNavigationBar.OnTabSelectedListener, IMainContract.IMainView {
    @BindView(R.id.bottom_navigation_bar)
    BottomNavigationBar bottomNavigationBar;
    @BindView(R.id.fl_content)
    FrameLayout fl_content;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    HomeFragment homeFragment;
    ProjectFragment projectFragment;
    NavigateFragment navigateFragment;
    FreeTimeFragment freeTimeFragment;
    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter();
    }


    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        /**
         * 三种模式:
         * MODE_DEFAULT:如果item的个数<=3就会使用MODE_FIXED模式,否则使用MODE_SHIFITING模式
         * MODE_FIXED(固定大小)填充模式,未选中的item会显示文字,没有换档动画
         *宽度=总宽度/action个数
         * 最大宽度: 168dp
         * 最小宽度: 80dp
         * Padding：6dp（8dp）、10dp、12dp
         * 字体大小：12sp、14sp
         *MODE_SHIFING(不固定大小)
         * 换挡模式,未选中的Item不会显示文字,选中的会显示文字,在切换的时候会有一个先换挡的动画
         */
        bottomNavigationBar.setMode(BottomNavigationBar.MODE_FIXED);

        /**
         * 三种Style
         * BACKGROUND_STYLE_DEFAULT
         * 如果设置的Mode为MODE_FIXED，将使用BACKGROUND_STYLE_STATIC 。如果Mode为MODE_SHIFTING将使用BACKGROUND_STYLE_RIPPLE。
         *
         * BACKGROUND_STYLE_STATIC
         * 点击的时候没有水波纹效果
         * 航条的背景色是白色，加上setBarBackgroundColor（）可以设置成你所需要的任何背景颜色
         *
         * BACKGROUND_STYLE_RIPPLE
         * 点击的时候有水波纹效果
         * 导航条的背景色是你设置的处于选中状态的 Item的颜色（ActiveColor），也就是setActiveColorResource这个设置的颜色
         */
        bottomNavigationBar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC);
        bottomNavigationBar.setBarBackgroundColor(R.color.background_gray_color);
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        fragmentManager = getSupportFragmentManager();
        initBottomNavigationBar();
    }

    private void initBottomNavigationBar() {
        bottomNavigationBar
                .addItem(new BottomNavigationItem(R.mipmap.ic_main_home1,"首页").setActiveColorResource(R.color.txt_select).setInactiveIconResource(R.mipmap.ic_main_home2).setInActiveColorResource(R.color.txt_unselect))
                .addItem(new BottomNavigationItem(R.mipmap.ic_main_project1,"项目").setActiveColorResource(R.color.txt_select).setInactiveIconResource(R.mipmap.ic_main_project2).setInActiveColorResource(R.color.txt_unselect))
                .addItem(new BottomNavigationItem(R.mipmap.ic_main_navigate1,"导航").setActiveColorResource(R.color.txt_select).setInactiveIconResource(R.mipmap.ic_main_navigate2).setInActiveColorResource(R.color.txt_unselect))
                .addItem(new BottomNavigationItem(R.mipmap.ic_main_me1,"我的").setActiveColorResource(R.color.txt_select).setInactiveIconResource(R.mipmap.ic_main_me2).setInActiveColorResource(R.color.txt_unselect))
                .initialise();
        bottomNavigationBar.setTabSelectedListener(this);//设置监听
        bottomNavigationBar.selectTab(0);

    }

    @Override
    public void onTabSelected(int position) {
        fragmentTransaction = fragmentManager.beginTransaction();
        hideFragment(fragmentTransaction);
        switch (position) {
            case 0:
                if(homeFragment == null) {
                    homeFragment = new HomeFragment();
                    fragmentTransaction.add(R.id.fl_content,homeFragment);
                }
                fragmentTransaction.show(homeFragment);
                break;
            case 1:
                if(projectFragment == null) {
                    projectFragment = new ProjectFragment();
                    fragmentTransaction.add(R.id.fl_content,projectFragment);
                }
                fragmentTransaction.show(projectFragment);
                break;
            case 2:
                if(navigateFragment == null) {
                    navigateFragment = new NavigateFragment();
                    fragmentTransaction.add(R.id.fl_content,navigateFragment);
                }
                fragmentTransaction.show(navigateFragment);
                break;
            case 3:
                if(freeTimeFragment == null) {
                    freeTimeFragment = new FreeTimeFragment();
                    fragmentTransaction.add(R.id.fl_content,freeTimeFragment);
                }
                fragmentTransaction.show(freeTimeFragment);
                break;
        }
        fragmentTransaction.commit();
    }

    @Override
    public void onTabUnselected(int position) {

    }

    @Override
    public void onTabReselected(int position) {

    }

    private void hideFragment(FragmentTransaction fragmentTransaction) {
        if(homeFragment != null) {
            fragmentTransaction.hide(homeFragment);
        }
        if(projectFragment != null) {
            fragmentTransaction.hide(projectFragment);
        }

        if(navigateFragment != null) {
            fragmentTransaction.hide(navigateFragment);
        }

        if(freeTimeFragment != null) {
            fragmentTransaction.hide(freeTimeFragment);
        }
    }
}
