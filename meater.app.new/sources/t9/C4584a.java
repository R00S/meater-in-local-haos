package t9;

import K6.j;
import com.google.firebase.f;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import ea.C3263a;
import ea.C3264b;
import j9.InterfaceC3755b;
import k9.InterfaceC3810e;
import ma.InterfaceC4015a;
import s9.e;
import s9.g;
import u9.C4687a;
import u9.C4688b;
import u9.C4689c;
import u9.C4690d;
import u9.C4691e;
import u9.C4692f;
import u9.C4693g;
import u9.C4694h;

/* compiled from: DaggerFirebasePerformanceComponent.java */
/* renamed from: t9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4584a {

    /* compiled from: DaggerFirebasePerformanceComponent.java */
    /* renamed from: t9.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private C4687a f49981a;

        public t9.b a() {
            C3264b.a(this.f49981a, C4687a.class);
            return new c(this.f49981a);
        }

        public b b(C4687a c4687a) {
            this.f49981a = (C4687a) C3264b.b(c4687a);
            return this;
        }

        private b() {
        }
    }

    /* compiled from: DaggerFirebasePerformanceComponent.java */
    /* renamed from: t9.a$c */
    private static final class c implements t9.b {

        /* renamed from: a, reason: collision with root package name */
        private final c f49982a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC4015a<f> f49983b;

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC4015a<InterfaceC3755b<com.google.firebase.remoteconfig.c>> f49984c;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC4015a<InterfaceC3810e> f49985d;

        /* renamed from: e, reason: collision with root package name */
        private InterfaceC4015a<InterfaceC3755b<j>> f49986e;

        /* renamed from: f, reason: collision with root package name */
        private InterfaceC4015a<RemoteConfigManager> f49987f;

        /* renamed from: g, reason: collision with root package name */
        private InterfaceC4015a<com.google.firebase.perf.config.a> f49988g;

        /* renamed from: h, reason: collision with root package name */
        private InterfaceC4015a<SessionManager> f49989h;

        /* renamed from: i, reason: collision with root package name */
        private InterfaceC4015a<e> f49990i;

        private void b(C4687a c4687a) {
            this.f49983b = C4689c.a(c4687a);
            this.f49984c = C4691e.a(c4687a);
            this.f49985d = C4690d.a(c4687a);
            this.f49986e = C4694h.a(c4687a);
            this.f49987f = C4692f.a(c4687a);
            this.f49988g = C4688b.a(c4687a);
            C4693g c4693gA = C4693g.a(c4687a);
            this.f49989h = c4693gA;
            this.f49990i = C3263a.a(g.a(this.f49983b, this.f49984c, this.f49985d, this.f49986e, this.f49987f, this.f49988g, c4693gA));
        }

        @Override // t9.b
        public e a() {
            return this.f49990i.get();
        }

        private c(C4687a c4687a) {
            this.f49982a = this;
            b(c4687a);
        }
    }

    public static b a() {
        return new b();
    }
}
