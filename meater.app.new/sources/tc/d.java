package tc;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oc.C4181a;
import oc.F;
import oc.r;
import oc.v;
import oc.z;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import tc.i;

/* compiled from: ExchangeFinder.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u0017\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u0015\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'J\r\u0010$\u001a\u00020\u0011¢\u0006\u0004\b$\u0010(J\u0015\u0010+\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010-R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010.\u001a\u0004\b/\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00102R\u0018\u00105\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00104R\u0018\u00108\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00107R\u0016\u0010:\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00109R\u0016\u0010;\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00109R\u0016\u0010=\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00109R\u0018\u0010@\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006A"}, d2 = {"Ltc/d;", "", "Ltc/g;", "connectionPool", "Loc/a;", "address", "Ltc/e;", "call", "Loc/r;", "eventListener", "<init>", "(Ltc/g;Loc/a;Ltc/e;Loc/r;)V", "", "connectTimeout", "readTimeout", "writeTimeout", "pingIntervalMillis", "", "connectionRetryEnabled", "doExtensiveHealthChecks", "Ltc/f;", "c", "(IIIIZZ)Ltc/f;", "b", "(IIIIZ)Ltc/f;", "Loc/F;", "f", "()Loc/F;", "Loc/z;", "client", "Luc/g;", "chain", "Luc/d;", "a", "(Loc/z;Luc/g;)Luc/d;", "Ljava/io/IOException;", "e", "Loa/F;", "h", "(Ljava/io/IOException;)V", "()Z", "Loc/v;", "url", "g", "(Loc/v;)Z", "Ltc/g;", "Loc/a;", "d", "()Loc/a;", "Ltc/e;", "Loc/r;", "Ltc/i$b;", "Ltc/i$b;", "routeSelection", "Ltc/i;", "Ltc/i;", "routeSelector", "I", "refusedStreamCount", "connectionShutdownCount", "i", "otherFailureCount", "j", "Loc/F;", "nextRouteToTry", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g connectionPool;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C4181a address;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e call;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final r eventListener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private i.b routeSelection;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private i routeSelector;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int refusedStreamCount;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int connectionShutdownCount;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int otherFailureCount;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private F nextRouteToTry;

    public d(g connectionPool, C4181a address, e call, r eventListener) {
        C3862t.g(connectionPool, "connectionPool");
        C3862t.g(address, "address");
        C3862t.g(call, "call");
        C3862t.g(eventListener, "eventListener");
        this.connectionPool = connectionPool;
        this.address = address;
        this.call = call;
        this.eventListener = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final tc.f b(int r15, int r16, int r17, int r18, boolean r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.d.b(int, int, int, int, boolean):tc.f");
    }

    private final f c(int connectTimeout, int readTimeout, int writeTimeout, int pingIntervalMillis, boolean connectionRetryEnabled, boolean doExtensiveHealthChecks) throws IOException {
        while (true) {
            f fVarB = b(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled);
            if (fVarB.u(doExtensiveHealthChecks)) {
                return fVarB;
            }
            fVarB.y();
            if (this.nextRouteToTry == null) {
                i.b bVar = this.routeSelection;
                if (bVar != null ? bVar.b() : true) {
                    continue;
                } else {
                    i iVar = this.routeSelector;
                    if (!(iVar != null ? iVar.a() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    private final F f() {
        f connection;
        if (this.refusedStreamCount > 1 || this.connectionShutdownCount > 1 || this.otherFailureCount > 0 || (connection = this.call.getConnection()) == null) {
            return null;
        }
        synchronized (connection) {
            if (connection.getRouteFailureCount() != 0) {
                return null;
            }
            if (pc.d.j(connection.getRoute().getAddress().getUrl(), this.address.getUrl())) {
                return connection.getRoute();
            }
            return null;
        }
    }

    public final uc.d a(z client, uc.g chain) {
        C3862t.g(client, "client");
        C3862t.g(chain, "chain");
        try {
            return c(chain.getConnectTimeoutMillis(), chain.getReadTimeoutMillis(), chain.getWriteTimeoutMillis(), client.getPingIntervalMillis(), client.getRetryOnConnectionFailure(), !C3862t.b(chain.getRequest().getMethod(), "GET")).w(client, chain);
        } catch (IOException e10) {
            h(e10);
            throw new RouteException(e10);
        } catch (RouteException e11) {
            h(e11.getLastConnectException());
            throw e11;
        }
    }

    /* renamed from: d, reason: from getter */
    public final C4181a getAddress() {
        return this.address;
    }

    public final boolean e() {
        i iVar;
        if (this.refusedStreamCount == 0 && this.connectionShutdownCount == 0 && this.otherFailureCount == 0) {
            return false;
        }
        if (this.nextRouteToTry != null) {
            return true;
        }
        F f10 = f();
        if (f10 != null) {
            this.nextRouteToTry = f10;
            return true;
        }
        i.b bVar = this.routeSelection;
        if ((bVar == null || !bVar.b()) && (iVar = this.routeSelector) != null) {
            return iVar.a();
        }
        return true;
    }

    public final boolean g(v url) {
        C3862t.g(url, "url");
        v url2 = this.address.getUrl();
        return url.getPort() == url2.getPort() && C3862t.b(url.getHost(), url2.getHost());
    }

    public final void h(IOException e10) {
        C3862t.g(e10, "e");
        this.nextRouteToTry = null;
        if ((e10 instanceof StreamResetException) && ((StreamResetException) e10).errorCode == wc.a.REFUSED_STREAM) {
            this.refusedStreamCount++;
        } else if (e10 instanceof ConnectionShutdownException) {
            this.connectionShutdownCount++;
        } else {
            this.otherFailureCount++;
        }
    }
}
