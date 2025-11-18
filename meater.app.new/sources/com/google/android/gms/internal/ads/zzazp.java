package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Map;
import java.util.WeakHashMap;

@zzard
/* loaded from: classes2.dex */
public final class zzazp {

    /* renamed from: d */
    private boolean f22723d;

    /* renamed from: e */
    private Context f22724e;

    /* renamed from: c */
    private boolean f22722c = false;

    /* renamed from: b */
    private final Map<BroadcastReceiver, IntentFilter> f22721b = new WeakHashMap();

    /* renamed from: a */
    private final BroadcastReceiver f22720a = new C6625e6(this);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final synchronized void m17286e(Context context, Intent intent) {
        for (Map.Entry<BroadcastReceiver, IntentFilter> entry : this.f22721b.entrySet()) {
            if (entry.getValue().hasAction(intent.getAction())) {
                entry.getKey().onReceive(context, intent);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m17287a(Context context) {
        if (this.f22722c) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.f22724e = applicationContext;
        if (applicationContext == null) {
            this.f22724e = context;
        }
        zzacu.m16423a(this.f22724e);
        this.f22723d = ((Boolean) zzyt.m20848e().m16421c(zzacu.f21691Q2)).booleanValue();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f22724e.registerReceiver(this.f22720a, intentFilter);
        this.f22722c = true;
    }

    /* renamed from: b */
    public final synchronized void m17288b(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f22723d) {
            this.f22721b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    /* renamed from: c */
    public final synchronized void m17289c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f22723d) {
            this.f22721b.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }
}
