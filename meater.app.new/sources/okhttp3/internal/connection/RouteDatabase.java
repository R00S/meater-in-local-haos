package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import okhttp3.Route;

/* compiled from: RouteDatabase.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m32267d2 = {"Lokhttp3/internal/connection/RouteDatabase;", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Route;", "failedRoute", "Lkotlin/u;", "failed", "(Lokhttp3/Route;)V", "route", "connected", HttpUrl.FRAGMENT_ENCODE_SET, "shouldPostpone", "(Lokhttp3/Route;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "failedRoutes", "Ljava/util/Set;", "<init>", "()V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class RouteDatabase {
    private final Set<Route> failedRoutes = new LinkedHashSet();

    public final synchronized void connected(Route route) {
        C9801m.m32346f(route, "route");
        this.failedRoutes.remove(route);
    }

    public final synchronized void failed(Route failedRoute) {
        C9801m.m32346f(failedRoute, "failedRoute");
        this.failedRoutes.add(failedRoute);
    }

    public final synchronized boolean shouldPostpone(Route route) {
        C9801m.m32346f(route, "route");
        return this.failedRoutes.contains(route);
    }
}
