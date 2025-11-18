package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* loaded from: classes2.dex */
public final class zzcrp implements zzcva<zzcro> {

    /* renamed from: a */
    private final zzcva<zzcvf> f24983a;

    /* renamed from: b */
    private final zzcxv f24984b;

    /* renamed from: c */
    private final Context f24985c;

    /* renamed from: d */
    private final zzawm f24986d;

    public zzcrp(zzcsk<zzcvf> zzcskVar, zzcxv zzcxvVar, Context context, zzawm zzawmVar) {
        this.f24983a = zzcskVar;
        this.f24984b = zzcxvVar;
        this.f24985c = context;
        this.f24986d = zzawmVar;
    }

    /* renamed from: a */
    final /* synthetic */ zzcro m18958a(zzcvf zzcvfVar) {
        String str;
        boolean z;
        String strMo17106t;
        float f2;
        int i2;
        int i3;
        int i4;
        DisplayMetrics displayMetrics;
        zzyd zzydVar = this.f24984b.f25294e;
        zzyd[] zzydVarArr = zzydVar.f27453l;
        if (zzydVarArr != null) {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (zzyd zzydVar2 : zzydVarArr) {
                boolean z4 = zzydVar2.f27455n;
                if (!z4 && !z2) {
                    str = zzydVar2.f27447f;
                    z2 = true;
                }
                if (z4 && !z3) {
                    z3 = true;
                    z = true;
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = zzydVar.f27447f;
            z = zzydVar.f27455n;
        }
        Resources resources = this.f24985c.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            strMo17106t = null;
            f2 = 0.0f;
            i2 = 0;
            i3 = 0;
        } else {
            float f3 = displayMetrics.density;
            int i5 = displayMetrics.widthPixels;
            i3 = displayMetrics.heightPixels;
            strMo17106t = this.f24986d.m17061r().mo17106t();
            i2 = i5;
            f2 = f3;
        }
        StringBuilder sb = new StringBuilder();
        zzyd[] zzydVarArr2 = zzydVar.f27453l;
        if (zzydVarArr2 != null) {
            boolean z5 = false;
            for (zzyd zzydVar3 : zzydVarArr2) {
                if (zzydVar3.f27455n) {
                    z5 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i6 = zzydVar3.f27451j;
                    if (i6 == -1 && f2 != 0.0f) {
                        i6 = (int) (zzydVar3.f27452k / f2);
                    }
                    sb.append(i6);
                    sb.append("x");
                    int i7 = zzydVar3.f27448g;
                    if (i7 == -2 && f2 != 0.0f) {
                        i7 = (int) (zzydVar3.f27449h / f2);
                    }
                    sb.append(i7);
                }
            }
            if (z5) {
                if (sb.length() != 0) {
                    i4 = 0;
                    sb.insert(0, "|");
                } else {
                    i4 = 0;
                }
                sb.insert(i4, "320x50");
            }
        }
        return new zzcro(zzydVar, str, z, sb.toString(), f2, i2, i3, strMo17106t);
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzcro> mo14982b() {
        return zzbar.m17367d(this.f24983a.mo14982b(), new zzbam(this) { // from class: com.google.android.gms.internal.ads.rn

            /* renamed from: a */
            private final zzcrp f20466a;

            {
                this.f20466a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbam
            /* renamed from: a */
            public final Object mo14764a(Object obj) {
                return this.f20466a.m18958a((zzcvf) obj);
            }
        }, zzbbm.f22758b);
    }
}
