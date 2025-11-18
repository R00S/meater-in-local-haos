package u9;

import com.google.firebase.perf.config.RemoteConfigManager;
import ea.C3264b;
import ma.InterfaceC4015a;

/* compiled from: FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory.java */
/* renamed from: u9.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4692f implements InterfaceC4015a {

    /* renamed from: a, reason: collision with root package name */
    private final C4687a f50508a;

    public C4692f(C4687a c4687a) {
        this.f50508a = c4687a;
    }

    public static C4692f a(C4687a c4687a) {
        return new C4692f(c4687a);
    }

    public static RemoteConfigManager c(C4687a c4687a) {
        return (RemoteConfigManager) C3264b.c(c4687a.e());
    }

    @Override // ma.InterfaceC4015a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RemoteConfigManager get() {
        return c(this.f50508a);
    }
}
