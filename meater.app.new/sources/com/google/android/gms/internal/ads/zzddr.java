package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzddr extends zzdob<zzddr, zza> implements zzdpm {
    private static volatile zzdpv<zzddr> zzdv;
    private static final zzddr zzgqn;
    private int zzgqk;
    private zzdeb zzgql;
    private zzdgl zzgqm;

    public static final class zza extends zzdob.zza<zzddr, zza> implements zzdpm {
        private zza() {
            super(zzddr.zzgqn);
        }

        /* renamed from: u */
        public final zza m19241u(zzdeb zzdebVar) {
            m19735p();
            ((zzddr) this.f25755g).m19231C(zzdebVar);
            return this;
        }

        /* renamed from: v */
        public final zza m19242v(zzdgl zzdglVar) {
            m19735p();
            ((zzddr) this.f25755g).m19232D(zzdglVar);
            return this;
        }

        /* renamed from: w */
        public final zza m19243w(int i2) {
            m19735p();
            ((zzddr) this.f25755g).m19236y(i2);
            return this;
        }

        /* synthetic */ zza(C7423zr c7423zr) {
            this();
        }
    }

    static {
        zzddr zzddrVar = new zzddr();
        zzgqn = zzddrVar;
        zzdob.m19721t(zzddr.class, zzddrVar);
    }

    private zzddr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public final void m19231C(zzdeb zzdebVar) {
        zzdebVar.getClass();
        this.zzgql = zzdebVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public final void m19232D(zzdgl zzdglVar) {
        zzdglVar.getClass();
        this.zzgqm = zzdglVar;
    }

    /* renamed from: G */
    public static zza m19233G() {
        return (zza) ((zzdob.zza) zzgqn.mo17725q(zzdob.zze.f25762e, null, null));
    }

    /* renamed from: I */
    public static zzddr m19235I(zzdmr zzdmrVar) throws zzdok {
        return (zzddr) zzdob.m19713k(zzgqn, zzdmrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public final void m19236y(int i2) {
        this.zzgqk = i2;
    }

    /* renamed from: E */
    public final zzdeb m19238E() {
        zzdeb zzdebVar = this.zzgql;
        return zzdebVar == null ? zzdeb.m19254G() : zzdebVar;
    }

    /* renamed from: F */
    public final zzdgl m19239F() {
        zzdgl zzdglVar = this.zzgqm;
        return zzdglVar == null ? zzdgl.m19385F() : zzdglVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C7423zr c7423zr = null;
        switch (C7423zr.f21475a[i2 - 1]) {
            case 1:
                return new zzddr();
            case 2:
                return new zza(c7423zr);
            case 3:
                return zzdob.m19719r(zzgqn, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzgqk", "zzgql", "zzgqm"});
            case 4:
                return zzgqn;
            case 5:
                zzdpv<zzddr> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzddr.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzgqn);
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
    public final int m19240x() {
        return this.zzgqk;
    }
}
