package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdfx extends zzdob<zzdfx, zza> implements zzdpm {
    private static volatile zzdpv<zzdfx> zzdv;
    private static final zzdfx zzgsz;
    private int zzgqk;
    private zzdmr zzgsh;
    private zzdmr zzgsi;
    private zzdft zzgsr;

    public static final class zza extends zzdob.zza<zzdfx, zza> implements zzdpm {
        private zza() {
            super(zzdfx.zzgsz);
        }

        /* renamed from: A */
        public final zza m19368A(int i2) {
            m19735p();
            ((zzdfx) this.f25755g).m19362y(0);
            return this;
        }

        /* renamed from: u */
        public final zza m19369u(zzdmr zzdmrVar) {
            m19735p();
            ((zzdfx) this.f25755g).m19357I(zzdmrVar);
            return this;
        }

        /* renamed from: v */
        public final zza m19370v(zzdmr zzdmrVar) {
            m19735p();
            ((zzdfx) this.f25755g).m19358J(zzdmrVar);
            return this;
        }

        /* renamed from: w */
        public final zza m19371w(zzdft zzdftVar) {
            m19735p();
            ((zzdfx) this.f25755g).m19359K(zzdftVar);
            return this;
        }

        /* synthetic */ zza(C7054ps c7054ps) {
            this();
        }
    }

    static {
        zzdfx zzdfxVar = new zzdfx();
        zzgsz = zzdfxVar;
        zzdob.m19721t(zzdfx.class, zzdfxVar);
    }

    private zzdfx() {
        zzdmr zzdmrVar = zzdmr.f25661f;
        this.zzgsh = zzdmrVar;
        this.zzgsi = zzdmrVar;
    }

    /* renamed from: F */
    public static zza m19354F() {
        return (zza) ((zzdob.zza) zzgsz.mo17725q(zzdob.zze.f25762e, null, null));
    }

    /* renamed from: G */
    public static zzdfx m19355G() {
        return zzgsz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public final void m19357I(zzdmr zzdmrVar) {
        zzdmrVar.getClass();
        this.zzgsh = zzdmrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public final void m19358J(zzdmr zzdmrVar) {
        zzdmrVar.getClass();
        this.zzgsi = zzdmrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public final void m19359K(zzdft zzdftVar) {
        zzdftVar.getClass();
        this.zzgsr = zzdftVar;
    }

    /* renamed from: M */
    public static zzdfx m19361M(zzdmr zzdmrVar) throws zzdok {
        return (zzdfx) zzdob.m19713k(zzgsz, zzdmrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public final void m19362y(int i2) {
        this.zzgqk = i2;
    }

    /* renamed from: C */
    public final zzdmr m19364C() {
        return this.zzgsh;
    }

    /* renamed from: D */
    public final zzdmr m19365D() {
        return this.zzgsi;
    }

    /* renamed from: E */
    public final zzdft m19366E() {
        zzdft zzdftVar = this.zzgsr;
        return zzdftVar == null ? zzdft.m19332A() : zzdftVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C7054ps c7054ps = null;
        switch (C7054ps.f20322a[i2 - 1]) {
            case 1:
                return new zzdfx();
            case 2:
                return new zza(c7054ps);
            case 3:
                return zzdob.m19719r(zzgsz, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzgqk", "zzgsr", "zzgsh", "zzgsi"});
            case 4:
                return zzgsz;
            case 5:
                zzdpv<zzdfx> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzdfx.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzgsz);
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
    public final int m19367x() {
        return this.zzgqk;
    }
}
