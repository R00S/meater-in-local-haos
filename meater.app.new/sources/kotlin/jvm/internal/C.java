package kotlin.jvm.internal;

import kotlin.Metadata;

/* compiled from: PackageReference.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkotlin/jvm/internal/C;", "Lkotlin/jvm/internal/h;", "Ljava/lang/Class;", "jClass", "", "moduleName", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "B", "Ljava/lang/Class;", "f", "()Ljava/lang/Class;", "C", "Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class C implements InterfaceC3851h {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Class<?> jClass;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final String moduleName;

    public C(Class<?> jClass, String moduleName) {
        C3862t.g(jClass, "jClass");
        C3862t.g(moduleName, "moduleName");
        this.jClass = jClass;
        this.moduleName = moduleName;
    }

    public boolean equals(Object other) {
        return (other instanceof C) && C3862t.b(f(), ((C) other).f());
    }

    @Override // kotlin.jvm.internal.InterfaceC3851h
    public Class<?> f() {
        return this.jClass;
    }

    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString() + " (Kotlin reflection is not available)";
    }
}
