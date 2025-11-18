package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdhi extends zzdob<zzdhi, zza> implements zzdpm {
    private static volatile zzdpv<zzdhi> zzdv;
    private static final zzdhi zzgvm;
    private int zzgqk;
    private zzdhk zzgvl;

    public static final class zza extends zzdob.zza<zzdhi, zza> implements zzdpm {
        private zza() {
            super(zzdhi.zzgvm);
        }

        /* renamed from: u */
        public final zza m19514u(zzdhk zzdhkVar) {
            m19735p();
            ((zzdhi) this.f25755g).m19506B(zzdhkVar);
            return this;
        }

        /* renamed from: v */
        public final zza m19515v(int i2) {
            m19735p();
            ((zzdhi) this.f25755g).m19510y(0);
            return this;
        }

        /* synthetic */ zza(C6722gt c6722gt) {
            this();
        }
    }

    static {
        zzdhi zzdhiVar = new zzdhi();
        zzgvm = zzdhiVar;
        zzdob.m19721t(zzdhi.class, zzdhiVar);
    }

    private zzdhi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public final void m19506B(zzdhk zzdhkVar) {
        zzdhkVar.getClass();
        this.zzgvl = zzdhkVar;
    }

    /* renamed from: D */
    public static zza m19507D() {
        return (zza) ((zzdob.zza) zzgvm.mo17725q(zzdob.zze.f25762e, null, null));
    }

    /* renamed from: F */
    public static zzdhi m19509F(zzdmr zzdmrVar) throws zzdok {
        return (zzdhi) zzdob.m19713k(zzgvm, zzdmrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public final void m19510y(int i2) {
        this.zzgqk = i2;
    }

    /* renamed from: C */
    public final zzdhk m19512C() {
        zzdhk zzdhkVar = this.zzgvl;
        return zzdhkVar == null ? zzdhk.m19518z() : zzdhkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C6722gt c6722gt = null;
        switch (C6722gt.f18991a[i2 - 1]) {
            case 1:
                return new zzdhi();
            case 2:
                return new zza(c6722gt);
            case 3:
                return zzdob.m19719r(zzgvm, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzgqk", "zzgvl"});
            case 4:
                return zzgvm;
            case 5:
                zzdpv<zzdhi> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzdhi.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzgvm);
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
    public final int m19513x() {
        return this.zzgqk;
    }
}
