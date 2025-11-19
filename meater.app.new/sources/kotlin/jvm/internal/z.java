package kotlin.jvm.internal;

import Ia.k;
import Ia.o;

/* compiled from: MutablePropertyReference1.java */
/* loaded from: classes2.dex */
public abstract class z extends B implements Ia.k {
    public z(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.AbstractC3849f
    protected Ia.c computeReflected() {
        return P.f(this);
    }

    @Override // Ba.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // Ia.m
    /* renamed from: e */
    public o.a h0() {
        return ((Ia.k) getReflected()).h0();
    }

    @Override // Ia.i
    public k.a h() {
        return ((Ia.k) getReflected()).h();
    }
}
