package kotlin.jvm.internal;

import Ia.j;
import Ia.n;

/* compiled from: MutablePropertyReference0.java */
/* renamed from: kotlin.jvm.internal.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3866x extends B implements Ia.j {
    public AbstractC3866x(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.AbstractC3849f
    protected Ia.c computeReflected() {
        return P.e(this);
    }

    @Override // Ba.a
    public Object invoke() {
        return get();
    }

    @Override // Ia.m
    public n.a e() {
        return ((Ia.j) getReflected()).e();
    }

    @Override // Ia.i
    public j.a h() {
        return ((Ia.j) getReflected()).h();
    }
}
