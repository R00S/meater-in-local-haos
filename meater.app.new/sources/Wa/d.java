package Wa;

import Ub.n;
import Xa.B;
import Xa.q;
import ab.InterfaceC1961u;
import hb.InterfaceC3514g;
import hb.InterfaceC3528u;
import java.util.Set;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectJavaClassFinder.kt */
/* loaded from: classes3.dex */
public final class d implements InterfaceC1961u {

    /* renamed from: a, reason: collision with root package name */
    private final ClassLoader f18481a;

    public d(ClassLoader classLoader) {
        C3862t.g(classLoader, "classLoader");
        this.f18481a = classLoader;
    }

    @Override // ab.InterfaceC1961u
    public Set<String> a(qb.c packageFqName) {
        C3862t.g(packageFqName, "packageFqName");
        return null;
    }

    @Override // ab.InterfaceC1961u
    public InterfaceC3528u b(qb.c fqName, boolean z10) {
        C3862t.g(fqName, "fqName");
        return new B(fqName);
    }

    @Override // ab.InterfaceC1961u
    public InterfaceC3514g c(InterfaceC1961u.a request) {
        C3862t.g(request, "request");
        qb.b bVarA = request.a();
        qb.c cVarF = bVarA.f();
        String strB = bVarA.g().b();
        C3862t.f(strB, "asString(...)");
        String strB2 = n.B(strB, '.', '$', false, 4, null);
        if (!cVarF.d()) {
            strB2 = cVarF.b() + '.' + strB2;
        }
        Class<?> clsA = e.a(this.f18481a, strB2);
        if (clsA != null) {
            return new q(clsA);
        }
        return null;
    }
}
