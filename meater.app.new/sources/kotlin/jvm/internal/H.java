package kotlin.jvm.internal;

import Ia.p;

/* compiled from: PropertyReference2.java */
/* loaded from: classes2.dex */
public abstract class H extends J implements Ia.p {
    public H(Class cls, String str, String str2, int i10) {
        super(AbstractC3849f.NO_RECEIVER, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.AbstractC3849f
    protected Ia.c computeReflected() {
        return P.i(this);
    }

    @Override // Ba.p
    public Object invoke(Object obj, Object obj2) {
        return t(obj, obj2);
    }

    @Override // Ia.m
    /* renamed from: e */
    public p.a h0() {
        return ((Ia.p) getReflected()).h0();
    }
}
