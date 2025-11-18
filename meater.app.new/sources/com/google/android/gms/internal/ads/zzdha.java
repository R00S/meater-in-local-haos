package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzdha extends zzdob<zzdha, zza> implements zzdpm {
    private static volatile zzdpv<zzdha> zzdv;
    private static final zzdha zzguz;
    private int zzdj;
    private int zzgux;
    private zzdoj<zzb> zzguy = zzdob.m19723v();

    public static final class zza extends zzdob.zza<zzdha, zza> implements zzdpm {
        private zza() {
            super(zzdha.zzguz);
        }

        /* synthetic */ zza(C6574ct c6574ct) {
            this();
        }
    }

    public static final class zzb extends zzdob<zzb, zza> implements zzdpm {
        private static volatile zzdpv<zzb> zzdv;
        private static final zzb zzgvd;
        private int zzguq;
        private zzdgr zzgva;
        private int zzgvb;
        private int zzgvc;

        public static final class zza extends zzdob.zza<zzb, zza> implements zzdpm {
            private zza() {
                super(zzb.zzgvd);
            }

            /* synthetic */ zza(C6574ct c6574ct) {
                this();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzgvd = zzbVar;
            zzdob.m19721t(zzb.class, zzbVar);
        }

        private zzb() {
        }

        /* renamed from: A */
        public final zzdgu m19463A() {
            zzdgu zzdguVarM19423g = zzdgu.m19423g(this.zzgvb);
            return zzdguVarM19423g == null ? zzdgu.UNRECOGNIZED : zzdguVarM19423g;
        }

        /* renamed from: B */
        public final int m19464B() {
            return this.zzgvc;
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            C6574ct c6574ct = null;
            switch (C6574ct.f18467a[i2 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(c6574ct);
                case 3:
                    return zzdob.m19719r(zzgvd, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzgva", "zzgvb", "zzgvc", "zzguq"});
                case 4:
                    return zzgvd;
                case 5:
                    zzdpv<zzb> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzb.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzgvd);
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
        public final zzdhm m19465x() {
            zzdhm zzdhmVarM19521g = zzdhm.m19521g(this.zzguq);
            return zzdhmVarM19521g == null ? zzdhm.UNRECOGNIZED : zzdhmVarM19521g;
        }

        /* renamed from: y */
        public final boolean m19466y() {
            return this.zzgva != null;
        }

        /* renamed from: z */
        public final zzdgr m19467z() {
            zzdgr zzdgrVar = this.zzgva;
            return zzdgrVar == null ? zzdgr.m19409F() : zzdgrVar;
        }
    }

    static {
        zzdha zzdhaVar = new zzdha();
        zzguz = zzdhaVar;
        zzdob.m19721t(zzdha.class, zzdhaVar);
    }

    private zzdha() {
    }

    /* renamed from: B */
    public static zzdha m19458B(byte[] bArr) throws zzdok {
        return (zzdha) zzdob.m19716n(zzguz, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C6574ct c6574ct = null;
        switch (C6574ct.f18467a[i2 - 1]) {
            case 1:
                return new zzdha();
            case 2:
                return new zza(c6574ct);
            case 3:
                return zzdob.m19719r(zzguz, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzdj", "zzgux", "zzguy", zzb.class});
            case 4:
                return zzguz;
            case 5:
                zzdpv<zzdha> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzdha.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzguz);
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
    public final int m19459x() {
        return this.zzgux;
    }

    /* renamed from: y */
    public final List<zzb> m19460y() {
        return this.zzguy;
    }

    /* renamed from: z */
    public final int m19461z() {
        return this.zzguy.size();
    }
}
