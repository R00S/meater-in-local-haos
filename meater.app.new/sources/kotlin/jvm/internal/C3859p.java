package kotlin.jvm.internal;

/* compiled from: FunctionReference.java */
/* renamed from: kotlin.jvm.internal.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3859p extends AbstractC3849f implements InterfaceC3858o, Ia.h {
    private final int arity;
    private final int flags;

    public C3859p(int i10) {
        this(i10, AbstractC3849f.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.AbstractC3849f
    protected Ia.c computeReflected() {
        return P.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3859p) {
            C3859p c3859p = (C3859p) obj;
            return getName().equals(c3859p.getName()) && getSignature().equals(c3859p.getSignature()) && this.flags == c3859p.flags && this.arity == c3859p.arity && C3862t.b(getBoundReceiver(), c3859p.getBoundReceiver()) && C3862t.b(getOwner(), c3859p.getOwner());
        }
        if (obj instanceof Ia.h) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC3858o
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // Ia.h
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // Ia.h
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // Ia.h
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // Ia.h
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.AbstractC3849f, Ia.c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        Ia.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public C3859p(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC3849f
    public Ia.h getReflected() {
        return (Ia.h) super.getReflected();
    }

    public C3859p(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }
}
