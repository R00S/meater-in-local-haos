package android.view;

import android.view.AbstractC2106m;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: CompositeGeneratedAdaptersObserver.jvm.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/d;", "Landroidx/lifecycle/s;", "", "Landroidx/lifecycle/j;", "generatedAdapters", "<init>", "([Landroidx/lifecycle/j;)V", "Landroidx/lifecycle/v;", "source", "Landroidx/lifecycle/m$a;", "event", "Loa/F;", "f", "(Landroidx/lifecycle/v;Landroidx/lifecycle/m$a;)V", "B", "[Landroidx/lifecycle/j;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2096d implements InterfaceC2111s {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2103j[] generatedAdapters;

    public C2096d(InterfaceC2103j[] generatedAdapters) {
        C3862t.g(generatedAdapters, "generatedAdapters");
        this.generatedAdapters = generatedAdapters;
    }

    @Override // android.view.InterfaceC2111s
    public void f(InterfaceC2114v source, AbstractC2106m.a event) {
        C3862t.g(source, "source");
        C3862t.g(event, "event");
        C c10 = new C();
        for (InterfaceC2103j interfaceC2103j : this.generatedAdapters) {
            interfaceC2103j.a(source, event, false, c10);
        }
        for (InterfaceC2103j interfaceC2103j2 : this.generatedAdapters) {
            interfaceC2103j2.a(source, event, true, c10);
        }
    }
}
