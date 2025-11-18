package cm.aptoide.aptoideviews.downloadprogressview;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import cm.aptoide.aptoideviews.C1103R;
import cm.aptoide.aptoideviews.common.AnimatedImageView;
import cm.aptoide.aptoideviews.common.Debouncer;
import cm.aptoide.aptoideviews.downloadprogressview.DownloadEventListener;
import cm.aptoide.aptoideviews.downloadprogressview.Event;
import cm.aptoide.aptoideviews.downloadprogressview.State;
import cm.aptoide.p092pt.preferences.managed.ManagedKeys;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p241e.p316i.C9052a;
import p456rx.C11234e;

/* compiled from: DownloadProgressView.kt */
@Metadata(m32266d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0007J\b\u0010 \u001a\u00020!H\u0014J\b\u0010\"\u001a\u00020!H\u0014J\u0006\u0010#\u001a\u00020!J\u0006\u0010$\u001a\u00020!J\b\u0010%\u001a\u00020!H\u0002J\u001a\u0010&\u001a\u00020!2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u0015\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\b*J\u000e\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020\fJ\u0010\u0010-\u001a\u00020!2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010.\u001a\u00020!2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u000e\u0010/\u001a\u00020!2\u0006\u00100\u001a\u00020\tJ\u0010\u00101\u001a\u00020!2\b\u00102\u001a\u0004\u0018\u000103J\b\u00104\u001a\u00020!H\u0002J\u0006\u00105\u001a\u00020!J\u0006\u00106\u001a\u00020!R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00180\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00067"}, m32267d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/DownloadProgressView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", HttpUrl.FRAGMENT_ENCODE_SET, "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", ManagedKeys.ANIMATIONS_ENABLED, HttpUrl.FRAGMENT_ENCODE_SET, "currentProgress", "debouncer", "Lcm/aptoide/aptoideviews/common/Debouncer;", "downloadingText", HttpUrl.FRAGMENT_ENCODE_SET, "eventListener", "Lcm/aptoide/aptoideviews/downloadprogressview/DownloadEventListener;", "installingText", "isPausable", "pausedText", "payload", HttpUrl.FRAGMENT_ENCODE_SET, "stateMachine", "Lcom/tinder/StateMachine;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", "Lcm/aptoide/aptoideviews/downloadprogressview/Event;", "events", "Lrx/Observable;", "Lcm/aptoide/aptoideviews/downloadprogressview/DownloadEventListener$Action;", "onAttachedToWindow", HttpUrl.FRAGMENT_ENCODE_SET, "onDetachedFromWindow", "pauseDownload", "reset", "resetProgress", "retrievePreferences", "setDebounceTime", "time", HttpUrl.FRAGMENT_ENCODE_SET, "setDebounceTime$aptoide_views_prodRelease", "setEnableAnimations", "enableAnimations", "setEventListener", "setPayload", "setProgress", "progress", "setProgressDrawable", "progressDrawable", "Landroid/graphics/drawable/Drawable;", "setupClickListeners", "startDownload", "startInstallation", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class DownloadProgressView extends FrameLayout {
    public Map<Integer, View> _$_findViewCache;
    private boolean animationsEnabled;
    private int currentProgress;
    private Debouncer debouncer;
    private String downloadingText;
    private DownloadEventListener eventListener;
    private String installingText;
    private boolean isPausable;
    private String pausedText;
    private Object payload;
    private C9052a<State, Event, Object> stateMachine;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DownloadProgressView(Context context) {
        this(context, null);
        C9801m.m32346f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetProgress() {
        this.currentProgress = 0;
        ((ProgressBar) _$_findCachedViewById(C1103R.id.progressBar)).setProgress(this.currentProgress);
        StringBuilder sb = new StringBuilder();
        sb.append(this.currentProgress);
        sb.append('%');
        ((TextView) _$_findCachedViewById(C1103R.id.downloadProgressNumber)).setText(sb.toString());
    }

    private final void retrievePreferences(AttributeSet attrs, int defStyleAttr) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C1103R.styleable.DownloadProgressView, defStyleAttr, 0);
        C9801m.m32345e(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…essView, defStyleAttr, 0)");
        setProgressDrawable(typedArrayObtainStyledAttributes.getDrawable(C1103R.styleable.DownloadProgressView_progressDrawable));
        setEnableAnimations(typedArrayObtainStyledAttributes.getBoolean(C1103R.styleable.DownloadProgressView_enableAnimations, true));
        this.isPausable = typedArrayObtainStyledAttributes.getBoolean(C1103R.styleable.DownloadProgressView_isPausable, true);
        String string = typedArrayObtainStyledAttributes.getString(C1103R.styleable.DownloadProgressView_downloadingText);
        if (string == null) {
            string = getContext().getString(C1103R.string.appview_short_downloading);
            C9801m.m32345e(string, "context.getString(\n     …ppview_short_downloading)");
        }
        this.downloadingText = string;
        String string2 = typedArrayObtainStyledAttributes.getString(C1103R.styleable.DownloadProgressView_pausedText);
        if (string2 == null) {
            string2 = getContext().getString(C1103R.string.apps_short_download_paused);
            C9801m.m32345e(string2, "context.getString(\n     …ps_short_download_paused)");
        }
        this.pausedText = string2;
        String string3 = typedArrayObtainStyledAttributes.getString(C1103R.styleable.DownloadProgressView_installingText);
        if (string3 == null) {
            string3 = getContext().getString(C1103R.string.apps_short_installing);
            C9801m.m32345e(string3, "context.getString(\n     …ng.apps_short_installing)");
        }
        this.installingText = string3;
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void setupClickListeners() {
        ((ImageView) _$_findCachedViewById(C1103R.id.cancelButton)).setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.aptoideviews.downloadprogressview.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadProgressView.m40678setupClickListeners$lambda0(this.f7147f, view);
            }
        });
        ((AnimatedImageView) _$_findCachedViewById(C1103R.id.resumePauseButton)).setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.aptoideviews.downloadprogressview.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadProgressView.m40679setupClickListeners$lambda1(this.f7146f, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupClickListeners$lambda-0, reason: not valid java name */
    public static final void m40678setupClickListeners$lambda0(DownloadProgressView downloadProgressView, View view) {
        C9801m.m32346f(downloadProgressView, "this$0");
        downloadProgressView.debouncer.execute(new DownloadProgressView$setupClickListeners$1$1(downloadProgressView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupClickListeners$lambda-1, reason: not valid java name */
    public static final void m40679setupClickListeners$lambda1(DownloadProgressView downloadProgressView, View view) {
        C9801m.m32346f(downloadProgressView, "this$0");
        downloadProgressView.debouncer.execute(new DownloadProgressView$setupClickListeners$2$1(downloadProgressView));
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

    public final C11234e<DownloadEventListener.Action> events() {
        C11234e<DownloadEventListener.Action> c11234eM40048l = C11234e.m40048l(new DownloadProgressViewEventOnSubscribe(this));
        C9801m.m32345e(c11234eM40048l, "create(DownloadProgressViewEventOnSubscribe(this))");
        return c11234eM40048l;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setupClickListeners();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((ImageView) _$_findCachedViewById(C1103R.id.cancelButton)).setOnClickListener(null);
        ((AnimatedImageView) _$_findCachedViewById(C1103R.id.resumePauseButton)).setOnClickListener(null);
    }

    public final void pauseDownload() {
        this.stateMachine.m29076g(Event.PauseStart.INSTANCE);
    }

    public final void reset() {
        this.stateMachine.m29076g(Event.Reset.INSTANCE);
    }

    public final void setDebounceTime$aptoide_views_prodRelease(long time) {
        this.debouncer = new Debouncer(time);
    }

    public final void setEnableAnimations(boolean enableAnimations) {
        this.animationsEnabled = enableAnimations;
        ((AnimatedImageView) _$_findCachedViewById(C1103R.id.resumePauseButton)).setAnimationsEnabled(enableAnimations);
        ((ConstraintLayout) _$_findCachedViewById(C1103R.id.rootLayout)).setLayoutTransition(enableAnimations ? new LayoutTransition() : null);
    }

    public final void setEventListener(DownloadEventListener eventListener) {
        this.eventListener = eventListener;
        if (eventListener == null) {
            ((ImageView) _$_findCachedViewById(C1103R.id.cancelButton)).setOnClickListener(null);
            ((AnimatedImageView) _$_findCachedViewById(C1103R.id.resumePauseButton)).setOnClickListener(null);
        }
    }

    public final void setPayload(Object payload) {
        this.payload = payload;
    }

    public final void setProgress(int progress) {
        if (C9801m.m32341a(this.stateMachine.m29075b(), State.Queue.INSTANCE) || C9801m.m32341a(this.stateMachine.m29075b(), State.Canceled.INSTANCE)) {
            return;
        }
        this.currentProgress = Math.min(Math.max(progress, 0), 100);
        if (C9801m.m32341a(this.stateMachine.m29075b(), State.InProgress.INSTANCE) || C9801m.m32341a(this.stateMachine.m29075b(), State.InitialPaused.INSTANCE)) {
            if (Build.VERSION.SDK_INT >= 24) {
                ((ProgressBar) _$_findCachedViewById(C1103R.id.progressBar)).setProgress(this.currentProgress, this.animationsEnabled);
            } else {
                ((ProgressBar) _$_findCachedViewById(C1103R.id.progressBar)).setProgress(this.currentProgress);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.currentProgress);
            sb.append('%');
            ((TextView) _$_findCachedViewById(C1103R.id.downloadProgressNumber)).setText(sb.toString());
        }
    }

    public final void setProgressDrawable(Drawable progressDrawable) {
        if (progressDrawable != null) {
            ((ProgressBar) _$_findCachedViewById(C1103R.id.progressBar)).setProgressDrawable(progressDrawable);
        }
    }

    public final void startDownload() {
        this.stateMachine.m29076g(Event.DownloadStart.INSTANCE);
    }

    public final void startInstallation() {
        this.stateMachine.m29076g(Event.InstallStart.INSTANCE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DownloadProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C9801m.m32346f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadProgressView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C9801m.m32346f(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.isPausable = true;
        this.debouncer = new Debouncer(750L);
        this.downloadingText = HttpUrl.FRAGMENT_ENCODE_SET;
        this.pausedText = HttpUrl.FRAGMENT_ENCODE_SET;
        this.installingText = HttpUrl.FRAGMENT_ENCODE_SET;
        this.stateMachine = C9052a.f34854a.m29078b(new DownloadProgressView$stateMachine$1(this));
        FrameLayout.inflate(context, C1103R.layout.download_progress_view, this);
        retrievePreferences(attributeSet, i2);
    }
}
