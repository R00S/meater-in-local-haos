package com.bumptech.glide.p138m;

import android.content.Context;
import android.util.Log;
import androidx.core.content.C0255a;
import com.bumptech.glide.p138m.InterfaceC5534c;

/* compiled from: DefaultConnectivityMonitorFactory.java */
/* renamed from: com.bumptech.glide.m.f */
/* loaded from: classes.dex */
public class C5537f implements InterfaceC5535d {
    @Override // com.bumptech.glide.p138m.InterfaceC5535d
    /* renamed from: a */
    public InterfaceC5534c mo10788a(Context context, InterfaceC5534c.a aVar) {
        boolean z = C0255a.m1672a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z ? new C5536e(context, aVar) : new C5541j();
    }
}
