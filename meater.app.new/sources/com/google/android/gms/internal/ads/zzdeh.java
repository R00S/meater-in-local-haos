package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdeh extends zzdob<zzdeh, zza> implements zzdpm {
    private static volatile zzdpv<zzdeh> zzdv;
    private static final zzdeh zzgrh;
    private int zzgqk;
    private zzdmr zzgqs = zzdmr.f25661f;
    private zzdel zzgrg;

    public static final class zza extends zzdob.zza<zzdeh, zza> implements zzdpm {
        private zza() {
            super(zzdeh.zzgrh);
        }

        /* renamed from: u */
        public final zza m19286u(zzdmr zzdmrVar) {
            m19735p();
            ((zzdeh) this.f25755g).m19280I(zzdmrVar);
            return this;
        }

        /* renamed from: v */
        public final zza m19287v(zzdel zzdelVar) {
            m19735p();
            ((zzdeh) this.f25755g).m19276C(zzdelVar);
            return this;
        }

        /* renamed from: w */
        public final zza m19288w(int i2) {
            m19735p();
            ((zzdeh) this.f25755g).m19281y(0);
            return this;
        }

        /* synthetic */ zza(C6647es c6647es) {
            this();
        }
    }

    static {
        zzdeh zzdehVar = new zzdeh();
        zzgrh = zzdehVar;
        zzdob.m19721t(zzdeh.class, zzdehVar);
    }

    private zzdeh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public final void m19276C(zzdel zzdelVar) {
        zzdelVar.getClass();
        this.zzgrg = zzdelVar;
    }

    /* renamed from: D */
    public static zzdeh m19277D(zzdmr zzdmrVar) throws zzdok {
        return (zzdeh) zzdob.m19713k(zzgrh, zzdmrVar);
    }

    /* renamed from: G */
    public static zza m19278G() {
        return (zza) ((zzdob.zza) zzgrh.mo17725q(zzdob.zze.f25762e, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public final void m19280I(zzdmr zzdmrVar) {
        zzdmrVar.getClass();
        this.zzgqs = zzdmrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public final void m19281y(int i2) {
        this.zzgqk = i2;
    }

    /* renamed from: E */
    public final zzdmr m19283E() {
        return this.zzgqs;
    }

    /* renamed from: F */
    public final zzdel m19284F() {
        zzdel zzdelVar = this.zzgrg;
        return zzdelVar == null ? zzdel.m19293y() : zzdelVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C6647es c6647es = null;
        switch (C6647es.f18832a[i2 - 1]) {
            case 1:
                return new zzdeh();
            case 2:
                return new zza(c6647es);
            case 3:
                return zzdob.m19719r(zzgrh, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzgqk", "zzgrg", "zzgqs"});
            case 4:
                return zzgrh;
            case 5:
                zzdpv<zzdeh> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzdeh.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzgrh);
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
    public final int m19285x() {
        return this.zzgqk;
    }
}
