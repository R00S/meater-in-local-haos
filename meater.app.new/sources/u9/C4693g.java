package u9;

import com.google.firebase.perf.session.SessionManager;
import ea.C3264b;
import ma.InterfaceC4015a;

/* compiled from: FirebasePerformanceModule_ProvidesSessionManagerFactory.java */
/* renamed from: u9.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4693g implements InterfaceC4015a {

    /* renamed from: a, reason: collision with root package name */
    private final C4687a f50509a;

    public C4693g(C4687a c4687a) {
        this.f50509a = c4687a;
    }

    public static C4693g a(C4687a c4687a) {
        return new C4693g(c4687a);
    }

    public static SessionManager c(C4687a c4687a) {
        return (SessionManager) C3264b.c(c4687a.f());
    }

    @Override // ma.InterfaceC4015a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SessionManager get() {
        return c(this.f50509a);
    }
}
