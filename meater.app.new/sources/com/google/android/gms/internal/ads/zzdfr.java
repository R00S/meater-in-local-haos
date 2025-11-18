package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdfr extends zzdob<zzdfr, zza> implements zzdpm {
    private static volatile zzdpv<zzdfr> zzdv;
    private static final zzdfr zzgss;
    private zzdft zzgsr;

    public static final class zza extends zzdob.zza<zzdfr, zza> implements zzdpm {
        private zza() {
            super(zzdfr.zzgss);
        }

        /* synthetic */ zza(C6943ms c6943ms) {
            this();
        }
    }

    static {
        zzdfr zzdfrVar = new zzdfr();
        zzgss = zzdfrVar;
        zzdob.m19721t(zzdfr.class, zzdfrVar);
    }

    private zzdfr() {
    }

    /* renamed from: z */
    public static zzdfr m19330z(zzdmr zzdmrVar) throws zzdok {
        return (zzdfr) zzdob.m19713k(zzgss, zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C6943ms c6943ms = null;
        switch (C6943ms.f19937a[i2 - 1]) {
            case 1:
                return new zzdfr();
            case 2:
                return new zza(c6943ms);
            case 3:
                return zzdob.m19719r(zzgss, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzgsr"});
            case 4:
                return zzgss;
            case 5:
                zzdpv<zzdfr> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzdfr.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzgss);
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
    public final zzdft m19331x() {
        zzdft zzdftVar = this.zzgsr;
        return zzdftVar == null ? zzdft.m19332A() : zzdftVar;
    }
}
