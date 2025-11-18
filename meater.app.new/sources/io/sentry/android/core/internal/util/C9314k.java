package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9670w1;
import io.sentry.android.core.C9344s0;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ConnectivityChecker.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.internal.util.k */
/* loaded from: classes2.dex */
public final class C9314k {

    /* compiled from: ConnectivityChecker.java */
    /* renamed from: io.sentry.android.core.internal.util.k$a */
    public enum a {
        CONNECTED,
        NOT_CONNECTED,
        NO_PERMISSION,
        UNKNOWN
    }

    /* renamed from: a */
    private static a m30280a(Context context, ConnectivityManager connectivityManager, InterfaceC9670w1 interfaceC9670w1) {
        if (!C9320q.m30298a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            interfaceC9670w1.mo30214c(EnumC9587s4.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return a.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected() ? a.CONNECTED : a.NOT_CONNECTED;
            }
            interfaceC9670w1.mo30214c(EnumC9587s4.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
            return a.NOT_CONNECTED;
        } catch (Throwable th) {
            interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, "Could not retrieve Connection Status", th);
            return a.UNKNOWN;
        }
    }

    /* renamed from: b */
    public static a m30281b(Context context, InterfaceC9670w1 interfaceC9670w1) {
        ConnectivityManager connectivityManagerM30284e = m30284e(context, interfaceC9670w1);
        return connectivityManagerM30284e == null ? a.UNKNOWN : m30280a(context, connectivityManagerM30284e, interfaceC9670w1);
    }

    @SuppressLint({"ObsoleteSdkInt", "MissingPermission", "NewApi"})
    /* renamed from: c */
    public static String m30282c(Context context, InterfaceC9670w1 interfaceC9670w1, C9344s0 c9344s0) {
        boolean zHasTransport;
        boolean zHasTransport2;
        ConnectivityManager connectivityManagerM30284e = m30284e(context, interfaceC9670w1);
        if (connectivityManagerM30284e == null) {
            return null;
        }
        boolean z = false;
        if (!C9320q.m30298a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            interfaceC9670w1.mo30214c(EnumC9587s4.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return null;
        }
        try {
            zHasTransport = true;
            if (c9344s0.m30406d() >= 23) {
                Network activeNetwork = connectivityManagerM30284e.getActiveNetwork();
                if (activeNetwork == null) {
                    interfaceC9670w1.mo30214c(EnumC9587s4.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities = connectivityManagerM30284e.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    interfaceC9670w1.mo30214c(EnumC9587s4.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean zHasTransport3 = networkCapabilities.hasTransport(3);
                zHasTransport2 = networkCapabilities.hasTransport(1);
                zHasTransport = networkCapabilities.hasTransport(0);
                z = zHasTransport3;
            } else {
                NetworkInfo activeNetworkInfo = connectivityManagerM30284e.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    interfaceC9670w1.mo30214c(EnumC9587s4.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
                    return null;
                }
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        zHasTransport2 = true;
                    } else if (type != 9) {
                        zHasTransport2 = false;
                    } else {
                        zHasTransport2 = false;
                        z = true;
                    }
                    zHasTransport = false;
                } else {
                    zHasTransport2 = false;
                }
            }
        } catch (Throwable th) {
            interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, "Failed to retrieve network info", th);
        }
        if (z) {
            return "ethernet";
        }
        if (zHasTransport2) {
            return "wifi";
        }
        if (zHasTransport) {
            return "cellular";
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public static String m30283d(NetworkCapabilities networkCapabilities, C9344s0 c9344s0) {
        if (c9344s0.m30406d() < 21) {
            return null;
        }
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "cellular";
        }
        return null;
    }

    /* renamed from: e */
    private static ConnectivityManager m30284e(Context context, InterfaceC9670w1 interfaceC9670w1) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            interfaceC9670w1.mo30214c(EnumC9587s4.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
        }
        return connectivityManager;
    }

    @SuppressLint({"MissingPermission", "NewApi"})
    /* renamed from: f */
    public static boolean m30285f(Context context, InterfaceC9670w1 interfaceC9670w1, C9344s0 c9344s0, ConnectivityManager.NetworkCallback networkCallback) {
        if (c9344s0.m30406d() < 24) {
            interfaceC9670w1.mo30214c(EnumC9587s4.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        ConnectivityManager connectivityManagerM30284e = m30284e(context, interfaceC9670w1);
        if (connectivityManagerM30284e == null) {
            return false;
        }
        if (!C9320q.m30298a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            interfaceC9670w1.mo30214c(EnumC9587s4.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        try {
            connectivityManagerM30284e.registerDefaultNetworkCallback(networkCallback);
            return true;
        } catch (Throwable th) {
            interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, "registerDefaultNetworkCallback failed", th);
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public static void m30286g(Context context, InterfaceC9670w1 interfaceC9670w1, C9344s0 c9344s0, ConnectivityManager.NetworkCallback networkCallback) {
        ConnectivityManager connectivityManagerM30284e;
        if (c9344s0.m30406d() >= 21 && (connectivityManagerM30284e = m30284e(context, interfaceC9670w1)) != null) {
            try {
                connectivityManagerM30284e.unregisterNetworkCallback(networkCallback);
            } catch (Throwable th) {
                interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, "unregisterNetworkCallback failed", th);
            }
        }
    }
}
