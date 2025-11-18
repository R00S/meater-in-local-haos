package kotlin.jvm.internal;

import Ia.o;

/* compiled from: PropertyReference1.java */
/* loaded from: classes2.dex */
public abstract class F extends J implements Ia.o {
    public F() {
    }

    @Override // kotlin.jvm.internal.AbstractC3849f
    protected Ia.c computeReflected() {
        return P.h(this);
    }

    @Override // Ba.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    public F(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // Ia.m
    /* renamed from: e */
    public o.a h0() {
        return ((Ia.o) getReflected()).h0();
    }
}
