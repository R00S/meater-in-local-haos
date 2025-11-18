package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdeb extends zzdob<zzdeb, zza> implements zzdpm {
    private static volatile zzdpv<zzdeb> zzdv;
    private static final zzdeb zzgrc;
    private int zzgqk;
    private zzdmr zzgqs = zzdmr.f25661f;
    private zzdef zzgrb;

    public static final class zza extends zzdob.zza<zzdeb, zza> implements zzdpm {
        private zza() {
            super(zzdeb.zzgrc);
        }

        /* renamed from: u */
        public final zza m19263u(zzdmr zzdmrVar) {
            m19735p();
            ((zzdeb) this.f25755g).m19257J(zzdmrVar);
            return this;
        }

        /* renamed from: v */
        public final zza m19264v(zzdef zzdefVar) {
            m19735p();
            ((zzdeb) this.f25755g).m19256I(zzdefVar);
            return this;
        }

        /* renamed from: w */
        public final zza m19265w(int i2) {
            m19735p();
            ((zzdeb) this.f25755g).m19258y(0);
            return this;
        }

        /* synthetic */ zza(C6536bs c6536bs) {
            this();
        }
    }

    static {
        zzdeb zzdebVar = new zzdeb();
        zzgrc = zzdebVar;
        zzdob.m19721t(zzdeb.class, zzdebVar);
    }

    private zzdeb() {
    }

    /* renamed from: C */
    public static zzdeb m19252C(zzdmr zzdmrVar) throws zzdok {
        return (zzdeb) zzdob.m19713k(zzgrc, zzdmrVar);
    }

    /* renamed from: F */
    public static zza m19253F() {
        return (zza) ((zzdob.zza) zzgrc.mo17725q(zzdob.zze.f25762e, null, null));
    }

    /* renamed from: G */
    public static zzdeb m19254G() {
        return zzgrc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public final void m19256I(zzdef zzdefVar) {
        zzdefVar.getClass();
        this.zzgrb = zzdefVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public final void m19257J(zzdmr zzdmrVar) {
        zzdmrVar.getClass();
        this.zzgqs = zzdmrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public final void m19258y(int i2) {
        this.zzgqk = i2;
    }

    /* renamed from: D */
    public final zzdmr m19260D() {
        return this.zzgqs;
    }

    /* renamed from: E */
    public final zzdef m19261E() {
        zzdef zzdefVar = this.zzgrb;
        return zzdefVar == null ? zzdef.m19271y() : zzdefVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C6536bs c6536bs = null;
        switch (C6536bs.f18354a[i2 - 1]) {
            case 1:
                return new zzdeb();
            case 2:
                return new zza(c6536bs);
            case 3:
                return zzdob.m19719r(zzgrc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzgqk", "zzgrb", "zzgqs"});
            case 4:
                return zzgrc;
            case 5:
                zzdpv<zzdeb> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzdeb.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzgrc);
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
    public final int m19262x() {
        return this.zzgqk;
    }
}
