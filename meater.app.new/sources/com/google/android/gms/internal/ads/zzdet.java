package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdet extends zzdob<zzdet, zza> implements zzdpm {
    private static volatile zzdpv<zzdet> zzdv;
    private static final zzdet zzgro;
    private int zzgqk;
    private zzdmr zzgqs = zzdmr.f25661f;

    public static final class zza extends zzdob.zza<zzdet, zza> implements zzdpm {
        private zza() {
            super(zzdet.zzgro);
        }

        /* renamed from: u */
        public final zza m19305u(zzdmr zzdmrVar) {
            m19735p();
            ((zzdet) this.f25755g).m19300F(zzdmrVar);
            return this;
        }

        /* renamed from: v */
        public final zza m19306v(int i2) {
            m19735p();
            ((zzdet) this.f25755g).m19301y(0);
            return this;
        }

        /* synthetic */ zza(C6758hs c6758hs) {
            this();
        }
    }

    static {
        zzdet zzdetVar = new zzdet();
        zzgro = zzdetVar;
        zzdob.m19721t(zzdet.class, zzdetVar);
    }

    private zzdet() {
    }

    /* renamed from: B */
    public static zzdet m19297B(zzdmr zzdmrVar) throws zzdok {
        return (zzdet) zzdob.m19713k(zzgro, zzdmrVar);
    }

    /* renamed from: D */
    public static zza m19298D() {
        return (zza) ((zzdob.zza) zzgro.mo17725q(zzdob.zze.f25762e, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public final void m19300F(zzdmr zzdmrVar) {
        zzdmrVar.getClass();
        this.zzgqs = zzdmrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public final void m19301y(int i2) {
        this.zzgqk = i2;
    }

    /* renamed from: C */
    public final zzdmr m19303C() {
        return this.zzgqs;
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C6758hs c6758hs = null;
        switch (C6758hs.f19244a[i2 - 1]) {
            case 1:
                return new zzdet();
            case 2:
                return new zza(c6758hs);
            case 3:
                return zzdob.m19719r(zzgro, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzgqk", "zzgqs"});
            case 4:
                return zzgro;
            case 5:
                zzdpv<zzdet> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzdet.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzgro);
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
    public final int m19304x() {
        return this.zzgqk;
    }
}
