package tc;

import Cc.C;
import Cc.o;
import Ub.n;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oc.C4178B;
import oc.C4180D;
import oc.C4181a;
import oc.C4187g;
import oc.EnumC4177A;
import oc.F;
import oc.InterfaceC4185e;
import oc.j;
import oc.l;
import oc.t;
import oc.v;
import oc.z;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import vc.C4947b;
import wc.e;

/* compiled from: RealConnection.kt */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001VB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0014\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010#\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001fH\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\u00020)2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020)2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020)2\u0006\u0010\"\u001a\u00020!2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0011H\u0000¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0011H\u0000¢\u0006\u0004\b4\u00103J\u000f\u00105\u001a\u00020\u0011H\u0000¢\u0006\u0004\b5\u00103JE\u00107\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u00106\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b7\u00108J'\u0010<\u001a\u00020)2\u0006\u0010:\u001a\u0002092\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010'H\u0000¢\u0006\u0004\b<\u0010=J\u001f\u0010C\u001a\u00020B2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0000¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0005H\u0016¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\u0011¢\u0006\u0004\bG\u00103J\u000f\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bI\u0010JJ\u0015\u0010L\u001a\u00020)2\u0006\u0010K\u001a\u00020)¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\u00112\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\u001f\u0010V\u001a\u00020\u00112\u0006\u0010S\u001a\u00020R2\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bV\u0010WJ\u0011\u0010X\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\bX\u0010YJ'\u0010]\u001a\u00020\u00112\u0006\u0010?\u001a\u00020>2\u0006\u0010Z\u001a\u00020\u00052\u0006\u0010\\\u001a\u00020[H\u0000¢\u0006\u0004\b]\u0010^J!\u0010`\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020_2\b\u00100\u001a\u0004\u0018\u00010[H\u0000¢\u0006\u0004\b`\u0010aJ\u000f\u0010c\u001a\u00020bH\u0016¢\u0006\u0004\bc\u0010dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010iR\u0018\u0010k\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010jR\u0018\u0010l\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010jR\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010mR\u0018\u0010p\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010oR\u0018\u0010r\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010qR\u0018\u0010u\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010tR\u0018\u0010x\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010wR\"\u0010~\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u0016\u0010\u007f\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010yR(\u0010\u0085\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0005\b\u0084\u0001\u0010\u001cR\u0019\u0010\u0087\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0081\u0001R\u0018\u0010\u0088\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bz\u0010\u0081\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0081\u0001R)\u0010\u008e\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020_0\u008b\u00010\u008a\u00018\u0006¢\u0006\u000f\n\u0005\bX\u0010\u008c\u0001\u001a\u0006\b\u0080\u0001\u0010\u008d\u0001R)\u0010\u0094\u0001\u001a\u00030\u008f\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b5\u0010\u0090\u0001\u001a\u0006\b\u0086\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0016\u0010\u0096\u0001\u001a\u00020)8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010{¨\u0006\u0097\u0001"}, d2 = {"Ltc/f;", "Lwc/e$c;", "Loc/j;", "Ltc/g;", "connectionPool", "Loc/F;", "route", "<init>", "(Ltc/g;Loc/F;)V", "", "connectTimeout", "readTimeout", "writeTimeout", "Loc/e;", "call", "Loc/r;", "eventListener", "Loa/F;", "j", "(IIILoc/e;Loc/r;)V", "h", "(IILoc/e;Loc/r;)V", "Ltc/b;", "connectionSpecSelector", "pingIntervalMillis", "m", "(Ltc/b;ILoc/e;Loc/r;)V", "E", "(I)V", "i", "(Ltc/b;)V", "Loc/B;", "tunnelRequest", "Loc/v;", "url", "k", "(IILoc/B;Loc/v;)Loc/B;", "l", "()Loc/B;", "", "candidates", "", "A", "(Ljava/util/List;)Z", "F", "(Loc/v;)Z", "Loc/t;", "handshake", "e", "(Loc/v;Loc/t;)Z", "y", "()V", "x", "s", "connectionRetryEnabled", "f", "(IIIIZLoc/e;Loc/r;)V", "Loc/a;", "address", "routes", "t", "(Loc/a;Ljava/util/List;)Z", "Loc/z;", "client", "Luc/g;", "chain", "Luc/d;", "w", "(Loc/z;Luc/g;)Luc/d;", "z", "()Loc/F;", "d", "Ljava/net/Socket;", "D", "()Ljava/net/Socket;", "doExtensiveChecks", "u", "(Z)Z", "Lwc/h;", "stream", "b", "(Lwc/h;)V", "Lwc/e;", "connection", "Lwc/l;", "settings", "a", "(Lwc/e;Lwc/l;)V", "r", "()Loc/t;", "failedRoute", "Ljava/io/IOException;", "failure", "g", "(Loc/z;Loc/F;Ljava/io/IOException;)V", "Ltc/e;", "G", "(Ltc/e;Ljava/io/IOException;)V", "", "toString", "()Ljava/lang/String;", "c", "Ltc/g;", "getConnectionPool", "()Ltc/g;", "Loc/F;", "Ljava/net/Socket;", "rawSocket", "socket", "Loc/t;", "Loc/A;", "Loc/A;", "protocol", "Lwc/e;", "http2Connection", "LCc/g;", "LCc/g;", "source", "LCc/f;", "LCc/f;", "sink", "Z", "p", "()Z", "C", "(Z)V", "noNewExchanges", "noCoalescedConnections", "n", "I", "q", "()I", "setRouteFailureCount$okhttp", "routeFailureCount", "o", "successCount", "refusedStreamCount", "allocationLimit", "", "Ljava/lang/ref/Reference;", "Ljava/util/List;", "()Ljava/util/List;", "calls", "", "J", "()J", "B", "(J)V", "idleAtNs", "v", "isMultiplexed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends e.c implements j {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g connectionPool;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final F route;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Socket rawSocket;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Socket socket;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private t handshake;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private EnumC4177A protocol;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private wc.e http2Connection;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Cc.g source;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Cc.f sink;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean noNewExchanges;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean noCoalescedConnections;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int routeFailureCount;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int successCount;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int refusedStreamCount;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int allocationLimit;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final List<Reference<e>> calls;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private long idleAtNs;

    /* compiled from: RealConnection.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50130a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f50130a = iArr;
        }
    }

    /* compiled from: RealConnection.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements Ba.a<List<? extends Certificate>> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C4187g f50131B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ t f50132C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ C4181a f50133D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C4187g c4187g, t tVar, C4181a c4181a) {
            super(0);
            this.f50131B = c4187g;
            this.f50132C = tVar;
            this.f50133D = c4181a;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Certificate> invoke() {
            Bc.c cVarD = this.f50131B.getCertificateChainCleaner();
            C3862t.d(cVarD);
            return cVarD.a(this.f50132C.d(), this.f50133D.getUrl().getHost());
        }
    }

    /* compiled from: RealConnection.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/X509Certificate;", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class d extends AbstractC3864v implements Ba.a<List<? extends X509Certificate>> {
        d() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<X509Certificate> invoke() {
            t tVar = f.this.handshake;
            C3862t.d(tVar);
            List<Certificate> listD = tVar.d();
            ArrayList arrayList = new ArrayList(r.x(listD, 10));
            for (Certificate certificate : listD) {
                C3862t.e(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public f(g connectionPool, F route) {
        C3862t.g(connectionPool, "connectionPool");
        C3862t.g(route, "route");
        this.connectionPool = connectionPool;
        this.route = route;
        this.allocationLimit = 1;
        this.calls = new ArrayList();
        this.idleAtNs = Long.MAX_VALUE;
    }

    private final boolean A(List<F> candidates) {
        List<F> list = candidates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (F f10 : list) {
            Proxy.Type type = f10.getProxy().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.route.getProxy().type() == type2 && C3862t.b(this.route.getSocketAddress(), f10.getSocketAddress())) {
                return true;
            }
        }
        return false;
    }

    private final void E(int pingIntervalMillis) throws SocketException {
        Socket socket = this.socket;
        C3862t.d(socket);
        Cc.g gVar = this.source;
        C3862t.d(gVar);
        Cc.f fVar = this.sink;
        C3862t.d(fVar);
        socket.setSoTimeout(0);
        wc.e eVarA = new e.a(true, sc.e.f49702i).q(socket, this.route.getAddress().getUrl().getHost(), gVar, fVar).k(this).l(pingIntervalMillis).a();
        this.http2Connection = eVarA;
        this.allocationLimit = wc.e.INSTANCE.a().d();
        wc.e.U0(eVarA, false, null, 3, null);
    }

    private final boolean F(v url) {
        t tVar;
        if (pc.d.f47758h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        v url2 = this.route.getAddress().getUrl();
        if (url.getPort() != url2.getPort()) {
            return false;
        }
        if (C3862t.b(url.getHost(), url2.getHost())) {
            return true;
        }
        if (this.noCoalescedConnections || (tVar = this.handshake) == null) {
            return false;
        }
        C3862t.d(tVar);
        return e(url, tVar);
    }

    private final boolean e(v url, t handshake) {
        List<Certificate> listD = handshake.d();
        if (listD.isEmpty()) {
            return false;
        }
        Bc.d dVar = Bc.d.f1968a;
        String host = url.getHost();
        Certificate certificate = listD.get(0);
        C3862t.e(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
        return dVar.e(host, (X509Certificate) certificate);
    }

    private final void h(int connectTimeout, int readTimeout, InterfaceC4185e call, oc.r eventListener) throws IOException {
        Socket socketCreateSocket;
        Proxy proxy = this.route.getProxy();
        C4181a address = this.route.getAddress();
        Proxy.Type type = proxy.type();
        int i10 = type == null ? -1 : b.f50130a[type.ordinal()];
        if (i10 == 1 || i10 == 2) {
            socketCreateSocket = address.getSocketFactory().createSocket();
            C3862t.d(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.rawSocket = socketCreateSocket;
        eventListener.j(call, this.route.getSocketAddress(), proxy);
        socketCreateSocket.setSoTimeout(readTimeout);
        try {
            yc.j.INSTANCE.g().f(socketCreateSocket, this.route.getSocketAddress(), connectTimeout);
            try {
                this.source = o.d(o.l(socketCreateSocket));
                this.sink = o.c(o.h(socketCreateSocket));
            } catch (NullPointerException e10) {
                if (C3862t.b(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.route.getSocketAddress());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    private final void i(tc.b connectionSpecSelector) throws Throwable {
        C4181a address = this.route.getAddress();
        SSLSocketFactory sslSocketFactory = address.getSslSocketFactory();
        SSLSocket sSLSocket = null;
        try {
            C3862t.d(sslSocketFactory);
            Socket socketCreateSocket = sslSocketFactory.createSocket(this.rawSocket, address.getUrl().getHost(), address.getUrl().getPort(), true);
            C3862t.e(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                l lVarA = connectionSpecSelector.a(sSLSocket2);
                if (lVarA.getSupportsTlsExtensions()) {
                    yc.j.INSTANCE.g().e(sSLSocket2, address.getUrl().getHost(), address.f());
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                t.Companion companion = t.INSTANCE;
                C3862t.f(sslSocketSession, "sslSocketSession");
                t tVarA = companion.a(sslSocketSession);
                HostnameVerifier hostnameVerifier = address.getHostnameVerifier();
                C3862t.d(hostnameVerifier);
                if (hostnameVerifier.verify(address.getUrl().getHost(), sslSocketSession)) {
                    C4187g certificatePinner = address.getCertificatePinner();
                    C3862t.d(certificatePinner);
                    this.handshake = new t(tVarA.getTlsVersion(), tVarA.getCipherSuite(), tVarA.c(), new c(certificatePinner, tVarA, address));
                    certificatePinner.b(address.getUrl().getHost(), new d());
                    String strH = lVarA.getSupportsTlsExtensions() ? yc.j.INSTANCE.g().h(sSLSocket2) : null;
                    this.socket = sSLSocket2;
                    this.source = o.d(o.l(sSLSocket2));
                    this.sink = o.c(o.h(sSLSocket2));
                    this.protocol = strH != null ? EnumC4177A.INSTANCE.a(strH) : EnumC4177A.HTTP_1_1;
                    yc.j.INSTANCE.g().b(sSLSocket2);
                    return;
                }
                List<Certificate> listD = tVarA.d();
                if (listD.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + address.getUrl().getHost() + " not verified (no certificates)");
                }
                Certificate certificate = listD.get(0);
                C3862t.e(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) certificate;
                throw new SSLPeerUnverifiedException(n.h("\n              |Hostname " + address.getUrl().getHost() + " not verified:\n              |    certificate: " + C4187g.INSTANCE.a(x509Certificate) + "\n              |    DN: " + x509Certificate.getSubjectDN().getName() + "\n              |    subjectAltNames: " + Bc.d.f1968a.a(x509Certificate) + "\n              ", null, 1, null));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    yc.j.INSTANCE.g().b(sSLSocket);
                }
                if (sSLSocket != null) {
                    pc.d.n(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void j(int connectTimeout, int readTimeout, int writeTimeout, InterfaceC4185e call, oc.r eventListener) throws IOException {
        C4178B c4178bL = l();
        v url = c4178bL.getUrl();
        for (int i10 = 0; i10 < 21; i10++) {
            h(connectTimeout, readTimeout, call, eventListener);
            c4178bL = k(readTimeout, writeTimeout, c4178bL, url);
            if (c4178bL == null) {
                return;
            }
            Socket socket = this.rawSocket;
            if (socket != null) {
                pc.d.n(socket);
            }
            this.rawSocket = null;
            this.sink = null;
            this.source = null;
            eventListener.h(call, this.route.getSocketAddress(), this.route.getProxy(), null);
        }
    }

    private final C4178B k(int readTimeout, int writeTimeout, C4178B tunnelRequest, v url) throws IOException {
        String str = "CONNECT " + pc.d.R(url, true) + " HTTP/1.1";
        while (true) {
            Cc.g gVar = this.source;
            C3862t.d(gVar);
            Cc.f fVar = this.sink;
            C3862t.d(fVar);
            C4947b c4947b = new C4947b(null, this, gVar, fVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            gVar.getTimeout().g(readTimeout, timeUnit);
            fVar.getTimeout().g(writeTimeout, timeUnit);
            c4947b.A(tunnelRequest.getHeaders(), str);
            c4947b.b();
            C4180D.a aVarC = c4947b.c(false);
            C3862t.d(aVarC);
            C4180D c4180dC = aVarC.r(tunnelRequest).c();
            c4947b.z(c4180dC);
            int code = c4180dC.getCode();
            if (code == 200) {
                if (gVar.getBufferField().c0() && fVar.getBufferField().c0()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (code != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + c4180dC.getCode());
            }
            C4178B c4178bA = this.route.getAddress().getProxyAuthenticator().a(this.route, c4180dC);
            if (c4178bA == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (n.t("close", C4180D.k(c4180dC, "Connection", null, 2, null), true)) {
                return c4178bA;
            }
            tunnelRequest = c4178bA;
        }
    }

    private final C4178B l() {
        C4178B c4178bB = new C4178B.a().j(this.route.getAddress().getUrl()).f("CONNECT", null).d("Host", pc.d.R(this.route.getAddress().getUrl(), true)).d("Proxy-Connection", "Keep-Alive").d("User-Agent", "okhttp/4.12.0").b();
        C4178B c4178bA = this.route.getAddress().getProxyAuthenticator().a(this.route, new C4180D.a().r(c4178bB).p(EnumC4177A.HTTP_1_1).g(407).m("Preemptive Authenticate").b(pc.d.f47753c).s(-1L).q(-1L).j("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return c4178bA == null ? c4178bB : c4178bA;
    }

    private final void m(tc.b connectionSpecSelector, int pingIntervalMillis, InterfaceC4185e call, oc.r eventListener) throws Throwable {
        if (this.route.getAddress().getSslSocketFactory() != null) {
            eventListener.C(call);
            i(connectionSpecSelector);
            eventListener.B(call, this.handshake);
            if (this.protocol == EnumC4177A.HTTP_2) {
                E(pingIntervalMillis);
                return;
            }
            return;
        }
        List<EnumC4177A> listF = this.route.getAddress().f();
        EnumC4177A enumC4177A = EnumC4177A.H2_PRIOR_KNOWLEDGE;
        if (!listF.contains(enumC4177A)) {
            this.socket = this.rawSocket;
            this.protocol = EnumC4177A.HTTP_1_1;
        } else {
            this.socket = this.rawSocket;
            this.protocol = enumC4177A;
            E(pingIntervalMillis);
        }
    }

    public final void B(long j10) {
        this.idleAtNs = j10;
    }

    public final void C(boolean z10) {
        this.noNewExchanges = z10;
    }

    public Socket D() {
        Socket socket = this.socket;
        C3862t.d(socket);
        return socket;
    }

    public final synchronized void G(e call, IOException e10) {
        try {
            C3862t.g(call, "call");
            if (e10 instanceof StreamResetException) {
                if (((StreamResetException) e10).errorCode == wc.a.REFUSED_STREAM) {
                    int i10 = this.refusedStreamCount + 1;
                    this.refusedStreamCount = i10;
                    if (i10 > 1) {
                        this.noNewExchanges = true;
                        this.routeFailureCount++;
                    }
                } else if (((StreamResetException) e10).errorCode != wc.a.CANCEL || !call.getCanceled()) {
                    this.noNewExchanges = true;
                    this.routeFailureCount++;
                }
            } else if (!v() || (e10 instanceof ConnectionShutdownException)) {
                this.noNewExchanges = true;
                if (this.successCount == 0) {
                    if (e10 != null) {
                        g(call.getClient(), this.route, e10);
                    }
                    this.routeFailureCount++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // wc.e.c
    public synchronized void a(wc.e connection, wc.l settings) {
        C3862t.g(connection, "connection");
        C3862t.g(settings, "settings");
        this.allocationLimit = settings.d();
    }

    @Override // wc.e.c
    public void b(wc.h stream) {
        C3862t.g(stream, "stream");
        stream.d(wc.a.REFUSED_STREAM, null);
    }

    public final void d() {
        Socket socket = this.rawSocket;
        if (socket != null) {
            pc.d.n(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0149 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r17, int r18, int r19, int r20, boolean r21, oc.InterfaceC4185e r22, oc.r r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.f.f(int, int, int, int, boolean, oc.e, oc.r):void");
    }

    public final void g(z client, F failedRoute, IOException failure) {
        C3862t.g(client, "client");
        C3862t.g(failedRoute, "failedRoute");
        C3862t.g(failure, "failure");
        if (failedRoute.getProxy().type() != Proxy.Type.DIRECT) {
            C4181a address = failedRoute.getAddress();
            address.getProxySelector().connectFailed(address.getUrl().t(), failedRoute.getProxy().address(), failure);
        }
        client.getRouteDatabase().b(failedRoute);
    }

    public final List<Reference<e>> n() {
        return this.calls;
    }

    /* renamed from: o, reason: from getter */
    public final long getIdleAtNs() {
        return this.idleAtNs;
    }

    /* renamed from: p, reason: from getter */
    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    /* renamed from: q, reason: from getter */
    public final int getRouteFailureCount() {
        return this.routeFailureCount;
    }

    /* renamed from: r, reason: from getter */
    public t getHandshake() {
        return this.handshake;
    }

    public final synchronized void s() {
        this.successCount++;
    }

    public final boolean t(C4181a address, List<F> routes) {
        C3862t.g(address, "address");
        if (pc.d.f47758h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.calls.size() >= this.allocationLimit || this.noNewExchanges || !this.route.getAddress().d(address)) {
            return false;
        }
        if (C3862t.b(address.getUrl().getHost(), getRoute().getAddress().getUrl().getHost())) {
            return true;
        }
        if (this.http2Connection == null || routes == null || !A(routes) || address.getHostnameVerifier() != Bc.d.f1968a || !F(address.getUrl())) {
            return false;
        }
        try {
            C4187g certificatePinner = address.getCertificatePinner();
            C3862t.d(certificatePinner);
            String host = address.getUrl().getHost();
            t handshake = getHandshake();
            C3862t.d(handshake);
            certificatePinner.a(host, handshake.d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public String toString() {
        Object cipherSuite;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.route.getAddress().getUrl().getHost());
        sb2.append(':');
        sb2.append(this.route.getAddress().getUrl().getPort());
        sb2.append(", proxy=");
        sb2.append(this.route.getProxy());
        sb2.append(" hostAddress=");
        sb2.append(this.route.getSocketAddress());
        sb2.append(" cipherSuite=");
        t tVar = this.handshake;
        if (tVar == null || (cipherSuite = tVar.getCipherSuite()) == null) {
            cipherSuite = "none";
        }
        sb2.append(cipherSuite);
        sb2.append(" protocol=");
        sb2.append(this.protocol);
        sb2.append('}');
        return sb2.toString();
    }

    public final boolean u(boolean doExtensiveChecks) {
        long j10;
        if (pc.d.f47758h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.rawSocket;
        C3862t.d(socket);
        Socket socket2 = this.socket;
        C3862t.d(socket2);
        Cc.g gVar = this.source;
        C3862t.d(gVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        wc.e eVar = this.http2Connection;
        if (eVar != null) {
            return eVar.f0(jNanoTime);
        }
        synchronized (this) {
            j10 = jNanoTime - this.idleAtNs;
        }
        if (j10 < 10000000000L || !doExtensiveChecks) {
            return true;
        }
        return pc.d.G(socket2, gVar);
    }

    public final boolean v() {
        return this.http2Connection != null;
    }

    public final uc.d w(z client, uc.g chain) throws SocketException {
        C3862t.g(client, "client");
        C3862t.g(chain, "chain");
        Socket socket = this.socket;
        C3862t.d(socket);
        Cc.g gVar = this.source;
        C3862t.d(gVar);
        Cc.f fVar = this.sink;
        C3862t.d(fVar);
        wc.e eVar = this.http2Connection;
        if (eVar != null) {
            return new wc.f(client, this, chain, eVar);
        }
        socket.setSoTimeout(chain.j());
        C cR = gVar.getTimeout();
        long jG = chain.getReadTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cR.g(jG, timeUnit);
        fVar.getTimeout().g(chain.getWriteTimeoutMillis(), timeUnit);
        return new C4947b(client, this, gVar, fVar);
    }

    public final synchronized void x() {
        this.noCoalescedConnections = true;
    }

    public final synchronized void y() {
        this.noNewExchanges = true;
    }

    /* renamed from: z, reason: from getter */
    public F getRoute() {
        return this.route;
    }
}
