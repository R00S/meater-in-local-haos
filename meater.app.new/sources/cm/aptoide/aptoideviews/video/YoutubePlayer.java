package cm.aptoide.aptoideviews.video;

import android.animation.LayoutTransition;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import cm.aptoide.aptoideviews.C1103R;
import cm.aptoide.aptoideviews.ExtensionsKt;
import cm.aptoide.aptoideviews.video.YoutubePlayer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;

/* compiled from: YoutubePlayer.kt */
@Metadata(m32266d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\fJ\b\u0010\u0016\u001a\u00020\u0013H\u0002R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m32267d2 = {"Lcm/aptoide/aptoideviews/video/YoutubePlayer;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", HttpUrl.FRAGMENT_ENCODE_SET, "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentEnableSubtitles", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/Boolean;", "currentVideoId", HttpUrl.FRAGMENT_ENCODE_SET, "threadHandler", "Landroid/os/Handler;", "loadVideo", HttpUrl.FRAGMENT_ENCODE_SET, "videoId", "enableSubtitles", "setListeners", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class YoutubePlayer extends FrameLayout {
    public Map<Integer, View> _$_findViewCache;
    private Boolean currentEnableSubtitles;
    private String currentVideoId;
    private final Handler threadHandler;

    /* compiled from: YoutubePlayer.kt */
    @Metadata(m32266d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: cm.aptoide.aptoideviews.video.YoutubePlayer$setListeners$1 */
    static final class C11281 extends Lambda implements Function0<C10775u> {
        C11281() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invoke$lambda-0, reason: not valid java name */
        public static final void m40690invoke$lambda0(YoutubePlayer youtubePlayer) {
            C9801m.m32346f(youtubePlayer, "this$0");
            ((YoutubeWebViewPlayer) youtubePlayer._$_findCachedViewById(C1103R.id.webview)).setVisibility(0);
            ((ProgressBar) youtubePlayer._$_findCachedViewById(C1103R.id.progress_bar)).setVisibility(8);
            ((TextView) youtubePlayer._$_findCachedViewById(C1103R.id.status_text)).setVisibility(8);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ C10775u invoke() {
            invoke2();
            return C10775u.f41439a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Handler handler = YoutubePlayer.this.threadHandler;
            final YoutubePlayer youtubePlayer = YoutubePlayer.this;
            handler.postDelayed(new Runnable() { // from class: cm.aptoide.aptoideviews.video.b
                @Override // java.lang.Runnable
                public final void run() {
                    YoutubePlayer.C11281.m40690invoke$lambda0(youtubePlayer);
                }
            }, 500L);
        }
    }

    /* compiled from: YoutubePlayer.kt */
    @Metadata(m32266d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: cm.aptoide.aptoideviews.video.YoutubePlayer$setListeners$2 */
    static final class C11292 extends Lambda implements Function0<C10775u> {
        C11292() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ C10775u invoke() {
            invoke2();
            return C10775u.f41439a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((TextView) YoutubePlayer.this._$_findCachedViewById(C1103R.id.status_text)).setVisibility(0);
            ((YoutubeWebViewPlayer) YoutubePlayer.this._$_findCachedViewById(C1103R.id.webview)).setVisibility(4);
            ((ProgressBar) YoutubePlayer.this._$_findCachedViewById(C1103R.id.progress_bar)).setVisibility(8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YoutubePlayer(Context context) {
        this(context, null);
        C9801m.m32346f(context, "context");
    }

    private final void setListeners() {
        int i2 = C1103R.id.webview;
        ((YoutubeWebViewPlayer) _$_findCachedViewById(i2)).setOnPageFinishedAction(new C11281());
        ((YoutubeWebViewPlayer) _$_findCachedViewById(i2)).setOnErrorAction(new C11292());
        ((TextView) _$_findCachedViewById(C1103R.id.status_text)).setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.aptoideviews.video.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                YoutubePlayer.m40689setListeners$lambda0(this.f7159f, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setListeners$lambda-0, reason: not valid java name */
    public static final void m40689setListeners$lambda0(YoutubePlayer youtubePlayer, View view) {
        C9801m.m32346f(youtubePlayer, "this$0");
        ((ProgressBar) youtubePlayer._$_findCachedViewById(C1103R.id.progress_bar)).setVisibility(0);
        ((TextView) youtubePlayer._$_findCachedViewById(C1103R.id.status_text)).setVisibility(8);
        ExtensionsKt.safeLet(youtubePlayer.currentVideoId, youtubePlayer.currentEnableSubtitles, new YoutubePlayer$setListeners$3$1(youtubePlayer));
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
        this.currentVideoId = videoId;
        this.currentEnableSubtitles = Boolean.valueOf(enableSubtitles);
        ((YoutubeWebViewPlayer) _$_findCachedViewById(C1103R.id.webview)).loadVideo(videoId, enableSubtitles);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YoutubePlayer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C9801m.m32346f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YoutubePlayer(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C9801m.m32346f(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.threadHandler = new Handler();
        setLayoutTransition(new LayoutTransition());
        FrameLayout.inflate(context, C1103R.layout.youtube_player, this);
        setListeners();
    }
}
