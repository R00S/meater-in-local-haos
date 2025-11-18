package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzccc implements zzdti<zzccb> {

    /* renamed from: a */
    private final zzdtu<String> f24043a;

    /* renamed from: b */
    private final zzdtu<zzbyn> f24044b;

    /* renamed from: c */
    private final zzdtu<zzbyt> f24045c;

    private zzccc(zzdtu<String> zzdtuVar, zzdtu<zzbyn> zzdtuVar2, zzdtu<zzbyt> zzdtuVar3) {
        this.f24043a = zzdtuVar;
        this.f24044b = zzdtuVar2;
        this.f24045c = zzdtuVar3;
    }

    /* renamed from: a */
    public static zzccc m18657a(zzdtu<String> zzdtuVar, zzdtu<zzbyn> zzdtuVar2, zzdtu<zzbyt> zzdtuVar3) {
        return new zzccc(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzccb(this.f24043a.get(), this.f24044b.get(), this.f24045c.get());
    }
}
