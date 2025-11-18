package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p024c.p041e.C0867a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzcu implements InterfaceC7546m0 {

    /* renamed from: a */
    private static final Map<String, zzcu> f28026a = new C0867a();

    /* renamed from: b */
    private final SharedPreferences f28027b;

    /* renamed from: c */
    private final SharedPreferences.OnSharedPreferenceChangeListener f28028c;

    /* renamed from: d */
    private final Object f28029d;

    /* renamed from: e */
    private volatile Map<String, ?> f28030e;

    /* renamed from: f */
    private final List<zzcc> f28031f;

    private zzcu(SharedPreferences sharedPreferences) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener(this) { // from class: com.google.android.gms.internal.measurement.x0

            /* renamed from: f */
            private final zzcu f27925f;

            {
                this.f27925f = this;
            }

            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                this.f27925f.m22125c(sharedPreferences2, str);
            }
        };
        this.f28028c = onSharedPreferenceChangeListener;
        this.f28029d = new Object();
        this.f28031f = new ArrayList();
        this.f28027b = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    /* renamed from: a */
    static zzcu m22123a(Context context, String str) {
        zzcu zzcuVar;
        SharedPreferences sharedPreferences;
        if (!((!zzby.m22095a() || str.startsWith("direct_boot:")) ? true : zzby.m22096b(context))) {
            return null;
        }
        synchronized (zzcu.class) {
            Map<String, zzcu> map = f28026a;
            zzcuVar = map.get(str);
            if (zzcuVar == null) {
                if (str.startsWith("direct_boot:")) {
                    if (zzby.m22095a()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    sharedPreferences = context.getSharedPreferences(str.substring(12), 0);
                } else {
                    sharedPreferences = context.getSharedPreferences(str, 0);
                }
                zzcuVar = new zzcu(sharedPreferences);
                map.put(str, zzcuVar);
            }
        }
        return zzcuVar;
    }

    /* renamed from: b */
    static synchronized void m22124b() {
        for (zzcu zzcuVar : f28026a.values()) {
            zzcuVar.f28027b.unregisterOnSharedPreferenceChangeListener(zzcuVar.f28028c);
        }
        f28026a.clear();
    }

    /* renamed from: c */
    final /* synthetic */ void m22125c(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f28029d) {
            this.f28030e = null;
            zzcl.m22109g();
        }
        synchronized (this) {
            Iterator<zzcc> it = this.f28031f.iterator();
            while (it.hasNext()) {
                it.next().m22100a();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7546m0
    /* renamed from: u */
    public final Object mo21237u(String str) {
        Map<String, ?> all = this.f28030e;
        if (all == null) {
            synchronized (this.f28029d) {
                all = this.f28030e;
                if (all == null) {
                    all = this.f28027b.getAll();
                    this.f28030e = all;
                }
            }
        }
        if (all != null) {
            return all.get(str);
        }
        return null;
    }
}
