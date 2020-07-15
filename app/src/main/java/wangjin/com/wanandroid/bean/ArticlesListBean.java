package wangjin.com.wanandroid.bean;

import java.util.List;

/**
 * 首页文章列表bean
 */
public class ArticlesListBean {

    /**
     * data : {"curPage":1,"datas":[{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":14112,"link":"https://juejin.im/post/5efc760f5188252e99702d73","niceDate":"1小时前","niceShareDate":"1小时前","origin":"","prefix":"","projectLink":"","publishTime":1593605589000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1593605589000,"shareUser":"哈利迪","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android | 资源冲突覆盖的一些思考","type":0,"userId":6999,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":14113,"link":"https://mp.weixin.qq.com/s/fVnlqU2L_L7xo345axUh_Q","niceDate":"21小时前","niceShareDate":"41分钟前","origin":"","prefix":"","projectLink":"","publishTime":1593532800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1593607630000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"刚刚，GitHub 重磅发布 4 大新功能！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":14114,"link":"https://mp.weixin.qq.com/s/uu0mvYOkuwbeNN6yPzu4dA","niceDate":"21小时前","niceShareDate":"41分钟前","origin":"","prefix":"","projectLink":"","publishTime":1593532800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1593607644000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"我用 React 和 Vue 构建了同款应用，来看看哪里不一样","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":14115,"link":"https://mp.weixin.qq.com/s/Vbe2Pb8u5uHPTsRbJhzMSQ","niceDate":"21小时前","niceShareDate":"41分钟前","origin":"","prefix":"","projectLink":"","publishTime":1593532800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1593607660000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"可重入读写锁，来点进阶的","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":14101,"link":"https://www.jianshu.com/p/933b1e86f887","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1593502413000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1593502413000,"shareUser":"winlee28","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Navigation修改版-避免生命周期重复回调","type":0,"userId":25211,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14098,"link":"https://www.jianshu.com/p/ea370b6fca40","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1593492583000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1593492583000,"shareUser":"蓝天","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"手把手教你撸一个一行代码请求权限的框架","type":0,"userId":29034,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14095,"link":"https://juejin.im/post/5ee4f9705188254330682fff","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1593479771000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1593479771000,"shareUser":"xfhy666","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"JNI NDK入门详解","type":0,"userId":1623,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14094,"link":"https://juejin.im/post/5ef9c5065188252e47138310?utm_source=gold_browser_extension","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1593479738000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1593479738000,"shareUser":"xfhy666","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"反编译基础知识","type":0,"userId":1623,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14091,"link":"https://juejin.im/post/5ef9327e6fb9a07e716acac4","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1593476689000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1593476689000,"shareUser":"JsonChao","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"深入探索 Gradle 自动化构建技术（九、Gradle 插件平台化框架 ByteX 探秘之旅）","type":0,"userId":611,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"谷歌开发者","canEdit":false,"chapterId":415,"chapterName":"谷歌开发者","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14103,"link":"https://mp.weixin.qq.com/s/EUxI9ewLxLTWC_W8T0Qw9w","niceDate":"1天前","niceShareDate":"22小时前","origin":"","prefix":"","projectLink":"","publishTime":1593446400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1593530261000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/415/1"}],"title":"11 Weeks of Android: 联系人与身份","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"谷歌开发者","canEdit":false,"chapterId":415,"chapterName":"谷歌开发者","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14104,"link":"https://mp.weixin.qq.com/s/07rXV6kTG5Sw06MH27Flyg","niceDate":"1天前","niceShareDate":"22小时前","origin":"","prefix":"","projectLink":"","publishTime":1593446400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1593530275000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/415/1"}],"title":"\u200bAndroid 样式系统 | 主题背景和样式","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14105,"link":"https://mp.weixin.qq.com/s/IRIZ-c9qdwJCL7t5Yri_IA","niceDate":"1天前","niceShareDate":"22小时前","origin":"","prefix":"","projectLink":"","publishTime":1593446400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1593530297000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"一款高仿 Eyepetizer | 开眼短视频的 MVVM 开源项目","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14106,"link":"https://mp.weixin.qq.com/s/ILuXnH-GUlDhIeO3zfuChg","niceDate":"1天前","niceShareDate":"22小时前","origin":"","prefix":"","projectLink":"","publishTime":1593446400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1593530316000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"小厂跳大厂,我是如何拿到腾讯头条美团小米的offer的","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14107,"link":"https://mp.weixin.qq.com/s/aVvos5iWYVmiVZRv4hMQMQ","niceDate":"1天前","niceShareDate":"22小时前","origin":"","prefix":"","projectLink":"","publishTime":1593446400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1593530333000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"花花绿绿的股票线是怎么画出来的？想怎么画就怎么画！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":78,"chapterName":"性能优化","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14086,"link":"https://www.jianshu.com/p/db65f4982897","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1593445632000,"realSuperChapterId":53,"selfVisible":0,"shareDate":1593445245000,"shareUser":"鸿洋","superChapterId":81,"superChapterName":"热门专题","tags":[],"title":"浅谈Android中的R文件作用以及将R资源inline减少包大小","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":26,"chapterName":"基础UI控件","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14087,"link":"https://www.jianshu.com/p/ea464eb15436","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1593445621000,"realSuperChapterId":25,"selfVisible":0,"shareDate":1593445286000,"shareUser":"鸿洋","superChapterId":26,"superChapterName":"常用控件","tags":[],"title":"Android 之你真的了解 View.post() 原理吗？","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":423,"chapterName":"Architecture","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14088,"link":"https://juejin.im/post/5ef061d0e51d4573e71f3243","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1593445606000,"realSuperChapterId":422,"selfVisible":0,"shareDate":1593445377000,"shareUser":"鸿洋","superChapterId":423,"superChapterName":"Jetpack","tags":[],"title":"独家记忆 | Jetpack MVVM 高频提问和解答","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":79,"chapterName":"黑科技","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14090,"link":"https://juejin.im/post/5ef5c2abf265da22ad19d975","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1593445589000,"realSuperChapterId":53,"selfVisible":0,"shareDate":1593445570000,"shareUser":"鸿洋","superChapterId":81,"superChapterName":"热门专题","tags":[],"title":"Flutter Notes ｜ Android 借壳分享微信","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>在 Android 7.0了，引入了「Network Security Configuration」，当时默认配置为信任系统内置证书以及用户安装证书，并且允许访问 HTTP 请求。<\/p>\r\n<p>而在 Android 9.0上，默认只信任系统证书了，并且默认不再允许访问 HTTP 请求，所以在很多适配P文章中，因为无法访问 HTTP 了，无法抓包了，所以我们要引入如下配置：<\/p>\r\n<pre><code>&lt;base-config&gt; \r\n    &lt;trust-anchors&gt;\r\n        &lt;certificates src=&quot;system&quot; /&gt;\r\n                 &lt;certificates src=&quot;user&quot; /&gt; // 信任用户安装证书\r\n    &lt;/trust-anchors&gt;\r\n&lt;/base-config&gt;\r\n<\/code><\/pre><p>问题来了，今天在一个技术群，有人说：<\/p>\r\n<p><strong>高版本的(AndroidP )，需要配置 android:networkSecurityConfig=&quot;@xml/network_security_config&quot;(上面的配置) ，才能抓包<\/strong><\/p>\r\n<ol>\r\n<li>这个结论一定是正确的吗？<\/li>\r\n<li>我在Android P以及以上的设备中不配置networkSecurityConfig，就一定无法抓包吗？<\/li>\r\n<\/ol>\r\n<p>其实之前问过类似的问题，上次没人回答，这次细化到具体场景了。<\/p>","descMd":"","envelopePic":"","fresh":false,"id":13949,"link":"https://www.wanandroid.com/wenda/show/13949","niceDate":"2天前","niceShareDate":"2020-06-19 11:50","origin":"","prefix":"","projectLink":"","publishTime":1593437188000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1592538623000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | Android P 上，需要配置 network_security_config ，才能抓包，正确吗？","type":0,"userId":2,"visible":1,"zan":2}],"offset":0,"over":false,"pageCount":439,"size":20,"total":8771}
     * errorCode : 0
     * errorMsg :
     */

