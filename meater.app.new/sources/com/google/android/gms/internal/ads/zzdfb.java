package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdfb extends zzdob<zzdfb, zza> implements zzdpm {
    private static volatile zzdpv<zzdfb> zzdv;
    private static final zzdfb zzgrs;
    private int zzgqk;
    private zzdmr zzgqs = zzdmr.f25661f;

    public static final class zza extends zzdob.zza<zzdfb, zza> implements zzdpm {
        private zza() {
            super(zzdfb.zzgrs);
        }

        /* renamed from: u */
        public final zza m19323u(zzdmr zzdmrVar) {
            m19735p();
            ((zzdfb) this.f25755g).m19318F(zzdmrVar);
            return this;
        }

        /* renamed from: v */
        public final zza m19324v(int i2) {
            m19735p();
            ((zzdfb) this.f25755g).m19319y(0);
            return this;
        }

        /* synthetic */ zza(C6832js c6832js) {
            this();
        }
    }

    static {
        zzdfb zzdfbVar = new zzdfb();
        zzgrs = zzdfbVar;
        zzdob.m19721t(zzdfb.class, zzdfbVar);
    }

    private zzdfb() {
    }

    /* renamed from: C */
    public static zzdfb m19315C(zzdmr zzdmrVar) throws zzdok {
        return (zzdfb) zzdob.m19713k(zzgrs, zzdmrVar);
    }

    /* renamed from: D */
    public static zza m19316D() {
        return (zza) ((zzdob.zza) zzgrs.mo17725q(zzdob.zze.f25762e, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public final void m19318F(zzdmr zzdmrVar) {
        zzdmrVar.getClass();
        this.zzgqs = zzdmrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public final void m19319y(int i2) {
        this.zzgqk = i2;
    }

    /* renamed from: B */
    public final zzdmr m19321B() {
        return this.zzgqs;
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C6832js c6832js = null;
        switch (C6832js.f19499a[i2 - 1]) {
            case 1:
                return new zzdfb();
            case 2:
                return new zza(c6832js);
            case 3:
                return zzdob.m19719r(zzgrs, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzgqk", "zzgqs"});
            case 4:
                return zzgrs;
            case 5:
                zzdpv<zzdfb> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzdfb.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzgrs);
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
    public final int m19322x() {
        return this.zzgqk;
    }
}
