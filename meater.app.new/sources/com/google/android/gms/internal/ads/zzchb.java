package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzchb implements zzdti<zzbbh<String>> {

    /* renamed from: a */
    private final zzdtu<zzdh> f24308a;

    /* renamed from: b */
    private final zzdtu<Context> f24309b;

    /* renamed from: c */
    private final zzdtu<zzbbl> f24310c;

    private zzchb(zzdtu<zzdh> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<zzbbl> zzdtuVar3) {
        this.f24308a = zzdtuVar;
        this.f24309b = zzdtuVar2;
        this.f24310c = zzdtuVar3;
    }

    /* renamed from: a */
    public static zzchb m18783a(zzdtu<zzdh> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<zzbbl> zzdtuVar3) {
        return new zzchb(zzdtuVar, zzdtuVar2, zzdtuVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        final zzdh zzdhVar = this.f24308a.get();
        final Context context = this.f24309b.get();
        return (zzbbh) zzdto.m19874b(this.f24310c.get().submit(new Callable(zzdhVar, context) { // from class: com.google.android.gms.internal.ads.yi

            /* renamed from: f */
            private final zzdh f21304f;

            /* renamed from: g */
            private final Context f21305g;

            {
                this.f21304f = zzdhVar;
                this.f21305g = context;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdh zzdhVar2 = this.f21304f;
                return zzdhVar2.m19455f().zza(this.f21305g);
            }
        }), "Cannot return null from a non-@Nullable @Provides method");
    }
}
