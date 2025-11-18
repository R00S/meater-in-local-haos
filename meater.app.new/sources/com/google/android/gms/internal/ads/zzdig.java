package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdig extends zzdob<zzdig, zza> implements zzdpm {
    private static volatile zzdpv<zzdig> zzdv;
    private static final zzdig zzgwz;
    private int zzgqk;
    private zzdmr zzgqs = zzdmr.f25661f;

    public static final class zza extends zzdob.zza<zzdig, zza> implements zzdpm {
        private zza() {
            super(zzdig.zzgwz);
        }

        /* renamed from: u */
        public final zza m19540u(zzdmr zzdmrVar) {
            m19735p();
            ((zzdig) this.f25755g).m19535F(zzdmrVar);
            return this;
        }

        /* renamed from: v */
        public final zza m19541v(int i2) {
            m19735p();
            ((zzdig) this.f25755g).m19536y(0);
            return this;
        }

        /* synthetic */ zza(C6870kt c6870kt) {
            this();
        }
    }

    static {
        zzdig zzdigVar = new zzdig();
        zzgwz = zzdigVar;
        zzdob.m19721t(zzdig.class, zzdigVar);
    }

    private zzdig() {
    }

    /* renamed from: C */
    public static zza m19532C() {
        return (zza) ((zzdob.zza) zzgwz.mo17725q(zzdob.zze.f25762e, null, null));
    }

    /* renamed from: E */
    public static zzdig m19534E(zzdmr zzdmrVar) throws zzdok {
        return (zzdig) zzdob.m19713k(zzgwz, zzdmrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public final void m19535F(zzdmr zzdmrVar) {
        zzdmrVar.getClass();
        this.zzgqs = zzdmrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public final void m19536y(int i2) {
        this.zzgqk = i2;
    }

    /* renamed from: B */
    public final zzdmr m19538B() {
        return this.zzgqs;
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C6870kt c6870kt = null;
        switch (C6870kt.f19723a[i2 - 1]) {
            case 1:
                return new zzdig();
            case 2:
                return new zza(c6870kt);
            case 3:
                return zzdob.m19719r(zzgwz, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzgqk", "zzgqs"});
            case 4:
                return zzgwz;
            case 5:
                zzdpv<zzdig> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzdig.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzgwz);
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
    public final int m19539x() {
        return this.zzgqk;
    }
}
