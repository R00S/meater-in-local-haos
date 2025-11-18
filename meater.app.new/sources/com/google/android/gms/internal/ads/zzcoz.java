package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;

/* loaded from: classes2.dex */
public final class zzcoz implements zzf {

    /* renamed from: a */
    private zzf f24843a;

    /* renamed from: a */
    public final synchronized void m18905a(zzf zzfVar) {
        this.f24843a = zzfVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zzg(View view) {
        zzf zzfVar = this.f24843a;
        if (zzfVar != null) {
            zzfVar.zzg(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zzky() {
        zzf zzfVar = this.f24843a;
        if (zzfVar != null) {
            zzfVar.zzky();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zzkz() {
        zzf zzfVar = this.f24843a;
        if (zzfVar != null) {
            zzfVar.zzkz();
        }
    }
}
