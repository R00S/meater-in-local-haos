package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;

/* compiled from: FunctionReference.java */
/* renamed from: kotlin.a0.d.i */
/* loaded from: classes2.dex */
public class C9793i extends AbstractC9781c implements FunctionBase, KFunction {

    /* renamed from: f */
    private final int f37182f;

    /* renamed from: g */
    private final int f37183g;

    public C9793i(int i2) {
        this(i2, AbstractC9781c.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.AbstractC9781c
    protected KCallable computeReflected() {
        return C9790g0.m32297a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9793i) {
            C9793i c9793i = (C9793i) obj;
            return getName().equals(c9793i.getName()) && getSignature().equals(c9793i.getSignature()) && this.f37183g == c9793i.f37183g && this.f37182f == c9793i.f37182f && C9801m.m32341a(getBoundReceiver(), c9793i.getBoundReceiver()) && C9801m.m32341a(getOwner(), c9793i.getOwner());
        }
        if (obj instanceof KFunction) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.f37182f;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // kotlin.jvm.internal.AbstractC9781c, kotlin.reflect.KCallable
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC9781c
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public KFunction getReflected() {
        return (KFunction) super.getReflected();
    }

    public String toString() {
        KCallable kCallableCompute = compute();
        if (kCallableCompute != this) {
            return kCallableCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public C9793i(int i2, Object obj) {
        this(i2, obj, null, null, null, 0);
    }

    public C9793i(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.f37182f = i2;
        this.f37183g = i3 >> 1;
    }
}
