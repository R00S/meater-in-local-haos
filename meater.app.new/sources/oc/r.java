package oc;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: EventListener.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000 L2\u00020\u0001:\u0002IJB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010\bJ!\u0010\"\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J1\u0010&\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J9\u0010*\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b0\u0010/J\u0017\u00101\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b1\u0010\bJ\u001f\u00104\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b6\u0010\bJ\u001f\u00109\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u001f\u0010;\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b=\u0010\bJ\u001f\u0010@\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bB\u0010\bJ\u001f\u0010C\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\bC\u0010:J\u001f\u0010D\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\bD\u0010<J\u0017\u0010E\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bE\u0010\bJ\u001f\u0010F\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\bF\u0010<J\u0017\u0010G\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bG\u0010\bJ\u001f\u0010H\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bH\u0010AJ\u001f\u0010I\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bI\u0010AJ\u0017\u0010J\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bJ\u0010\bJ\u001f\u0010L\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010K\u001a\u00020>H\u0016¢\u0006\u0004\bL\u0010A¨\u0006M"}, d2 = {"Loc/r;", "", "<init>", "()V", "Loc/e;", "call", "Loa/F;", "f", "(Loc/e;)V", "Loc/v;", "url", "p", "(Loc/e;Loc/v;)V", "", "Ljava/net/Proxy;", "proxies", "o", "(Loc/e;Loc/v;Ljava/util/List;)V", "", "domainName", "n", "(Loc/e;Ljava/lang/String;)V", "Ljava/net/InetAddress;", "inetAddressList", "m", "(Loc/e;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "j", "(Loc/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "C", "Loc/t;", "handshake", "B", "(Loc/e;Loc/t;)V", "Loc/A;", "protocol", "h", "(Loc/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Loc/A;)V", "Ljava/io/IOException;", "ioe", "i", "(Loc/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Loc/A;Ljava/io/IOException;)V", "Loc/j;", "connection", "k", "(Loc/e;Loc/j;)V", "l", "u", "Loc/B;", "request", "t", "(Loc/e;Loc/B;)V", "r", "", "byteCount", "q", "(Loc/e;J)V", "s", "(Loc/e;Ljava/io/IOException;)V", "z", "Loc/D;", "response", "y", "(Loc/e;Loc/D;)V", "w", "v", "x", "d", "e", "g", "A", "b", "c", "cachedResponse", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class r {

    /* renamed from: b, reason: collision with root package name */
    public static final r f47073b = new a();

    /* compiled from: EventListener.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"oc/r$a", "Loc/r;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends r {
        a() {
        }
    }

    /* compiled from: EventListener.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Loc/r$c;", "", "Loc/e;", "call", "Loc/r;", "a", "(Loc/e;)Loc/r;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface c {
        r a(InterfaceC4185e call);
    }

    public void A(InterfaceC4185e call, C4180D response) {
        C3862t.g(call, "call");
        C3862t.g(response, "response");
    }

    public void B(InterfaceC4185e call, t handshake) {
        C3862t.g(call, "call");
    }

    public void C(InterfaceC4185e call) {
        C3862t.g(call, "call");
    }

    public void a(InterfaceC4185e call, C4180D cachedResponse) {
        C3862t.g(call, "call");
        C3862t.g(cachedResponse, "cachedResponse");
    }

    public void b(InterfaceC4185e call, C4180D response) {
        C3862t.g(call, "call");
        C3862t.g(response, "response");
    }

    public void c(InterfaceC4185e call) {
        C3862t.g(call, "call");
    }

    public void d(InterfaceC4185e call) {
        C3862t.g(call, "call");
    }

    public void e(InterfaceC4185e call, IOException ioe) {
        C3862t.g(call, "call");
        C3862t.g(ioe, "ioe");
    }

    public void f(InterfaceC4185e call) {
        C3862t.g(call, "call");
    }

    public void g(InterfaceC4185e call) {
        C3862t.g(call, "call");
    }

    public void h(InterfaceC4185e call, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC4177A protocol) {
        C3862t.g(call, "call");
        C3862t.g(inetSocketAddress, "inetSocketAddress");
        C3862t.g(proxy, "proxy");
    }

    public void i(InterfaceC4185e call, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC4177A protocol, IOException ioe) {
        C3862t.g(call, "call");
        C3862t.g(inetSocketAddress, "inetSocketAddress");
        C3862t.g(proxy, "proxy");
        C3862t.g(ioe, "ioe");
    }

    public void j(InterfaceC4185e call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        C3862t.g(call, "call");
        C3862t.g(inetSocketAddress, "inetSocketAddress");
        C3862t.g(proxy, "proxy");
    }

    public void k(InterfaceC4185e call, j connection) {
        C3862t.g(call, "call");
        C3862t.g(connection, "connection");
    }

    public void l(InterfaceC4185e call, j connection) {
        C3862t.g(call, "call");
        C3862t.g(connection, "connection");
    }

    public void m(InterfaceC4185e call, String domainName, List<InetAddress> inetAddressList) {
        C3862t.g(call, "call");
        C3862t.g(domainName, "domainName");
        C3862t.g(inetAddressList, "inetAddressList");
    }

    public void n(InterfaceC4185e call, String domainName) {
        C3862t.g(call, "call");
        C3862t.g(domainName, "domainName");
    }

    public void o(InterfaceC4185e call, v url, List<Proxy> proxies) {
        C3862t.g(call, "call");
        C3862t.g(url, "url");
        C3862t.g(proxies, "proxies");
    }

    public void p(InterfaceC4185e call, v url) {
        C3862t.g(call, "call");
        C3862t.g(url, "url");
    }

    public void q(InterfaceC4185e call, long byteCount) {
        C3862t.g(call, "call");
    }

    public void r(InterfaceC4185e call) {
        C3862t.g(call, "call");
    }

    public void s(InterfaceC4185e call, IOException ioe) {
        C3862t.g(call, "call");
        C3862t.g(ioe, "ioe");
    }

    public void t(InterfaceC4185e call, C4178B request) {
        C3862t.g(call, "call");
        C3862t.g(request, "request");
    }

    public void u(InterfaceC4185e call) {
        C3862t.g(call, "call");
    }

    public void v(InterfaceC4185e call, long byteCount) {
        C3862t.g(call, "call");
    }

    public void w(InterfaceC4185e call) {
        C3862t.g(call, "call");
    }

    public void x(InterfaceC4185e call, IOException ioe) {
        C3862t.g(call, "call");
        C3862t.g(ioe, "ioe");
    }

    public void y(InterfaceC4185e call, C4180D response) {
        C3862t.g(call, "call");
        C3862t.g(response, "response");
    }

    public void z(InterfaceC4185e call) {
        C3862t.g(call, "call");
    }
}
