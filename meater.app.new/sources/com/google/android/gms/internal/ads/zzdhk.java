package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzdhk extends zzdob<zzdhk, zza> implements zzdpm {
    private static volatile zzdpv<zzdhk> zzdv;
    private static final zzdhk zzgvp;
    private String zzgvn = HttpUrl.FRAGMENT_ENCODE_SET;
    private zzdgw zzgvo;

    public static final class zza extends zzdob.zza<zzdhk, zza> implements zzdpm {
        private zza() {
            super(zzdhk.zzgvp);
        }

        /* synthetic */ zza(C6759ht c6759ht) {
            this();
        }
    }

    static {
        zzdhk zzdhkVar = new zzdhk();
        zzgvp = zzdhkVar;
        zzdob.m19721t(zzdhk.class, zzdhkVar);
    }

    private zzdhk() {
    }

    /* renamed from: B */
    public static zzdhk m19517B(zzdmr zzdmrVar) throws zzdok {
        return (zzdhk) zzdob.m19713k(zzgvp, zzdmrVar);
    }

    /* renamed from: z */
    public static zzdhk m19518z() {
        return zzgvp;
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C6759ht c6759ht = null;
        switch (C6759ht.f19245a[i2 - 1]) {
            case 1:
                return new zzdhk();
            case 2:
                return new zza(c6759ht);
            case 3:
                return zzdob.m19719r(zzgvp, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzgvn", "zzgvo"});
            case 4:
                return zzgvp;
            case 5:
                zzdpv<zzdhk> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzdhk.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzgvp);
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
    public final String m19519x() {
        return this.zzgvn;
    }

    /* renamed from: y */
    public final zzdgw m19520y() {
        zzdgw zzdgwVar = this.zzgvo;
        return zzdgwVar == null ? zzdgw.m19425z() : zzdgwVar;
    }
}
