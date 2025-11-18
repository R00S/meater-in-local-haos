package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KProperty0;

/* compiled from: MutablePropertyReference0.java */
/* renamed from: kotlin.a0.d.p */
/* loaded from: classes2.dex */
public abstract class AbstractC9810p extends AbstractC9814t implements KMutableProperty0 {
    public AbstractC9810p() {
    }

    @Override // kotlin.jvm.internal.AbstractC9781c
    protected KCallable computeReflected() {
        return C9790g0.m32301e(this);
    }

    @Override // kotlin.reflect.KProperty0
    public Object getDelegate() {
        return ((KMutableProperty0) getReflected()).getDelegate();
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    public AbstractC9810p(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.KProperty
    public KProperty0.a getGetter() {
        return ((KMutableProperty0) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.KMutableProperty
    public KMutableProperty0.a getSetter() {
        return ((KMutableProperty0) getReflected()).getSetter();
    }

    public AbstractC9810p(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }
}
