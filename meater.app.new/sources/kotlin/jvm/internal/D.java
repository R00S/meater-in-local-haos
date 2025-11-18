package kotlin.jvm.internal;

import Ia.n;

/* compiled from: PropertyReference0.java */
/* loaded from: classes2.dex */
public abstract class D extends J implements Ia.n {
    public D(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.AbstractC3849f
    protected Ia.c computeReflected() {
        return P.g(this);
    }

    @Override // Ba.a
    public Object invoke() {
        return get();
    }

    @Override // Ia.m
    public n.a e() {
        return ((Ia.n) getReflected()).e();
    }
}
