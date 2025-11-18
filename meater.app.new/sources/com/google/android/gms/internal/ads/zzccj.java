package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzccj {

    /* renamed from: b */
    private final com.google.android.gms.ads.internal.zza f24064b;

    /* renamed from: c */
    private final zzbhf f24065c;

    /* renamed from: d */
    private final Context f24066d;

    /* renamed from: e */
    private final Executor f24067e;

    /* renamed from: f */
    private final zzdh f24068f;

    /* renamed from: g */
    private final zzbai f24069g;

    /* renamed from: i */
    private zzbbh<zzbgz> f24071i;

    /* renamed from: a */
    private final C7043ph f24063a = new C7043ph(null);

    /* renamed from: h */
    private final zzahu f24070h = new zzahu();

    public zzccj(Context context, Executor executor, zzdh zzdhVar, zzbai zzbaiVar, com.google.android.gms.ads.internal.zza zzaVar, zzbhf zzbhfVar) {
        this.f24066d = context;
        this.f24067e = executor;
        this.f24068f = zzdhVar;
        this.f24069g = zzbaiVar;
        this.f24064b = zzaVar;
        this.f24065c = zzbhfVar;
    }

    /* renamed from: a */
    public final synchronized void m18663a() {
        zzbbh<zzbgz> zzbbhVar = this.f24071i;
        if (zzbbhVar == null) {
            return;
        }
        zzbar.m17369f(zzbbhVar, new C6895lh(this), this.f24067e);
        this.f24071i = null;
    }

    /* renamed from: b */
    final /* synthetic */ zzbbh m18664b(String str, JSONObject jSONObject, zzbgz zzbgzVar) throws Exception {
        return this.f24070h.m16577b(zzbgzVar, str, jSONObject);
    }

    /* renamed from: d */
    public final synchronized void m18665d(String str, zzaho<Object> zzahoVar) {
        zzbbh<zzbgz> zzbbhVar = this.f24071i;
        if (zzbbhVar == null) {
            return;
        }
        zzbar.m17369f(zzbbhVar, new C6932mh(this, str, zzahoVar), this.f24067e);
    }

    /* renamed from: e */
    public final synchronized void m18666e(String str, Map<String, ?> map) {
        zzbbh<zzbgz> zzbbhVar = this.f24071i;
        if (zzbbhVar == null) {
            return;
        }
        zzbar.m17369f(zzbbhVar, new C7006oh(this, str, map), this.f24067e);
    }

    /* renamed from: f */
    public final <T> void m18667f(WeakReference<T> weakReference, String str, zzaho<T> zzahoVar) {
        m18665d(str, new C7117rh(this, weakReference, str, zzahoVar, null));
    }

    /* renamed from: g */
    public final synchronized void m18668g() {
        zzbbh<zzbgz> zzbbhVarM17367d = zzbar.m17367d(zzbhf.m17702a(this.f24066d, this.f24069g, (String) zzyt.m20848e().m16421c(zzacu.f21637H2), this.f24068f, this.f24064b), new zzbam(this) { // from class: com.google.android.gms.internal.ads.jh

            /* renamed from: a */
            private final zzccj f19482a;

            {
                this.f19482a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbam
            /* renamed from: a */
            public final Object mo14764a(Object obj) {
                return this.f19482a.m18671j((zzbgz) obj);
            }
        }, this.f24067e);
        this.f24071i = zzbbhVarM17367d;
        zzbao.m17362a(zzbbhVarM17367d, "NativeJavascriptExecutor.initializeEngine");
    }

    /* renamed from: h */
    public final synchronized void m18669h(String str, zzaho<Object> zzahoVar) {
        zzbbh<zzbgz> zzbbhVar = this.f24071i;
        if (zzbbhVar == null) {
            return;
        }
        zzbar.m17369f(zzbbhVar, new C6969nh(this, str, zzahoVar), this.f24067e);
    }

    /* renamed from: i */
    public final synchronized zzbbh<JSONObject> m18670i(final String str, final JSONObject jSONObject) {
        zzbbh<zzbgz> zzbbhVar = this.f24071i;
        if (zzbbhVar == null) {
            return zzbar.m17378o(null);
        }
        return zzbar.m17366c(zzbbhVar, new zzbal(this, str, jSONObject) { // from class: com.google.android.gms.internal.ads.kh

            /* renamed from: a */
            private final zzccj f19702a;

            /* renamed from: b */
            private final String f19703b;

            /* renamed from: c */
            private final JSONObject f19704c;

            {
                this.f19702a = this;
                this.f19703b = str;
                this.f19704c = jSONObject;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.f19702a.m18664b(this.f19703b, this.f19704c, (zzbgz) obj);
            }
        }, this.f24067e);
    }

    /* renamed from: j */
    final /* synthetic */ zzbgz m18671j(zzbgz zzbgzVar) {
        zzbgzVar.mo14907f("/result", this.f24070h);
        zzbii zzbiiVarMo14926p = zzbgzVar.mo14926p();
        C7043ph c7043ph = this.f24063a;
        zzbiiVarMo14926p.mo17681c(null, c7043ph, c7043ph, c7043ph, c7043ph, false, null, new com.google.android.gms.ads.internal.zzb(this.f24066d, null, null), null, null);
        return zzbgzVar;
    }
}
