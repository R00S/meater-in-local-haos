package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzdgw extends zzdob<zzdgw, zza> implements zzdpm {
    private static volatile zzdpv<zzdgw> zzdv;
    private static final zzdgw zzgur;
    private String zzgtz = HttpUrl.FRAGMENT_ENCODE_SET;
    private zzdmr zzgua = zzdmr.f25661f;
    private int zzguq;

    public static final class zza extends zzdob.zza<zzdgw, zza> implements zzdpm {
        private zza() {
            super(zzdgw.zzgur);
        }

        /* synthetic */ zza(C6500at c6500at) {
            this();
        }
    }

    static {
        zzdgw zzdgwVar = new zzdgw();
        zzgur = zzdgwVar;
        zzdob.m19721t(zzdgw.class, zzdgwVar);
    }

    private zzdgw() {
    }

    /* renamed from: z */
    public static zzdgw m19425z() {
        return zzgur;
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C6500at c6500at = null;
        switch (C6500at.f18182a[i2 - 1]) {
            case 1:
                return new zzdgw();
            case 2:
                return new zza(c6500at);
            case 3:
                return zzdob.m19719r(zzgur, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzgtz", "zzgua", "zzguq"});
            case 4:
                return zzgur;
            case 5:
                zzdpv<zzdgw> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzdgw.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzgur);
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
    public final String m19426x() {
        return this.zzgtz;
    }

    /* renamed from: y */
    public final zzdmr m19427y() {
        return this.zzgua;
    }
}
