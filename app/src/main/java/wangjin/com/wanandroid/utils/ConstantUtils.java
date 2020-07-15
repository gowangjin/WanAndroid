package wangjin.com.wanandroid.utils;

import android.os.Environment;

public class ConstantUtils {
    public static final String PATH_ROOT = Environment.getExternalStorageDirectory().getPath() + "/wanAndroid/"; //SD卡中根目录
    public static final String PATH_LOG_INFO = PATH_ROOT +"log/";//log保存路径
    public static final String URL_BASE = "https://www.wanandroid.com";
    public static final String URL_ARTICLE = URL_BASE + "/article/list/";
    public static final int TYPE_REFRESH = 1; //上拉刷新
    public static final int TYPE_LOAD_MORE = 2; //下拉加载
    public static final int TYPE_FIRST = 3;//首次加载
}
