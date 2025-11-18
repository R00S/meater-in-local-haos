package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdej extends zzdob<zzdej, zza> implements zzdpm {
    private static volatile zzdpv<zzdej> zzdv;
    private static final zzdej zzgri;
    private int zzgqu;
    private zzdel zzgrg;

    public static final class zza extends zzdob.zza<zzdej, zza> implements zzdpm {
        private zza() {
            super(zzdej.zzgri);
        }

        /* synthetic */ zza(C6684fs c6684fs) {
            this();
        }
    }

    static {
        zzdej zzdejVar = new zzdej();
        zzgri = zzdejVar;
        zzdob.m19721t(zzdej.class, zzdejVar);
    }

    private zzdej() {
    }

    /* renamed from: y */
    public static zzdej m19290y(zzdmr zzdmrVar) throws zzdok {
        return (zzdej) zzdob.m19713k(zzgri, zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C6684fs c6684fs = null;
        switch (C6684fs.f18915a[i2 - 1]) {
            case 1:
                return new zzdej();
            case 2:
                return new zza(c6684fs);
            case 3:
                return zzdob.m19719r(zzgri, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzgrg", "zzgqu"});
            case 4:
                return zzgri;
            case 5:
                zzdpv<zzdej> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzdej.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzgri);
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
    public final int m19291x() {
        return this.zzgqu;
    }

    /* renamed from: z */
    public final zzdel m19292z() {
        zzdel zzdelVar = this.zzgrg;
        return zzdelVar == null ? zzdel.m19293y() : zzdelVar;
    }
}
