package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcyk {

    /* renamed from: a */
    private final Map<String, zzcym> f25332a = new HashMap();

    /* renamed from: b */
    private final Context f25333b;

    /* renamed from: c */
    private final zzawm f25334c;

    /* renamed from: d */
    private final zzbai f25335d;

    /* renamed from: e */
    private final zzdh f25336e;

    public zzcyk(Context context, zzbai zzbaiVar, zzawm zzawmVar) {
        this.f25333b = context;
        this.f25335d = zzbaiVar;
        this.f25334c = zzawmVar;
        this.f25336e = new zzdh(new com.google.android.gms.ads.internal.zzg(context, zzbaiVar));
    }

    /* renamed from: a */
    private final zzcym m19077a() {
        return new zzcym(this.f25333b, this.f25334c.m17061r(), this.f25334c.m17063t(), this.f25336e);
    }

    /* renamed from: c */
    private final zzcym m19078c(String str) {
        zzasq zzasqVarM16925e = zzasq.m16925e(this.f25333b);
        try {
            zzasqVarM16925e.m16927a(str);
            zzaxc zzaxcVar = new zzaxc();
            zzaxcVar.m17116B(this.f25333b, str, false);
            zzaxf zzaxfVar = new zzaxf(this.f25334c.m17061r(), zzaxcVar);
            return new zzcym(zzasqVarM16925e, zzaxfVar, new zzawu(zzazt.m17319x(), zzaxfVar), new zzdh(new com.google.android.gms.ads.internal.zzg(this.f25333b, this.f25335d)));
        } catch (PackageManager.NameNotFoundException unused) {
            return m19077a();
        }
    }

    /* renamed from: b */
    public final zzcym m19079b(String str) {
        if (str == null) {
            return m19077a();
        }
        if (this.f25332a.containsKey(str)) {
            return this.f25332a.get(str);
        }
        zzcym zzcymVarM19078c = m19078c(str);
        this.f25332a.put(str, zzcymVarM19078c);
        return zzcymVarM19078c;
    }
}
