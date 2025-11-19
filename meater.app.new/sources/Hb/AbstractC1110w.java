package Hb;

import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import kotlin.jvm.internal.C3862t;
import tb.C4597i;

/* compiled from: ClassifierBasedTypeConstructor.kt */
/* renamed from: Hb.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1110w implements y0 {

    /* renamed from: a, reason: collision with root package name */
    private int f5796a;

    private final boolean d(InterfaceC1695h interfaceC1695h) {
        return (Jb.l.m(interfaceC1695h) || C4597i.E(interfaceC1695h)) ? false : true;
    }

    protected final boolean c(InterfaceC1695h first, InterfaceC1695h second) {
        C3862t.g(first, "first");
        C3862t.g(second, "second");
        if (!C3862t.b(first.getName(), second.getName())) {
            return false;
        }
        InterfaceC1700m interfaceC1700mC = first.c();
        for (InterfaceC1700m interfaceC1700mC2 = second.c(); interfaceC1700mC != null && interfaceC1700mC2 != null; interfaceC1700mC2 = interfaceC1700mC2.c()) {
            if (interfaceC1700mC instanceof Ra.H) {
                return interfaceC1700mC2 instanceof Ra.H;
            }
            if (interfaceC1700mC2 instanceof Ra.H) {
                return false;
            }
            if (interfaceC1700mC instanceof Ra.N) {
                return (interfaceC1700mC2 instanceof Ra.N) && C3862t.b(((Ra.N) interfaceC1700mC).f(), ((Ra.N) interfaceC1700mC2).f());
            }
            if ((interfaceC1700mC2 instanceof Ra.N) || !C3862t.b(interfaceC1700mC.getName(), interfaceC1700mC2.getName())) {
                return false;
            }
            interfaceC1700mC = interfaceC1700mC.c();
        }
        return true;
    }

    protected abstract boolean e(InterfaceC1695h interfaceC1695h);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0) || obj.hashCode() != hashCode()) {
            return false;
        }
        y0 y0Var = (y0) obj;
        if (y0Var.getParameters().size() != getParameters().size()) {
            return false;
        }
        InterfaceC1695h interfaceC1695hT = t();
        InterfaceC1695h interfaceC1695hT2 = y0Var.t();
        if (interfaceC1695hT2 != null && d(interfaceC1695hT) && d(interfaceC1695hT2)) {
            return e(interfaceC1695hT2);
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f5796a;
        if (i10 != 0) {
            return i10;
        }
        InterfaceC1695h interfaceC1695hT = t();
        int iHashCode = d(interfaceC1695hT) ? C4597i.m(interfaceC1695hT).hashCode() : System.identityHashCode(this);
        this.f5796a = iHashCode;
        return iHashCode;
    }

    @Override // Hb.y0
    public abstract InterfaceC1695h t();
}
