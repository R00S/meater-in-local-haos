package qc;

import Ub.n;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oc.C4178B;
import oc.C4180D;
import oc.C4181a;
import oc.F;
import oc.InterfaceC4182b;
import oc.h;
import oc.o;
import oc.q;
import oc.v;

/* compiled from: JavaNetAuthenticator.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lqc/a;", "Loc/b;", "Loc/q;", "defaultDns", "<init>", "(Loc/q;)V", "Ljava/net/Proxy;", "Loc/v;", "url", "dns", "Ljava/net/InetAddress;", "b", "(Ljava/net/Proxy;Loc/v;Loc/q;)Ljava/net/InetAddress;", "Loc/F;", "route", "Loc/D;", "response", "Loc/B;", "a", "(Loc/F;Loc/D;)Loc/B;", "d", "Loc/q;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: qc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4326a implements InterfaceC4182b {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q defaultDns;

    /* compiled from: JavaNetAuthenticator.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: qc.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0672a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48312a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f48312a = iArr;
        }
    }

    public C4326a(q defaultDns) {
        C3862t.g(defaultDns, "defaultDns");
        this.defaultDns = defaultDns;
    }

    private final InetAddress b(Proxy proxy, v vVar, q qVar) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : C0672a.f48312a[type.ordinal()]) == 1) {
            return (InetAddress) r.j0(qVar.a(vVar.getHost()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        C3862t.e(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        C3862t.f(address, "address() as InetSocketAddress).address");
        return address;
    }

    @Override // oc.InterfaceC4182b
    public C4178B a(F route, C4180D response) {
        Proxy proxy;
        q dns;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        C4181a address;
        C3862t.g(response, "response");
        List<h> listD = response.d();
        C4178B request = response.getRequest();
        v url = request.getUrl();
        boolean z10 = response.getCode() == 407;
        if (route == null || (proxy = route.getProxy()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (h hVar : listD) {
            if (n.t("Basic", hVar.getScheme(), true)) {
                if (route == null || (address = route.getAddress()) == null || (dns = address.getDns()) == null) {
                    dns = this.defaultDns;
                }
                if (z10) {
                    SocketAddress socketAddressAddress = proxy.address();
                    C3862t.e(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    C3862t.f(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, url, dns), inetSocketAddress.getPort(), url.getScheme(), hVar.b(), hVar.getScheme(), url.u(), Authenticator.RequestorType.PROXY);
                } else {
                    String host = url.getHost();
                    C3862t.f(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(host, b(proxy, url, dns), url.getPort(), url.getScheme(), hVar.b(), hVar.getScheme(), url.u(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z10 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    C3862t.f(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    C3862t.f(password, "auth.password");
                    return request.i().d(str, o.a(userName, new String(password), hVar.a())).b();
                }
            }
        }
        return null;
    }

    public /* synthetic */ C4326a(q qVar, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? q.f47070b : qVar);
    }
}
