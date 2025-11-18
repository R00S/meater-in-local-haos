package u9;

import ea.C3264b;
import k9.InterfaceC3810e;
import ma.InterfaceC4015a;

/* compiled from: FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory.java */
/* renamed from: u9.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4690d implements InterfaceC4015a {

    /* renamed from: a, reason: collision with root package name */
    private final C4687a f50506a;

    public C4690d(C4687a c4687a) {
        this.f50506a = c4687a;
    }

    public static C4690d a(C4687a c4687a) {
        return new C4690d(c4687a);
    }

    public static InterfaceC3810e c(C4687a c4687a) {
        return (InterfaceC3810e) C3264b.c(c4687a.c());
    }

    @Override // ma.InterfaceC4015a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC3810e get() {
        return c(this.f50506a);
    }
}
