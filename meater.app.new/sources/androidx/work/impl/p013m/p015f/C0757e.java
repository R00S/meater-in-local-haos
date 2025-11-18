package androidx.work.impl.p013m.p015f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.core.net.C0271a;
import androidx.work.AbstractC0807n;
import androidx.work.impl.p013m.C0742b;
import androidx.work.impl.utils.p018p.InterfaceC0799a;

/* compiled from: NetworkStateTracker.java */
/* renamed from: androidx.work.impl.m.f.e */
/* loaded from: classes.dex */
public class C0757e extends AbstractC0756d<C0742b> {

    /* renamed from: g */
    static final String f4754g = AbstractC0807n.m5223f("NetworkStateTracker");

    /* renamed from: h */
    private final ConnectivityManager f4755h;

    /* renamed from: i */
    private b f4756i;

    /* renamed from: j */
    private a f4757j;

    /* compiled from: NetworkStateTracker.java */
    /* renamed from: androidx.work.impl.m.f.e$a */
    private class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            AbstractC0807n.m5221c().mo5224a(C0757e.f4754g, "Network broadcast received", new Throwable[0]);
            C0757e c0757e = C0757e.this;
            c0757e.m5060d(c0757e.m5062g());
        }
    }

    /* compiled from: NetworkStateTracker.java */
    /* renamed from: androidx.work.impl.m.f.e$b */
    private class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            AbstractC0807n.m5221c().mo5224a(C0757e.f4754g, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            C0757e c0757e = C0757e.this;
            c0757e.m5060d(c0757e.m5062g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            AbstractC0807n.m5221c().mo5224a(C0757e.f4754g, "Network connection lost", new Throwable[0]);
            C0757e c0757e = C0757e.this;
            c0757e.m5060d(c0757e.m5062g());
        }
    }

    public C0757e(Context context, InterfaceC0799a interfaceC0799a) {
        super(context, interfaceC0799a);
        this.f4755h = (ConnectivityManager) this.f4748c.getSystemService("connectivity");
        if (m5061j()) {
            this.f4756i = new b();
        } else {
            this.f4757j = new a();
        }
    }

    /* renamed from: j */
    private static boolean m5061j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // androidx.work.impl.p013m.p015f.AbstractC0756d
    /* renamed from: e */
    public void mo5056e() {
        if (!m5061j()) {
            AbstractC0807n.m5221c().mo5224a(f4754g, "Registering broadcast receiver", new Throwable[0]);
            this.f4748c.registerReceiver(this.f4757j, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            AbstractC0807n.m5221c().mo5224a(f4754g, "Registering network callback", new Throwable[0]);
            this.f4755h.registerDefaultNetworkCallback(this.f4756i);
        } catch (IllegalArgumentException | SecurityException e2) {
            AbstractC0807n.m5221c().mo5225b(f4754g, "Received exception while registering network callback", e2);
        }
    }

    @Override // androidx.work.impl.p013m.p015f.AbstractC0756d
    /* renamed from: f */
    public void mo5057f() {
        if (!m5061j()) {
            AbstractC0807n.m5221c().mo5224a(f4754g, "Unregistering broadcast receiver", new Throwable[0]);
            this.f4748c.unregisterReceiver(this.f4757j);
            return;
        }
        try {
            AbstractC0807n.m5221c().mo5224a(f4754g, "Unregistering network callback", new Throwable[0]);
            this.f4755h.unregisterNetworkCallback(this.f4756i);
        } catch (IllegalArgumentException | SecurityException e2) {
            AbstractC0807n.m5221c().mo5225b(f4754g, "Received exception while unregistering network callback", e2);
        }
    }

    /* renamed from: g */
    C0742b m5062g() {
        NetworkInfo activeNetworkInfo = this.f4755h.getActiveNetworkInfo();
        return new C0742b(activeNetworkInfo != null && activeNetworkInfo.isConnected(), m5064i(), C0271a.m1830a(this.f4755h), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }

    @Override // androidx.work.impl.p013m.p015f.AbstractC0756d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0742b mo5051b() {
        return m5062g();
    }

    /* renamed from: i */
    boolean m5064i() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = this.f4755h.getNetworkCapabilities(this.f4755h.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (SecurityException e2) {
            AbstractC0807n.m5221c().mo5225b(f4754g, "Unable to validate active network", e2);
            return false;
        }
    }
}
