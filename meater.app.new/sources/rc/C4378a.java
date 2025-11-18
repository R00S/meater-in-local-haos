package rc;

import Cc.B;
import Cc.C;
import Cc.C0982e;
import Cc.f;
import Cc.g;
import Cc.o;
import Cc.z;
import Ub.n;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oc.C4178B;
import oc.C4180D;
import oc.C4183c;
import oc.E;
import oc.EnumC4177A;
import oc.InterfaceC4185e;
import oc.r;
import oc.u;
import oc.w;
import rc.c;
import uc.h;

/* compiled from: CacheInterceptor.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u000eB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lrc/a;", "Loc/w;", "Loc/c;", "cache", "<init>", "(Loc/c;)V", "Lrc/b;", "cacheRequest", "Loc/D;", "response", "b", "(Lrc/b;Loc/D;)Loc/D;", "Loc/w$a;", "chain", "a", "(Loc/w$a;)Loc/D;", "Loc/c;", "getCache$okhttp", "()Loc/c;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: rc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4378a implements w {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C4183c cache;

    /* compiled from: CacheInterceptor.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lrc/a$a;", "", "<init>", "()V", "Loc/D;", "response", "f", "(Loc/D;)Loc/D;", "Loc/u;", "cachedHeaders", "networkHeaders", "c", "(Loc/u;Loc/u;)Loc/u;", "", "fieldName", "", "e", "(Ljava/lang/String;)Z", "d", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: rc.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final u c(u cachedHeaders, u networkHeaders) {
            u.a aVar = new u.a();
            int size = cachedHeaders.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strH = cachedHeaders.h(i10);
                String strW = cachedHeaders.w(i10);
                if ((!n.t("Warning", strH, true) || !n.G(strW, "1", false, 2, null)) && (d(strH) || !e(strH) || networkHeaders.c(strH) == null)) {
                    aVar.d(strH, strW);
                }
            }
            int size2 = networkHeaders.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String strH2 = networkHeaders.h(i11);
                if (!d(strH2) && e(strH2)) {
                    aVar.d(strH2, networkHeaders.w(i11));
                }
            }
            return aVar.e();
        }

        private final boolean d(String fieldName) {
            return n.t("Content-Length", fieldName, true) || n.t("Content-Encoding", fieldName, true) || n.t("Content-Type", fieldName, true);
        }

        private final boolean e(String fieldName) {
            return (n.t("Connection", fieldName, true) || n.t("Keep-Alive", fieldName, true) || n.t("Proxy-Authenticate", fieldName, true) || n.t("Proxy-Authorization", fieldName, true) || n.t("TE", fieldName, true) || n.t("Trailers", fieldName, true) || n.t("Transfer-Encoding", fieldName, true) || n.t("Upgrade", fieldName, true)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C4180D f(C4180D response) {
            return (response != null ? response.getBody() : null) != null ? response.o().b(null).c() : response;
        }

        private Companion() {
        }
    }

    /* compiled from: CacheInterceptor.kt */
    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"rc/a$b", "LCc/B;", "LCc/e;", "sink", "", "byteCount", "I0", "(LCc/e;J)J", "LCc/C;", "r", "()LCc/C;", "Loa/F;", "close", "()V", "", "B", "Z", "cacheRequestClosed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: rc.a$b */
    public static final class b implements B {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private boolean cacheRequestClosed;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ g f48502C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ rc.b f48503D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ f f48504E;

        b(g gVar, rc.b bVar, f fVar) {
            this.f48502C = gVar;
            this.f48503D = bVar;
            this.f48504E = fVar;
        }

        @Override // Cc.B
        public long I0(C0982e sink, long byteCount) throws IOException {
            C3862t.g(sink, "sink");
            try {
                long jI0 = this.f48502C.I0(sink, byteCount);
                if (jI0 != -1) {
                    sink.g(this.f48504E.getBufferField(), sink.getSize() - jI0, jI0);
                    this.f48504E.k0();
                    return jI0;
                }
                if (!this.cacheRequestClosed) {
                    this.cacheRequestClosed = true;
                    this.f48504E.close();
                }
                return -1L;
            } catch (IOException e10) {
                if (!this.cacheRequestClosed) {
                    this.cacheRequestClosed = true;
                    this.f48503D.a();
                }
                throw e10;
            }
        }

        @Override // Cc.B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.cacheRequestClosed && !pc.d.s(this, 100, TimeUnit.MILLISECONDS)) {
                this.cacheRequestClosed = true;
                this.f48503D.a();
            }
            this.f48502C.close();
        }

        @Override // Cc.B
        /* renamed from: r */
        public C getTimeout() {
            return this.f48502C.getTimeout();
        }
    }

    public C4378a(C4183c c4183c) {
        this.cache = c4183c;
    }

    private final C4180D b(rc.b cacheRequest, C4180D response) {
        if (cacheRequest == null) {
            return response;
        }
        z body = cacheRequest.getBody();
        E body2 = response.getBody();
        C3862t.d(body2);
        b bVar = new b(body2.getBodySource(), cacheRequest, o.c(body));
        return response.o().b(new h(C4180D.k(response, "Content-Type", null, 2, null), response.getBody().getContentLength(), o.d(bVar))).c();
    }

    @Override // oc.w
    public C4180D a(w.a chain) throws IOException {
        r eventListener;
        E body;
        E body2;
        C3862t.g(chain, "chain");
        InterfaceC4185e interfaceC4185eCall = chain.call();
        C4183c c4183c = this.cache;
        C4180D c4180dB = c4183c != null ? c4183c.b(chain.request()) : null;
        c cVarB = new c.b(System.currentTimeMillis(), chain.request(), c4180dB).b();
        C4178B c4178bB = cVarB.getNetworkRequest();
        C4180D c4180dA = cVarB.getCacheResponse();
        C4183c c4183c2 = this.cache;
        if (c4183c2 != null) {
            c4183c2.l(cVarB);
        }
        tc.e eVar = interfaceC4185eCall instanceof tc.e ? (tc.e) interfaceC4185eCall : null;
        if (eVar == null || (eventListener = eVar.getEventListener()) == null) {
            eventListener = r.f47073b;
        }
        if (c4180dB != null && c4180dA == null && (body2 = c4180dB.getBody()) != null) {
            pc.d.m(body2);
        }
        if (c4178bB == null && c4180dA == null) {
            C4180D c4180dC = new C4180D.a().r(chain.request()).p(EnumC4177A.HTTP_1_1).g(504).m("Unsatisfiable Request (only-if-cached)").b(pc.d.f47753c).s(-1L).q(System.currentTimeMillis()).c();
            eventListener.A(interfaceC4185eCall, c4180dC);
            return c4180dC;
        }
        if (c4178bB == null) {
            C3862t.d(c4180dA);
            C4180D c4180dC2 = c4180dA.o().d(INSTANCE.f(c4180dA)).c();
            eventListener.b(interfaceC4185eCall, c4180dC2);
            return c4180dC2;
        }
        if (c4180dA != null) {
            eventListener.a(interfaceC4185eCall, c4180dA);
        } else if (this.cache != null) {
            eventListener.c(interfaceC4185eCall);
        }
        try {
            C4180D c4180dA2 = chain.a(c4178bB);
            if (c4180dA2 == null && c4180dB != null && body != null) {
            }
            if (c4180dA != null) {
                if (c4180dA2 != null && c4180dA2.getCode() == 304) {
                    C4180D.a aVarO = c4180dA.o();
                    Companion companion = INSTANCE;
                    C4180D c4180dC3 = aVarO.k(companion.c(c4180dA.getHeaders(), c4180dA2.getHeaders())).s(c4180dA2.getSentRequestAtMillis()).q(c4180dA2.getReceivedResponseAtMillis()).d(companion.f(c4180dA)).n(companion.f(c4180dA2)).c();
                    E body3 = c4180dA2.getBody();
                    C3862t.d(body3);
                    body3.close();
                    C4183c c4183c3 = this.cache;
                    C3862t.d(c4183c3);
                    c4183c3.k();
                    this.cache.m(c4180dA, c4180dC3);
                    eventListener.b(interfaceC4185eCall, c4180dC3);
                    return c4180dC3;
                }
                E body4 = c4180dA.getBody();
                if (body4 != null) {
                    pc.d.m(body4);
                }
            }
            C3862t.d(c4180dA2);
            C4180D.a aVarO2 = c4180dA2.o();
            Companion companion2 = INSTANCE;
            C4180D c4180dC4 = aVarO2.d(companion2.f(c4180dA)).n(companion2.f(c4180dA2)).c();
            if (this.cache != null) {
                if (uc.e.b(c4180dC4) && c.INSTANCE.a(c4180dC4, c4178bB)) {
                    C4180D c4180dB2 = b(this.cache.e(c4180dC4), c4180dC4);
                    if (c4180dA != null) {
                        eventListener.c(interfaceC4185eCall);
                    }
                    return c4180dB2;
                }
                if (uc.f.f50537a.a(c4178bB.getMethod())) {
                    try {
                        this.cache.f(c4178bB);
                    } catch (IOException unused) {
                    }
                }
            }
            return c4180dC4;
        } finally {
            if (c4180dB != null && (body = c4180dB.getBody()) != null) {
                pc.d.m(body);
            }
        }
    }
}
