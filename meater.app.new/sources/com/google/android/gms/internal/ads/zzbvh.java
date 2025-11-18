package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzbvh implements zzbvg {

    /* renamed from: a */
    private final List<String> f23602a;

    /* renamed from: b */
    private final zzdae f23603b;

    /* renamed from: c */
    private boolean f23604c;

    public zzbvh(zzcxm zzcxmVar, zzdae zzdaeVar) {
        this.f23602a = zzcxmVar.f25256n;
        this.f23603b = zzdaeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    /* renamed from: a */
    public final void mo18393a() {
        if (this.f23604c) {
            return;
        }
        this.f23603b.m19137h(this.f23602a);
        this.f23604c = true;
    }
}
