package x4;

import P5.C1607o;
import android.view.InterfaceC2097e;
import android.view.InterfaceC2114v;
import android.view.J;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: MEATERAPPLifeCycleObserver.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lx4/e;", "Landroidx/lifecycle/e;", "Ljava/lang/ref/WeakReference;", "Lx4/e$a;", "listener", "<init>", "(Ljava/lang/ref/WeakReference;)V", "Landroidx/lifecycle/v;", "owner", "Loa/F;", "onStop", "(Landroidx/lifecycle/v;)V", "onStart", "B", "Ljava/lang/ref/WeakReference;", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e implements InterfaceC2097e {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final WeakReference<a> listener;

    /* compiled from: MEATERAPPLifeCycleObserver.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lx4/e$a;", "", "", "wentBackground", "Loa/F;", "q", "(Z)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        void q(boolean wentBackground);
    }

    public e(WeakReference<a> listener) {
        C3862t.g(listener, "listener");
        this.listener = listener;
        J.INSTANCE.a().getLifecycle().a(this);
    }

    @Override // android.view.InterfaceC2097e
    public void onStart(InterfaceC2114v owner) {
        C3862t.g(owner, "owner");
        C1607o.f14055a.a();
        a aVar = this.listener.get();
        if (aVar != null) {
            aVar.q(false);
        }
    }

    @Override // android.view.InterfaceC2097e
    public void onStop(InterfaceC2114v owner) {
        C3862t.g(owner, "owner");
        a aVar = this.listener.get();
        if (aVar != null) {
            aVar.q(true);
        }
    }
}
