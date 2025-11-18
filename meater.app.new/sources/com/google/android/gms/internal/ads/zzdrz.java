package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzdrz {

    public static final class zza extends zzdob<zza, C11482zza> implements zzdpm {
        private static volatile zzdpv<zza> zzdv;
        private static final zza zzhoq;
        private int zzdj;
        private int zzhoj;
        private zzb zzhok;
        private zzdmr zzhol;
        private zzdmr zzhom;
        private boolean zzhon;
        private boolean zzhoo;
        private byte zzhop = 2;

        /* renamed from: com.google.android.gms.internal.ads.zzdrz$zza$zza, reason: collision with other inner class name */
        public static final class C11482zza extends zzdob.zza<zza, C11482zza> implements zzdpm {
            private C11482zza() {
                super(zza.zzhoq);
            }

            /* synthetic */ C11482zza(C7355xx c7355xx) {
                this();
            }
        }

        public static final class zzb extends zzdob<zzb, C11483zza> implements zzdpm {
            private static volatile zzdpv<zzb> zzdv;
            private static final zzb zzhov;
            private int zzdj;
            private String zzhor = HttpUrl.FRAGMENT_ENCODE_SET;
            private String zzhos = HttpUrl.FRAGMENT_ENCODE_SET;
            private String zzhot = HttpUrl.FRAGMENT_ENCODE_SET;
            private int zzhou;

            /* renamed from: com.google.android.gms.internal.ads.zzdrz$zza$zzb$zza, reason: collision with other inner class name */
            public static final class C11483zza extends zzdob.zza<zzb, C11483zza> implements zzdpm {
                private C11483zza() {
                    super(zzb.zzhov);
                }

                /* synthetic */ C11483zza(C7355xx c7355xx) {
                    this();
                }
            }

            static {
                zzb zzbVar = new zzb();
                zzhov = zzbVar;
                zzdob.m19721t(zzb.class, zzbVar);
            }

            private zzb() {
            }

            @Override // com.google.android.gms.internal.ads.zzdob
            /* renamed from: q */
            protected final Object mo17725q(int i2, Object obj, Object obj2) {
                C7355xx c7355xx = null;
                switch (C7355xx.f20986a[i2 - 1]) {
                    case 1:
                        return new zzb();
                    case 2:
                        return new C11483zza(c7355xx);
                    case 3:
                        return zzdob.m19719r(zzhov, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u0004\u0003", new Object[]{"zzdj", "zzhor", "zzhos", "zzhot", "zzhou"});
                    case 4:
                        return zzhov;
                    case 5:
                        zzdpv<zzb> zzbVar = zzdv;
                        if (zzbVar == null) {
                            synchronized (zzb.class) {
                                zzbVar = zzdv;
                                if (zzbVar == null) {
                                    zzbVar = new zzdob.zzb<>(zzhov);
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

        public enum zzc implements zzdoe {
            SAFE(0),
            DANGEROUS(1),
            UNKNOWN(2),
            POTENTIALLY_UNWANTED(3),
            DANGEROUS_HOST(4);


            /* renamed from: k */
            private static final zzdof<zzc> f25868k = new C7392yx();

            /* renamed from: m */
            private final int f25870m;

            zzc(int i2) {
                this.f25870m = i2;
            }

            /* renamed from: g */
            public static zzdog m19831g() {
                return C7429zx.f21480a;
            }

            /* renamed from: k */
            public static zzc m19832k(int i2) {
                if (i2 == 0) {
                    return SAFE;
                }
                if (i2 == 1) {
                    return DANGEROUS;
                }
                if (i2 == 2) {
                    return UNKNOWN;
                }
                if (i2 == 3) {
                    return POTENTIALLY_UNWANTED;
                }
                if (i2 != 4) {
                    return null;
                }
                return DANGEROUS_HOST;
            }

            @Override // com.google.android.gms.internal.ads.zzdoe
            /* renamed from: i */
            public final int mo17879i() {
                return this.f25870m;
            }
        }

        static {
            zza zzaVar = new zza();
            zzhoq = zzaVar;
            zzdob.m19721t(zza.class, zzaVar);
        }

        private zza() {
            zzdmr zzdmrVar = zzdmr.f25661f;
            this.zzhol = zzdmrVar;
            this.zzhom = zzdmrVar;
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            C7355xx c7355xx = null;
            switch (C7355xx.f20986a[i2 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C11482zza(c7355xx);
                case 3:
                    return zzdob.m19719r(zzhoq, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001Ԍ\u0000\u0002\t\u0001\u0003\n\u0002\u0004\n\u0003\u0005\u0007\u0004\u0006\u0007\u0005", new Object[]{"zzdj", "zzhoj", zzc.m19831g(), "zzhok", "zzhol", "zzhom", "zzhon", "zzhoo"});
                case 4:
                    return zzhoq;
                case 5:
                    zzdpv<zza> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zza.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzhoq);
                                zzdv = zzbVar;
                            }
                        }
                    }
                    return zzbVar;
                case 6:
                    return Byte.valueOf(this.zzhop);
                case 7:
                    this.zzhop = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzb extends zzdob<zzb, zza> implements zzdpm {
        private static volatile zzdpv<zzb> zzdv;
        private static final zzb zzhpr;
        private int zzbzi;
        private int zzdj;
        private int zzhpc;
        private C11484zzb zzhpf;
        private zzf zzhpi;
        private boolean zzhpj;
        private boolean zzhpm;
        private boolean zzhpn;
        private zzi zzhpo;
        private byte zzhop = 2;
        private String zzhos = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzhpd = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzhpe = HttpUrl.FRAGMENT_ENCODE_SET;
        private zzdoj<zzh> zzhpg = zzdob.m19723v();
        private String zzhph = HttpUrl.FRAGMENT_ENCODE_SET;
        private zzdoj<String> zzhpk = zzdob.m19723v();
        private String zzhpl = HttpUrl.FRAGMENT_ENCODE_SET;
        private zzdmr zzhol = zzdmr.f25661f;
        private zzdoj<String> zzhpp = zzdob.m19723v();
        private zzdoj<String> zzhpq = zzdob.m19723v();

        public static final class zza extends zzdob.zza<zzb, zza> implements zzdpm {
            private zza() {
                super(zzb.zzhpr);
            }

            /* synthetic */ zza(C7355xx c7355xx) {
                this();
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.zzdrz$zzb$zzb, reason: collision with other inner class name */
        public static final class C11484zzb extends zzdob<C11484zzb, zza> implements zzdpm {
            private static volatile zzdpv<C11484zzb> zzdv;
            private static final C11484zzb zzhpt;
            private int zzdj;
            private String zzhps = HttpUrl.FRAGMENT_ENCODE_SET;

            /* renamed from: com.google.android.gms.internal.ads.zzdrz$zzb$zzb$zza */
            public static final class zza extends zzdob.zza<C11484zzb, zza> implements zzdpm {
                private zza() {
                    super(C11484zzb.zzhpt);
                }

                /* synthetic */ zza(C7355xx c7355xx) {
                    this();
                }
            }

            static {
                C11484zzb c11484zzb = new C11484zzb();
                zzhpt = c11484zzb;
                zzdob.m19721t(C11484zzb.class, c11484zzb);
            }

            private C11484zzb() {
            }

            @Override // com.google.android.gms.internal.ads.zzdob
            /* renamed from: q */
            protected final Object mo17725q(int i2, Object obj, Object obj2) {
                C7355xx c7355xx = null;
                switch (C7355xx.f20986a[i2 - 1]) {
                    case 1:
                        return new C11484zzb();
                    case 2:
                        return new zza(c7355xx);
                    case 3:
                        return zzdob.m19719r(zzhpt, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"zzdj", "zzhps"});
                    case 4:
                        return zzhpt;
                    case 5:
                        zzdpv<C11484zzb> zzbVar = zzdv;
                        if (zzbVar == null) {
                            synchronized (C11484zzb.class) {
                                zzbVar = zzdv;
                                if (zzbVar == null) {
                                    zzbVar = new zzdob.zzb<>(zzhpt);
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

        public static final class zzc extends zzdob<zzc, zza> implements zzdpm {
            private static volatile zzdpv<zzc> zzdv;
            private static final zzc zzhpv;
            private int zzdj;
            private zzdmr zzgua;
            private byte zzhop = 2;
            private zzdmr zzhpu;

            public static final class zza extends zzdob.zza<zzc, zza> implements zzdpm {
                private zza() {
                    super(zzc.zzhpv);
                }

                /* synthetic */ zza(C7355xx c7355xx) {
                    this();
                }
            }

            static {
                zzc zzcVar = new zzc();
                zzhpv = zzcVar;
                zzdob.m19721t(zzc.class, zzcVar);
            }

            private zzc() {
                zzdmr zzdmrVar = zzdmr.f25661f;
                this.zzhpu = zzdmrVar;
                this.zzgua = zzdmrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdob
            /* renamed from: q */
            protected final Object mo17725q(int i2, Object obj, Object obj2) {
                C7355xx c7355xx = null;
                switch (C7355xx.f20986a[i2 - 1]) {
                    case 1:
                        return new zzc();
                    case 2:
                        return new zza(c7355xx);
                    case 3:
                        return zzdob.m19719r(zzhpv, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001Ԋ\u0000\u0002\n\u0001", new Object[]{"zzdj", "zzhpu", "zzgua"});
                    case 4:
                        return zzhpv;
                    case 5:
                        zzdpv<zzc> zzbVar = zzdv;
                        if (zzbVar == null) {
                            synchronized (zzc.class) {
                                zzbVar = zzdv;
                                if (zzbVar == null) {
                                    zzbVar = new zzdob.zzb<>(zzhpv);
                                    zzdv = zzbVar;
                                }
                            }
                        }
                        return zzbVar;
                    case 6:
                        return Byte.valueOf(this.zzhop);
                    case 7:
                        this.zzhop = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class zzd extends zzdob<zzd, zza> implements zzdpm {
            private static volatile zzdpv<zzd> zzdv;
            private static final zzd zzhqb;
            private int zzdj;
            private C11485zzb zzhpw;
            private zzdmr zzhpy;
            private zzdmr zzhpz;
            private int zzhqa;
            private byte zzhop = 2;
            private zzdoj<zzc> zzhpx = zzdob.m19723v();

            public static final class zza extends zzdob.zza<zzd, zza> implements zzdpm {
                private zza() {
                    super(zzd.zzhqb);
                }

                /* synthetic */ zza(C7355xx c7355xx) {
                    this();
                }
            }

            /* renamed from: com.google.android.gms.internal.ads.zzdrz$zzb$zzd$zzb, reason: collision with other inner class name */
            public static final class C11485zzb extends zzdob<C11485zzb, zza> implements zzdpm {
                private static volatile zzdpv<C11485zzb> zzdv;
                private static final C11485zzb zzhqf;
                private int zzdj;
                private zzdmr zzhqc;
                private zzdmr zzhqd;
                private zzdmr zzhqe;

                /* renamed from: com.google.android.gms.internal.ads.zzdrz$zzb$zzd$zzb$zza */
                public static final class zza extends zzdob.zza<C11485zzb, zza> implements zzdpm {
                    private zza() {
                        super(C11485zzb.zzhqf);
                    }

                    /* synthetic */ zza(C7355xx c7355xx) {
                        this();
                    }
                }

                static {
                    C11485zzb c11485zzb = new C11485zzb();
                    zzhqf = c11485zzb;
                    zzdob.m19721t(C11485zzb.class, c11485zzb);
                }

                private C11485zzb() {
                    zzdmr zzdmrVar = zzdmr.f25661f;
                    this.zzhqc = zzdmrVar;
                    this.zzhqd = zzdmrVar;
                    this.zzhqe = zzdmrVar;
                }

                @Override // com.google.android.gms.internal.ads.zzdob
                /* renamed from: q */
                protected final Object mo17725q(int i2, Object obj, Object obj2) {
                    C7355xx c7355xx = null;
                    switch (C7355xx.f20986a[i2 - 1]) {
                        case 1:
                            return new C11485zzb();
                        case 2:
                            return new zza(c7355xx);
                        case 3:
                            return zzdob.m19719r(zzhqf, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0000\u0002\n\u0001\u0003\n\u0002", new Object[]{"zzdj", "zzhqc", "zzhqd", "zzhqe"});
                        case 4:
                            return zzhqf;
                        case 5:
                            zzdpv<C11485zzb> zzbVar = zzdv;
                            if (zzbVar == null) {
                                synchronized (C11485zzb.class) {
                                    zzbVar = zzdv;
                                    if (zzbVar == null) {
                                        zzbVar = new zzdob.zzb<>(zzhqf);
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

            static {
                zzd zzdVar = new zzd();
                zzhqb = zzdVar;
                zzdob.m19721t(zzd.class, zzdVar);
            }

            private zzd() {
                zzdmr zzdmrVar = zzdmr.f25661f;
                this.zzhpy = zzdmrVar;
                this.zzhpz = zzdmrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdob
            /* renamed from: q */
            protected final Object mo17725q(int i2, Object obj, Object obj2) {
                C7355xx c7355xx = null;
                switch (C7355xx.f20986a[i2 - 1]) {
                    case 1:
                        return new zzd();
                    case 2:
                        return new zza(c7355xx);
                    case 3:
                        return zzdob.m19719r(zzhqb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\t\u0000\u0002Л\u0003\n\u0001\u0004\n\u0002\u0005\u0004\u0003", new Object[]{"zzdj", "zzhpw", "zzhpx", zzc.class, "zzhpy", "zzhpz", "zzhqa"});
                    case 4:
                        return zzhqb;
                    case 5:
                        zzdpv<zzd> zzbVar = zzdv;
                        if (zzbVar == null) {
                            synchronized (zzd.class) {
                                zzbVar = zzdv;
                                if (zzbVar == null) {
                                    zzbVar = new zzdob.zzb<>(zzhqb);
                                    zzdv = zzbVar;
                                }
                            }
                        }
                        return zzbVar;
                    case 6:
                        return Byte.valueOf(this.zzhop);
                    case 7:
                        this.zzhop = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class zze extends zzdob<zze, zza> implements zzdpm {
            private static volatile zzdpv<zze> zzdv;
            private static final zze zzhqi;
            private int zzdj;
            private byte zzhop = 2;
            private zzdoj<zzc> zzhpx = zzdob.m19723v();
            private zzdmr zzhpy;
            private zzdmr zzhpz;
            private int zzhqa;
            private C11486zzb zzhqg;
            private zzdmr zzhqh;

            public static final class zza extends zzdob.zza<zze, zza> implements zzdpm {
                private zza() {
                    super(zze.zzhqi);
                }

                /* synthetic */ zza(C7355xx c7355xx) {
                    this();
                }
            }

            /* renamed from: com.google.android.gms.internal.ads.zzdrz$zzb$zze$zzb, reason: collision with other inner class name */
            public static final class C11486zzb extends zzdob<C11486zzb, zza> implements zzdpm {
                private static volatile zzdpv<C11486zzb> zzdv;
                private static final C11486zzb zzhql;
                private int zzdj;
                private zzdmr zzhqe;
                private int zzhqj;
                private zzdmr zzhqk;

                /* renamed from: com.google.android.gms.internal.ads.zzdrz$zzb$zze$zzb$zza */
                public static final class zza extends zzdob.zza<C11486zzb, zza> implements zzdpm {
                    private zza() {
                        super(C11486zzb.zzhql);
                    }

                    /* synthetic */ zza(C7355xx c7355xx) {
                        this();
                    }
                }

                static {
                    C11486zzb c11486zzb = new C11486zzb();
                    zzhql = c11486zzb;
                    zzdob.m19721t(C11486zzb.class, c11486zzb);
                }

                private C11486zzb() {
                    zzdmr zzdmrVar = zzdmr.f25661f;
                    this.zzhqk = zzdmrVar;
                    this.zzhqe = zzdmrVar;
                }

                @Override // com.google.android.gms.internal.ads.zzdob
                /* renamed from: q */
                protected final Object mo17725q(int i2, Object obj, Object obj2) {
                    C7355xx c7355xx = null;
                    switch (C7355xx.f20986a[i2 - 1]) {
                        case 1:
                            return new C11486zzb();
                        case 2:
                            return new zza(c7355xx);
                        case 3:
                            return zzdob.m19719r(zzhql, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\n\u0001\u0003\n\u0002", new Object[]{"zzdj", "zzhqj", "zzhqk", "zzhqe"});
                        case 4:
                            return zzhql;
                        case 5:
                            zzdpv<C11486zzb> zzbVar = zzdv;
                            if (zzbVar == null) {
                                synchronized (C11486zzb.class) {
                                    zzbVar = zzdv;
                                    if (zzbVar == null) {
                                        zzbVar = new zzdob.zzb<>(zzhql);
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

            static {
                zze zzeVar = new zze();
                zzhqi = zzeVar;
                zzdob.m19721t(zze.class, zzeVar);
            }

            private zze() {
                zzdmr zzdmrVar = zzdmr.f25661f;
                this.zzhpy = zzdmrVar;
                this.zzhpz = zzdmrVar;
                this.zzhqh = zzdmrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdob
            /* renamed from: q */
            protected final Object mo17725q(int i2, Object obj, Object obj2) {
                C7355xx c7355xx = null;
                switch (C7355xx.f20986a[i2 - 1]) {
                    case 1:
                        return new zze();
                    case 2:
                        return new zza(c7355xx);
                    case 3:
                        return zzdob.m19719r(zzhqi, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001\t\u0000\u0002Л\u0003\n\u0001\u0004\n\u0002\u0005\u0004\u0003\u0006\n\u0004", new Object[]{"zzdj", "zzhqg", "zzhpx", zzc.class, "zzhpy", "zzhpz", "zzhqa", "zzhqh"});
                    case 4:
                        return zzhqi;
                    case 5:
                        zzdpv<zze> zzbVar = zzdv;
                        if (zzbVar == null) {
                            synchronized (zze.class) {
                                zzbVar = zzdv;
                                if (zzbVar == null) {
                                    zzbVar = new zzdob.zzb<>(zzhqi);
                                    zzdv = zzbVar;
                                }
                            }
                        }
                        return zzbVar;
                    case 6:
                        return Byte.valueOf(this.zzhop);
                    case 7:
                        this.zzhop = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class zzf extends zzdob<zzf, zza> implements zzdpm {
            private static volatile zzdpv<zzf> zzdv;
            private static final zzf zzhqo;
            private int zzbzi;
            private int zzdj;
            private String zzhqm = HttpUrl.FRAGMENT_ENCODE_SET;
            private zzdmr zzhqn = zzdmr.f25661f;

            public static final class zza extends zzdob.zza<zzf, zza> implements zzdpm {
                private zza() {
                    super(zzf.zzhqo);
                }

                /* synthetic */ zza(C7355xx c7355xx) {
                    this();
                }
            }

            /* renamed from: com.google.android.gms.internal.ads.zzdrz$zzb$zzf$zzb, reason: collision with other inner class name */
            public enum EnumC11487zzb implements zzdoe {
                TYPE_UNKNOWN(0),
                TYPE_CREATIVE(1);


                /* renamed from: h */
                private static final zzdof<EnumC11487zzb> f25873h = new C6505ay();

                /* renamed from: j */
                private final int f25875j;

                EnumC11487zzb(int i2) {
                    this.f25875j = i2;
                }

                /* renamed from: g */
                public static zzdog m19841g() {
                    return C6542by.f18370a;
                }

                /* renamed from: k */
                public static EnumC11487zzb m19842k(int i2) {
                    if (i2 == 0) {
                        return TYPE_UNKNOWN;
                    }
                    if (i2 != 1) {
                        return null;
                    }
                    return TYPE_CREATIVE;
                }

                @Override // com.google.android.gms.internal.ads.zzdoe
                /* renamed from: i */
                public final int mo17879i() {
                    return this.f25875j;
                }
            }

            static {
                zzf zzfVar = new zzf();
                zzhqo = zzfVar;
                zzdob.m19721t(zzf.class, zzfVar);
            }

            private zzf() {
            }

            @Override // com.google.android.gms.internal.ads.zzdob
            /* renamed from: q */
            protected final Object mo17725q(int i2, Object obj, Object obj2) {
                C7355xx c7355xx = null;
                switch (C7355xx.f20986a[i2 - 1]) {
                    case 1:
                        return new zzf();
                    case 2:
                        return new zza(c7355xx);
                    case 3:
                        return zzdob.m19719r(zzhqo, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\n\u0002", new Object[]{"zzdj", "zzbzi", EnumC11487zzb.m19841g(), "zzhqm", "zzhqn"});
                    case 4:
                        return zzhqo;
                    case 5:
                        zzdpv<zzf> zzbVar = zzdv;
                        if (zzbVar == null) {
                            synchronized (zzf.class) {
                                zzbVar = zzdv;
                                if (zzbVar == null) {
                                    zzbVar = new zzdob.zzb<>(zzhqo);
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

        public enum zzg implements zzdoe {
            UNKNOWN(0),
            URL_PHISHING(1),
            URL_MALWARE(2),
            URL_UNWANTED(3),
            CLIENT_SIDE_PHISHING_URL(4),
            CLIENT_SIDE_MALWARE_URL(5),
            DANGEROUS_DOWNLOAD_RECOVERY(6),
            DANGEROUS_DOWNLOAD_WARNING(7),
            OCTAGON_AD(8),
            OCTAGON_AD_SB_MATCH(9);


            /* renamed from: p */
            private static final zzdof<zzg> f25886p = new C6579cy();

            /* renamed from: r */
            private final int f25888r;

            zzg(int i2) {
                this.f25888r = i2;
            }

            /* renamed from: g */
            public static zzdog m19843g() {
                return C6616dy.f18706a;
            }

            /* renamed from: k */
            public static zzg m19844k(int i2) {
                switch (i2) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return URL_PHISHING;
                    case 2:
                        return URL_MALWARE;
                    case 3:
                        return URL_UNWANTED;
                    case 4:
                        return CLIENT_SIDE_PHISHING_URL;
                    case 5:
                        return CLIENT_SIDE_MALWARE_URL;
                    case 6:
                        return DANGEROUS_DOWNLOAD_RECOVERY;
                    case 7:
                        return DANGEROUS_DOWNLOAD_WARNING;
                    case 8:
                        return OCTAGON_AD;
                    case 9:
                        return OCTAGON_AD_SB_MATCH;
                    default:
                        return null;
                }
            }

            @Override // com.google.android.gms.internal.ads.zzdoe
            /* renamed from: i */
            public final int mo17879i() {
                return this.f25888r;
            }
        }

        public static final class zzh extends zzdob<zzh, C11488zzb> implements zzdpm {
            private static volatile zzdpv<zzh> zzdv;
            private static final zzh zzhrl;
            private int zzdj;
            private int zzhrd;
            private zzd zzhre;
            private zze zzhrf;
            private int zzhrg;
            private int zzhrj;
            private byte zzhop = 2;
            private String zzhos = HttpUrl.FRAGMENT_ENCODE_SET;
            private zzdoh zzhrh = zzdob.m19722u();
            private String zzhri = HttpUrl.FRAGMENT_ENCODE_SET;
            private zzdoj<String> zzhrk = zzdob.m19723v();

            public enum zza implements zzdoe {
                AD_RESOURCE_UNKNOWN(0),
                AD_RESOURCE_CREATIVE(1),
                AD_RESOURCE_POST_CLICK(2),
                AD_RESOURCE_AUTO_CLICK_DESTINATION(3);


                /* renamed from: j */
                private static final zzdof<zza> f25893j = new C6653ey();

                /* renamed from: l */
                private final int f25895l;

                zza(int i2) {
                    this.f25895l = i2;
                }

                /* renamed from: g */
                public static zzdog m19846g() {
                    return C6690fy.f18920a;
                }

                /* renamed from: k */
                public static zza m19847k(int i2) {
                    if (i2 == 0) {
                        return AD_RESOURCE_UNKNOWN;
                    }
                    if (i2 == 1) {
                        return AD_RESOURCE_CREATIVE;
                    }
                    if (i2 == 2) {
                        return AD_RESOURCE_POST_CLICK;
                    }
                    if (i2 != 3) {
                        return null;
                    }
                    return AD_RESOURCE_AUTO_CLICK_DESTINATION;
                }

                @Override // com.google.android.gms.internal.ads.zzdoe
                /* renamed from: i */
                public final int mo17879i() {
                    return this.f25895l;
                }
            }

            /* renamed from: com.google.android.gms.internal.ads.zzdrz$zzb$zzh$zzb, reason: collision with other inner class name */
            public static final class C11488zzb extends zzdob.zza<zzh, C11488zzb> implements zzdpm {
                private C11488zzb() {
                    super(zzh.zzhrl);
                }

                /* synthetic */ C11488zzb(C7355xx c7355xx) {
                    this();
                }
            }

            static {
                zzh zzhVar = new zzh();
                zzhrl = zzhVar;
                zzdob.m19721t(zzh.class, zzhVar);
            }

            private zzh() {
            }

            @Override // com.google.android.gms.internal.ads.zzdob
            /* renamed from: q */
            protected final Object mo17725q(int i2, Object obj, Object obj2) {
                C7355xx c7355xx = null;
                switch (C7355xx.f20986a[i2 - 1]) {
                    case 1:
                        return new zzh();
                    case 2:
                        return new C11488zzb(c7355xx);
                    case 3:
                        return zzdob.m19719r(zzhrl, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001Ԅ\u0000\u0002\b\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005\u0004\u0004\u0006\u0016\u0007\b\u0005\b\f\u0006\t\u001a", new Object[]{"zzdj", "zzhrd", "zzhos", "zzhre", "zzhrf", "zzhrg", "zzhrh", "zzhri", "zzhrj", zza.m19846g(), "zzhrk"});
                    case 4:
                        return zzhrl;
                    case 5:
                        zzdpv<zzh> zzbVar = zzdv;
                        if (zzbVar == null) {
                            synchronized (zzh.class) {
                                zzbVar = zzdv;
                                if (zzbVar == null) {
                                    zzbVar = new zzdob.zzb<>(zzhrl);
                                    zzdv = zzbVar;
                                }
                            }
                        }
                        return zzbVar;
                    case 6:
                        return Byte.valueOf(this.zzhop);
                    case 7:
                        this.zzhop = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class zzi extends zzdob<zzi, zza> implements zzdpm {
            private static volatile zzdpv<zzi> zzdv;
            private static final zzi zzhru;
            private int zzdj;
            private String zzhrr = HttpUrl.FRAGMENT_ENCODE_SET;
            private long zzhrs;
            private boolean zzhrt;

            public static final class zza extends zzdob.zza<zzi, zza> implements zzdpm {
                private zza() {
                    super(zzi.zzhru);
                }

                /* synthetic */ zza(C7355xx c7355xx) {
                    this();
                }
            }

            static {
                zzi zziVar = new zzi();
                zzhru = zziVar;
                zzdob.m19721t(zzi.class, zziVar);
            }

            private zzi() {
            }

            @Override // com.google.android.gms.internal.ads.zzdob
            /* renamed from: q */
            protected final Object mo17725q(int i2, Object obj, Object obj2) {
                C7355xx c7355xx = null;
                switch (C7355xx.f20986a[i2 - 1]) {
                    case 1:
                        return new zzi();
                    case 2:
                        return new zza(c7355xx);
                    case 3:
                        return zzdob.m19719r(zzhru, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\u0007\u0002", new Object[]{"zzdj", "zzhrr", "zzhrs", "zzhrt"});
                    case 4:
                        return zzhru;
                    case 5:
                        zzdpv<zzi> zzbVar = zzdv;
                        if (zzbVar == null) {
                            synchronized (zzi.class) {
                                zzbVar = zzdv;
                                if (zzbVar == null) {
                                    zzbVar = new zzdob.zzb<>(zzhru);
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

        static {
            zzb zzbVar = new zzb();
            zzhpr = zzbVar;
            zzdob.m19721t(zzb.class, zzbVar);
        }

        private zzb() {
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            C7355xx c7355xx = null;
            switch (C7355xx.f20986a[i2 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(c7355xx);
                case 3:
                    return zzdob.m19719r(zzhpr, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0004\u0001\u0001\b\u0002\u0002\b\u0003\u0003\b\u0004\u0004Л\u0005\u0007\b\u0006\u001a\u0007\b\t\b\u0007\n\t\u0007\u000b\n\f\u0000\u000b\f\u0001\f\t\u0005\r\b\u0006\u000e\t\u0007\u000f\n\f\u0011\t\r\u0014\u001a\u0015\u001a", new Object[]{"zzdj", "zzhos", "zzhpd", "zzhpe", "zzhpg", zzh.class, "zzhpj", "zzhpk", "zzhpl", "zzhpm", "zzhpn", "zzbzi", zzg.m19843g(), "zzhpc", zza.zzc.m19831g(), "zzhpf", "zzhph", "zzhpi", "zzhol", "zzhpo", "zzhpp", "zzhpq"});
                case 4:
                    return zzhpr;
                case 5:
                    zzdpv<zzb> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzb.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzhpr);
                                zzdv = zzbVar;
                            }
                        }
                    }
                    return zzbVar;
                case 6:
                    return Byte.valueOf(this.zzhop);
                case 7:
                    this.zzhop = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}
