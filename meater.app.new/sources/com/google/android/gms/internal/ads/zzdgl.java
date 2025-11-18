package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdgl extends zzdob<zzdgl, zza> implements zzdpm {
    private static volatile zzdpv<zzdgl> zzdv;
    private static final zzdgl zzgtu;
    private int zzgqk;
    private zzdmr zzgqs = zzdmr.f25661f;
    private zzdgp zzgtt;

    public static final class zza extends zzdob.zza<zzdgl, zza> implements zzdpm {
        private zza() {
            super(zzdgl.zzgtu);
        }

        /* renamed from: u */
        public final zza m19395u(zzdmr zzdmrVar) {
            m19735p();
            ((zzdgl) this.f25755g).m19389J(zzdmrVar);
            return this;
        }

        /* renamed from: v */
        public final zza m19396v(zzdgp zzdgpVar) {
            m19735p();
            ((zzdgl) this.f25755g).m19387H(zzdgpVar);
            return this;
        }

        /* renamed from: w */
        public final zza m19397w(int i2) {
            m19735p();
            ((zzdgl) this.f25755g).m19390y(0);
            return this;
        }

        /* synthetic */ zza(C7239us c7239us) {
            this();
        }
    }

    static {
        zzdgl zzdglVar = new zzdgl();
        zzgtu = zzdglVar;
        zzdob.m19721t(zzdgl.class, zzdglVar);
    }

    private zzdgl() {
    }

    /* renamed from: E */
    public static zza m19384E() {
        return (zza) ((zzdob.zza) zzgtu.mo17725q(zzdob.zze.f25762e, null, null));
    }

    /* renamed from: F */
    public static zzdgl m19385F() {
        return zzgtu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public final void m19387H(zzdgp zzdgpVar) {
        zzdgpVar.getClass();
        this.zzgtt = zzdgpVar;
    }

    /* renamed from: I */
    public static zzdgl m19388I(zzdmr zzdmrVar) throws zzdok {
        return (zzdgl) zzdob.m19713k(zzgtu, zzdmrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public final void m19389J(zzdmr zzdmrVar) {
        zzdmrVar.getClass();
        this.zzgqs = zzdmrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public final void m19390y(int i2) {
        this.zzgqk = i2;
    }

    /* renamed from: C */
    public final zzdmr m19392C() {
        return this.zzgqs;
    }

    /* renamed from: D */
    public final zzdgp m19393D() {
        zzdgp zzdgpVar = this.zzgtt;
        return zzdgpVar == null ? zzdgp.m19404z() : zzdgpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C7239us c7239us = null;
        switch (C7239us.f20654a[i2 - 1]) {
            case 1:
                return new zzdgl();
            case 2:
                return new zza(c7239us);
            case 3:
                return zzdob.m19719r(zzgtu, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzgqk", "zzgtt", "zzgqs"});
            case 4:
                return zzgtu;
            case 5:
                zzdpv<zzdgl> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzdgl.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzgtu);
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
    public final int m19394x() {
        return this.zzgqk;
    }
}
