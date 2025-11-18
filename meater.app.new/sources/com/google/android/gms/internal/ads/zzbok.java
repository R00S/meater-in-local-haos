package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbok implements zzdti<Boolean> {

    /* renamed from: a */
    private final zzdtu<zzcxv> f23359a;

    public zzbok(zzdtu<zzcxv> zzdtuVar) {
        this.f23359a = zzdtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        boolean zBooleanValue;
        if (this.f23359a.get().m19024a() != null) {
            zBooleanValue = ((Boolean) zzyt.m20848e().m16421c(zzacu.f21870t1)).booleanValue();
        } else {
            zBooleanValue = ((Boolean) zzyt.m20848e().m16421c(zzacu.f21897x4)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
