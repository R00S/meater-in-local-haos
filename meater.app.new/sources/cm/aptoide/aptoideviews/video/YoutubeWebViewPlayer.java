package cm.aptoide.aptoideviews.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import cm.aptoide.aptoideviews.video.YoutubeWebViewPlayer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: YoutubeWebViewPlayer.kt */
@Metadata(m32266d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0014\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015J\u0014\u0010\u0016\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m32267d2 = {"Lcm/aptoide/aptoideviews/video/YoutubeWebViewPlayer;", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", HttpUrl.FRAGMENT_ENCODE_SET, "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "youtubeWebViewClient", "Lcm/aptoide/aptoideviews/video/YoutubeWebViewPlayer$YoutubeWebViewClient;", "loadVideo", HttpUrl.FRAGMENT_ENCODE_SET, "videoId", HttpUrl.FRAGMENT_ENCODE_SET, "enableSubtitles", HttpUrl.FRAGMENT_ENCODE_SET, "setOnErrorAction", "action", "Lkotlin/Function0;", "setOnPageFinishedAction", "YoutubeWebViewClient", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class YoutubeWebViewPlayer extends WebView {
    public Map<Integer, View> _$_findViewCache;
    private final YoutubeWebViewClient youtubeWebViewClient;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: YoutubeWebViewPlayer.kt */
    @Metadata(m32266d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J&\u0010\u000f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J&\u0010\u0012\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0014\u0010\u0017\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0014\u0010\u0019\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u001c\u0010\u001a\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m32267d2 = {"Lcm/aptoide/aptoideviews/video/YoutubeWebViewPlayer$YoutubeWebViewClient;", "Landroid/webkit/WebViewClient;", "()V", "hasError", HttpUrl.FRAGMENT_ENCODE_SET, "hasLoaded", "onErrorAction", "Lkotlin/Function0;", HttpUrl.FRAGMENT_ENCODE_SET, "onPageFinishedAction", "onPageFinished", "view", "Landroid/webkit/WebView;", "url", HttpUrl.FRAGMENT_ENCODE_SET, "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "setOnError", "action", "setOnPageFinishedAction", "shouldOverrideUrlLoading", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    static final class YoutubeWebViewClient extends WebViewClient {
        private boolean hasError;
        private boolean hasLoaded;
        private Function0<C10775u> onErrorAction;
        private Function0<C10775u> onPageFinishedAction;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onPageFinished$lambda-1, reason: not valid java name */
        public static final void m40692onPageFinished$lambda1(YoutubeWebViewClient youtubeWebViewClient, String str) {
            C9801m.m32346f(youtubeWebViewClient, "this$0");
            if (youtubeWebViewClient.hasError) {
                return;
            }
            youtubeWebViewClient.hasLoaded = true;
            Function0<C10775u> function0 = youtubeWebViewClient.onPageFinishedAction;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            C9801m.m32346f(view, "view");
            if (Build.VERSION.SDK_INT >= 19) {
                view.evaluateJavascript("document.getElementsByClassName('ytp-chrome-top')[0].remove();document.getElementsByClassName('ytp-icon-large-play-button-hover')[0].style.background=\"no-repeat url('https://cdn6.aptoide.com/includes/themes/2014/images/vanilla_appcoins_info_video_placeholder.svg')\";document.getElementsByClassName('ytp-icon-large-play-button-hover')[0].style.width=\"75px\";document.getElementsByClassName('ytp-icon-large-play-button-hover')[0].style.height=\"75px\";", new ValueCallback() { // from class: cm.aptoide.aptoideviews.video.d
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        YoutubeWebViewPlayer.YoutubeWebViewClient.m40692onPageFinished$lambda1(this.f7162a, (String) obj);
                    }
                });
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            this.hasError = false;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            if (this.hasLoaded) {
                return;
            }
            Function0<C10775u> function0 = this.onErrorAction;
            if (function0 != null) {
                function0.invoke();
            }
            this.hasError = true;
        }

        public final void setOnError(Function0<C10775u> function0) {
            C9801m.m32346f(function0, "action");
            this.onErrorAction = function0;
        }

        public final void setOnPageFinishedAction(Function0<C10775u> function0) {
            C9801m.m32346f(function0, "action");
            this.onPageFinishedAction = function0;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YoutubeWebViewPlayer(Context context) {
        this(context, null);
        C9801m.m32346f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-0, reason: not valid java name */
    public static final boolean m40691_init_$lambda0(YoutubeWebViewPlayer youtubeWebViewPlayer, View view, MotionEvent motionEvent) {
        C9801m.m32346f(youtubeWebViewPlayer, "this$0");
        if (Build.VERSION.SDK_INT < 19) {
            return false;
        }
        youtubeWebViewPlayer.evaluateJavascript("document.getElementsByClassName('ytp-endscreen-content')[0].remove();document.getElementsByClassName('html5-endscreen')[0].remove();document.getElementsByClassName('ytp-replay-button')[0].style.top=0;document.getElementsByClassName('ytp-pause-overlay')[0].remove();", null);
        return false;
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i2) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i2);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i2), viewFindViewById);
        return viewFindViewById;
    }

    public final void loadVideo(String videoId, boolean enableSubtitles) {
        C9801m.m32346f(videoId, "videoId");
        loadUrl("https://www.youtube.com/embed/" + videoId + "?rel=0" + (enableSubtitles ? "&cc_load_policy=1" : HttpUrl.FRAGMENT_ENCODE_SET));
    }

    public final void setOnErrorAction(Function0<C10775u> function0) {
        C9801m.m32346f(function0, "action");
        this.youtubeWebViewClient.setOnError(function0);
    }

    public final void setOnPageFinishedAction(Function0<C10775u> function0) {
        C9801m.m32346f(function0, "action");
        this.youtubeWebViewClient.setOnPageFinishedAction(function0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YoutubeWebViewPlayer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C9801m.m32346f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YoutubeWebViewPlayer(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C9801m.m32346f(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        YoutubeWebViewClient youtubeWebViewClient = new YoutubeWebViewClient();
        this.youtubeWebViewClient = youtubeWebViewClient;
        setOnTouchListener(new View.OnTouchListener() { // from class: cm.aptoide.aptoideviews.video.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return YoutubeWebViewPlayer.m40691_init_$lambda0(this.f7161f, view, motionEvent);
            }
        });
        setWebViewClient(youtubeWebViewClient);
        setWebChromeClient(new WebChromeClientWithoutPlayerPlaceholder());
        getSettings().setJavaScriptEnabled(true);
    }
}
