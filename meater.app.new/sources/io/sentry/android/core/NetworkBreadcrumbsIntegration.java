package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import io.sentry.C9471i2;
import io.sentry.C9517n1;
import io.sentry.C9657v0;
import io.sentry.C9680x4;
import io.sentry.EnumC9587s4;
import io.sentry.Integration;
import io.sentry.InterfaceC9658v1;
import io.sentry.InterfaceC9670w1;
import io.sentry.android.core.internal.util.C9314k;
import io.sentry.util.C9646q;
import java.io.Closeable;
import java.io.IOException;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class NetworkBreadcrumbsIntegration implements Integration, Closeable {

    /* renamed from: f */
    private final Context f35810f;

    /* renamed from: g */
    private final C9344s0 f35811g;

    /* renamed from: h */
    private final InterfaceC9670w1 f35812h;

    /* renamed from: i */
    C9256b f35813i;

    /* renamed from: io.sentry.android.core.NetworkBreadcrumbsIntegration$a */
    static class C9255a {

        /* renamed from: a */
        final int f35814a;

        /* renamed from: b */
        final int f35815b;

        /* renamed from: c */
        final int f35816c;

        /* renamed from: d */
        final boolean f35817d;

        /* renamed from: e */
        final String f35818e;

        @SuppressLint({"NewApi", "ObsoleteSdkInt"})
        C9255a(NetworkCapabilities networkCapabilities, C9344s0 c9344s0) {
            C9646q.m31802c(networkCapabilities, "NetworkCapabilities is required");
            C9646q.m31802c(c9344s0, "BuildInfoProvider is required");
            this.f35814a = networkCapabilities.getLinkDownstreamBandwidthKbps();
            this.f35815b = networkCapabilities.getLinkUpstreamBandwidthKbps();
            int signalStrength = c9344s0.m30406d() >= 29 ? networkCapabilities.getSignalStrength() : 0;
            this.f35816c = signalStrength > -100 ? signalStrength : 0;
            this.f35817d = networkCapabilities.hasTransport(4);
            String strM30283d = C9314k.m30283d(networkCapabilities, c9344s0);
            this.f35818e = strM30283d == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM30283d;
        }

        /* renamed from: a */
        boolean m30132a(C9255a c9255a) {
            if (this.f35817d == c9255a.f35817d && this.f35818e.equals(c9255a.f35818e)) {
                int i2 = this.f35816c;
                int i3 = c9255a.f35816c;
                if (-5 <= i2 - i3 && i2 - i3 <= 5) {
                    int i4 = this.f35814a;
                    int i5 = c9255a.f35814a;
                    if (-1000 <= i4 - i5 && i4 - i5 <= 1000) {
                        int i6 = this.f35815b;
                        int i7 = c9255a.f35815b;
                        if (-1000 <= i6 - i7 && i6 - i7 <= 1000) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    @SuppressLint({"ObsoleteSdkInt"})
    /* renamed from: io.sentry.android.core.NetworkBreadcrumbsIntegration$b */
    static final class C9256b extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        final InterfaceC9658v1 f35819a;

        /* renamed from: b */
        final C9344s0 f35820b;

        /* renamed from: c */
        Network f35821c = null;

        /* renamed from: d */
        NetworkCapabilities f35822d = null;

        C9256b(InterfaceC9658v1 interfaceC9658v1, C9344s0 c9344s0) {
            this.f35819a = (InterfaceC9658v1) C9646q.m31802c(interfaceC9658v1, "Hub is required");
            this.f35820b = (C9344s0) C9646q.m31802c(c9344s0, "BuildInfoProvider is required");
        }

        /* renamed from: a */
        private C9657v0 m30133a(String str) {
            C9657v0 c9657v0 = new C9657v0();
            c9657v0.m31844p("system");
            c9657v0.m31840l("network.event");
            c9657v0.m31841m("action", str);
            c9657v0.m31842n(EnumC9587s4.INFO);
            return c9657v0;
        }

        /* renamed from: b */
        private C9255a m30134b(NetworkCapabilities networkCapabilities, NetworkCapabilities networkCapabilities2) {
            if (networkCapabilities == null) {
                return new C9255a(networkCapabilities2, this.f35820b);
            }
            C9255a c9255a = new C9255a(networkCapabilities, this.f35820b);
            C9255a c9255a2 = new C9255a(networkCapabilities2, this.f35820b);
            if (c9255a2.m30132a(c9255a)) {
                return null;
            }
            return c9255a2;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (network.equals(this.f35821c)) {
                return;
            }
            this.f35819a.mo31148i(m30133a("NETWORK_AVAILABLE"));
            this.f35821c = network;
            this.f35822d = null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            C9255a c9255aM30134b;
            if (network.equals(this.f35821c) && (c9255aM30134b = m30134b(this.f35822d, networkCapabilities)) != null) {
                this.f35822d = networkCapabilities;
                C9657v0 c9657v0M30133a = m30133a("NETWORK_CAPABILITIES_CHANGED");
                c9657v0M30133a.m31841m("download_bandwidth", Integer.valueOf(c9255aM30134b.f35814a));
                c9657v0M30133a.m31841m("upload_bandwidth", Integer.valueOf(c9255aM30134b.f35815b));
                c9657v0M30133a.m31841m("vpn_active", Boolean.valueOf(c9255aM30134b.f35817d));
                c9657v0M30133a.m31841m("network_type", c9255aM30134b.f35818e);
                int i2 = c9255aM30134b.f35816c;
                if (i2 != 0) {
                    c9657v0M30133a.m31841m("signal_strength", Integer.valueOf(i2));
                }
                C9517n1 c9517n1 = new C9517n1();
                c9517n1.m31079j("android:networkCapabilities", c9255aM30134b);
                this.f35819a.mo31153n(c9657v0M30133a, c9517n1);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (network.equals(this.f35821c)) {
                this.f35819a.mo31148i(m30133a("NETWORK_LOST"));
                this.f35821c = null;
                this.f35822d = null;
            }
        }
    }

    public NetworkBreadcrumbsIntegration(Context context, C9344s0 c9344s0, InterfaceC9670w1 interfaceC9670w1) {
        this.f35810f = (Context) C9646q.m31802c(context, "Context is required");
        this.f35811g = (C9344s0) C9646q.m31802c(c9344s0, "BuildInfoProvider is required");
        this.f35812h = (InterfaceC9670w1) C9646q.m31802c(interfaceC9670w1, "ILogger is required");
    }

    @Override // io.sentry.InterfaceC9490j2
    /* renamed from: a */
    public /* synthetic */ void mo30003a() {
        C9471i2.m30845a(this);
    }

    @Override // io.sentry.Integration
    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public void mo30001c(InterfaceC9658v1 interfaceC9658v1, C9680x4 c9680x4) {
        C9646q.m31802c(interfaceC9658v1, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) C9646q.m31802c(c9680x4 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c9680x4 : null, "SentryAndroidOptions is required");
        InterfaceC9670w1 interfaceC9670w1 = this.f35812h;
        EnumC9587s4 enumC9587s4 = EnumC9587s4.DEBUG;
        interfaceC9670w1.mo30214c(enumC9587s4, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            if (this.f35811g.m30406d() < 21) {
                this.f35813i = null;
                this.f35812h.mo30214c(enumC9587s4, "NetworkBreadcrumbsIntegration requires Android 5+", new Object[0]);
                return;
            }
            C9256b c9256b = new C9256b(interfaceC9658v1, this.f35811g);
            this.f35813i = c9256b;
            if (C9314k.m30285f(this.f35810f, this.f35812h, this.f35811g, c9256b)) {
                this.f35812h.mo30214c(enumC9587s4, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                mo30003a();
            } else {
                this.f35813i = null;
                this.f35812h.mo30214c(enumC9587s4, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        C9256b c9256b = this.f35813i;
        if (c9256b != null) {
            C9314k.m30286g(this.f35810f, this.f35812h, this.f35811g, c9256b);
            this.f35812h.mo30214c(EnumC9587s4.DEBUG, "NetworkBreadcrumbsIntegration remove.", new Object[0]);
        }
        this.f35813i = null;
    }

    @Override // io.sentry.InterfaceC9490j2
    /* renamed from: d */
    public /* synthetic */ String mo30004d() {
        return C9471i2.m30846b(this);
    }
}
