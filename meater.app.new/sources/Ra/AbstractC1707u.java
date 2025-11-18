package Ra;

import kotlin.jvm.internal.C3862t;

/* compiled from: DescriptorVisibility.kt */
/* renamed from: Ra.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1707u {
    protected AbstractC1707u() {
    }

    public final Integer a(AbstractC1707u visibility) {
        C3862t.g(visibility, "visibility");
        return b().a(visibility.b());
    }

    public abstract x0 b();

    public abstract String c();

    public final boolean d() {
        return b().c();
    }

    public abstract boolean e(Bb.g gVar, InterfaceC1704q interfaceC1704q, InterfaceC1700m interfaceC1700m, boolean z10);

    public abstract AbstractC1707u f();

    public final String toString() {
        return b().toString();
    }
}
