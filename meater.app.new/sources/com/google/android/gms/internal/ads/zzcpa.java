package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* loaded from: classes2.dex */
public final class zzcpa implements zzcou<zzbvx> {

    /* renamed from: a */
    private final Context f24844a;

    /* renamed from: b */
    private final zzbws f24845b;

    public zzcpa(Context context, zzbws zzbwsVar) {
        this.f24844a = context;
        this.f24845b = zzbwsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcou
    /* renamed from: a */
    public final /* synthetic */ zzbvx mo18901a(zzcxu zzcxuVar, zzcxm zzcxmVar, View view, zzcoz zzcozVar) {
        zzbvy zzbvyVarMo15300a = this.f24845b.mo15300a(new zzbpr(zzcxuVar, zzcxmVar, null), new C7159sm(this, C7122rm.f20465a));
        zzcozVar.m18905a(new C7196tm(this, zzbvyVarMo15300a));
        return zzbvyVarMo15300a.mo15337h();
    }
}
