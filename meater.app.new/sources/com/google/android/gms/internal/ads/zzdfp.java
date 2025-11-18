package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdfp extends zzdob<zzdfp, zza> implements zzdpm {
    private static volatile zzdpv<zzdfp> zzdv;
    private static final zzdfp zzgsq;
    private zzdgw zzgsp;

    public static final class zza extends zzdob.zza<zzdfp, zza> implements zzdpm {
        private zza() {
            super(zzdfp.zzgsq);
        }

        /* synthetic */ zza(C6906ls c6906ls) {
            this();
        }
    }

    static {
        zzdfp zzdfpVar = new zzdfp();
        zzgsq = zzdfpVar;
        zzdob.m19721t(zzdfp.class, zzdfpVar);
    }

    private zzdfp() {
    }

    /* renamed from: y */
    public static zzdfp m19326y() {
        return zzgsq;
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C6906ls c6906ls = null;
        switch (C6906ls.f19849a[i2 - 1]) {
            case 1:
                return new zzdfp();
            case 2:
                return new zza(c6906ls);
            case 3:
                return zzdob.m19719r(zzgsq, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzgsp"});
            case 4:
                return zzgsq;
            case 5:
                zzdpv<zzdfp> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzdfp.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzgsq);
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
    public final zzdgw m19328x() {
        zzdgw zzdgwVar = this.zzgsp;
        return zzdgwVar == null ? zzdgw.m19425z() : zzdgwVar;
    }
}
