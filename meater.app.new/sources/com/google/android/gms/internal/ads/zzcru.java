package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzcru implements zzdti<C7160sn> {

    /* renamed from: a */
    private final zzdtu<Set<String>> f24991a;

    private zzcru(zzdtu<Set<String>> zzdtuVar) {
        this.f24991a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzcru m18960a(zzdtu<Set<String>> zzdtuVar) {
        return new zzcru(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new C7160sn(this.f24991a.get());
    }
}
