package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzcsv implements zzcva<zzcsu> {

    /* renamed from: a */
    private final Context f25038a;

    /* renamed from: b */
    private final zzbbl f25039b;

    public zzcsv(Context context, zzbbl zzbblVar) {
        this.f25038a = context;
        this.f25039b = zzbblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzcsu> mo14982b() {
        return this.f25039b.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.eo

            /* renamed from: f */
            private final zzcsv f18829f;

            {
                this.f18829f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String strMo17093g;
                String strMo17086A;
                String strM20615j;
                zzk.zzlg();
                zzuu zzuuVarMo17101o = zzk.zzlk().m17061r().mo17101o();
                Bundle bundle = null;
                if (zzuuVarMo17101o != null && (!zzk.zzlk().m17061r().mo17097k() || !zzk.zzlk().m17061r().mo17088b())) {
                    if (zzuuVarMo17101o.m20639i()) {
                        zzuuVarMo17101o.m20634a();
                    }
                    zzuo zzuoVarM20638g = zzuuVarMo17101o.m20638g();
                    if (zzuoVarM20638g != null) {
                        strMo17093g = zzuoVarM20638g.m20614i();
                        strM20615j = zzuoVarM20638g.m20615j();
                        strMo17086A = zzuoVarM20638g.m20616k();
                        if (strMo17093g != null) {
                            zzk.zzlk().m17061r().mo17098l(strMo17093g);
                        }
                        if (strMo17086A != null) {
                            zzk.zzlk().m17061r().mo17102p(strMo17086A);
                        }
                    } else {
                        strMo17093g = zzk.zzlk().m17061r().mo17093g();
                        strMo17086A = zzk.zzlk().m17061r().mo17086A();
                        strM20615j = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (strMo17086A != null && !zzk.zzlk().m17061r().mo17088b()) {
                        bundle2.putString("v_fp_vertical", strMo17086A);
                    }
                    if (strMo17093g != null && !zzk.zzlk().m17061r().mo17097k()) {
                        bundle2.putString("fingerprint", strMo17093g);
                        if (!strMo17093g.equals(strM20615j)) {
                            bundle2.putString("v_fp", strM20615j);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new zzcsu(bundle);
            }
        });
    }
}
