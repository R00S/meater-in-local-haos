package P5;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: NetworkMonitor.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u0003J\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0012R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010'\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u0013\u0010&¨\u0006("}, d2 = {"LP5/z;", "Landroid/net/ConnectivityManager$NetworkCallback;", "<init>", "()V", "Landroid/net/Network;", "network", "Loa/F;", "onAvailable", "(Landroid/net/Network;)V", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onLost", "d", "LT4/i;", "listener", "c", "(LT4/i;)V", "b", "LT4/i;", "getConnectionStateListener", "()LT4/i;", "setConnectionStateListener", "connectionStateListener", "", "Z", "isConnected", "LO4/b;", "LO4/b;", "lastActiveNetworkType", "Landroid/net/ConnectivityManager;", "e", "Landroid/net/ConnectivityManager;", "connectivityManager", "a", "()LO4/b;", "activeNetwork", "()Z", "isOnline", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class z extends ConnectivityManager.NetworkCallback {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static T4.i connectionStateListener;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static boolean isConnected;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final ConnectivityManager connectivityManager;

    /* renamed from: f, reason: collision with root package name */
    public static final int f14090f;

    /* renamed from: a, reason: collision with root package name */
    public static final z f14085a = new z();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static O4.b lastActiveNetworkType = O4.b.f13237B;

    static {
        Object systemService = x4.g.h().getSystemService((Class<Object>) ConnectivityManager.class);
        C3862t.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        connectivityManager = (ConnectivityManager) systemService;
        f14090f = 8;
    }

    private z() {
    }

    private final O4.b a() {
        ConnectivityManager connectivityManager2 = connectivityManager;
        NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(connectivityManager2.getActiveNetwork());
        return networkCapabilities != null ? networkCapabilities.hasTransport(1) ? O4.b.f13239D : networkCapabilities.hasTransport(0) ? O4.b.f13238C : O4.b.f13237B : O4.b.f13237B;
    }

    public final boolean b() {
        return isConnected;
    }

    public final void c(T4.i listener) {
        C3862t.g(listener, "listener");
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(0).addTransportType(1).build(), this);
        connectionStateListener = listener;
    }

    public final void d() {
        try {
            if (connectionStateListener == null) {
                return;
            }
            connectivityManager.unregisterNetworkCallback(this);
        } catch (IllegalArgumentException unused) {
            Log.d("Error ", " failed to unregister, it was already ");
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        C3862t.g(network, "network");
        super.onAvailable(network);
        isConnected = true;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        T4.i iVar;
        C3862t.g(network, "network");
        C3862t.g(networkCapabilities, "networkCapabilities");
        super.onCapabilitiesChanged(network, networkCapabilities);
        networkCapabilities.hasCapability(11);
        if (lastActiveNetworkType != a() && (iVar = connectionStateListener) != null) {
            iVar.a(a() != O4.b.f13237B, a());
        }
        lastActiveNetworkType = a();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        C3862t.g(network, "network");
        super.onLost(network);
        O4.b bVar = O4.b.f13237B;
        lastActiveNetworkType = bVar;
        T4.i iVar = connectionStateListener;
        if (iVar != null) {
            iVar.a(false, bVar);
        }
        isConnected = false;
    }
}
