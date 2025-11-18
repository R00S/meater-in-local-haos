package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10604k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10187d;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10427k;

/* compiled from: ClassifierBasedTypeConstructor.kt */
/* renamed from: kotlin.f0.y.e.j0.l.m */
/* loaded from: classes3.dex */
public abstract class AbstractC10367m implements InterfaceC10345e1 {

    /* renamed from: a */
    private int f40146a;

    /* renamed from: h */
    private final boolean m36764h(InterfaceC10594h interfaceC10594h) {
        return (C10427k.m37054m(interfaceC10594h) || C10187d.m35804E(interfaceC10594h)) ? false : true;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: c */
    public abstract InterfaceC10594h mo32891w();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC10345e1) || obj.hashCode() != hashCode()) {
            return false;
        }
        InterfaceC10345e1 interfaceC10345e1 = (InterfaceC10345e1) obj;
        if (interfaceC10345e1.getParameters().size() != getParameters().size()) {
            return false;
        }
        InterfaceC10594h interfaceC10594hMo32891w = mo32891w();
        InterfaceC10594h interfaceC10594hMo32891w2 = interfaceC10345e1.mo32891w();
        if (interfaceC10594hMo32891w2 != null && m36764h(interfaceC10594hMo32891w) && m36764h(interfaceC10594hMo32891w2)) {
            return mo36579i(interfaceC10594hMo32891w2);
        }
        return false;
    }

    /* renamed from: g */
    protected final boolean m36765g(InterfaceC10594h interfaceC10594h, InterfaceC10594h interfaceC10594h2) {
        C9801m.m32346f(interfaceC10594h, "first");
        C9801m.m32346f(interfaceC10594h2, "second");
        if (!C9801m.m32341a(interfaceC10594h.getName(), interfaceC10594h2.getName())) {
            return false;
        }
        InterfaceC10609m interfaceC10609mMo32876b = interfaceC10594h.mo32876b();
        for (InterfaceC10609m interfaceC10609mMo32876b2 = interfaceC10594h2.mo32876b(); interfaceC10609mMo32876b != null && interfaceC10609mMo32876b2 != null; interfaceC10609mMo32876b2 = interfaceC10609mMo32876b2.mo32876b()) {
            if (interfaceC10609mMo32876b instanceof InterfaceC10592g0) {
                return interfaceC10609mMo32876b2 instanceof InterfaceC10592g0;
            }
            if (interfaceC10609mMo32876b2 instanceof InterfaceC10592g0) {
                return false;
            }
            if (interfaceC10609mMo32876b instanceof InterfaceC10604k0) {
                return (interfaceC10609mMo32876b2 instanceof InterfaceC10604k0) && C9801m.m32341a(((InterfaceC10604k0) interfaceC10609mMo32876b).mo37712d(), ((InterfaceC10604k0) interfaceC10609mMo32876b2).mo37712d());
            }
            if ((interfaceC10609mMo32876b2 instanceof InterfaceC10604k0) || !C9801m.m32341a(interfaceC10609mMo32876b.getName(), interfaceC10609mMo32876b2.getName())) {
                return false;
            }
            interfaceC10609mMo32876b = interfaceC10609mMo32876b.mo32876b();
        }
        return true;
    }

    public int hashCode() {
        int i2 = this.f40146a;
        if (i2 != 0) {
            return i2;
        }
        InterfaceC10594h interfaceC10594hMo32891w = mo32891w();
        int iHashCode = m36764h(interfaceC10594hMo32891w) ? C10187d.m35825m(interfaceC10594hMo32891w).hashCode() : System.identityHashCode(this);
        this.f40146a = iHashCode;
        return iHashCode;
    }

    /* renamed from: i */
    protected abstract boolean mo36579i(InterfaceC10594h interfaceC10594h);
}
