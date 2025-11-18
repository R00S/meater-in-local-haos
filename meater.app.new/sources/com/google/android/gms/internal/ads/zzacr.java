package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzacr implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: l */
    private Context f21590l;

    /* renamed from: f */
    private final Object f21584f = new Object();

    /* renamed from: g */
    private final ConditionVariable f21585g = new ConditionVariable();

    /* renamed from: h */
    private volatile boolean f21586h = false;

    /* renamed from: i */
    @VisibleForTesting
    private volatile boolean f21587i = false;

    /* renamed from: j */
    private SharedPreferences f21588j = null;

    /* renamed from: k */
    private Bundle f21589k = new Bundle();

    /* renamed from: m */
    private JSONObject f21591m = new JSONObject();

    /* renamed from: d */
    private final void m16419d() {
        if (this.f21588j == null) {
            return;
        }
        try {
            this.f21591m = new JSONObject((String) zzazl.m17282a(this.f21590l, new Callable(this) { // from class: com.google.android.gms.internal.ads.q

                /* renamed from: f */
                private final zzacr f20342f;

                {
                    this.f20342f = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f20342f.m16422e();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public final void m16420a(Context context) {
        if (this.f21586h) {
            return;
        }
        synchronized (this.f21584f) {
            if (this.f21586h) {
                return;
            }
            if (!this.f21587i) {
                this.f21587i = true;
            }
            Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
            this.f21590l = applicationContext;
            try {
                this.f21589k = Wrappers.m14674a(applicationContext).m14669c(this.f21590l.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            try {
                Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                if (remoteContext == null) {
                    Context applicationContext2 = context.getApplicationContext();
                    if (applicationContext2 != null) {
                        context = applicationContext2;
                    }
                    remoteContext = context;
                }
                if (remoteContext == null) {
                    return;
                }
                zzyt.m20846c();
                SharedPreferences sharedPreferences = remoteContext.getSharedPreferences("google_ads_flags", 0);
                this.f21588j = sharedPreferences;
                if (sharedPreferences != null) {
                    sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                }
                m16419d();
                this.f21586h = true;
            } finally {
                this.f21587i = false;
                this.f21585g.open();
            }
        }
    }

    /* renamed from: c */
    public final <T> T m16421c(zzacj<T> zzacjVar) {
        if (!this.f21585g.block(5000L)) {
            synchronized (this.f21584f) {
                if (!this.f21587i) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.f21586h || this.f21588j == null) {
            synchronized (this.f21584f) {
                if (this.f21586h && this.f21588j != null) {
                }
                return zzacjVar.m16411n();
            }
        }
        if (zzacjVar.m16410b() != 2) {
            return (zzacjVar.m16410b() == 1 && this.f21591m.has(zzacjVar.m16409a())) ? zzacjVar.mo15500j(this.f21591m) : (T) zzazl.m17282a(this.f21590l, new CallableC7099r(this, zzacjVar));
        }
        Bundle bundle = this.f21589k;
        return bundle == null ? zzacjVar.m16411n() : zzacjVar.mo15499i(bundle);
    }

    /* renamed from: e */
    final /* synthetic */ String m16422e() throws Exception {
        return this.f21588j.getString("flag_configuration", "{}");
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            m16419d();
        }
    }
}
