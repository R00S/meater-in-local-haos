package okhttp3.internal.connection;

import java.io.IOException;
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
import kotlin.collections.C10815t;
import kotlin.collections.C10817u;
import kotlin.collections.C10827z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;

/* compiled from: RouteSelector.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 -2\u00020\u0001:\u0002-.B'\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b+\u0010,J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020#0!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010 R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006/"}, m32267d2 = {"Lokhttp3/internal/connection/RouteSelector;", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/HttpUrl;", "url", "Ljava/net/Proxy;", "proxy", "Lkotlin/u;", "resetNextProxy", "(Lokhttp3/HttpUrl;Ljava/net/Proxy;)V", HttpUrl.FRAGMENT_ENCODE_SET, "hasNextProxy", "()Z", "nextProxy", "()Ljava/net/Proxy;", "resetNextInetSocketAddress", "(Ljava/net/Proxy;)V", "hasNext", "Lokhttp3/internal/connection/RouteSelector$Selection;", "next", "()Lokhttp3/internal/connection/RouteSelector$Selection;", "Lokhttp3/Address;", "address", "Lokhttp3/Address;", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", HttpUrl.FRAGMENT_ENCODE_SET, "nextProxyIndex", "I", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Route;", "postponedRoutes", "Ljava/util/List;", HttpUrl.FRAGMENT_ENCODE_SET, "proxies", "Ljava/net/InetSocketAddress;", "inetSocketAddresses", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/EventListener;", "Lokhttp3/Call;", "call", "Lokhttp3/Call;", "<init>", "(Lokhttp3/Address;Lokhttp3/internal/connection/RouteDatabase;Lokhttp3/Call;Lokhttp3/EventListener;)V", "Companion", "Selection", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class RouteSelector {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Address address;
    private final Call call;
    private final EventListener eventListener;
    private List<? extends InetSocketAddress> inetSocketAddresses;
    private int nextProxyIndex;
    private final List<Route> postponedRoutes;
    private List<? extends Proxy> proxies;
    private final RouteDatabase routeDatabase;

    /* compiled from: RouteSelector.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u0003*\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, m32267d2 = {"Lokhttp3/internal/connection/RouteSelector$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/net/InetSocketAddress;", HttpUrl.FRAGMENT_ENCODE_SET, "getSocketHost", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "socketHost", "<init>", "()V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public final String getSocketHost(InetSocketAddress inetSocketAddress) {
            C9801m.m32346f(inetSocketAddress, "$this$socketHost");
            InetAddress address = inetSocketAddress.getAddress();
            if (address != null) {
                String hostAddress = address.getHostAddress();
                C9801m.m32345e(hostAddress, "address.hostAddress");
                return hostAddress;
            }
            String hostName = inetSocketAddress.getHostName();
            C9801m.m32345e(hostName, "hostName");
            return hostName;
        }

        public /* synthetic */ Companion(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: RouteSelector.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m32267d2 = {"Lokhttp3/internal/connection/RouteSelector$Selection;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "hasNext", "()Z", "Lokhttp3/Route;", "next", "()Lokhttp3/Route;", HttpUrl.FRAGMENT_ENCODE_SET, "nextRouteIndex", "I", HttpUrl.FRAGMENT_ENCODE_SET, "routes", "Ljava/util/List;", "getRoutes", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public static final class Selection {
        private int nextRouteIndex;
        private final List<Route> routes;

        public Selection(List<Route> list) {
            C9801m.m32346f(list, "routes");
            this.routes = list;
        }

        public final List<Route> getRoutes() {
            return this.routes;
        }

        public final boolean hasNext() {
            return this.nextRouteIndex < this.routes.size();
        }

        public final Route next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            List<Route> list = this.routes;
            int i2 = this.nextRouteIndex;
            this.nextRouteIndex = i2 + 1;
            return list.get(i2);
        }
    }

    /* compiled from: RouteSelector.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m32267d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/net/Proxy;", "invoke", "()Ljava/util/List;", "selectProxies"}, m32268k = 3, m32269mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.connection.RouteSelector$resetNextProxy$1 */
    static final class C111091 extends Lambda implements Function0<List<? extends Proxy>> {
        final /* synthetic */ Proxy $proxy;
        final /* synthetic */ HttpUrl $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C111091(Proxy proxy, HttpUrl httpUrl) {
            super(0);
            this.$proxy = proxy;
            this.$url = httpUrl;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Proxy> invoke() {
            Proxy proxy = this.$proxy;
            if (proxy != null) {
                return C10815t.m38883e(proxy);
            }
            URI uri = this.$url.uri();
            if (uri.getHost() == null) {
                return Util.immutableListOf(Proxy.NO_PROXY);
            }
            List<Proxy> listSelect = RouteSelector.this.address.proxySelector().select(uri);
            return listSelect == null || listSelect.isEmpty() ? Util.immutableListOf(Proxy.NO_PROXY) : Util.toImmutableList(listSelect);
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, Call call, EventListener eventListener) {
        C9801m.m32346f(address, "address");
        C9801m.m32346f(routeDatabase, "routeDatabase");
        C9801m.m32346f(call, "call");
        C9801m.m32346f(eventListener, "eventListener");
        this.address = address;
        this.routeDatabase = routeDatabase;
        this.call = call;
        this.eventListener = eventListener;
        this.proxies = C10817u.m38888j();
        this.inetSocketAddresses = C10817u.m38888j();
        this.postponedRoutes = new ArrayList();
        resetNextProxy(address.url(), address.proxy());
    }

    private final boolean hasNextProxy() {
        return this.nextProxyIndex < this.proxies.size();
    }

    private final Proxy nextProxy() throws IOException {
        if (hasNextProxy()) {
            List<? extends Proxy> list = this.proxies;
            int i2 = this.nextProxyIndex;
            this.nextProxyIndex = i2 + 1;
            Proxy proxy = list.get(i2);
            resetNextInetSocketAddress(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.address.url().host() + "; exhausted proxy configurations: " + this.proxies);
    }

    private final void resetNextInetSocketAddress(Proxy proxy) throws IOException {
        String strHost;
        int iPort;
        ArrayList arrayList = new ArrayList();
        this.inetSocketAddresses = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strHost = this.address.url().host();
            iPort = this.address.url().port();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            strHost = INSTANCE.getSocketHost(inetSocketAddress);
            iPort = inetSocketAddress.getPort();
        }
        if (1 > iPort || 65535 < iPort) {
            throw new SocketException("No route to " + strHost + ':' + iPort + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strHost, iPort));
            return;
        }
        this.eventListener.dnsStart(this.call, strHost);
        List<InetAddress> listLookup = this.address.dns().lookup(strHost);
        if (listLookup.isEmpty()) {
            throw new UnknownHostException(this.address.dns() + " returned no addresses for " + strHost);
        }
        this.eventListener.dnsEnd(this.call, strHost, listLookup);
        Iterator<InetAddress> it = listLookup.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress(it.next(), iPort));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void resetNextProxy(HttpUrl url, Proxy proxy) {
        C111091 c111091 = new C111091(proxy, url);
        this.eventListener.proxySelectStart(this.call, url);
        List<? extends Proxy> listInvoke = c111091.invoke();
        this.proxies = listInvoke;
        this.nextProxyIndex = 0;
        this.eventListener.proxySelectEnd(this.call, url, listInvoke);
    }

    public final boolean hasNext() {
        return hasNextProxy() || (this.postponedRoutes.isEmpty() ^ true);
    }

    public final Selection next() throws IOException {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (hasNextProxy()) {
            Proxy proxyNextProxy = nextProxy();
            Iterator<? extends InetSocketAddress> it = this.inetSocketAddresses.iterator();
            while (it.hasNext()) {
                Route route = new Route(this.address, proxyNextProxy, it.next());
                if (this.routeDatabase.shouldPostpone(route)) {
                    this.postponedRoutes.add(route);
                } else {
                    arrayList.add(route);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            C10827z.m38933z(arrayList, this.postponedRoutes);
            this.postponedRoutes.clear();
        }
        return new Selection(arrayList);
    }
}
