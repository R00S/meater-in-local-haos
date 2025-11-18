package uc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oc.AbstractC4179C;
import oc.C4178B;
import oc.C4180D;
import oc.F;
import oc.v;
import oc.w;
import oc.z;

/* compiled from: RetryAndFollowUpInterceptor.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u0007\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0007\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010%¨\u0006&"}, d2 = {"Luc/j;", "Loc/w;", "Loc/z;", "client", "<init>", "(Loc/z;)V", "Ljava/io/IOException;", "e", "Ltc/e;", "call", "Loc/B;", "userRequest", "", "requestSendStarted", "(Ljava/io/IOException;Ltc/e;Loc/B;Z)Z", "f", "(Ljava/io/IOException;Loc/B;)Z", "d", "(Ljava/io/IOException;Z)Z", "Loc/D;", "userResponse", "Ltc/c;", "exchange", "c", "(Loc/D;Ltc/c;)Loc/B;", "", "method", "b", "(Loc/D;Ljava/lang/String;)Loc/B;", "", "defaultDelay", "g", "(Loc/D;I)I", "Loc/w$a;", "chain", "a", "(Loc/w$a;)Loc/D;", "Loc/z;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z client;

    public j(z client) {
        C3862t.g(client, "client");
        this.client = client;
    }

    private final C4178B b(C4180D userResponse, String method) {
        String strK;
        v vVarR;
        if (!this.client.getFollowRedirects() || (strK = C4180D.k(userResponse, "Location", null, 2, null)) == null || (vVarR = userResponse.getRequest().getUrl().r(strK)) == null) {
            return null;
        }
        if (!C3862t.b(vVarR.getScheme(), userResponse.getRequest().getUrl().getScheme()) && !this.client.getFollowSslRedirects()) {
            return null;
        }
        C4178B.a aVarI = userResponse.getRequest().i();
        if (f.b(method)) {
            int code = userResponse.getCode();
            f fVar = f.f50537a;
            boolean z10 = fVar.d(method) || code == 308 || code == 307;
            if (!fVar.c(method) || code == 308 || code == 307) {
                aVarI.f(method, z10 ? userResponse.getRequest().getBody() : null);
            } else {
                aVarI.f("GET", null);
            }
            if (!z10) {
                aVarI.g("Transfer-Encoding");
                aVarI.g("Content-Length");
                aVarI.g("Content-Type");
            }
        }
        if (!pc.d.j(userResponse.getRequest().getUrl(), vVarR)) {
            aVarI.g("Authorization");
        }
        return aVarI.j(vVarR).b();
    }

    private final C4178B c(C4180D userResponse, tc.c exchange) throws ProtocolException {
        tc.f connection;
        F route = (exchange == null || (connection = exchange.getConnection()) == null) ? null : connection.getRoute();
        int code = userResponse.getCode();
        String method = userResponse.getRequest().getMethod();
        if (code != 307 && code != 308) {
            if (code == 401) {
                return this.client.getAuthenticator().a(route, userResponse);
            }
            if (code == 421) {
                AbstractC4179C body = userResponse.getRequest().getBody();
                if ((body != null && body.g()) || exchange == null || !exchange.l()) {
                    return null;
                }
                exchange.getConnection().x();
                return userResponse.getRequest();
            }
            if (code == 503) {
                C4180D priorResponse = userResponse.getPriorResponse();
                if ((priorResponse == null || priorResponse.getCode() != 503) && g(userResponse, Integer.MAX_VALUE) == 0) {
                    return userResponse.getRequest();
                }
                return null;
            }
            if (code == 407) {
                C3862t.d(route);
                if (route.getProxy().type() == Proxy.Type.HTTP) {
                    return this.client.getProxyAuthenticator().a(route, userResponse);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (code == 408) {
                if (!this.client.getRetryOnConnectionFailure()) {
                    return null;
                }
                AbstractC4179C body2 = userResponse.getRequest().getBody();
                if (body2 != null && body2.g()) {
                    return null;
                }
                C4180D priorResponse2 = userResponse.getPriorResponse();
                if ((priorResponse2 == null || priorResponse2.getCode() != 408) && g(userResponse, 0) <= 0) {
                    return userResponse.getRequest();
                }
                return null;
            }
            switch (code) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return b(userResponse, method);
    }

    private final boolean d(IOException e10, boolean requestSendStarted) {
        if (e10 instanceof ProtocolException) {
            return false;
        }
        return e10 instanceof InterruptedIOException ? (e10 instanceof SocketTimeoutException) && !requestSendStarted : (((e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) || (e10 instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean e(IOException e10, tc.e call, C4178B userRequest, boolean requestSendStarted) {
        if (this.client.getRetryOnConnectionFailure()) {
            return !(requestSendStarted && f(e10, userRequest)) && d(e10, requestSendStarted) && call.B();
        }
        return false;
    }

    private final boolean f(IOException e10, C4178B userRequest) {
        AbstractC4179C body = userRequest.getBody();
        return (body != null && body.g()) || (e10 instanceof FileNotFoundException);
    }

    private final int g(C4180D userResponse, int defaultDelay) throws NumberFormatException {
        String strK = C4180D.k(userResponse, "Retry-After", null, 2, null);
        if (strK == null) {
            return defaultDelay;
        }
        if (!new Ub.k("\\d+").b(strK)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strK);
        C3862t.f(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r0 = r1.getInterceptorScopedExchange();
        r6 = c(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r6 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r0.getIsDuplex() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        r1.D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        r1.l(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        r0 = r6.getBody();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r0.g() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        r1.l(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        r0 = r7.getBody();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        pc.d.m(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (r8 > 20) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r7 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r0 = r0.o().o(r7.o().b(null).c()).c();
     */
    @Override // oc.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public oc.C4180D a(oc.w.a r11) {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.C3862t.g(r11, r0)
            uc.g r11 = (uc.g) r11
            oc.B r0 = r11.getRequest()
            tc.e r1 = r11.getCall()
            java.util.List r2 = kotlin.collections.r.m()
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L18:
            r6 = r5
        L19:
            r1.k(r0, r6)
            boolean r6 = r1.getCanceled()     // Catch: java.lang.Throwable -> L42
            if (r6 != 0) goto Ld3
            oc.D r0 = r11.a(r0)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L99 okhttp3.internal.connection.RouteException -> Lb4
            if (r7 == 0) goto L40
            oc.D$a r0 = r0.o()     // Catch: java.lang.Throwable -> L42
            oc.D$a r6 = r7.o()     // Catch: java.lang.Throwable -> L42
            oc.D$a r6 = r6.b(r4)     // Catch: java.lang.Throwable -> L42
            oc.D r6 = r6.c()     // Catch: java.lang.Throwable -> L42
            oc.D$a r0 = r0.o(r6)     // Catch: java.lang.Throwable -> L42
            oc.D r0 = r0.c()     // Catch: java.lang.Throwable -> L42
        L40:
            r7 = r0
            goto L45
        L42:
            r11 = move-exception
            goto Ldb
        L45:
            tc.c r0 = r1.getInterceptorScopedExchange()     // Catch: java.lang.Throwable -> L42
            oc.B r6 = r10.c(r7, r0)     // Catch: java.lang.Throwable -> L42
            if (r6 != 0) goto L5e
            if (r0 == 0) goto L5a
            boolean r11 = r0.getIsDuplex()     // Catch: java.lang.Throwable -> L42
            if (r11 == 0) goto L5a
            r1.D()     // Catch: java.lang.Throwable -> L42
        L5a:
            r1.l(r3)
            return r7
        L5e:
            oc.C r0 = r6.getBody()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L6e
            boolean r0 = r0.g()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L6e
            r1.l(r3)
            return r7
        L6e:
            oc.E r0 = r7.getBody()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L77
            pc.d.m(r0)     // Catch: java.lang.Throwable -> L42
        L77:
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L82
            r1.l(r5)
            r0 = r6
            goto L18
        L82:
            java.net.ProtocolException r11 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> L42
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42
            r0.<init>()     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "Too many follow-up requests: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L42
            r0.append(r8)     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L42
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L42
            throw r11     // Catch: java.lang.Throwable -> L42
        L99:
            r6 = move-exception
            boolean r9 = r6 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L42
            r9 = r9 ^ r5
            boolean r9 = r10.e(r6, r1, r0, r9)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto Laf
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L42
            java.util.List r2 = kotlin.collections.r.G0(r2, r6)     // Catch: java.lang.Throwable -> L42
        La9:
            r1.l(r5)
            r6 = r3
            goto L19
        Laf:
            java.lang.Throwable r11 = pc.d.Z(r6, r2)     // Catch: java.lang.Throwable -> L42
            throw r11     // Catch: java.lang.Throwable -> L42
        Lb4:
            r6 = move-exception
            java.io.IOException r9 = r6.getLastConnectException()     // Catch: java.lang.Throwable -> L42
            boolean r9 = r10.e(r9, r1, r0, r3)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto Lca
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L42
            java.io.IOException r6 = r6.getFirstConnectException()     // Catch: java.lang.Throwable -> L42
            java.util.List r2 = kotlin.collections.r.G0(r2, r6)     // Catch: java.lang.Throwable -> L42
            goto La9
        Lca:
            java.io.IOException r11 = r6.getFirstConnectException()     // Catch: java.lang.Throwable -> L42
            java.lang.Throwable r11 = pc.d.Z(r11, r2)     // Catch: java.lang.Throwable -> L42
            throw r11     // Catch: java.lang.Throwable -> L42
        Ld3:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = "Canceled"
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L42
            throw r11     // Catch: java.lang.Throwable -> L42
        Ldb:
            r1.l(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: uc.j.a(oc.w$a):oc.D");
    }
}
