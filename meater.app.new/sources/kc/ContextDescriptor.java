package kc;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ContextAware.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u0018R\u0014\u0010 \u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016R\u0014\u0010!\u001a\u00020\u000e8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lkc/c;", "Lkc/f;", "original", "LIa/d;", "kClass", "<init>", "(Lkc/f;LIa/d;)V", "", "index", "e", "(I)Lkc/f;", "", "d", "(I)Ljava/lang/String;", "", "f", "(I)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Lkc/f;", "b", "LIa/d;", "c", "Ljava/lang/String;", "serialName", "elementsCount", "isInline", "()Z", "Lkc/j;", "i", "()Lkc/j;", "kind", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kc.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes3.dex */
final class ContextDescriptor implements f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f original;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Ia.d<?> kClass;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String serialName;

    public ContextDescriptor(f original, Ia.d<?> kClass) {
        C3862t.g(original, "original");
        C3862t.g(kClass, "kClass");
        this.original = original;
        this.kClass = kClass;
        this.serialName = original.getSerialName() + '<' + kClass.r() + '>';
    }

    @Override // kc.f
    /* renamed from: a, reason: from getter */
    public String getSerialName() {
        return this.serialName;
    }

    @Override // kc.f
    /* renamed from: c */
    public int getElementsCount() {
        return this.original.getElementsCount();
    }

    @Override // kc.f
    public String d(int index) {
        return this.original.d(index);
    }

    @Override // kc.f
    public f e(int index) {
        return this.original.e(index);
    }

    public boolean equals(Object other) {
        ContextDescriptor contextDescriptor = other instanceof ContextDescriptor ? (ContextDescriptor) other : null;
        return contextDescriptor != null && C3862t.b(this.original, contextDescriptor.original) && C3862t.b(contextDescriptor.kClass, this.kClass);
    }

    @Override // kc.f
    public boolean f(int index) {
        return this.original.f(index);
    }

    public int hashCode() {
        return (this.kClass.hashCode() * 31) + getSerialName().hashCode();
    }

    @Override // kc.f
    public j i() {
        return this.original.i();
    }

    @Override // kc.f
    public boolean isInline() {
        return this.original.isInline();
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.kClass + ", original: " + this.original + ')';
    }
}
