package android.view;

import android.view.AbstractC2106m;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: SingleGeneratedAdapterObserver.jvm.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/X;", "Landroidx/lifecycle/s;", "Landroidx/lifecycle/j;", "generatedAdapter", "<init>", "(Landroidx/lifecycle/j;)V", "Landroidx/lifecycle/v;", "source", "Landroidx/lifecycle/m$a;", "event", "Loa/F;", "f", "(Landroidx/lifecycle/v;Landroidx/lifecycle/m$a;)V", "B", "Landroidx/lifecycle/j;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class X implements InterfaceC2111s {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2103j generatedAdapter;

    public X(InterfaceC2103j generatedAdapter) {
        C3862t.g(generatedAdapter, "generatedAdapter");
        this.generatedAdapter = generatedAdapter;
    }

    @Override // android.view.InterfaceC2111s
    public void f(InterfaceC2114v source, AbstractC2106m.a event) {
        C3862t.g(source, "source");
        C3862t.g(event, "event");
        this.generatedAdapter.a(source, event, false, null);
        this.generatedAdapter.a(source, event, true, null);
    }
}
