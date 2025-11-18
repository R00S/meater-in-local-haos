package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdhe extends zzdob<zzdhe, zza> implements zzdpm {
    private static volatile zzdpv<zzdhe> zzdv;
    private static final zzdhe zzgvi;
    private int zzgqk;
    private zzdhg zzgvh;

    public static final class zza extends zzdob.zza<zzdhe, zza> implements zzdpm {
        private zza() {
            super(zzdhe.zzgvi);
        }

        /* renamed from: u */
        public final zza m19499u(zzdhg zzdhgVar) {
            m19735p();
            ((zzdhe) this.f25755g).m19491B(zzdhgVar);
            return this;
        }

        /* renamed from: v */
        public final zza m19500v(int i2) {
            m19735p();
            ((zzdhe) this.f25755g).m19495y(0);
            return this;
        }

        /* synthetic */ zza(C6648et c6648et) {
            this();
        }
    }

    static {
        zzdhe zzdheVar = new zzdhe();
        zzgvi = zzdheVar;
        zzdob.m19721t(zzdhe.class, zzdheVar);
    }

    private zzdhe() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public final void m19491B(zzdhg zzdhgVar) {
        zzdhgVar.getClass();
        this.zzgvh = zzdhgVar;
    }

    /* renamed from: D */
    public static zza m19492D() {
        return (zza) ((zzdob.zza) zzgvi.mo17725q(zzdob.zze.f25762e, null, null));
    }

    /* renamed from: F */
    public static zzdhe m19494F(zzdmr zzdmrVar) throws zzdok {
        return (zzdhe) zzdob.m19713k(zzgvi, zzdmrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public final void m19495y(int i2) {
        this.zzgqk = i2;
    }

    /* renamed from: C */
    public final zzdhg m19497C() {
        zzdhg zzdhgVar = this.zzgvh;
        return zzdhgVar == null ? zzdhg.m19502y() : zzdhgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C6648et c6648et = null;
        switch (C6648et.f18833a[i2 - 1]) {
            case 1:
                return new zzdhe();
            case 2:
                return new zza(c6648et);
            case 3:
                return zzdob.m19719r(zzgvi, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzgqk", "zzgvh"});
            case 4:
                return zzgvi;
            case 5:
                zzdpv<zzdhe> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzdhe.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzgvi);
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
    public final int m19498x() {
        return this.zzgqk;
    }
}
