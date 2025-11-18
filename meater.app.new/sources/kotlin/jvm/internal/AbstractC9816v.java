package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty0;

/* compiled from: PropertyReference0.java */
/* renamed from: kotlin.a0.d.v */
/* loaded from: classes2.dex */
public abstract class AbstractC9816v extends AbstractC9780b0 implements KProperty0 {
    public AbstractC9816v(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }

    @Override // kotlin.jvm.internal.AbstractC9781c
    protected KCallable computeReflected() {
        return C9790g0.m32303g(this);
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    @Override // kotlin.reflect.KProperty
    public KProperty0.a getGetter() {
        return ((KProperty0) getReflected()).getGetter();
    }
}
