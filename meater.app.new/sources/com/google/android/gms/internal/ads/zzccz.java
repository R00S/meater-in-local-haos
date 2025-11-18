package com.google.android.gms.internal.ads;

import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzccz implements zzahy {

    /* renamed from: f */
    private final zzbse f24091f;

    /* renamed from: g */
    private final zzato f24092g;

    /* renamed from: h */
    private final String f24093h;

    /* renamed from: i */
    private final String f24094i;

    public zzccz(zzbse zzbseVar, zzcxm zzcxmVar) {
        this.f24091f = zzbseVar;
        this.f24092g = zzcxmVar.f25254l;
        this.f24093h = zzcxmVar.f25252j;
        this.f24094i = zzcxmVar.f25253k;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    /* renamed from: P */
    public final void mo16580P(zzato zzatoVar) {
        String str;
        int i2;
        zzato zzatoVar2 = this.f24092g;
        if (zzatoVar2 != null) {
            zzatoVar = zzatoVar2;
        }
        if (zzatoVar != null) {
            str = zzatoVar.f22516f;
            i2 = zzatoVar.f22517g;
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
            i2 = 1;
        }
        this.f24091f.m18313q0(new zzasp(str, i2), this.f24093h, this.f24094i);
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    /* renamed from: j */
    public final void mo16581j() {
        this.f24091f.m18311i0();
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    /* renamed from: r */
    public final void mo16582r() {
        this.f24091f.m18312o0();
    }
}
