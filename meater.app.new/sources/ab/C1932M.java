package ab;

import java.util.Map;
import kotlin.jvm.internal.C3862t;

/* compiled from: JavaNullabilityAnnotationSettings.kt */
/* renamed from: ab.M, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1932M<T> implements InterfaceC1930K<T> {

    /* renamed from: b, reason: collision with root package name */
    private final Map<qb.c, T> f20191b;

    /* renamed from: c, reason: collision with root package name */
    private final Gb.f f20192c;

    /* renamed from: d, reason: collision with root package name */
    private final Gb.h<qb.c, T> f20193d;

    /* JADX WARN: Multi-variable type inference failed */
    public C1932M(Map<qb.c, ? extends T> states) {
        C3862t.g(states, "states");
        this.f20191b = states;
        Gb.f fVar = new Gb.f("Java nullability annotation states");
        this.f20192c = fVar;
        Gb.h<qb.c, T> hVarE = fVar.e(new C1931L(this));
        C3862t.f(hVarE, "createMemoizedFunctionWithNullableValues(...)");
        this.f20193d = hVarE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(C1932M c1932m, qb.c cVar) {
        C3862t.d(cVar);
        return qb.e.a(cVar, c1932m.f20191b);
    }

    @Override // ab.InterfaceC1930K
    public T a(qb.c fqName) {
        C3862t.g(fqName, "fqName");
        return this.f20193d.invoke(fqName);
    }
}
