package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzddt extends zzdob<zzddt, zza> implements zzdpm {
    private static volatile zzdpv<zzddt> zzdv;
    private static final zzddt zzgqq;
    private zzded zzgqo;
    private zzdgn zzgqp;

    public static final class zza extends zzdob.zza<zzddt, zza> implements zzdpm {
        private zza() {
            super(zzddt.zzgqq);
        }

        /* synthetic */ zza(C6499as c6499as) {
            this();
        }
    }

    static {
        zzddt zzddtVar = new zzddt();
        zzgqq = zzddtVar;
        zzdob.m19721t(zzddt.class, zzddtVar);
    }

    private zzddt() {
    }

    /* renamed from: A */
    public static zzddt m19244A(zzdmr zzdmrVar) throws zzdok {
        return (zzddt) zzdob.m19713k(zzgqq, zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C6499as c6499as = null;
        switch (C6499as.f18181a[i2 - 1]) {
            case 1:
                return new zzddt();
            case 2:
                return new zza(c6499as);
            case 3:
                return zzdob.m19719r(zzgqq, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzgqo", "zzgqp"});
            case 4:
                return zzgqq;
            case 5:
                zzdpv<zzddt> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzddt.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzgqq);
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
    public final zzded m19246x() {
        zzded zzdedVar = this.zzgqo;
        return zzdedVar == null ? zzded.m19266A() : zzdedVar;
    }

    /* renamed from: y */
    public final zzdgn m19247y() {
        zzdgn zzdgnVar = this.zzgqp;
        return zzdgnVar == null ? zzdgn.m19400z() : zzdgnVar;
    }
}
