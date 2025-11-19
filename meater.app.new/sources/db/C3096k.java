package db;

import Ra.H;
import ab.C1924E;
import fb.C3358e;
import kotlin.jvm.internal.C3862t;
import oa.InterfaceC4164i;

/* compiled from: context.kt */
/* renamed from: db.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3096k {

    /* renamed from: a, reason: collision with root package name */
    private final C3089d f39913a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3101p f39914b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4164i<C1924E> f39915c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4164i f39916d;

    /* renamed from: e, reason: collision with root package name */
    private final C3358e f39917e;

    public C3096k(C3089d components, InterfaceC3101p typeParameterResolver, InterfaceC4164i<C1924E> delegateForDefaultTypeQualifiers) {
        C3862t.g(components, "components");
        C3862t.g(typeParameterResolver, "typeParameterResolver");
        C3862t.g(delegateForDefaultTypeQualifiers, "delegateForDefaultTypeQualifiers");
        this.f39913a = components;
        this.f39914b = typeParameterResolver;
        this.f39915c = delegateForDefaultTypeQualifiers;
        this.f39916d = delegateForDefaultTypeQualifiers;
        this.f39917e = new C3358e(this, typeParameterResolver);
    }

    public final C3089d a() {
        return this.f39913a;
    }

    public final C1924E b() {
        return (C1924E) this.f39916d.getValue();
    }

    public final InterfaceC4164i<C1924E> c() {
        return this.f39915c;
    }

    public final H d() {
        return this.f39913a.m();
    }

    public final Gb.n e() {
        return this.f39913a.u();
    }

    public final InterfaceC3101p f() {
        return this.f39914b;
    }

    public final C3358e g() {
        return this.f39917e;
    }
}
