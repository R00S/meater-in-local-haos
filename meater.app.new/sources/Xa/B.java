package Xa;

import hb.InterfaceC3508a;
import hb.InterfaceC3514g;
import hb.InterfaceC3528u;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectJavaPackage.kt */
/* loaded from: classes3.dex */
public final class B extends u implements InterfaceC3528u {

    /* renamed from: a, reason: collision with root package name */
    private final qb.c f18928a;

    public B(qb.c fqName) {
        C3862t.g(fqName, "fqName");
        this.f18928a = fqName;
    }

    @Override // hb.InterfaceC3528u
    public Collection<InterfaceC3528u> B() {
        return kotlin.collections.r.m();
    }

    public boolean equals(Object obj) {
        return (obj instanceof B) && C3862t.b(f(), ((B) obj).f());
    }

    @Override // hb.InterfaceC3528u
    public qb.c f() {
        return this.f18928a;
    }

    public int hashCode() {
        return f().hashCode();
    }

    @Override // hb.InterfaceC3511d
    public boolean l() {
        return false;
    }

    @Override // hb.InterfaceC3511d
    public InterfaceC3508a o(qb.c fqName) {
        C3862t.g(fqName, "fqName");
        return null;
    }

    public String toString() {
        return B.class.getName() + ": " + f();
    }

    @Override // hb.InterfaceC3528u
    public Collection<InterfaceC3514g> v(Ba.l<? super qb.f, Boolean> nameFilter) {
        C3862t.g(nameFilter, "nameFilter");
        return kotlin.collections.r.m();
    }

    @Override // hb.InterfaceC3511d
    public List<InterfaceC3508a> getAnnotations() {
        return kotlin.collections.r.m();
    }
}
