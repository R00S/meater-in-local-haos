package android.view;

import android.view.AbstractC2106m;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import t3.C4547d;

/* compiled from: SavedStateHandleController.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroidx/lifecycle/Q;", "Landroidx/lifecycle/s;", "Ljava/io/Closeable;", "", "key", "Landroidx/lifecycle/O;", "handle", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/O;)V", "Lt3/d;", "registry", "Landroidx/lifecycle/m;", "lifecycle", "Loa/F;", "a", "(Lt3/d;Landroidx/lifecycle/m;)V", "Landroidx/lifecycle/v;", "source", "Landroidx/lifecycle/m$a;", "event", "f", "(Landroidx/lifecycle/v;Landroidx/lifecycle/m$a;)V", "close", "()V", "B", "Ljava/lang/String;", "C", "Landroidx/lifecycle/O;", "b", "()Landroidx/lifecycle/O;", "", "<set-?>", "D", "Z", "c", "()Z", "isAttached", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Q implements InterfaceC2111s, Closeable {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final String key;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final O handle;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private boolean isAttached;

    public Q(String key, O handle) {
        C3862t.g(key, "key");
        C3862t.g(handle, "handle");
        this.key = key;
        this.handle = handle;
    }

    public final void a(C4547d registry, AbstractC2106m lifecycle) {
        C3862t.g(registry, "registry");
        C3862t.g(lifecycle, "lifecycle");
        if (this.isAttached) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.isAttached = true;
        lifecycle.a(this);
        registry.h(this.key, this.handle.getSavedStateProvider());
    }

    /* renamed from: b, reason: from getter */
    public final O getHandle() {
        return this.handle;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    @Override // android.view.InterfaceC2111s
    public void f(InterfaceC2114v source, AbstractC2106m.a event) {
        C3862t.g(source, "source");
        C3862t.g(event, "event");
        if (event == AbstractC2106m.a.ON_DESTROY) {
            this.isAttached = false;
            source.getLifecycle().d(this);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
