package s9;

import K6.j;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import j9.InterfaceC3755b;
import k9.InterfaceC3810e;
import ma.InterfaceC4015a;

/* compiled from: FirebasePerformance_Factory.java */
/* loaded from: classes2.dex */
public final class g implements InterfaceC4015a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4015a<com.google.firebase.f> f49539a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4015a<InterfaceC3755b<com.google.firebase.remoteconfig.c>> f49540b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4015a<InterfaceC3810e> f49541c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4015a<InterfaceC3755b<j>> f49542d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4015a<RemoteConfigManager> f49543e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC4015a<com.google.firebase.perf.config.a> f49544f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC4015a<SessionManager> f49545g;

    public g(InterfaceC4015a<com.google.firebase.f> interfaceC4015a, InterfaceC4015a<InterfaceC3755b<com.google.firebase.remoteconfig.c>> interfaceC4015a2, InterfaceC4015a<InterfaceC3810e> interfaceC4015a3, InterfaceC4015a<InterfaceC3755b<j>> interfaceC4015a4, InterfaceC4015a<RemoteConfigManager> interfaceC4015a5, InterfaceC4015a<com.google.firebase.perf.config.a> interfaceC4015a6, InterfaceC4015a<SessionManager> interfaceC4015a7) {
        this.f49539a = interfaceC4015a;
        this.f49540b = interfaceC4015a2;
        this.f49541c = interfaceC4015a3;
        this.f49542d = interfaceC4015a4;
        this.f49543e = interfaceC4015a5;
        this.f49544f = interfaceC4015a6;
        this.f49545g = interfaceC4015a7;
    }

    public static g a(InterfaceC4015a<com.google.firebase.f> interfaceC4015a, InterfaceC4015a<InterfaceC3755b<com.google.firebase.remoteconfig.c>> interfaceC4015a2, InterfaceC4015a<InterfaceC3810e> interfaceC4015a3, InterfaceC4015a<InterfaceC3755b<j>> interfaceC4015a4, InterfaceC4015a<RemoteConfigManager> interfaceC4015a5, InterfaceC4015a<com.google.firebase.perf.config.a> interfaceC4015a6, InterfaceC4015a<SessionManager> interfaceC4015a7) {
        return new g(interfaceC4015a, interfaceC4015a2, interfaceC4015a3, interfaceC4015a4, interfaceC4015a5, interfaceC4015a6, interfaceC4015a7);
    }

    public static e c(com.google.firebase.f fVar, InterfaceC3755b<com.google.firebase.remoteconfig.c> interfaceC3755b, InterfaceC3810e interfaceC3810e, InterfaceC3755b<j> interfaceC3755b2, RemoteConfigManager remoteConfigManager, com.google.firebase.perf.config.a aVar, SessionManager sessionManager) {
        return new e(fVar, interfaceC3755b, interfaceC3810e, interfaceC3755b2, remoteConfigManager, aVar, sessionManager);
    }

    @Override // ma.InterfaceC4015a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f49539a.get(), this.f49540b.get(), this.f49541c.get(), this.f49542d.get(), this.f49543e.get(), this.f49544f.get(), this.f49545g.get());
    }
}
