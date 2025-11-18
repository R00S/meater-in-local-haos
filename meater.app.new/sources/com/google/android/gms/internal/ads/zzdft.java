package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdft extends zzdob<zzdft, zza> implements zzdpm {
    private static volatile zzdpv<zzdft> zzdv;
    private static final zzdft zzgsw;
    private zzdfz zzgst;
    private zzdfp zzgsu;
    private int zzgsv;

    public static final class zza extends zzdob.zza<zzdft, zza> implements zzdpm {
        private zza() {
            super(zzdft.zzgsw);
        }

        /* synthetic */ zza(C6980ns c6980ns) {
            this();
        }
    }

    static {
        zzdft zzdftVar = new zzdft();
        zzgsw = zzdftVar;
        zzdob.m19721t(zzdft.class, zzdftVar);
    }

    private zzdft() {
    }

    /* renamed from: A */
    public static zzdft m19332A() {
        return zzgsw;
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C6980ns c6980ns = null;
        switch (C6980ns.f20104a[i2 - 1]) {
            case 1:
                return new zzdft();
            case 2:
                return new zza(c6980ns);
            case 3:
                return zzdob.m19719r(zzgsw, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzgst", "zzgsu", "zzgsv"});
            case 4:
                return zzgsw;
            case 5:
                zzdpv<zzdft> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzdft.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzgsw);
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
    public final zzdfz m19334x() {
        zzdfz zzdfzVar = this.zzgst;
        return zzdfzVar == null ? zzdfz.m19372A() : zzdfzVar;
    }

    /* renamed from: y */
    public final zzdfp m19335y() {
        zzdfp zzdfpVar = this.zzgsu;
        return zzdfpVar == null ? zzdfp.m19326y() : zzdfpVar;
    }

    /* renamed from: z */
    public final zzdfd m19336z() {
        zzdfd zzdfdVarM19325g = zzdfd.m19325g(this.zzgsv);
        return zzdfdVarM19325g == null ? zzdfd.UNRECOGNIZED : zzdfdVarM19325g;
    }
}
