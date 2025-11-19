package u9;

import ea.C3264b;
import ma.InterfaceC4015a;

/* compiled from: FirebasePerformanceModule_ProvidesConfigResolverFactory.java */
/* renamed from: u9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4688b implements InterfaceC4015a {

    /* renamed from: a, reason: collision with root package name */
    private final C4687a f50504a;

    public C4688b(C4687a c4687a) {
        this.f50504a = c4687a;
    }

    public static C4688b a(C4687a c4687a) {
        return new C4688b(c4687a);
    }

    public static com.google.firebase.perf.config.a c(C4687a c4687a) {
        return (com.google.firebase.perf.config.a) C3264b.c(c4687a.a());
    }

    @Override // ma.InterfaceC4015a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.firebase.perf.config.a get() {
        return c(this.f50504a);
    }
}
