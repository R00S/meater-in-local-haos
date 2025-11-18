package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdfz extends zzdob<zzdfz, zza> implements zzdpm {
    private static volatile zzdpv<zzdfz> zzdv;
    private static final zzdfz zzgtc;
    private int zzgqy;
    private int zzgta;
    private zzdmr zzgtb = zzdmr.f25661f;

    public static final class zza extends zzdob.zza<zzdfz, zza> implements zzdpm {
        private zza() {
            super(zzdfz.zzgtc);
        }

        /* synthetic */ zza(C7091qs c7091qs) {
            this();
        }
    }

    static {
        zzdfz zzdfzVar = new zzdfz();
        zzgtc = zzdfzVar;
        zzdob.m19721t(zzdfz.class, zzdfzVar);
    }

    private zzdfz() {
    }

    /* renamed from: A */
    public static zzdfz m19372A() {
        return zzgtc;
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C7091qs c7091qs = null;
        switch (C7091qs.f20406a[i2 - 1]) {
            case 1:
                return new zzdfz();
            case 2:
                return new zza(c7091qs);
            case 3:
                return zzdob.m19719r(zzgtc, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzgta", "zzgqy", "zzgtb"});
            case 4:
                return zzgtc;
            case 5:
                zzdpv<zzdfz> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzdfz.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzgtc);
                            zzdv = zzbVar;
                        }
                    }
                }
                return zzbVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: x */
    public final zzdgj m19374x() {
        zzdgj zzdgjVarM19381g = zzdgj.m19381g(this.zzgqy);
        return zzdgjVarM19381g == null ? zzdgj.UNRECOGNIZED : zzdgjVarM19381g;
    }

    /* renamed from: y */
    public final zzdgf m19375y() {
        zzdgf zzdgfVarM19378g = zzdgf.m19378g(this.zzgta);
        return zzdgfVarM19378g == null ? zzdgf.UNRECOGNIZED : zzdgfVarM19378g;
    }

    /* renamed from: z */
    public final zzdmr m19376z() {
        return this.zzgtb;
    }
}
