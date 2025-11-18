package Hb;

import kotlin.jvm.internal.C3862t;

/* compiled from: TypeSubstitution.kt */
/* loaded from: classes3.dex */
public class A extends H0 {

    /* renamed from: c, reason: collision with root package name */
    private final H0 f5639c;

    public A(H0 substitution) {
        C3862t.g(substitution, "substitution");
        this.f5639c = substitution;
    }

    @Override // Hb.H0
    public boolean a() {
        return this.f5639c.a();
    }

    @Override // Hb.H0
    public Sa.h d(Sa.h annotations) {
        C3862t.g(annotations, "annotations");
        return this.f5639c.d(annotations);
    }

    @Override // Hb.H0
    public E0 e(U key) {
        C3862t.g(key, "key");
        return this.f5639c.e(key);
    }

    @Override // Hb.H0
    public boolean f() {
        return this.f5639c.f();
    }

    @Override // Hb.H0
    public U g(U topLevelType, Q0 position) {
        C3862t.g(topLevelType, "topLevelType");
        C3862t.g(position, "position");
        return this.f5639c.g(topLevelType, position);
    }
}
