package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzded extends zzdob<zzded, zza> implements zzdpm {
    private static volatile zzdpv<zzded> zzdv;
    private static final zzded zzgrd;
    private int zzgqu;
    private zzdef zzgrb;

    public static final class zza extends zzdob.zza<zzded, zza> implements zzdpm {
        private zza() {
            super(zzded.zzgrd);
        }

        /* synthetic */ zza(C6573cs c6573cs) {
            this();
        }
    }

    static {
        zzded zzdedVar = new zzded();
        zzgrd = zzdedVar;
        zzdob.m19721t(zzded.class, zzdedVar);
    }

    private zzded() {
    }

    /* renamed from: A */
    public static zzded m19266A() {
        return zzgrd;
    }

    /* renamed from: y */
    public static zzded m19268y(zzdmr zzdmrVar) throws zzdok {
        return (zzded) zzdob.m19713k(zzgrd, zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C6573cs c6573cs = null;
        switch (C6573cs.f18466a[i2 - 1]) {
            case 1:
                return new zzded();
            case 2:
                return new zza(c6573cs);
            case 3:
                return zzdob.m19719r(zzgrd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzgrb", "zzgqu"});
            case 4:
                return zzgrd;
            case 5:
                zzdpv<zzded> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzded.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzgrd);
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
    public final int m19269x() {
        return this.zzgqu;
    }

    /* renamed from: z */
    public final zzdef m19270z() {
        zzdef zzdefVar = this.zzgrb;
        return zzdefVar == null ? zzdef.m19271y() : zzdefVar;
    }
}
