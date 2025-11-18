package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcve<T> implements zzdti<zzcvb<T>> {

    /* renamed from: a */
    private final zzdtu<Executor> f25128a;

    /* renamed from: b */
    private final zzdtu<Set<zzcva<? extends zzcuz<T>>>> f25129b;

    private zzcve(zzdtu<Executor> zzdtuVar, zzdtu<Set<zzcva<? extends zzcuz<T>>>> zzdtuVar2) {
        this.f25128a = zzdtuVar;
        this.f25129b = zzdtuVar2;
    }

    /* renamed from: a */
    public static <T> zzcve<T> m18999a(zzdtu<Executor> zzdtuVar, zzdtu<Set<zzcva<? extends zzcuz<T>>>> zzdtuVar2) {
        return new zzcve<>(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcvb(this.f25128a.get(), this.f25129b.get());
    }
}
