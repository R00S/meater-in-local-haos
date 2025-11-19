package tb;

import Ra.InterfaceC1689b;
import kotlin.jvm.internal.C3862t;

/* compiled from: OverridingStrategy.kt */
/* renamed from: tb.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4601m extends AbstractC4602n {
    @Override // tb.AbstractC4602n
    public void b(InterfaceC1689b first, InterfaceC1689b second) {
        C3862t.g(first, "first");
        C3862t.g(second, "second");
        e(first, second);
    }

    @Override // tb.AbstractC4602n
    public void c(InterfaceC1689b fromSuper, InterfaceC1689b fromCurrent) {
        C3862t.g(fromSuper, "fromSuper");
        C3862t.g(fromCurrent, "fromCurrent");
        e(fromSuper, fromCurrent);
    }

    protected abstract void e(InterfaceC1689b interfaceC1689b, InterfaceC1689b interfaceC1689b2);
}
