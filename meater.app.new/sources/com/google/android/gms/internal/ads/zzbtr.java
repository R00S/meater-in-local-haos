package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbtr implements zzdti<zzbtp> {

    /* renamed from: a */
    private final zzdtu<Set<zzbuz<AppEventListener>>> f23550a;

    private zzbtr(zzdtu<Set<zzbuz<AppEventListener>>> zzdtuVar) {
        this.f23550a = zzdtuVar;
    }

    /* renamed from: a */
    public static zzbtr m18328a(zzdtu<Set<zzbuz<AppEventListener>>> zzdtuVar) {
        return new zzbtr(zzdtuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbtp(this.f23550a.get());
    }
}
