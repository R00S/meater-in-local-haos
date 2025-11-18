package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcvy implements zzcva<zzcvx> {

    /* renamed from: a */
    private final zzasc f25171a;

    /* renamed from: b */
    private final Context f25172b;

    /* renamed from: c */
    private final String f25173c;

    /* renamed from: d */
    private final zzbbl f25174d;

    public zzcvy(zzasc zzascVar, Context context, String str, zzbbl zzbblVar) {
        this.f25171a = zzascVar;
        this.f25172b = context;
        this.f25173c = str;
        this.f25174d = zzbblVar;
    }

    /* renamed from: a */
    final /* synthetic */ zzcvx m19004a() throws Exception {
        JSONObject jSONObject = new JSONObject();
        zzasc zzascVar = this.f25171a;
        if (zzascVar != null) {
            zzascVar.m16902a(this.f25172b, this.f25173c, jSONObject);
        }
        return new zzcvx(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzcvx> mo14982b() {
        return this.f25174d.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.jp

            /* renamed from: f */
            private final zzcvy f19496f;

            {
                this.f19496f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f19496f.m19004a();
            }
        });
    }
}
