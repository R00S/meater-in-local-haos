package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbuj implements zzdti<Set<zzbuz<AppEventListener>>> {

    /* renamed from: a */
    private final zzbtv f23583a;

    private zzbuj(zzbtv zzbtvVar) {
        this.f23583a = zzbtvVar;
    }

    /* renamed from: a */
    public static zzbuj m18374a(zzbtv zzbtvVar) {
        return new zzbuj(zzbtvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return (Set) zzdto.m19874b(this.f23583a.m18339g(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
