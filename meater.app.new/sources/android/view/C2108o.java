package android.view;

import Xb.InterfaceC1867v0;
import android.view.AbstractC2106m;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: LifecycleController.jvm.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/lifecycle/o;", "", "Landroidx/lifecycle/m;", "lifecycle", "Landroidx/lifecycle/m$b;", "minState", "Landroidx/lifecycle/h;", "dispatchQueue", "LXb/v0;", "parentJob", "<init>", "(Landroidx/lifecycle/m;Landroidx/lifecycle/m$b;Landroidx/lifecycle/h;LXb/v0;)V", "Loa/F;", "b", "()V", "a", "Landroidx/lifecycle/m;", "Landroidx/lifecycle/m$b;", "c", "Landroidx/lifecycle/h;", "Landroidx/lifecycle/s;", "d", "Landroidx/lifecycle/s;", "observer", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2108o {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC2106m lifecycle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC2106m.b minState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C2101h dispatchQueue;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2111s observer;

    public C2108o(AbstractC2106m lifecycle, AbstractC2106m.b minState, C2101h dispatchQueue, final InterfaceC1867v0 parentJob) {
        C3862t.g(lifecycle, "lifecycle");
        C3862t.g(minState, "minState");
        C3862t.g(dispatchQueue, "dispatchQueue");
        C3862t.g(parentJob, "parentJob");
        this.lifecycle = lifecycle;
        this.minState = minState;
        this.dispatchQueue = dispatchQueue;
        InterfaceC2111s interfaceC2111s = new InterfaceC2111s() { // from class: androidx.lifecycle.n
            @Override // android.view.InterfaceC2111s
            public final void f(InterfaceC2114v interfaceC2114v, AbstractC2106m.a aVar) {
                C2108o.c(this.f25973B, parentJob, interfaceC2114v, aVar);
            }
        };
        this.observer = interfaceC2111s;
        if (lifecycle.getState() != AbstractC2106m.b.DESTROYED) {
            lifecycle.a(interfaceC2111s);
        } else {
            InterfaceC1867v0.a.a(parentJob, null, 1, null);
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C2108o this$0, InterfaceC1867v0 parentJob, InterfaceC2114v source, AbstractC2106m.a aVar) {
        C3862t.g(this$0, "this$0");
        C3862t.g(parentJob, "$parentJob");
        C3862t.g(source, "source");
        C3862t.g(aVar, "<anonymous parameter 1>");
        if (source.getLifecycle().getState() == AbstractC2106m.b.DESTROYED) {
            InterfaceC1867v0.a.a(parentJob, null, 1, null);
            this$0.b();
        } else if (source.getLifecycle().getState().compareTo(this$0.minState) < 0) {
            this$0.dispatchQueue.h();
        } else {
            this$0.dispatchQueue.i();
        }
    }

    public final void b() {
        this.lifecycle.d(this.observer);
        this.dispatchQueue.g();
    }
}
