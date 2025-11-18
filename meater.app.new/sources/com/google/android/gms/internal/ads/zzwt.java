package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzdob;
import java.util.Iterator;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzwt {

    public static final class zza extends zzdob<zza, zzb> implements zzdpm {
        private static final zza zzbzk;
        private static volatile zzdpv<zza> zzdv;
        private int zzbzi;
        private zzl zzbzj;
        private int zzdj;

        /* renamed from: com.google.android.gms.internal.ads.zzwt$zza$zza, reason: collision with other inner class name */
        public enum EnumC11490zza implements zzdoe {
            AD_FORMAT_TYPE_UNSPECIFIED(0),
            BANNER(1),
            INTERSTITIAL(2),
            NATIVE_EXPRESS(3),
            NATIVE_CONTENT(4),
            NATIVE_APP_INSTALL(5),
            NATIVE_CUSTOM_TEMPLATE(6),
            DFP_BANNER(7),
            DFP_INTERSTITIAL(8),
            REWARD_BASED_VIDEO_AD(9),
            BANNER_SEARCH_ADS(10);


            /* renamed from: q */
            private static final zzdof<EnumC11490zza> f27303q = new k50();

            /* renamed from: s */
            private final int f27305s;

            EnumC11490zza(int i2) {
                this.f27305s = i2;
            }

            /* renamed from: g */
            public static zzdog m20705g() {
                return l50.f19751a;
            }

            /* renamed from: k */
            public static EnumC11490zza m20706k(int i2) {
                switch (i2) {
                    case 0:
                        return AD_FORMAT_TYPE_UNSPECIFIED;
                    case 1:
                        return BANNER;
                    case 2:
                        return INTERSTITIAL;
                    case 3:
                        return NATIVE_EXPRESS;
                    case 4:
                        return NATIVE_CONTENT;
                    case 5:
                        return NATIVE_APP_INSTALL;
                    case 6:
                        return NATIVE_CUSTOM_TEMPLATE;
                    case 7:
                        return DFP_BANNER;
                    case 8:
                        return DFP_INTERSTITIAL;
                    case 9:
                        return REWARD_BASED_VIDEO_AD;
                    case 10:
                        return BANNER_SEARCH_ADS;
                    default:
                        return null;
                }
            }

            @Override // com.google.android.gms.internal.ads.zzdoe
            /* renamed from: i */
            public final int mo17879i() {
                return this.f27305s;
            }
        }

        public static final class zzb extends zzdob.zza<zza, zzb> implements zzdpm {
            private zzb() {
                super(zza.zzbzk);
            }

            /* synthetic */ zzb(j50 j50Var) {
                this();
            }
        }

        static {
            zza zzaVar = new zza();
            zzbzk = zzaVar;
            zzdob.m19721t(zza.class, zzaVar);
        }

        private zza() {
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            j50 j50Var = null;
            switch (j50.f19460a[i2 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new zzb(j50Var);
                case 3:
                    return zzdob.m19719r(zzbzk, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001", new Object[]{"zzdj", "zzbzi", EnumC11490zza.m20705g(), "zzbzj"});
                case 4:
                    return zzbzk;
                case 5:
                    zzdpv<zza> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zza.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzbzk);
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

    public static final class zzb extends zzdob<zzb, zza> implements zzdpm {
        private static final zzb zzcaa;
        private static volatile zzdpv<zzb> zzdv;
        private String zzbzx = HttpUrl.FRAGMENT_ENCODE_SET;
        private zzdoj<zza> zzbzy = zzdob.m19723v();
        private int zzbzz;
        private int zzdj;

        public static final class zza extends zzdob.zza<zzb, zza> implements zzdpm {
            private zza() {
                super(zzb.zzcaa);
            }

            /* synthetic */ zza(j50 j50Var) {
                this();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzcaa = zzbVar;
            zzdob.m19721t(zzb.class, zzbVar);
        }

        private zzb() {
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            j50 j50Var = null;
            switch (j50.f19460a[i2 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(j50Var);
                case 3:
                    return zzdob.m19719r(zzcaa, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\b\u0000\u0002\u001b\u0003\f\u0001", new Object[]{"zzdj", "zzbzx", "zzbzy", zza.class, "zzbzz", zzwx.m20810g()});
                case 4:
                    return zzcaa;
                case 5:
                    zzdpv<zzb> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzb.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzcaa);
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
        private static final zzc zzcah;
        private static volatile zzdpv<zzc> zzdv;
        private int zzcab;
        private zzn zzcac;
        private zzn zzcad;
        private zzn zzcae;
        private zzdoj<zzn> zzcaf = zzdob.m19723v();
        private int zzcag;
        private int zzdj;

        public static final class zza extends zzdob.zza<zzc, zza> implements zzdpm {
            private zza() {
                super(zzc.zzcah);
            }

            /* synthetic */ zza(j50 j50Var) {
                this();
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzcah = zzcVar;
            zzdob.m19721t(zzc.class, zzcVar);
        }

        private zzc() {
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            j50 j50Var = null;
            switch (j50.f19460a[i2 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(j50Var);
                case 3:
                    return zzdob.m19719r(zzcah, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0004\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\u001b\u0006\u0004\u0004", new Object[]{"zzdj", "zzcab", "zzcac", "zzcad", "zzcae", "zzcaf", zzn.class, "zzcag"});
                case 4:
                    return zzcah;
                case 5:
                    zzdpv<zzc> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzc.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzcah);
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

    public static final class zzd extends zzdob<zzd, zza> implements zzdpm {
        private static final zzd zzcaq;
        private static volatile zzdpv<zzd> zzdv;
        private int zzcan;
        private zzn zzcap;
        private int zzdj;
        private String zzcam = HttpUrl.FRAGMENT_ENCODE_SET;
        private zzdoh zzcao = zzdob.m19722u();

        public static final class zza extends zzdob.zza<zzd, zza> implements zzdpm {
            private zza() {
                super(zzd.zzcaq);
            }

            /* synthetic */ zza(j50 j50Var) {
                this();
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzcaq = zzdVar;
            zzdob.m19721t(zzd.class, zzdVar);
        }

        private zzd() {
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            j50 j50Var = null;
            switch (j50.f19460a[i2 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(j50Var);
                case 3:
                    return zzdob.m19719r(zzcaq, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\b\u0000\u0002\f\u0001\u0003\u0016\u0004\t\u0002", new Object[]{"zzdj", "zzcam", "zzcan", zzwx.m20810g(), "zzcao", "zzcap"});
                case 4:
                    return zzcaq;
                case 5:
                    zzdpv<zzd> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzd.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzcaq);
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

    public static final class zze extends zzdob<zze, zza> implements zzdpm {
        private static final zze zzcas;
        private static volatile zzdpv<zze> zzdv;
        private zzdoh zzcao = zzdob.m19722u();
        private int zzcar;
        private int zzdj;

        public static final class zza extends zzdob.zza<zze, zza> implements zzdpm {
            private zza() {
                super(zze.zzcas);
            }

            /* synthetic */ zza(j50 j50Var) {
                this();
            }
        }

        static {
            zze zzeVar = new zze();
            zzcas = zzeVar;
            zzdob.m19721t(zze.class, zzeVar);
        }

        private zze() {
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            j50 j50Var = null;
            switch (j50.f19460a[i2 - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(j50Var);
                case 3:
                    return zzdob.m19719r(zzcas, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u0016", new Object[]{"zzdj", "zzcar", zzwx.m20810g(), "zzcao"});
                case 4:
                    return zzcas;
                case 5:
                    zzdpv<zze> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zze.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzcas);
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

    public static final class zzf extends zzdob<zzf, zza> implements zzdpm {
        private static final zzf zzcav;
        private static volatile zzdpv<zzf> zzdv;
        private zzn zzcap;
        private int zzcar;
        private zzd zzcat;
        private zzdoj<zzm> zzcau = zzdob.m19723v();
        private int zzdj;

        public static final class zza extends zzdob.zza<zzf, zza> implements zzdpm {
            private zza() {
                super(zzf.zzcav);
            }

            /* synthetic */ zza(j50 j50Var) {
                this();
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzcav = zzfVar;
            zzdob.m19721t(zzf.class, zzfVar);
        }

        private zzf() {
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            j50 j50Var = null;
            switch (j50.f19460a[i2 - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza(j50Var);
                case 3:
                    return zzdob.m19719r(zzcav, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0000\u0002\u001b\u0003\f\u0001\u0004\t\u0002", new Object[]{"zzdj", "zzcat", "zzcau", zzm.class, "zzcar", zzwx.m20810g(), "zzcap"});
                case 4:
                    return zzcav;
                case 5:
                    zzdpv<zzf> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzf.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzcav);
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

    public static final class zzg extends zzdob<zzg, zza> implements zzdpm {
        private static final zzg zzcax;
        private static volatile zzdpv<zzg> zzdv;
        private int zzbzi;
        private int zzcaw;
        private int zzdj;

        public static final class zza extends zzdob.zza<zzg, zza> implements zzdpm {
            private zza() {
                super(zzg.zzcax);
            }

            /* renamed from: u */
            public final zza m20718u(zzb zzbVar) {
                m19735p();
                ((zzg) this.f25755g).m20715x(zzbVar);
                return this;
            }

            /* renamed from: v */
            public final zza m20719v(zzc zzcVar) {
                m19735p();
                ((zzg) this.f25755g).m20716y(zzcVar);
                return this;
            }

            /* synthetic */ zza(j50 j50Var) {
                this();
            }
        }

        public enum zzb implements zzdoe {
            CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
            TWO_G(1),
            THREE_G(2),
            LTE(4);


            /* renamed from: j */
            private static final zzdof<zzb> f27310j = new o50();

            /* renamed from: l */
            private final int f27312l;

            zzb(int i2) {
                this.f27312l = i2;
            }

            /* renamed from: g */
            public static zzdog m20720g() {
                return p50.f20280a;
            }

            /* renamed from: k */
            public static zzb m20721k(int i2) {
                if (i2 == 0) {
                    return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                }
                if (i2 == 1) {
                    return TWO_G;
                }
                if (i2 == 2) {
                    return THREE_G;
                }
                if (i2 != 4) {
                    return null;
                }
                return LTE;
            }

            @Override // com.google.android.gms.internal.ads.zzdoe
            /* renamed from: i */
            public final int mo17879i() {
                return this.f27312l;
            }
        }

        public enum zzc implements zzdoe {
            NETWORKTYPE_UNSPECIFIED(0),
            CELL(1),
            WIFI(2);


            /* renamed from: i */
            private static final zzdof<zzc> f27316i = new q50();

            /* renamed from: k */
            private final int f27318k;

            zzc(int i2) {
                this.f27318k = i2;
            }

            /* renamed from: g */
            public static zzdog m20722g() {
                return r50.f20436a;
            }

            /* renamed from: k */
            public static zzc m20723k(int i2) {
                if (i2 == 0) {
                    return NETWORKTYPE_UNSPECIFIED;
                }
                if (i2 == 1) {
                    return CELL;
                }
                if (i2 != 2) {
                    return null;
                }
                return WIFI;
            }

            @Override // com.google.android.gms.internal.ads.zzdoe
            /* renamed from: i */
            public final int mo17879i() {
                return this.f27318k;
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzcax = zzgVar;
            zzdob.m19721t(zzg.class, zzgVar);
        }

        private zzg() {
        }

        /* renamed from: B */
        public static zza m20713B() {
            return (zza) ((zzdob.zza) zzcax.mo17725q(zzdob.zze.f25762e, null, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x */
        public final void m20715x(zzb zzbVar) {
            zzbVar.getClass();
            this.zzdj |= 2;
            this.zzcaw = zzbVar.mo17879i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public final void m20716y(zzc zzcVar) {
            zzcVar.getClass();
            this.zzdj |= 1;
            this.zzbzi = zzcVar.mo17879i();
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            j50 j50Var = null;
            switch (j50.f19460a[i2 - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza(j50Var);
                case 3:
                    return zzdob.m19719r(zzcax, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001", new Object[]{"zzdj", "zzbzi", zzc.m20722g(), "zzcaw", zzb.m20720g()});
                case 4:
                    return zzcax;
                case 5:
                    zzdpv<zzg> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzg.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzcax);
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

    public static final class zzh extends zzdob<zzh, zza> implements zzdpm {
        private static final zzh zzcbj;
        private static volatile zzdpv<zzh> zzdv;
        private int zzcbh;
        private zzn zzcbi;
        private int zzdj;

        public static final class zza extends zzdob.zza<zzh, zza> implements zzdpm {
            private zza() {
                super(zzh.zzcbj);
            }

            /* synthetic */ zza(j50 j50Var) {
                this();
            }
        }

        static {
            zzh zzhVar = new zzh();
            zzcbj = zzhVar;
            zzdob.m19721t(zzh.class, zzhVar);
        }

        private zzh() {
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            j50 j50Var = null;
            switch (j50.f19460a[i2 - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza(j50Var);
                case 3:
                    return zzdob.m19719r(zzcbj, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001", new Object[]{"zzdj", "zzcbh", zzwx.m20810g(), "zzcbi"});
                case 4:
                    return zzcbj;
                case 5:
                    zzdpv<zzh> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzh.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzcbj);
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

    public static final class zzi extends zzdob<zzi, zzb> implements zzdpm {
        private static final zzi zzcbq;
        private static volatile zzdpv<zzi> zzdv;
        private int zzcbl;
        private int zzcbm;
        private long zzcbn;
        private long zzcbp;
        private int zzdj;
        private zzdoj<zza> zzcbk = zzdob.m19723v();
        private String zzdk = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzcbo = HttpUrl.FRAGMENT_ENCODE_SET;

        public static final class zza extends zzdob<zza, C11491zza> implements zzdpm {
            private static final zzdoi<Integer, zza.EnumC11490zza> zzcbw = new s50();
            private static final zza zzcce;
            private static volatile zzdpv<zza> zzdv;
            private long zzcbr;
            private int zzcbs;
            private long zzcbt;
            private long zzcbu;
            private zzdoh zzcbv = zzdob.m19722u();
            private zzg zzcbx;
            private int zzcby;
            private int zzcbz;
            private int zzcca;
            private int zzccb;
            private int zzccc;
            private int zzccd;
            private int zzdj;

            /* renamed from: com.google.android.gms.internal.ads.zzwt$zzi$zza$zza, reason: collision with other inner class name */
            public static final class C11491zza extends zzdob.zza<zza, C11491zza> implements zzdpm {
                private C11491zza() {
                    super(zza.zzcce);
                }

                /* renamed from: A */
                public final C11491zza m20766A(int i2) {
                    m19735p();
                    ((zza) this.f25755g).m20753O(i2);
                    return this;
                }

                /* renamed from: B */
                public final C11491zza m20767B(long j2) {
                    m19735p();
                    ((zza) this.f25755g).m20763x(j2);
                    return this;
                }

                /* renamed from: C */
                public final C11491zza m20768C(long j2) {
                    m19735p();
                    ((zza) this.f25755g).m20758T(j2);
                    return this;
                }

                /* renamed from: D */
                public final C11491zza m20769D(long j2) {
                    m19735p();
                    ((zza) this.f25755g).m20759U(j2);
                    return this;
                }

                /* renamed from: E */
                public final C11491zza m20770E(zzwx zzwxVar) {
                    m19735p();
                    ((zza) this.f25755g).m20745G(zzwxVar);
                    return this;
                }

                /* renamed from: F */
                public final C11491zza m20771F(zzwx zzwxVar) {
                    m19735p();
                    ((zza) this.f25755g).m20748J(zzwxVar);
                    return this;
                }

                /* renamed from: G */
                public final C11491zza m20772G(zzwx zzwxVar) {
                    m19735p();
                    ((zza) this.f25755g).m20752N(zzwxVar);
                    return this;
                }

                /* renamed from: H */
                public final C11491zza m20773H(zzwx zzwxVar) {
                    m19735p();
                    ((zza) this.f25755g).m20755Q(zzwxVar);
                    return this;
                }

                /* renamed from: I */
                public final C11491zza m20774I(zzwx zzwxVar) {
                    m19735p();
                    ((zza) this.f25755g).m20757S(zzwxVar);
                    return this;
                }

                /* renamed from: u */
                public final C11491zza m20775u(zzg zzgVar) {
                    m19735p();
                    ((zza) this.f25755g).m20764y(zzgVar);
                    return this;
                }

                /* renamed from: v */
                public final C11491zza m20776v(zzc zzcVar) {
                    m19735p();
                    ((zza) this.f25755g).m20744F(zzcVar);
                    return this;
                }

                /* renamed from: w */
                public final C11491zza m20777w(Iterable<? extends zza.EnumC11490zza> iterable) {
                    m19735p();
                    ((zza) this.f25755g).m20749K(iterable);
                    return this;
                }

                /* synthetic */ C11491zza(j50 j50Var) {
                    this();
                }
            }

            static {
                zza zzaVar = new zza();
                zzcce = zzaVar;
                zzdob.m19721t(zza.class, zzaVar);
            }

            private zza() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: F */
            public final void m20744F(zzc zzcVar) {
                zzcVar.getClass();
                this.zzdj |= 1024;
                this.zzccd = zzcVar.mo17879i();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: G */
            public final void m20745G(zzwx zzwxVar) {
                zzwxVar.getClass();
                this.zzdj |= 2;
                this.zzcbs = zzwxVar.mo17879i();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: J */
            public final void m20748J(zzwx zzwxVar) {
                zzwxVar.getClass();
                this.zzdj |= 32;
                this.zzcby = zzwxVar.mo17879i();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: K */
            public final void m20749K(Iterable<? extends zza.EnumC11490zza> iterable) {
                if (!this.zzcbv.mo16107m0()) {
                    zzdoh zzdohVar = this.zzcbv;
                    int size = zzdohVar.size();
                    this.zzcbv = zzdohVar.mo14989N(size == 0 ? 10 : size << 1);
                }
                Iterator<? extends zza.EnumC11490zza> it = iterable.iterator();
                while (it.hasNext()) {
                    this.zzcbv.mo15174Z0(it.next().mo17879i());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: N */
            public final void m20752N(zzwx zzwxVar) {
                zzwxVar.getClass();
                this.zzdj |= 64;
                this.zzcbz = zzwxVar.mo17879i();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: O */
            public final void m20753O(int i2) {
                this.zzdj |= 256;
                this.zzccb = i2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: Q */
            public final void m20755Q(zzwx zzwxVar) {
                zzwxVar.getClass();
                this.zzdj |= 128;
                this.zzcca = zzwxVar.mo17879i();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: S */
            public final void m20757S(zzwx zzwxVar) {
                zzwxVar.getClass();
                this.zzdj |= AdRequest.MAX_CONTENT_URL_LENGTH;
                this.zzccc = zzwxVar.mo17879i();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: T */
            public final void m20758T(long j2) {
                this.zzdj |= 4;
                this.zzcbt = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: U */
            public final void m20759U(long j2) {
                this.zzdj |= 8;
                this.zzcbu = j2;
            }

            /* renamed from: V */
            public static zza m20760V(byte[] bArr) throws zzdok {
                return (zza) zzdob.m19716n(zzcce, bArr);
            }

            /* renamed from: W */
            public static C11491zza m20761W() {
                return (C11491zza) ((zzdob.zza) zzcce.mo17725q(zzdob.zze.f25762e, null, null));
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: x */
            public final void m20763x(long j2) {
                this.zzdj |= 1;
                this.zzcbr = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: y */
            public final void m20764y(zzg zzgVar) {
                zzgVar.getClass();
                this.zzcbx = zzgVar;
                this.zzdj |= 16;
            }

            @Override // com.google.android.gms.internal.ads.zzdob
            /* renamed from: q */
            protected final Object mo17725q(int i2, Object obj, Object obj2) {
                j50 j50Var = null;
                switch (j50.f19460a[i2 - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C11491zza(j50Var);
                    case 3:
                        return zzdob.m19719r(zzcce, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001\u0002\u0000\u0002\f\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u001e\u0006\t\u0004\u0007\f\u0005\b\f\u0006\t\f\u0007\n\u0004\b\u000b\f\t\f\f\n", new Object[]{"zzdj", "zzcbr", "zzcbs", zzwx.m20810g(), "zzcbt", "zzcbu", "zzcbv", zza.EnumC11490zza.m20705g(), "zzcbx", "zzcby", zzwx.m20810g(), "zzcbz", zzwx.m20810g(), "zzcca", zzwx.m20810g(), "zzccb", "zzccc", zzwx.m20810g(), "zzccd", zzc.m20784g()});
                    case 4:
                        return zzcce;
                    case 5:
                        zzdpv<zza> zzbVar = zzdv;
                        if (zzbVar == null) {
                            synchronized (zza.class) {
                                zzbVar = zzdv;
                                if (zzbVar == null) {
                                    zzbVar = new zzdob.zzb<>(zzcce);
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

        public static final class zzb extends zzdob.zza<zzi, zzb> implements zzdpm {
            private zzb() {
                super(zzi.zzcbq);
            }

            /* renamed from: A */
            public final zzb m20778A(int i2) {
                m19735p();
                ((zzi) this.f25755g).m20731G(i2);
                return this;
            }

            /* renamed from: B */
            public final zzb m20779B(Iterable<? extends zza> iterable) {
                m19735p();
                ((zzi) this.f25755g).m20726B(iterable);
                return this;
            }

            /* renamed from: C */
            public final zzb m20780C(long j2) {
                m19735p();
                ((zzi) this.f25755g).m20732H(j2);
                return this;
            }

            /* renamed from: u */
            public final zzb m20781u(String str) {
                m19735p();
                ((zzi) this.f25755g).m20733I(str);
                return this;
            }

            /* renamed from: v */
            public final zzb m20782v(String str) {
                m19735p();
                ((zzi) this.f25755g).m20729E(str);
                return this;
            }

            /* renamed from: w */
            public final zzb m20783w(int i2) {
                m19735p();
                ((zzi) this.f25755g).m20730F(i2);
                return this;
            }

            /* synthetic */ zzb(j50 j50Var) {
                this();
            }
        }

        public enum zzc implements zzdoe {
            UNSPECIFIED(0),
            CONNECTING(1),
            CONNECTED(2),
            DISCONNECTING(3),
            DISCONNECTED(4),
            SUSPENDED(5);


            /* renamed from: l */
            private static final zzdof<zzc> f27325l = new t50();

            /* renamed from: n */
            private final int f27327n;

            zzc(int i2) {
                this.f27327n = i2;
            }

            /* renamed from: g */
            public static zzdog m20784g() {
                return u50.f20618a;
            }

            /* renamed from: k */
            public static zzc m20785k(int i2) {
                if (i2 == 0) {
                    return UNSPECIFIED;
                }
                if (i2 == 1) {
                    return CONNECTING;
                }
                if (i2 == 2) {
                    return CONNECTED;
                }
                if (i2 == 3) {
                    return DISCONNECTING;
                }
                if (i2 == 4) {
                    return DISCONNECTED;
                }
                if (i2 != 5) {
                    return null;
                }
                return SUSPENDED;
            }

            @Override // com.google.android.gms.internal.ads.zzdoe
            /* renamed from: i */
            public final int mo17879i() {
                return this.f27327n;
            }
        }

        static {
            zzi zziVar = new zzi();
            zzcbq = zziVar;
            zzdob.m19721t(zzi.class, zziVar);
        }

        private zzi() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: B */
        public final void m20726B(Iterable<? extends zza> iterable) {
            if (!this.zzcbk.mo16107m0()) {
                zzdoj<zza> zzdojVar = this.zzcbk;
                int size = zzdojVar.size();
                this.zzcbk = zzdojVar.mo14989N(size == 0 ? 10 : size << 1);
            }
            zzdmi.m19584a(iterable, this.zzcbk);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: E */
        public final void m20729E(String str) {
            str.getClass();
            this.zzdj |= 16;
            this.zzcbo = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: F */
        public final void m20730F(int i2) {
            this.zzdj |= 1;
            this.zzcbl = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: G */
        public final void m20731G(int i2) {
            this.zzdj |= 2;
            this.zzcbm = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: H */
        public final void m20732H(long j2) {
            this.zzdj |= 4;
            this.zzcbn = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: I */
        public final void m20733I(String str) {
            str.getClass();
            this.zzdj |= 8;
            this.zzdk = str;
        }

        /* renamed from: J */
        public static zzb m20734J() {
            return (zzb) ((zzdob.zza) zzcbq.mo17725q(zzdob.zze.f25762e, null, null));
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            j50 j50Var = null;
            switch (j50.f19460a[i2 - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zzb(j50Var);
                case 3:
                    return zzdob.m19719r(zzcbq, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002\u0004\u0000\u0003\u0004\u0001\u0004\u0002\u0002\u0005\b\u0003\u0006\b\u0004\u0007\u0002\u0005", new Object[]{"zzdj", "zzcbk", zza.class, "zzcbl", "zzcbm", "zzcbn", "zzdk", "zzcbo", "zzcbp"});
                case 4:
                    return zzcbq;
                case 5:
                    zzdpv<zzi> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzi.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzcbq);
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

    public static final class zzj extends zzdob<zzj, zza> implements zzdpm {
        private static final zzj zzccx;
        private static volatile zzdpv<zzj> zzdv;
        private int zzccm = 1000;
        private int zzccn = 1000;
        private int zzcco;
        private int zzccp;
        private int zzccq;
        private int zzccr;
        private int zzccs;
        private int zzcct;
        private int zzccu;
        private int zzccv;
        private zzk zzccw;
        private int zzdj;

        public static final class zza extends zzdob.zza<zzj, zza> implements zzdpm {
            private zza() {
                super(zzj.zzccx);
            }

            /* synthetic */ zza(j50 j50Var) {
                this();
            }
        }

        static {
            zzj zzjVar = new zzj();
            zzccx = zzjVar;
            zzdob.m19721t(zzj.class, zzjVar);
        }

        private zzj() {
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            j50 j50Var = null;
            switch (j50.f19460a[i2 - 1]) {
                case 1:
                    return new zzj();
                case 2:
                    return new zza(j50Var);
                case 3:
                    return zzdob.m19719r(zzccx, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0004\u0006\b\u0004\u0007\t\u0004\b\n\u0004\t\u000b\t\n", new Object[]{"zzdj", "zzccm", zzwx.m20810g(), "zzccn", zzwx.m20810g(), "zzcco", "zzccp", "zzccq", "zzccr", "zzccs", "zzcct", "zzccu", "zzccv", "zzccw"});
                case 4:
                    return zzccx;
                case 5:
                    zzdpv<zzj> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzj.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzccx);
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

    public static final class zzk extends zzdob<zzk, zza> implements zzdpm {
        private static final zzk zzcda;
        private static volatile zzdpv<zzk> zzdv;
        private int zzccy;
        private int zzccz;
        private int zzdj;

        public static final class zza extends zzdob.zza<zzk, zza> implements zzdpm {
            private zza() {
                super(zzk.zzcda);
            }

            /* synthetic */ zza(j50 j50Var) {
                this();
            }
        }

        static {
            zzk zzkVar = new zzk();
            zzcda = zzkVar;
            zzdob.m19721t(zzk.class, zzkVar);
        }

        private zzk() {
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            j50 j50Var = null;
            switch (j50.f19460a[i2 - 1]) {
                case 1:
                    return new zzk();
                case 2:
                    return new zza(j50Var);
                case 3:
                    return zzdob.m19719r(zzcda, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{"zzdj", "zzccy", "zzccz"});
                case 4:
                    return zzcda;
                case 5:
                    zzdpv<zzk> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzk.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzcda);
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

    public static final class zzl extends zzdob<zzl, zza> implements zzdpm {
        private static final zzl zzcdd;
        private static volatile zzdpv<zzl> zzdv;
        private int zzcdb;
        private int zzcdc;
        private int zzdj;

        public static final class zza extends zzdob.zza<zzl, zza> implements zzdpm {
            private zza() {
                super(zzl.zzcdd);
            }

            /* synthetic */ zza(j50 j50Var) {
                this();
            }
        }

        static {
            zzl zzlVar = new zzl();
            zzcdd = zzlVar;
            zzdob.m19721t(zzl.class, zzlVar);
        }

        private zzl() {
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            j50 j50Var = null;
            switch (j50.f19460a[i2 - 1]) {
                case 1:
                    return new zzl();
                case 2:
                    return new zza(j50Var);
                case 3:
                    return zzdob.m19719r(zzcdd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{"zzdj", "zzcdb", "zzcdc"});
                case 4:
                    return zzcdd;
                case 5:
                    zzdpv<zzl> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzl.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzcdd);
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

    public static final class zzm extends zzdob<zzm, zza> implements zzdpm {
        private static final zzm zzcde;
        private static volatile zzdpv<zzm> zzdv;
        private String zzcam = HttpUrl.FRAGMENT_ENCODE_SET;
        private int zzcan;
        private zzn zzcap;
        private int zzdj;

        public static final class zza extends zzdob.zza<zzm, zza> implements zzdpm {
            private zza() {
                super(zzm.zzcde);
            }

            /* synthetic */ zza(j50 j50Var) {
                this();
            }
        }

        static {
            zzm zzmVar = new zzm();
            zzcde = zzmVar;
            zzdob.m19721t(zzm.class, zzmVar);
        }

        private zzm() {
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            j50 j50Var = null;
            switch (j50.f19460a[i2 - 1]) {
                case 1:
                    return new zzm();
                case 2:
                    return new zza(j50Var);
                case 3:
                    return zzdob.m19719r(zzcde, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\f\u0001\u0003\t\u0002", new Object[]{"zzdj", "zzcam", "zzcan", zzwx.m20810g(), "zzcap"});
                case 4:
                    return zzcde;
                case 5:
                    zzdpv<zzm> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzm.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzcde);
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

    public static final class zzn extends zzdob<zzn, zza> implements zzdpm {
        private static final zzn zzcdh;
        private static volatile zzdpv<zzn> zzdv;
        private int zzcdf;
        private int zzcdg;
        private int zzdj;

        public static final class zza extends zzdob.zza<zzn, zza> implements zzdpm {
            private zza() {
                super(zzn.zzcdh);
            }

            /* synthetic */ zza(j50 j50Var) {
                this();
            }
        }

        static {
            zzn zznVar = new zzn();
            zzcdh = zznVar;
            zzdob.m19721t(zzn.class, zznVar);
        }

        private zzn() {
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            j50 j50Var = null;
            switch (j50.f19460a[i2 - 1]) {
                case 1:
                    return new zzn();
                case 2:
                    return new zza(j50Var);
                case 3:
                    return zzdob.m19719r(zzcdh, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{"zzdj", "zzcdf", "zzcdg"});
                case 4:
                    return zzcdh;
                case 5:
                    zzdpv<zzn> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzn.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzcdh);
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

    public static final class zzo extends zzdob<zzo, zza> implements zzdpm {
        private static final zzo zzcdk;
        private static volatile zzdpv<zzo> zzdv;
        private int zzcar = 1000;
        private zzp zzcdi;
        private zzn zzcdj;
        private int zzdj;

        public static final class zza extends zzdob.zza<zzo, zza> implements zzdpm {
            private zza() {
                super(zzo.zzcdk);
            }

            /* synthetic */ zza(j50 j50Var) {
                this();
            }
        }

        static {
            zzo zzoVar = new zzo();
            zzcdk = zzoVar;
            zzdob.m19721t(zzo.class, zzoVar);
        }

        private zzo() {
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            j50 j50Var = null;
            switch (j50.f19460a[i2 - 1]) {
                case 1:
                    return new zzo();
                case 2:
                    return new zza(j50Var);
                case 3:
                    return zzdob.m19719r(zzcdk, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzdj", "zzcar", zzwx.m20810g(), "zzcdi", "zzcdj"});
                case 4:
                    return zzcdk;
                case 5:
                    zzdpv<zzo> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzo.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzcdk);
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

    public static final class zzp extends zzdob<zzp, zza> implements zzdpm {
        private static final zzp zzcdm;
        private static volatile zzdpv<zzp> zzdv;
        private int zzcdl;
        private int zzdj;

        public static final class zza extends zzdob.zza<zzp, zza> implements zzdpm {
            private zza() {
                super(zzp.zzcdm);
            }

            /* synthetic */ zza(j50 j50Var) {
                this();
            }
        }

        public enum zzb implements zzdoe {
            VIDEO_ERROR_CODE_UNSPECIFIED(0),
            OPENGL_RENDERING_FAILED(1),
            CACHE_LOAD_FAILED(2),
            ANDROID_TARGET_API_TOO_LOW(3);


            /* renamed from: j */
            private static final zzdof<zzb> f27332j = new v50();

            /* renamed from: l */
            private final int f27334l;

            zzb(int i2) {
                this.f27334l = i2;
            }

            /* renamed from: g */
            public static zzdog m20793g() {
                return w50.f20835a;
            }

            /* renamed from: k */
            public static zzb m20794k(int i2) {
                if (i2 == 0) {
                    return VIDEO_ERROR_CODE_UNSPECIFIED;
                }
                if (i2 == 1) {
                    return OPENGL_RENDERING_FAILED;
                }
                if (i2 == 2) {
                    return CACHE_LOAD_FAILED;
                }
                if (i2 != 3) {
                    return null;
                }
                return ANDROID_TARGET_API_TOO_LOW;
            }

            @Override // com.google.android.gms.internal.ads.zzdoe
            /* renamed from: i */
            public final int mo17879i() {
                return this.f27334l;
            }
        }

        static {
            zzp zzpVar = new zzp();
            zzcdm = zzpVar;
            zzdob.m19721t(zzp.class, zzpVar);
        }

        private zzp() {
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            j50 j50Var = null;
            switch (j50.f19460a[i2 - 1]) {
                case 1:
                    return new zzp();
                case 2:
                    return new zza(j50Var);
                case 3:
                    return zzdob.m19719r(zzcdm, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"zzdj", "zzcdl", zzb.m20793g()});
                case 4:
                    return zzcdm;
                case 5:
                    zzdpv<zzp> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzp.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzcdm);
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

    public static final class zzq extends zzdob<zzq, zza> implements zzdpm {
        private static final zzq zzcdv;
        private static volatile zzdpv<zzq> zzdv;
        private int zzcar = 1000;
        private zzp zzcdi;
        private int zzcds;
        private int zzcdt;
        private int zzcdu;
        private int zzdj;

        public static final class zza extends zzdob.zza<zzq, zza> implements zzdpm {
            private zza() {
                super(zzq.zzcdv);
            }

            /* synthetic */ zza(j50 j50Var) {
                this();
            }
        }

        static {
            zzq zzqVar = new zzq();
            zzcdv = zzqVar;
            zzdob.m19721t(zzq.class, zzqVar);
        }

        private zzq() {
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            j50 j50Var = null;
            switch (j50.f19460a[i2 - 1]) {
                case 1:
                    return new zzq();
                case 2:
                    return new zza(j50Var);
                case 3:
                    return zzdob.m19719r(zzcdv, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004", new Object[]{"zzdj", "zzcar", zzwx.m20810g(), "zzcdi", "zzcds", "zzcdt", "zzcdu"});
                case 4:
                    return zzcdv;
                case 5:
                    zzdpv<zzq> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzq.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzcdv);
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

    public static final class zzr extends zzdob<zzr, zza> implements zzdpm {
        private static final zzr zzcdw;
        private static volatile zzdpv<zzr> zzdv;
        private int zzcar = 1000;
        private zzp zzcdi;
        private zzn zzcdj;
        private int zzdj;

        public static final class zza extends zzdob.zza<zzr, zza> implements zzdpm {
            private zza() {
                super(zzr.zzcdw);
            }

            /* synthetic */ zza(j50 j50Var) {
                this();
            }
        }

        static {
            zzr zzrVar = new zzr();
            zzcdw = zzrVar;
            zzdob.m19721t(zzr.class, zzrVar);
        }

        private zzr() {
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            j50 j50Var = null;
            switch (j50.f19460a[i2 - 1]) {
                case 1:
                    return new zzr();
                case 2:
                    return new zza(j50Var);
                case 3:
                    return zzdob.m19719r(zzcdw, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzdj", "zzcar", zzwx.m20810g(), "zzcdi", "zzcdj"});
                case 4:
                    return zzcdw;
                case 5:
                    zzdpv<zzr> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzr.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzcdw);
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

    public static final class zzs extends zzdob<zzs, zza> implements zzdpm {
        private static final zzs zzcdy;
        private static volatile zzdpv<zzs> zzdv;
        private int zzcar = 1000;
        private zzp zzcdi;
        private int zzcds;
        private int zzcdt;
        private int zzcdu;
        private long zzcdx;
        private int zzdj;

        public static final class zza extends zzdob.zza<zzs, zza> implements zzdpm {
            private zza() {
                super(zzs.zzcdy);
            }

            /* synthetic */ zza(j50 j50Var) {
                this();
            }
        }

        static {
            zzs zzsVar = new zzs();
            zzcdy = zzsVar;
            zzdob.m19721t(zzs.class, zzsVar);
        }

        private zzs() {
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            j50 j50Var = null;
            switch (j50.f19460a[i2 - 1]) {
                case 1:
                    return new zzs();
                case 2:
                    return new zza(j50Var);
                case 3:
                    return zzdob.m19719r(zzcdy, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0003\u0005", new Object[]{"zzdj", "zzcar", zzwx.m20810g(), "zzcdi", "zzcds", "zzcdt", "zzcdu", "zzcdx"});
                case 4:
                    return zzcdy;
                case 5:
                    zzdpv<zzs> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzs.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzcdy);
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

    public static final class zzt extends zzdob<zzt, zza> implements zzdpm {
        private static final zzt zzcdz;
        private static volatile zzdpv<zzt> zzdv;
        private int zzcar = 1000;
        private zzp zzcdi;
        private zzn zzcdj;
        private int zzdj;

        public static final class zza extends zzdob.zza<zzt, zza> implements zzdpm {
            private zza() {
                super(zzt.zzcdz);
            }

            /* synthetic */ zza(j50 j50Var) {
                this();
            }
        }

        static {
            zzt zztVar = new zzt();
            zzcdz = zztVar;
            zzdob.m19721t(zzt.class, zztVar);
        }

        private zzt() {
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            j50 j50Var = null;
            switch (j50.f19460a[i2 - 1]) {
                case 1:
                    return new zzt();
                case 2:
                    return new zza(j50Var);
                case 3:
                    return zzdob.m19719r(zzcdz, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzdj", "zzcar", zzwx.m20810g(), "zzcdi", "zzcdj"});
                case 4:
                    return zzcdz;
                case 5:
                    zzdpv<zzt> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzt.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzcdz);
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

    public static final class zzu extends zzdob<zzu, zza> implements zzdpm {
        private static final zzu zzcea;
        private static volatile zzdpv<zzu> zzdv;
        private int zzcar = 1000;
        private zzp zzcdi;
        private int zzdj;

        public static final class zza extends zzdob.zza<zzu, zza> implements zzdpm {
            private zza() {
                super(zzu.zzcea);
            }

            /* synthetic */ zza(j50 j50Var) {
                this();
            }
        }

        static {
            zzu zzuVar = new zzu();
            zzcea = zzuVar;
            zzdob.m19721t(zzu.class, zzuVar);
        }

        private zzu() {
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            j50 j50Var = null;
            switch (j50.f19460a[i2 - 1]) {
                case 1:
                    return new zzu();
                case 2:
                    return new zza(j50Var);
                case 3:
                    return zzdob.m19719r(zzcea, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001", new Object[]{"zzdj", "zzcar", zzwx.m20810g(), "zzcdi"});
                case 4:
                    return zzcea;
                case 5:
                    zzdpv<zzu> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzu.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzcea);
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

    public static final class zzv extends zzdob<zzv, zza> implements zzdpm {
        private static final zzv zzced;
        private static volatile zzdpv<zzv> zzdv;
        private boolean zzceb;
        private int zzcec;
        private int zzdj;

        public static final class zza extends zzdob.zza<zzv, zza> implements zzdpm {
            private zza() {
                super(zzv.zzced);
            }

            /* renamed from: u */
            public final zza m20807u(int i2) {
                m19735p();
                ((zzv) this.f25755g).m20805z(i2);
                return this;
            }

            /* renamed from: v */
            public final boolean m20808v() {
                return ((zzv) this.f25755g).m20806A();
            }

            /* renamed from: w */
            public final zza m20809w(boolean z) {
                m19735p();
                ((zzv) this.f25755g).m20802D(z);
                return this;
            }

            /* synthetic */ zza(j50 j50Var) {
                this();
            }
        }

        static {
            zzv zzvVar = new zzv();
            zzced = zzvVar;
            zzdob.m19721t(zzv.class, zzvVar);
        }

        private zzv() {
        }

        /* renamed from: B */
        public static zza m20800B() {
            return (zza) ((zzdob.zza) zzced.mo17725q(zzdob.zze.f25762e, null, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: D */
        public final void m20802D(boolean z) {
            this.zzdj |= 1;
            this.zzceb = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public final void m20805z(int i2) {
            this.zzdj |= 2;
            this.zzcec = i2;
        }

        /* renamed from: A */
        public final boolean m20806A() {
            return this.zzceb;
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            j50 j50Var = null;
            switch (j50.f19460a[i2 - 1]) {
                case 1:
                    return new zzv();
                case 2:
                    return new zza(j50Var);
                case 3:
                    return zzdob.m19719r(zzced, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0004\u0001", new Object[]{"zzdj", "zzceb", "zzcec"});
                case 4:
                    return zzced;
                case 5:
                    zzdpv<zzv> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzv.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzced);
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
}
