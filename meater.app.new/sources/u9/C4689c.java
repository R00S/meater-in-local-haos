package u9;

import ea.C3264b;
import ma.InterfaceC4015a;

/* compiled from: FirebasePerformanceModule_ProvidesFirebaseAppFactory.java */
/* renamed from: u9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4689c implements InterfaceC4015a {

    /* renamed from: a, reason: collision with root package name */
    private final C4687a f50505a;

    public C4689c(C4687a c4687a) {
        this.f50505a = c4687a;
    }

    public static C4689c a(C4687a c4687a) {
        return new C4689c(c4687a);
    }

    public static com.google.firebase.f c(C4687a c4687a) {
        return (com.google.firebase.f) C3264b.c(c4687a.b());
    }

    @Override // ma.InterfaceC4015a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.firebase.f get() {
        return c(this.f50505a);
    }
}
