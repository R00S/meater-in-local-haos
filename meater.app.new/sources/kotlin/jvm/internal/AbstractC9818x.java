package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty1;

/* compiled from: PropertyReference1.java */
/* renamed from: kotlin.a0.d.x */
/* loaded from: classes2.dex */
public abstract class AbstractC9818x extends AbstractC9780b0 implements KProperty1 {
    public AbstractC9818x(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }

    @Override // kotlin.jvm.internal.AbstractC9781c
    protected KCallable computeReflected() {
        return C9790g0.m32304h(this);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // kotlin.reflect.KProperty
    public KProperty1.a getGetter() {
        return ((KProperty1) getReflected()).getGetter();
    }
}
