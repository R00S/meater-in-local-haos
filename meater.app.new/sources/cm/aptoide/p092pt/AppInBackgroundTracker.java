package cm.aptoide.p092pt;

import androidx.lifecycle.AbstractC0511g;
import androidx.lifecycle.InterfaceC0514j;
import androidx.lifecycle.InterfaceC0523s;
import androidx.lifecycle.ProcessLifecycleOwner;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: AppInBackgroundTracker.kt */
@Metadata(m32266d1 = {"\u0000\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, m32267d2 = {"Lcm/aptoide/pt/AppInBackgroundTracker;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "appLifecycleListener", "cm/aptoide/pt/AppInBackgroundTracker$appLifecycleListener$1", "Lcm/aptoide/pt/AppInBackgroundTracker$appLifecycleListener$1;", "isAppInBackground", HttpUrl.FRAGMENT_ENCODE_SET, "initialize", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class AppInBackgroundTracker {
    private final AppInBackgroundTracker$appLifecycleListener$1 appLifecycleListener = new InterfaceC0514j() { // from class: cm.aptoide.pt.AppInBackgroundTracker$appLifecycleListener$1
        @InterfaceC0523s(AbstractC0511g.b.ON_STOP)
        public final void onMoveToBackground() {
            this.this$0.isAppInBackground = true;
        }

        @InterfaceC0523s(AbstractC0511g.b.ON_START)
        public final void onMoveToForeground() {
            this.this$0.isAppInBackground = false;
        }
    };
    private boolean isAppInBackground;

    public final void initialize() {
        ProcessLifecycleOwner.m3827h().getLifecycle().mo3861a(this.appLifecycleListener);
    }

    /* renamed from: isAppInBackground, reason: from getter */
    public final boolean getIsAppInBackground() {
        return this.isAppInBackground;
    }
}
