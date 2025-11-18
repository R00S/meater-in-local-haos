package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty;

/* compiled from: PropertyReference.java */
/* renamed from: kotlin.a0.d.b0 */
/* loaded from: classes2.dex */
public abstract class AbstractC9780b0 extends AbstractC9781c implements KProperty {
    public AbstractC9780b0() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC9780b0) {
            AbstractC9780b0 abstractC9780b0 = (AbstractC9780b0) obj;
            return getOwner().equals(abstractC9780b0.getOwner()) && getName().equals(abstractC9780b0.getName()) && getSignature().equals(abstractC9780b0.getSignature()) && C9801m.m32341a(getBoundReceiver(), abstractC9780b0.getBoundReceiver());
        }
        if (obj instanceof KProperty) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // kotlin.reflect.KProperty
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // kotlin.reflect.KProperty
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        KCallable kCallableCompute = compute();
        if (kCallableCompute != this) {
            return kCallableCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public AbstractC9780b0(Object obj) {
        super(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC9781c
    public KProperty getReflected() {
        return (KProperty) super.getReflected();
    }

    public AbstractC9780b0(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
    }
}
