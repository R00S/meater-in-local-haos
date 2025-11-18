package com.bumptech.glide.p138m;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.bumptech.glide.p138m.InterfaceC5534c;
import com.bumptech.glide.p145r.C5596j;

/* compiled from: DefaultConnectivityMonitor.java */
/* renamed from: com.bumptech.glide.m.e */
/* loaded from: classes.dex */
final class C5536e implements InterfaceC5534c {

    /* renamed from: f */
    private final Context f13858f;

    /* renamed from: g */
    final InterfaceC5534c.a f13859g;

    /* renamed from: h */
    boolean f13860h;

    /* renamed from: i */
    private boolean f13861i;

    /* renamed from: j */
    private final BroadcastReceiver f13862j = new a();

    /* compiled from: DefaultConnectivityMonitor.java */
    /* renamed from: com.bumptech.glide.m.e$a */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C5536e c5536e = C5536e.this;
            boolean z = c5536e.f13860h;
            c5536e.f13860h = c5536e.m10791a(context);
            if (z != C5536e.this.f13860h) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + C5536e.this.f13860h);
                }
                C5536e c5536e2 = C5536e.this;
                c5536e2.f13859g.mo10048a(c5536e2.f13860h);
            }
        }
    }

    C5536e(Context context, InterfaceC5534c.a aVar) {
        this.f13858f = context.getApplicationContext();
        this.f13859g = aVar;
    }

    /* renamed from: b */
    private void m10789b() {
        if (this.f13861i) {
            return;
        }
        this.f13860h = m10791a(this.f13858f);
        try {
            this.f13858f.registerReceiver(this.f13862j, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f13861i = true;
        } catch (SecurityException e2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register", e2);
            }
        }
    }

    /* renamed from: c */
    private void m10790c() {
        if (this.f13861i) {
            this.f13858f.unregisterReceiver(this.f13862j);
            this.f13861i = false;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    boolean m10791a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) C5596j.m11042d((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e2);
            }
            return true;
        }
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5540i
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5540i
    public void onStart() {
        m10789b();
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5540i
    public void onStop() {
        m10790c();
    }
}
