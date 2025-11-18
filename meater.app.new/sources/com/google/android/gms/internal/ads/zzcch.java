package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcch implements zzdti<zzccg> {

    /* renamed from: a */
    private final zzdtu<String> f24057a;

    /* renamed from: b */
    private final zzdtu<zzbyn> f24058b;

    /* renamed from: c */
    private final zzdtu<zzbyt> f24059c;

    private zzcch(zzdtu<String> zzdtuVar, zzdtu<zzbyn> zzdtuVar2, zzdtu<zzbyt> zzdtuVar3) {
        this.f24057a = zzdtuVar;
        this.f24058b = zzdtuVar2;
        this.f24059c = zzdtuVar3;
    }

    /* renamed from: a */
    public static zzcch m18660a(zzdtu<String> zzdtuVar, zzdtu<zzbyn> zzdtuVar2, zzdtu<zzbyt> zzdtuVar3) {
        return new zzcch(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzccg(this.f24057a.get(), this.f24058b.get(), this.f24059c.get());
    }
}
