package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbrk implements zzdti<zzbri> {

    /* renamed from: a */
    private final zzdtu<Set<zzbuz<zzxr>>> f23532a;

    private zzbrk(zzdtu<Set<zzbuz<zzxr>>> zzdtuVar) {
        this.f23532a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbrk m18299a(zzdtu<Set<zzbuz<zzxr>>> zzdtuVar) {
        return new zzbrk(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbri(this.f23532a.get());
    }
}
