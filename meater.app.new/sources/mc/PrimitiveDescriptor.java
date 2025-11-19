package mc;

import kc.f;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Primitives.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001b¨\u0006#"}, d2 = {"Lmc/M;", "Lkc/f;", "", "serialName", "Lkc/e;", "kind", "<init>", "(Ljava/lang/String;Lkc/e;)V", "", "b", "()Ljava/lang/Void;", "", "index", "d", "(I)Ljava/lang/String;", "", "f", "(I)Z", "e", "(I)Lkc/f;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Ljava/lang/String;", "Lkc/e;", "g", "()Lkc/e;", "c", "elementsCount", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mc.M, reason: from toString */
/* loaded from: classes3.dex */
public final class PrimitiveDescriptor implements kc.f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String serialName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final kc.e kind;

    public PrimitiveDescriptor(String serialName, kc.e kind) {
        C3862t.g(serialName, "serialName");
        C3862t.g(kind, "kind");
        this.serialName = serialName;
        this.kind = kind;
    }

    private final Void b() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kc.f
    /* renamed from: a, reason: from getter */
    public String getSerialName() {
        return this.serialName;
    }

    @Override // kc.f
    /* renamed from: c */
    public int getElementsCount() {
        return 0;
    }

    @Override // kc.f
    public String d(int index) {
        b();
        throw new KotlinNothingValueException();
    }

    @Override // kc.f
    public kc.f e(int index) {
        b();
        throw new KotlinNothingValueException();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrimitiveDescriptor)) {
            return false;
        }
        PrimitiveDescriptor primitiveDescriptor = (PrimitiveDescriptor) other;
        return C3862t.b(getSerialName(), primitiveDescriptor.getSerialName()) && C3862t.b(i(), primitiveDescriptor.i());
    }

    @Override // kc.f
    public boolean f(int index) {
        b();
        throw new KotlinNothingValueException();
    }

    @Override // kc.f
    /* renamed from: g, reason: from getter and merged with bridge method [inline-methods] */
    public kc.e i() {
        return this.kind;
    }

    public int hashCode() {
        return getSerialName().hashCode() + (i().hashCode() * 31);
    }

    @Override // kc.f
    public boolean isInline() {
        return f.a.a(this);
    }

    public String toString() {
        return "PrimitiveDescriptor(" + getSerialName() + ')';
    }
}
