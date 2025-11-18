package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdgh extends zzdob<zzdgh, zza> implements zzdpm {
    private static volatile zzdpv<zzdgh> zzdv;
    private static final zzdgh zzgtm;

    public static final class zza extends zzdob.zza<zzdgh, zza> implements zzdpm {
        private zza() {
            super(zzdgh.zzgtm);
        }

        /* synthetic */ zza(C7165ss c7165ss) {
            this();
        }
    }

    static {
        zzdgh zzdghVar = new zzdgh();
        zzgtm = zzdghVar;
        zzdob.m19721t(zzdgh.class, zzdghVar);
    }

    private zzdgh() {
    }

    /* renamed from: y */
    public static zzdgh m19380y(zzdmr zzdmrVar) throws zzdok {
        return (zzdgh) zzdob.m19713k(zzgtm, zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C7165ss c7165ss = null;
        switch (C7165ss.f20537a[i2 - 1]) {
            case 1:
                return new zzdgh();
            case 2:
                return new zza(c7165ss);
            case 3:
                return zzdob.m19719r(zzgtm, "\u0000\u0000", null);
            case 4:
                return zzgtm;
            case 5:
                zzdpv<zzdgh> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzdgh.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzgtm);
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
}
