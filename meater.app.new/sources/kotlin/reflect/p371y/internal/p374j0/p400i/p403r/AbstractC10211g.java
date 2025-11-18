package kotlin.reflect.p371y.internal.p374j0.p400i.p403r;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;

/* compiled from: constantValues.kt */
/* renamed from: kotlin.f0.y.e.j0.i.r.g */
/* loaded from: classes3.dex */
public abstract class AbstractC10211g<T> {

    /* renamed from: a */
    private final T f39559a;

    public AbstractC10211g(T t) {
        this.f39559a = t;
    }

    /* renamed from: a */
    public abstract AbstractC10344e0 mo36013a(InterfaceC10592g0 interfaceC10592g0);

    /* renamed from: b */
    public T mo36023b() {
        return this.f39559a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            T tMo36023b = mo36023b();
            AbstractC10211g abstractC10211g = obj instanceof AbstractC10211g ? (AbstractC10211g) obj : null;
            if (!C9801m.m32341a(tMo36023b, abstractC10211g != null ? abstractC10211g.mo36023b() : null)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        T tMo36023b = mo36023b();
        if (tMo36023b != null) {
            return tMo36023b.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(mo36023b());
    }
}
