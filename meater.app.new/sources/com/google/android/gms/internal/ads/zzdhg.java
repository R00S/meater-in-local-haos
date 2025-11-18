package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzdhg extends zzdob<zzdhg, zza> implements zzdpm {
    private static volatile zzdpv<zzdhg> zzdv;
    private static final zzdhg zzgvk;
    private String zzgvj = HttpUrl.FRAGMENT_ENCODE_SET;

    public static final class zza extends zzdob.zza<zzdhg, zza> implements zzdpm {
        private zza() {
            super(zzdhg.zzgvk);
        }

        /* synthetic */ zza(C6685ft c6685ft) {
            this();
        }
    }

    static {
        zzdhg zzdhgVar = new zzdhg();
        zzgvk = zzdhgVar;
        zzdob.m19721t(zzdhg.class, zzdhgVar);
    }

    private zzdhg() {
    }

    /* renamed from: A */
    public static zzdhg m19501A(zzdmr zzdmrVar) throws zzdok {
        return (zzdhg) zzdob.m19713k(zzgvk, zzdmrVar);
    }

    /* renamed from: y */
    public static zzdhg m19502y() {
        return zzgvk;
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C6685ft c6685ft = null;
        switch (C6685ft.f18916a[i2 - 1]) {
            case 1:
                return new zzdhg();
            case 2:
                return new zza(c6685ft);
            case 3:
                return zzdob.m19719r(zzgvk, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzgvj"});
            case 4:
                return zzgvk;
            case 5:
                zzdpv<zzdhg> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzdhg.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzgvk);
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
    public final String m19504x() {
        return this.zzgvj;
    }
}
