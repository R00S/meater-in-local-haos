package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdgn extends zzdob<zzdgn, zza> implements zzdpm {
    private static volatile zzdpv<zzdgn> zzdv;
    private static final zzdgn zzgtv;
    private int zzgqu;
    private zzdgp zzgtt;

    public static final class zza extends zzdob.zza<zzdgn, zza> implements zzdpm {
        private zza() {
            super(zzdgn.zzgtv);
        }

        /* synthetic */ zza(C7276vs c7276vs) {
            this();
        }
    }

    static {
        zzdgn zzdgnVar = new zzdgn();
        zzgtv = zzdgnVar;
        zzdob.m19721t(zzdgn.class, zzdgnVar);
    }

    private zzdgn() {
    }

    /* renamed from: B */
    public static zzdgn m19399B(zzdmr zzdmrVar) throws zzdok {
        return (zzdgn) zzdob.m19713k(zzgtv, zzdmrVar);
    }

    /* renamed from: z */
    public static zzdgn m19400z() {
        return zzgtv;
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C7276vs c7276vs = null;
        switch (C7276vs.f20755a[i2 - 1]) {
            case 1:
                return new zzdgn();
            case 2:
                return new zza(c7276vs);
            case 3:
                return zzdob.m19719r(zzgtv, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzgtt", "zzgqu"});
            case 4:
                return zzgtv;
            case 5:
                zzdpv<zzdgn> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzdgn.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzgtv);
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
    public final int m19401x() {
        return this.zzgqu;
    }

    /* renamed from: y */
    public final zzdgp m19402y() {
        zzdgp zzdgpVar = this.zzgtt;
        return zzdgpVar == null ? zzdgp.m19404z() : zzdgpVar;
    }
}
