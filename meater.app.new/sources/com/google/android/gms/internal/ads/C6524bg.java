package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;

/* renamed from: com.google.android.gms.internal.ads.bg */
/* loaded from: classes2.dex */
final class C6524bg implements zzadx {

    /* renamed from: a */
    private final /* synthetic */ zzcab f18337a;

    /* renamed from: b */
    private final /* synthetic */ ViewGroup f18338b;

    /* renamed from: c */
    private final /* synthetic */ zzbzl f18339c;

    C6524bg(zzbzl zzbzlVar, zzcab zzcabVar, ViewGroup viewGroup) {
        this.f18339c = zzbzlVar;
        this.f18337a = zzcabVar;
        this.f18338b = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    /* renamed from: a */
    public final void mo14948a() {
        zzbzl zzbzlVar = this.f18339c;
        if (zzbzl.m18595d(this.f18337a, zzbzj.f23876f)) {
            this.f18337a.onClick(this.f18338b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    /* renamed from: b */
    public final void mo14949b(MotionEvent motionEvent) {
        this.f18337a.onTouch(null, motionEvent);
    }
}
