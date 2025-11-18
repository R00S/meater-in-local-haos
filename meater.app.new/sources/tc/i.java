package tc;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oc.C4181a;
import oc.F;
import oc.InterfaceC4185e;
import oc.r;
import oc.v;

/* compiled from: RouteSelector.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 /2\u00020\u0001:\u0002\u001a\u0014B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u001bH\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010!R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010#R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010#¨\u00060"}, d2 = {"Ltc/i;", "", "Loc/a;", "address", "Ltc/h;", "routeDatabase", "Loc/e;", "call", "Loc/r;", "eventListener", "<init>", "(Loc/a;Ltc/h;Loc/e;Loc/r;)V", "Loc/v;", "url", "Ljava/net/Proxy;", "proxy", "Loa/F;", "f", "(Loc/v;Ljava/net/Proxy;)V", "", "b", "()Z", "d", "()Ljava/net/Proxy;", "e", "(Ljava/net/Proxy;)V", "a", "Ltc/i$b;", "c", "()Ltc/i$b;", "Loc/a;", "Ltc/h;", "Loc/e;", "Loc/r;", "", "Ljava/util/List;", "proxies", "", "I", "nextProxyIndex", "Ljava/net/InetSocketAddress;", "g", "inetSocketAddresses", "", "Loc/F;", "h", "postponedRoutes", "i", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C4181a address;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h routeDatabase;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4185e call;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final r eventListener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private List<? extends Proxy> proxies;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int nextProxyIndex;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private List<? extends InetSocketAddress> inetSocketAddresses;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<F> postponedRoutes;

    /* compiled from: RouteSelector.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ltc/i$a;", "", "<init>", "()V", "Ljava/net/InetSocketAddress;", "", "a", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "socketHost", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: tc.i$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final String a(InetSocketAddress inetSocketAddress) {
            C3862t.g(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                C3862t.f(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            C3862t.f(hostAddress, "address.hostAddress");
            return hostAddress;
        }

        private Companion() {
        }
    }

    /* compiled from: RouteSelector.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0012"}, d2 = {"Ltc/i$b;", "", "", "Loc/F;", "routes", "<init>", "(Ljava/util/List;)V", "", "b", "()Z", "c", "()Loc/F;", "a", "Ljava/util/List;", "()Ljava/util/List;", "", "I", "nextRouteIndex", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<F> routes;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int nextRouteIndex;

        public b(List<F> routes) {
            C3862t.g(routes, "routes");
            this.routes = routes;
        }

        public final List<F> a() {
            return this.routes;
        }

        public final boolean b() {
            return this.nextRouteIndex < this.routes.size();
        }

        public final F c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List<F> list = this.routes;
            int i10 = this.nextRouteIndex;
            this.nextRouteIndex = i10 + 1;
            return list.get(i10);
        }
    }

    public i(C4181a address, h routeDatabase, InterfaceC4185e call, r eventListener) {
        C3862t.g(address, "address");
        C3862t.g(routeDatabase, "routeDatabase");
        C3862t.g(call, "call");
        C3862t.g(eventListener, "eventListener");
        this.address = address;
        this.routeDatabase = routeDatabase;
        this.call = call;
        this.eventListener = eventListener;
        this.proxies = kotlin.collections.r.m();
        this.inetSocketAddresses = kotlin.collections.r.m();
        this.postponedRoutes = new ArrayList();
        f(address.getUrl(), address.getProxy());
    }

    private final boolean b() {
        return this.nextProxyIndex < this.proxies.size();
    }

    private final Proxy d() throws SocketException, UnknownHostException {
        if (b()) {
            List<? extends Proxy> list = this.proxies;
            int i10 = this.nextProxyIndex;
            this.nextProxyIndex = i10 + 1;
            Proxy proxy = list.get(i10);
            e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.address.getUrl().getHost() + "; exhausted proxy configurations: " + this.proxies);
    }

    private final void e(Proxy proxy) throws SocketException, UnknownHostException {
        String host;
        int port;
        List<InetAddress> listA;
        ArrayList arrayList = new ArrayList();
        this.inetSocketAddresses = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            host = this.address.getUrl().getHost();
            port = this.address.getUrl().getPort();
        } else {
            SocketAddress proxyAddress = proxy.address();
            if (!(proxyAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + proxyAddress.getClass()).toString());
            }
            Companion companion = INSTANCE;
            C3862t.f(proxyAddress, "proxyAddress");
            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
            host = companion.a(inetSocketAddress);
            port = inetSocketAddress.getPort();
        }
        if (1 > port || port >= 65536) {
            throw new SocketException("No route to " + host + ':' + port + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(host, port));
            return;
        }
        if (pc.d.i(host)) {
            listA = kotlin.collections.r.e(InetAddress.getByName(host));
        } else {
            this.eventListener.n(this.call, host);
            listA = this.address.getDns().a(host);
            if (listA.isEmpty()) {
                throw new UnknownHostException(this.address.getDns() + " returned no addresses for " + host);
            }
            this.eventListener.m(this.call, host, listA);
        }
        Iterator<InetAddress> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress(it.next(), port));
        }
    }

    private final void f(v url, Proxy proxy) {
        this.eventListener.p(this.call, url);
        List<Proxy> listG = g(proxy, url, this);
        this.proxies = listG;
        this.nextProxyIndex = 0;
        this.eventListener.o(this.call, url, listG);
    }

    private static final List<Proxy> g(Proxy proxy, v vVar, i iVar) {
        if (proxy != null) {
            return kotlin.collections.r.e(proxy);
        }
        URI uriT = vVar.t();
        if (uriT.getHost() == null) {
            return pc.d.w(Proxy.NO_PROXY);
        }
        List<Proxy> proxiesOrNull = iVar.address.getProxySelector().select(uriT);
        List<Proxy> list = proxiesOrNull;
        if (list == null || list.isEmpty()) {
            return pc.d.w(Proxy.NO_PROXY);
        }
        C3862t.f(proxiesOrNull, "proxiesOrNull");
        return pc.d.T(proxiesOrNull);
    }

    public final boolean a() {
        return b() || !this.postponedRoutes.isEmpty();
    }

    public final b c() {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy proxyD = d();
            Iterator<? extends InetSocketAddress> it = this.inetSocketAddresses.iterator();
            while (it.hasNext()) {
                F f10 = new F(this.address, proxyD, it.next());
                if (this.routeDatabase.c(f10)) {
                    this.postponedRoutes.add(f10);
                } else {
                    arrayList.add(f10);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            kotlin.collections.r.D(arrayList, this.postponedRoutes);
            this.postponedRoutes.clear();
        }
        return new b(arrayList);
    }
}
