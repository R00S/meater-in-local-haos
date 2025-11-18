package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzbqw implements zzdti<zzbam<zzcxm, zzayb>> {

    /* renamed from: a */
    private final zzdtu<Context> f23507a;

    /* renamed from: b */
    private final zzdtu<zzbai> f23508b;

    /* renamed from: c */
    private final zzdtu<zzcxv> f23509c;

    public zzbqw(zzdtu<Context> zzdtuVar, zzdtu<zzbai> zzdtuVar2, zzdtu<zzcxv> zzdtuVar3) {
        this.f23507a = zzdtuVar;
        this.f23508b = zzdtuVar2;
        this.f23509c = zzdtuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        final Context context = this.f23507a.get();
        final zzbai zzbaiVar = this.f23508b.get();
        final zzcxv zzcxvVar = this.f23509c.get();
        return (zzbam) zzdto.m19874b(new zzbam(context, zzbaiVar, zzcxvVar) { // from class: com.google.android.gms.internal.ads.nd

            /* renamed from: a */
            private final Context f20079a;

            /* renamed from: b */
            private final zzbai f20080b;

            /* renamed from: c */
            private final zzcxv f20081c;

            {
                this.f20079a = context;
                this.f20080b = zzbaiVar;
                this.f20081c = zzcxvVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbam
            /* renamed from: a */
            public final Object mo14764a(Object obj) {
                Context context2 = this.f20079a;
                zzbai zzbaiVar2 = this.f20080b;
                zzcxv zzcxvVar2 = this.f20081c;
                zzcxm zzcxmVar = (zzcxm) obj;
                zzayb zzaybVar = new zzayb(context2);
                zzaybVar.m17225h(zzcxmVar.f25267y);
                zzaybVar.m17226i(zzcxmVar.f25268z.toString());
                zzaybVar.m17227j(zzbaiVar2.f22750f);
                zzaybVar.m17220a(zzcxvVar2.f25295f);
                return zzaybVar;
            }
        }, "Cannot return null from a non-@Nullable @Provides method");
    }
}
