package u9;

import ea.C3264b;
import j9.InterfaceC3755b;
import ma.InterfaceC4015a;

/* compiled from: FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory.java */
/* renamed from: u9.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4691e implements InterfaceC4015a {

    /* renamed from: a, reason: collision with root package name */
    private final C4687a f50507a;

    public C4691e(C4687a c4687a) {
        this.f50507a = c4687a;
    }

    public static C4691e a(C4687a c4687a) {
        return new C4691e(c4687a);
    }

    public static InterfaceC3755b<com.google.firebase.remoteconfig.c> c(C4687a c4687a) {
        return (InterfaceC3755b) C3264b.c(c4687a.d());
    }

    @Override // ma.InterfaceC4015a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC3755b<com.google.firebase.remoteconfig.c> get() {
        return c(this.f50507a);
    }
}
