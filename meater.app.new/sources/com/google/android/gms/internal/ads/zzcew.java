package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcew implements zzdti<Set<zzbuz<zzczz>>> {

    /* renamed from: a */
    private final zzdtu<String> f24192a;

    /* renamed from: b */
    private final zzdtu<Context> f24193b;

    /* renamed from: c */
    private final zzdtu<Executor> f24194c;

    /* renamed from: d */
    private final zzdtu<Map<zzczs, zzcez>> f24195d;

    public zzcew(zzdtu<String> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<Executor> zzdtuVar3, zzdtu<Map<zzczs, zzcez>> zzdtuVar4) {
        this.f24192a = zzdtuVar;
        this.f24193b = zzdtuVar2;
        this.f24194c = zzdtuVar3;
        this.f24195d = zzdtuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        Set setEmptySet;
        final String str = this.f24192a.get();
        Context context = this.f24193b.get();
        Executor executor = this.f24194c.get();
        Map<zzczs, zzcez> map = this.f24195d.get();
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21704S3)).booleanValue()) {
            zzwj zzwjVar = new zzwj(new zzwo(context));
            zzwjVar.m20697a(new zzwk(str) { // from class: com.google.android.gms.internal.ads.hi

                /* renamed from: a */
                private final String f19232a;

                {
                    this.f19232a = str;
                }

                @Override // com.google.android.gms.internal.ads.zzwk
                /* renamed from: a */
                public final void mo14971a(zzxn zzxnVar) {
                    zzxnVar.f27366d = this.f19232a;
                }
            });
            setEmptySet = Collections.singleton(new zzbuz(new zzcex(zzwjVar, map), executor));
        } else {
            setEmptySet = Collections.emptySet();
        }
        return (Set) zzdto.m19874b(setEmptySet, "Cannot return null from a non-@Nullable @Provides method");
    }
}
