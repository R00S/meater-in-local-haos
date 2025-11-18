package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcsb implements zzdti<zzcrz> {

    /* renamed from: a */
    private final zzdtu<String> f25001a;

    /* renamed from: b */
    private final zzdtu<String> f25002b;

    /* renamed from: c */
    private final zzdtu<zzbqe> f25003c;

    /* renamed from: d */
    private final zzdtu<zzcyi> f25004d;

    /* renamed from: e */
    private final zzdtu<zzcxv> f25005e;

    private zzcsb(zzdtu<String> zzdtuVar, zzdtu<String> zzdtuVar2, zzdtu<zzbqe> zzdtuVar3, zzdtu<zzcyi> zzdtuVar4, zzdtu<zzcxv> zzdtuVar5) {
        this.f25001a = zzdtuVar;
        this.f25002b = zzdtuVar2;
        this.f25003c = zzdtuVar3;
        this.f25004d = zzdtuVar4;
        this.f25005e = zzdtuVar5;
    }

    /* renamed from: a */
    public static zzcsb m18963a(zzdtu<String> zzdtuVar, zzdtu<String> zzdtuVar2, zzdtu<zzbqe> zzdtuVar3, zzdtu<zzcyi> zzdtuVar4, zzdtu<zzcxv> zzdtuVar5) {
        return new zzcsb(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcrz(this.f25001a.get(), this.f25002b.get(), this.f25003c.get(), this.f25004d.get(), this.f25005e.get());
    }
}
