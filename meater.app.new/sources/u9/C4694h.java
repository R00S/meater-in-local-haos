package u9;

import K6.j;
import ea.C3264b;
import j9.InterfaceC3755b;
import ma.InterfaceC4015a;

/* compiled from: FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory.java */
/* renamed from: u9.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4694h implements InterfaceC4015a {

    /* renamed from: a, reason: collision with root package name */
    private final C4687a f50510a;

    public C4694h(C4687a c4687a) {
        this.f50510a = c4687a;
    }

    public static C4694h a(C4687a c4687a) {
        return new C4694h(c4687a);
    }

    public static InterfaceC3755b<j> c(C4687a c4687a) {
        return (InterfaceC3755b) C3264b.c(c4687a.g());
    }

    @Override // ma.InterfaceC4015a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC3755b<j> get() {
        return c(this.f50510a);
    }
}
