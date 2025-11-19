package m8;

import java.io.Serializable;
import l8.C3918k;
import l8.InterfaceC3914g;

/* compiled from: ByFunctionOrdering.java */
/* renamed from: m8.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3993h<F, T> extends U<F> implements Serializable {

    /* renamed from: B, reason: collision with root package name */
    final InterfaceC3914g<F, ? extends T> f45335B;

    /* renamed from: C, reason: collision with root package name */
    final U<T> f45336C;

    C3993h(InterfaceC3914g<F, ? extends T> interfaceC3914g, U<T> u10) {
        this.f45335B = (InterfaceC3914g) l8.m.l(interfaceC3914g);
        this.f45336C = (U) l8.m.l(u10);
    }

    @Override // m8.U, java.util.Comparator
    public int compare(F f10, F f11) {
        return this.f45336C.compare(this.f45335B.apply(f10), this.f45335B.apply(f11));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3993h)) {
            return false;
        }
        C3993h c3993h = (C3993h) obj;
        return this.f45335B.equals(c3993h.f45335B) && this.f45336C.equals(c3993h.f45336C);
    }

    public int hashCode() {
        return C3918k.b(this.f45335B, this.f45336C);
    }

    public String toString() {
        return this.f45336C + ".onResultOf(" + this.f45335B + ")";
    }
}
