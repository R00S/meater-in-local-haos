package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes2.dex */
public final class zzbno implements zzdti<View> {

    /* renamed from: a */
    private final zzbnk f23314a;

    public zzbno(zzbnk zzbnkVar) {
        this.f23314a = zzbnkVar;
    }

    /* renamed from: a */
    public static View m17923a(zzbnk zzbnkVar) {
        return (View) zzdto.m19874b(zzbnkVar.m17918b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return m17923a(this.f23314a);
    }
}
