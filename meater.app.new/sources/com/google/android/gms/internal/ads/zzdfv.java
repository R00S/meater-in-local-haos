package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdfv extends zzdob<zzdfv, zza> implements zzdpm {
    private static volatile zzdpv<zzdfv> zzdv;
    private static final zzdfv zzgsy;
    private int zzgqk;
    private zzdmr zzgqs = zzdmr.f25661f;
    private zzdfx zzgsx;

    public static final class zza extends zzdob.zza<zzdfv, zza> implements zzdpm {
        private zza() {
            super(zzdfv.zzgsy);
        }

        /* renamed from: u */
        public final zza m19349u(zzdfx zzdfxVar) {
            m19735p();
            ((zzdfv) this.f25755g).m19339C(zzdfxVar);
            return this;
        }

        /* renamed from: v */
        public final zza m19350v(zzdmr zzdmrVar) {
            m19735p();
            ((zzdfv) this.f25755g).m19343I(zzdmrVar);
            return this;
        }

        /* renamed from: w */
        public final zza m19351w(int i2) {
            m19735p();
            ((zzdfv) this.f25755g).m19344y(0);
            return this;
        }

        /* synthetic */ zza(C7017os c7017os) {
            this();
        }
    }

    static {
        zzdfv zzdfvVar = new zzdfv();
        zzgsy = zzdfvVar;
        zzdob.m19721t(zzdfv.class, zzdfvVar);
    }

    private zzdfv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public final void m19339C(zzdfx zzdfxVar) {
        zzdfxVar.getClass();
        this.zzgsx = zzdfxVar;
    }

    /* renamed from: F */
    public static zza m19340F() {
        return (zza) ((zzdob.zza) zzgsy.mo17725q(zzdob.zze.f25762e, null, null));
    }

    /* renamed from: H */
    public static zzdfv m19342H(zzdmr zzdmrVar) throws zzdok {
        return (zzdfv) zzdob.m19713k(zzgsy, zzdmrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public final void m19343I(zzdmr zzdmrVar) {
        zzdmrVar.getClass();
        this.zzgqs = zzdmrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public final void m19344y(int i2) {
        this.zzgqk = i2;
    }

    /* renamed from: D */
    public final zzdmr m19346D() {
        return this.zzgqs;
    }

    /* renamed from: E */
    public final zzdfx m19347E() {
        zzdfx zzdfxVar = this.zzgsx;
        return zzdfxVar == null ? zzdfx.m19355G() : zzdfxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C7017os c7017os = null;
        switch (C7017os.f20211a[i2 - 1]) {
            case 1:
                return new zzdfv();
            case 2:
                return new zza(c7017os);
            case 3:
                return zzdob.m19719r(zzgsy, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzgqk", "zzgsx", "zzgqs"});
            case 4:
                return zzgsy;
            case 5:
                zzdpv<zzdfv> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzdfv.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzgsy);
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
    public final int m19348x() {
        return this.zzgqk;
    }
}
