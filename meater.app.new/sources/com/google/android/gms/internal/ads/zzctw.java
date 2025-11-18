package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzctw implements zzcva<zzctv> {

    /* renamed from: a */
    private final zzbbl f25068a;

    /* renamed from: b */
    private final Context f25069b;

    /* renamed from: c */
    private final Set<String> f25070c;

    public zzctw(zzbbl zzbblVar, Context context, Set<String> set) {
        this.f25068a = zzbblVar;
        this.f25069b = context;
        this.f25070c = set;
    }

    /* renamed from: a */
    final /* synthetic */ zzctv m18981a() throws Exception {
        return (((Boolean) zzyt.m20848e().m16421c(zzacu.f21760b4)).booleanValue() && zzctv.m18979b(this.f25070c)) ? new zzctv(zzk.zzlv().m16869a(this.f25069b)) : new zzctv(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzctv> mo14982b() {
        return this.f25068a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.oo

            /* renamed from: f */
            private final zzctw f20206f;

            {
                this.f20206f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20206f.m18981a();
            }
        });
    }
}
