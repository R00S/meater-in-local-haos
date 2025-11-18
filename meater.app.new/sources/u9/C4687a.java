package u9;

import K6.j;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import j9.InterfaceC3755b;
import k9.InterfaceC3810e;

/* compiled from: FirebasePerformanceModule.java */
/* renamed from: u9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4687a {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.f f50500a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3810e f50501b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3755b<com.google.firebase.remoteconfig.c> f50502c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3755b<j> f50503d;

    public C4687a(com.google.firebase.f fVar, InterfaceC3810e interfaceC3810e, InterfaceC3755b<com.google.firebase.remoteconfig.c> interfaceC3755b, InterfaceC3755b<j> interfaceC3755b2) {
        this.f50500a = fVar;
        this.f50501b = interfaceC3810e;
        this.f50502c = interfaceC3755b;
        this.f50503d = interfaceC3755b2;
    }

    com.google.firebase.perf.config.a a() {
        return com.google.firebase.perf.config.a.g();
    }

    com.google.firebase.f b() {
        return this.f50500a;
    }

    InterfaceC3810e c() {
        return this.f50501b;
    }

    InterfaceC3755b<com.google.firebase.remoteconfig.c> d() {
        return this.f50502c;
    }

    RemoteConfigManager e() {
        return RemoteConfigManager.getInstance();
    }

    SessionManager f() {
        return SessionManager.getInstance();
    }

    InterfaceC3755b<j> g() {
        return this.f50503d;
    }
}
