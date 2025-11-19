package kotlin.jvm.internal;

/* compiled from: PropertyReference.java */
/* loaded from: classes2.dex */
public abstract class J extends AbstractC3849f implements Ia.m {

    /* renamed from: B, reason: collision with root package name */
    private final boolean f43973B;

    public J() {
        this.f43973B = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC3849f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Ia.m getReflected() {
        if (this.f43973B) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (Ia.m) super.getReflected();
    }

    @Override // kotlin.jvm.internal.AbstractC3849f
    public Ia.c compute() {
        return this.f43973B ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof J) {
            J j10 = (J) obj;
            return getOwner().equals(j10.getOwner()) && getName().equals(j10.getName()) && getSignature().equals(j10.getSignature()) && C3862t.b(getBoundReceiver(), j10.getBoundReceiver());
        }
        if (obj instanceof Ia.m) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        Ia.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public J(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f43973B = (i10 & 2) == 2;
    }
}