    private DataBean data;
    private int errorCode;
    private String errorMsg;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public static class DataBean {
        /**
         * curPage : 1
         * datas : [{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":14112,"link":"https://juejin.im/post/5efc760f5188252e99702d73","niceDate":"1小时前","niceShareDate":"1小时前","origin":"","prefix":"","projectLink":"","publishTime":1593605589000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1593605589000,"shareUser":"哈利迪","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android | 资源冲突覆盖的一些思考","type":0,"userId":6999,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":14113,"link":"https://mp.weixin.qq.com/s/fVnlqU2L_L7xo345axUh_Q","niceDate":"21小时前","niceShareDate":"41分钟前","origin":"","prefix":"","projectLink":"","publishTime":1593532800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1593607630000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"刚刚，GitHub 重磅发布 4 大新功能！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":14114,"link":"https://mp.weixin.qq.com/s/uu0mvYOkuwbeNN6yPzu4dA","niceDate":"21小时前","niceShareDate":"41分钟前","origin":"","prefix":"","projectLink":"","publishTime":1593532800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1593607644000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"我用 React 和 Vue 构建了同款应用，来看看哪里不一样","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":14115,"link":"https://mp.weixin.qq.com/s/Vbe2Pb8u5uHPTsRbJhzMSQ","niceDate":"21小时前","niceShareDate":"41分钟前","origin":"","prefix":"","projectLink":"","publishTime":1593532800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1593607660000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"可重入读写锁，来点进阶的","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":14101,"link":"https://www.jianshu.com/p/933b1e86f887","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1593502413000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1593502413000,"shareUser":"winlee28","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Navigation修改版-避免生命周期重复回调","type":0,"userId":25211,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14098,"link":"https://www.jianshu.com/p/ea370b6fca40","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1593492583000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1593492583000,"shareUser":"蓝天","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"手把手教你撸一个一行代码请求权限的框架","type":0,"userId":29034,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14095,"link":"https://juejin.im/post/5ee4f9705188254330682fff","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1593479771000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1593479771000,"shareUser":"xfhy666","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"JNI NDK入门详解","type":0,"userId":1623,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14094,"link":"https://juejin.im/post/5ef9c5065188252e47138310?utm_source=gold_browser_extension","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1593479738000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1593479738000,"shareUser":"xfhy666","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"反编译基础知识","type":0,"userId":1623,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14091,"link":"https://juejin.im/post/5ef9327e6fb9a07e716acac4","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1593476689000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1593476689000,"shareUser":"JsonChao","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"深入探索 Gradle 自动化构建技术（九、Gradle 插件平台化框架 ByteX 探秘之旅）","type":0,"userId":611,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"谷歌开发者","canEdit":false,"chapterId":415,"chapterName":"谷歌开发者","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14103,"link":"https://mp.weixin.qq.com/s/EUxI9ewLxLTWC_W8T0Qw9w","niceDate":"1天前","niceShareDate":"22小时前","origin":"","prefix":"","projectLink":"","publishTime":1593446400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1593530261000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/415/1"}],"title":"11 Weeks of Android: 联系人与身份","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"谷歌开发者","canEdit":false,"chapterId":415,"chapterName":"谷歌开发者","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14104,"link":"https://mp.weixin.qq.com/s/07rXV6kTG5Sw06MH27Flyg","niceDate":"1天前","niceShareDate":"22小时前","origin":"","prefix":"","projectLink":"","publishTime":1593446400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1593530275000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/415/1"}],"title":"\u200bAndroid 样式系统 | 主题背景和样式","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14105,"link":"https://mp.weixin.qq.com/s/IRIZ-c9qdwJCL7t5Yri_IA","niceDate":"1天前","niceShareDate":"22小时前","origin":"","prefix":"","projectLink":"","publishTime":1593446400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1593530297000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"一款高仿 Eyepetizer | 开眼短视频的 MVVM 开源项目","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14106,"link":"https://mp.weixin.qq.com/s/ILuXnH-GUlDhIeO3zfuChg","niceDate":"1天前","niceShareDate":"22小时前","origin":"","prefix":"","projectLink":"","publishTime":1593446400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1593530316000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"小厂跳大厂,我是如何拿到腾讯头条美团小米的offer的","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14107,"link":"https://mp.weixin.qq.com/s/aVvos5iWYVmiVZRv4hMQMQ","niceDate":"1天前","niceShareDate":"22小时前","origin":"","prefix":"","projectLink":"","publishTime":1593446400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1593530333000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"花花绿绿的股票线是怎么画出来的？想怎么画就怎么画！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":78,"chapterName":"性能优化","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14086,"link":"https://www.jianshu.com/p/db65f4982897","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1593445632000,"realSuperChapterId":53,"selfVisible":0,"shareDate":1593445245000,"shareUser":"鸿洋","superChapterId":81,"superChapterName":"热门专题","tags":[],"title":"浅谈Android中的R文件作用以及将R资源inline减少包大小","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":26,"chapterName":"基础UI控件","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14087,"link":"https://www.jianshu.com/p/ea464eb15436","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1593445621000,"realSuperChapterId":25,"selfVisible":0,"shareDate":1593445286000,"shareUser":"鸿洋","superChapterId":26,"superChapterName":"常用控件","tags":[],"title":"Android 之你真的了解 View.post() 原理吗？","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":423,"chapterName":"Architecture","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14088,"link":"https://juejin.im/post/5ef061d0e51d4573e71f3243","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1593445606000,"realSuperChapterId":422,"selfVisible":0,"shareDate":1593445377000,"shareUser":"鸿洋","superChapterId":423,"superChapterName":"Jetpack","tags":[],"title":"独家记忆 | Jetpack MVVM 高频提问和解答","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":79,"chapterName":"黑科技","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14090,"link":"https://juejin.im/post/5ef5c2abf265da22ad19d975","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1593445589000,"realSuperChapterId":53,"selfVisible":0,"shareDate":1593445570000,"shareUser":"鸿洋","superChapterId":81,"superChapterName":"热门专题","tags":[],"title":"Flutter Notes ｜ Android 借壳分享微信","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>在 Android 7.0了，引入了「Network Security Configuration」，当时默认配置为信任系统内置证书以及用户安装证书，并且允许访问 HTTP 请求。<\/p>\r\n<p>而在 Android 9.0上，默认只信任系统证书了，并且默认不再允许访问 HTTP 请求，所以在很多适配P文章中，因为无法访问 HTTP 了，无法抓包了，所以我们要引入如下配置：<\/p>\r\n<pre><code>&lt;base-config&gt; \r\n    &lt;trust-anchors&gt;\r\n        &lt;certificates src=&quot;system&quot; /&gt;\r\n                 &lt;certificates src=&quot;user&quot; /&gt; // 信任用户安装证书\r\n    &lt;/trust-anchors&gt;\r\n&lt;/base-config&gt;\r\n<\/code><\/pre><p>问题来了，今天在一个技术群，有人说：<\/p>\r\n<p><strong>高版本的(AndroidP )，需要配置 android:networkSecurityConfig=&quot;@xml/network_security_config&quot;(上面的配置) ，才能抓包<\/strong><\/p>\r\n<ol>\r\n<li>这个结论一定是正确的吗？<\/li>\r\n<li>我在Android P以及以上的设备中不配置networkSecurityConfig，就一定无法抓包吗？<\/li>\r\n<\/ol>\r\n<p>其实之前问过类似的问题，上次没人回答，这次细化到具体场景了。<\/p>","descMd":"","envelopePic":"","fresh":false,"id":13949,"link":"https://www.wanandroid.com/wenda/show/13949","niceDate":"2天前","niceShareDate":"2020-06-19 11:50","origin":"","prefix":"","projectLink":"","publishTime":1593437188000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1592538623000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | Android P 上，需要配置 network_security_config ，才能抓包，正确吗？","type":0,"userId":2,"visible":1,"zan":2}]
         * offset : 0
         * over : false
         * pageCount : 439
         * size : 20
         * total : 8771
         */

        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        private List<DatasBean> datas;

        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public boolean isOver() {
            return over;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        public static class DatasBean {
            /**
             * apkLink :
             * audit : 1
             * author :
             * canEdit : false
             * chapterId : 502
             * chapterName : 自助
             * collect : false
             * courseId : 13
             * desc :
             * descMd :
             * envelopePic :
             * fresh : true
             * id : 14112
             * link : https://juejin.im/post/5efc760f5188252e99702d73
             * niceDate : 1小时前
             * niceShareDate : 1小时前
             * origin :
             * prefix :
             * projectLink :
             * publishTime : 1593605589000
             * realSuperChapterId : 493
             * selfVisible : 0
             * shareDate : 1593605589000
             * shareUser : 哈利迪
             * superChapterId : 494
             * superChapterName : 广场Tab
             * tags : []
             * title : Android | 资源冲突覆盖的一些思考
             * type : 0
             * userId : 6999
             * visible : 1
             * zan : 0
             */

            private String apkLink;
            private int audit;
            private String author;
            private boolean canEdit;
            private int chapterId;
            private String chapterName;
            private boolean collect;
            private int courseId;
            private String desc;
            private String descMd;
            private String envelopePic;
            private boolean fresh;
            private int id;
            private String link;
            private String niceDate;
            private String niceShareDate;
            private String origin;
            private String prefix;
            private String projectLink;
            private long publishTime;
            private int realSuperChapterId;
            private int selfVisible;
            private long shareDate;
            private String shareUser;
            private int superChapterId;
            private String superChapterName;
            private String title;
            private int type;
            private int userId;
            private int visible;
            private int zan;
            private List<?> tags;

            public String getApkLink() {
                return apkLink;
            }

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
            }

            public int getAudit() {
                return audit;
            }

            public void setAudit(int audit) {
                this.audit = audit;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public boolean isCanEdit() {
                return canEdit;
            }

            public void setCanEdit(boolean canEdit) {
                this.canEdit = canEdit;
            }

            public int getChapterId() {
                return chapterId;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }

            public String getChapterName() {
                return chapterName;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
            }

            public boolean isCollect() {
                return collect;
            }

            public void setCollect(boolean collect) {
                this.collect = collect;
            }

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getDescMd() {
                return descMd;
            }

            public void setDescMd(String descMd) {
                this.descMd = descMd;
            }

            public String getEnvelopePic() {
                return envelopePic;
            }

            public void setEnvelopePic(String envelopePic) {
                this.envelopePic = envelopePic;
            }

            public boolean isFresh() {
                return fresh;
            }

            public void setFresh(boolean fresh) {
                this.fresh = fresh;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }

            public String getNiceShareDate() {
                return niceShareDate;
            }

            public void setNiceShareDate(String niceShareDate) {
                this.niceShareDate = niceShareDate;
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getPrefix() {
                return prefix;
            }

            public void setPrefix(String prefix) {
                this.prefix = prefix;
            }

            public String getProjectLink() {
                return projectLink;
            }

            public void setProjectLink(String projectLink) {
                this.projectLink = projectLink;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public int getRealSuperChapterId() {
                return realSuperChapterId;
            }

            public void setRealSuperChapterId(int realSuperChapterId) {
                this.realSuperChapterId = realSuperChapterId;
            }

            public int getSelfVisible() {
                return selfVisible;
            }

            public void setSelfVisible(int selfVisible) {
                this.selfVisible = selfVisible;
            }

            public long getShareDate() {
                return shareDate;
            }

            public void setShareDate(long shareDate) {
                this.shareDate = shareDate;
            }

            public String getShareUser() {
                return shareUser;
            }

            public void setShareUser(String shareUser) {
                this.shareUser = shareUser;
            }

            public int getSuperChapterId() {
                return superChapterId;
            }

            public void setSuperChapterId(int superChapterId) {
                this.superChapterId = superChapterId;
            }

            public String getSuperChapterName() {
                return superChapterName;
            }

            public void setSuperChapterName(String superChapterName) {
                this.superChapterName = superChapterName;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public int getZan() {
                return zan;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }

            public List<?> getTags() {
                return tags;
            }

            public void setTags(List<?> tags) {
                this.tags = tags;
            }
        }
    }
}
