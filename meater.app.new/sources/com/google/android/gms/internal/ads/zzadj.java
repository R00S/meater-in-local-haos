package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzard
/* loaded from: classes2.dex */
public final class zzadj extends zzadm {

    /* renamed from: f */
    private final zzf f21936f;

    /* renamed from: g */
    private final String f21937g;

    /* renamed from: h */
    private final String f21938h;

    public zzadj(zzf zzfVar, String str, String str2) {
        this.f21936f = zzfVar;
        this.f21937g = str;
        this.f21938h = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    /* renamed from: M5 */
    public final String mo16454M5() {
        return this.f21937g;
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final String getContent() {
        return this.f21938h;
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void recordClick() {
        this.f21936f.zzky();
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void recordImpression() {
        this.f21936f.zzkz();
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    /* renamed from: z1 */
    public final void mo16455z1(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return;
        }
        this.f21936f.zzg((View) ObjectWrapper.m14709k0(iObjectWrapper));
    }
}
