package wangjin.com.wanandroid.network.okhttp;


import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;
import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import wangjin.com.wanandroid.base.ILoadingDataListener;
import wangjin.com.wanandroid.bean.ArticlesListBean;
import wangjin.com.wanandroid.utils.ConstantUtils;
import wangjin.com.wanandroid.utils.LogUtils;

 public  class OkHttpFactory {
    public  static ArticlesListBean getArticleList(int page, ILoadingDataListener loadingDataListener) {
        String url = ConstantUtils.URL_ARTICLE + page +"/json";
        final ArticlesListBean[] dataBean = {null};
        OkHttpClient okHttpClient = new OkHttpClient();
        final Request request = new Request.Builder()
                .url(url)
                .get()
                .build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                LogUtils.e(e.getMessage());
                loadingDataListener.onFailure(e.toString());

            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                Gson gson = new Gson();
                ArticlesListBean articlesListBean = gson.fromJson(response.body().string(), ArticlesListBean.class);
                dataBean[0] =  articlesListBean;
                loadingDataListener.onSuccess(articlesListBean);
               // LogUtils.e(dataBean[0].toString());
            }
        });
        return dataBean[0];
    }

}
