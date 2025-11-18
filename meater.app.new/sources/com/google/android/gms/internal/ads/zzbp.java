package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.file.CacheHelper;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzdob;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes2.dex */
public final class zzbp {

    public static final class zza extends zzdob<zza, C11479zza> implements zzdpm {
        private static volatile zzdpv<zza> zzdv;
        private static final zza zzhj;
        private int zzdj;
        private int zzeq;
        private int zzer;
        private long zzet;
        private long zzeu;
        private long zzev;
        private long zzew;
        private long zzex;
        private long zzey;
        private long zzez;
        private long zzfa;
        private long zzfb;
        private long zzfc;
        private long zzfe;
        private long zzff;
        private long zzfg;
        private long zzfh;
        private long zzfi;
        private long zzfj;
        private long zzfk;
        private long zzfl;
        private long zzfm;
        private long zzfo;
        private long zzfp;
        private long zzfq;
        private long zzfr;
        private zzb zzfu;
        private zze zzgj;
        private zzf zzgl;
        private int zzgw;
        private int zzgx;
        private int zzgy;
        private zzf zzgz;
        private long zzhc;
        private boolean zzhf;
        private long zzhh;
        private zze zzhi;
        private String zzes = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzdt = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzfd = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzej = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzfn = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzel = HttpUrl.FRAGMENT_ENCODE_SET;
        private long zzfs = -1;
        private long zzft = -1;
        private long zzfv = -1;
        private long zzfw = -1;
        private long zzfx = -1;
        private long zzfy = -1;
        private long zzfz = -1;
        private long zzga = -1;
        private String zzem = "D";
        private String zzen = "D";
        private int zzgb = 1000;
        private int zzgc = 1000;
        private long zzgd = -1;
        private long zzge = -1;
        private long zzgf = -1;
        private long zzgg = -1;
        private long zzgh = -1;
        private int zzgi = 1000;
        private zzdoj<zze> zzgk = zzdob.m19723v();
        private long zzgm = -1;
        private long zzgn = -1;
        private long zzgo = -1;
        private long zzgp = -1;
        private long zzgq = -1;
        private long zzgr = -1;
        private long zzgs = -1;
        private long zzgt = -1;
        private String zzgu = "D";
        private long zzgv = -1;
        private long zzha = -1;
        private int zzhb = 1000;
        private String zzhd = HttpUrl.FRAGMENT_ENCODE_SET;
        private int zzhe = 2;
        private String zzhg = HttpUrl.FRAGMENT_ENCODE_SET;

        /* renamed from: com.google.android.gms.internal.ads.zzbp$zza$zza, reason: collision with other inner class name */
        public static final class C11479zza extends zzdob.zza<zza, C11479zza> implements zzdpm {
            private C11479zza() {
                super(zza.zzhj);
            }

            /* renamed from: A */
            public final C11479zza m18051A(String str) {
                m19735p();
                ((zza) this.f25755g).m18040x1(str);
                return this;
            }

            /* renamed from: A0 */
            public final C11479zza m18052A0(String str) {
                m19735p();
                ((zza) this.f25755g).m18006f1(str);
                return this;
            }

            /* renamed from: B */
            public final C11479zza m18053B(String str) {
                m19735p();
                ((zza) this.f25755g).m17940A1(str);
                return this;
            }

            /* renamed from: B0 */
            public final C11479zza m18054B0(String str) {
                m19735p();
                ((zza) this.f25755g).m18011i1(str);
                return this;
            }

            /* renamed from: C */
            public final C11479zza m18055C(String str) {
                m19735p();
                ((zza) this.f25755g).m17949D1(str);
                return this;
            }

            /* renamed from: C0 */
            public final C11479zza m18056C0(String str) {
                m19735p();
                ((zza) this.f25755g).m18016l1(str);
                return this;
            }

            /* renamed from: D */
            public final C11479zza m18057D(long j2) {
                m19735p();
                ((zza) this.f25755g).m17945C0(j2);
                return this;
            }

            /* renamed from: E */
            public final C11479zza m18058E(long j2) {
                m19735p();
                ((zza) this.f25755g).m17954F0(j2);
                return this;
            }

            /* renamed from: F */
            public final C11479zza m18059F(long j2) {
                m19735p();
                ((zza) this.f25755g).m17963I0(j2);
                return this;
            }

            /* renamed from: G */
            public final C11479zza m18060G() {
                m19735p();
                ((zza) this.f25755g).m18005f0();
                return this;
            }

            /* renamed from: H */
            public final C11479zza m18061H(long j2) {
                m19735p();
                ((zza) this.f25755g).m17971L0(j2);
                return this;
            }

            /* renamed from: I */
            public final C11479zza m18062I(long j2) {
                m19735p();
                ((zza) this.f25755g).m17978P0(j2);
                return this;
            }

            /* renamed from: J */
            public final C11479zza m18063J(long j2) {
                m19735p();
                ((zza) this.f25755g).m17984S0(j2);
                return this;
            }

            /* renamed from: K */
            public final C11479zza m18064K(long j2) {
                m19735p();
                ((zza) this.f25755g).m17987U0(j2);
                return this;
            }

            /* renamed from: L */
            public final C11479zza m18065L(long j2) {
                m19735p();
                ((zza) this.f25755g).m17991W0(j2);
                return this;
            }

            /* renamed from: M */
            public final C11479zza m18066M(long j2) {
                m19735p();
                ((zza) this.f25755g).m17995Y0(j2);
                return this;
            }

            /* renamed from: N */
            public final C11479zza m18067N(long j2) {
                m19735p();
                ((zza) this.f25755g).m18000b1(j2);
                return this;
            }

            /* renamed from: O */
            public final C11479zza m18068O(long j2) {
                m19735p();
                ((zza) this.f25755g).m18003d1(j2);
                return this;
            }

            /* renamed from: P */
            public final C11479zza m18069P(long j2) {
                m19735p();
                ((zza) this.f25755g).m18008g1(j2);
                return this;
            }

            /* renamed from: Q */
            public final C11479zza m18070Q(long j2) {
                m19735p();
                ((zza) this.f25755g).m18012j1(j2);
                return this;
            }

            /* renamed from: R */
            public final C11479zza m18071R(long j2) {
                m19735p();
                ((zza) this.f25755g).m18018m1(j2);
                return this;
            }

            /* renamed from: S */
            public final C11479zza m18072S(long j2) {
                m19735p();
                ((zza) this.f25755g).m18023p1(j2);
                return this;
            }

            /* renamed from: T */
            public final C11479zza m18073T(zzc zzcVar) {
                m19735p();
                ((zza) this.f25755g).m18038x(zzcVar);
                return this;
            }

            /* renamed from: U */
            public final C11479zza m18074U(zzf zzfVar) {
                m19735p();
                ((zza) this.f25755g).m18044z(zzfVar);
                return this;
            }

            /* renamed from: V */
            public final C11479zza m18075V(zzf zzfVar) {
                m19735p();
                ((zza) this.f25755g).m17965J(zzfVar);
                return this;
            }

            /* renamed from: X */
            public final C11479zza m18076X(boolean z) {
                m19735p();
                ((zza) this.f25755g).m17970L(z);
                return this;
            }

            /* renamed from: Z */
            public final C11479zza m18077Z(long j2) {
                m19735p();
                ((zza) this.f25755g).m18029s1(j2);
                return this;
            }

            @Deprecated
            /* renamed from: a0 */
            public final C11479zza m18078a0(long j2) {
                m19735p();
                ((zza) this.f25755g).m18035v1(j2);
                return this;
            }

            /* renamed from: b0 */
            public final C11479zza m18079b0(long j2) {
                m19735p();
                ((zza) this.f25755g).m18043y1(j2);
                return this;
            }

            /* renamed from: c0 */
            public final C11479zza m18080c0(long j2) {
                m19735p();
                ((zza) this.f25755g).m17943B1(j2);
                return this;
            }

            /* renamed from: d0 */
            public final C11479zza m18081d0(long j2) {
                m19735p();
                ((zza) this.f25755g).m17952E1(j2);
                return this;
            }

            /* renamed from: f0 */
            public final C11479zza m18082f0(long j2) {
                m19735p();
                ((zza) this.f25755g).m17958G1(j2);
                return this;
            }

            /* renamed from: g0 */
            public final C11479zza m18083g0(long j2) {
                m19735p();
                ((zza) this.f25755g).m17964I1(j2);
                return this;
            }

            /* renamed from: h0 */
            public final C11479zza m18084h0(long j2) {
                m19735p();
                ((zza) this.f25755g).m17972M(j2);
                return this;
            }

            /* renamed from: j0 */
            public final C11479zza m18085j0(long j2) {
                m19735p();
                ((zza) this.f25755g).m17975O(j2);
                return this;
            }

            /* renamed from: k0 */
            public final C11479zza m18086k0(long j2) {
                m19735p();
                ((zza) this.f25755g).m17979Q(j2);
                return this;
            }

            /* renamed from: l0 */
            public final C11479zza m18087l0(long j2) {
                m19735p();
                ((zza) this.f25755g).m17983S(j2);
                return this;
            }

            /* renamed from: m0 */
            public final C11479zza m18088m0(long j2) {
                m19735p();
                ((zza) this.f25755g).m17988V(j2);
                return this;
            }

            /* renamed from: n0 */
            public final C11479zza m18089n0(long j2) {
                m19735p();
                ((zza) this.f25755g).m17992X(j2);
                return this;
            }

            /* renamed from: o0 */
            public final C11479zza m18090o0(long j2) {
                m19735p();
                ((zza) this.f25755g).m17996Z(j2);
                return this;
            }

            /* renamed from: q0 */
            public final C11479zza m18091q0(long j2) {
                m19735p();
                ((zza) this.f25755g).m17999b0(j2);
                return this;
            }

            /* renamed from: r0 */
            public final C11479zza m18092r0(long j2) {
                m19735p();
                ((zza) this.f25755g).m18001c0(j2);
                return this;
            }

            /* renamed from: s0 */
            public final C11479zza m18093s0(long j2) {
                m19735p();
                ((zza) this.f25755g).m18007g0(j2);
                return this;
            }

            /* renamed from: t0 */
            public final C11479zza m18094t0(long j2) {
                m19735p();
                ((zza) this.f25755g).m18009h0(j2);
                return this;
            }

            /* renamed from: u */
            public final C11479zza m18095u(String str) {
                m19735p();
                ((zza) this.f25755g).m18022o1(str);
                return this;
            }

            /* renamed from: u0 */
            public final C11479zza m18096u0(zze zzeVar) {
                m19735p();
                ((zza) this.f25755g).m18041y(zzeVar);
                return this;
            }

            /* renamed from: v */
            public final C11479zza m18097v(String str) {
                m19735p();
                ((zza) this.f25755g).m18027r1(str);
                return this;
            }

            /* renamed from: v0 */
            public final C11479zza m18098v0(zze zzeVar) {
                m19735p();
                ((zza) this.f25755g).m18019n0(zzeVar);
                return this;
            }

            /* renamed from: w */
            public final C11479zza m18099w(String str) {
                m19735p();
                ((zza) this.f25755g).m18033u1(str);
                return this;
            }

            /* renamed from: w0 */
            public final C11479zza m18100w0(zzbz zzbzVar) {
                m19735p();
                ((zza) this.f25755g).m17968K(zzbzVar);
                return this;
            }

            /* renamed from: x0 */
            public final C11479zza m18101x0(zzbz zzbzVar) {
                m19735p();
                ((zza) this.f25755g).m18030t0(zzbzVar);
                return this;
            }

            /* renamed from: y0 */
            public final C11479zza m18102y0(zzbz zzbzVar) {
                m19735p();
                ((zza) this.f25755g).m18039x0(zzbzVar);
                return this;
            }

            /* renamed from: z0 */
            public final C11479zza m18103z0(zzbz zzbzVar) {
                m19735p();
                ((zza) this.f25755g).m17942B0(zzbzVar);
                return this;
            }

            /* synthetic */ C11479zza(C6928md c6928md) {
                this();
            }
        }

        public enum zzb implements zzdoe {
            DEBUGGER_STATE_UNSPECIFIED(0),
            DEBUGGER_STATE_NOT_INSTALLED(1),
            DEBUGGER_STATE_INSTALLED(2),
            DEBUGGER_STATE_ACTIVE(3);


            /* renamed from: j */
            private static final zzdof<zzb> f23397j = new C7039pd();

            /* renamed from: l */
            private final int f23399l;

            zzb(int i2) {
                this.f23399l = i2;
            }

            /* renamed from: g */
            public static zzdog m18104g() {
                return C7261vd.f20739a;
            }

            /* renamed from: k */
            public static zzb m18105k(int i2) {
                if (i2 == 0) {
                    return DEBUGGER_STATE_UNSPECIFIED;
                }
                if (i2 == 1) {
                    return DEBUGGER_STATE_NOT_INSTALLED;
                }
                if (i2 == 2) {
                    return DEBUGGER_STATE_INSTALLED;
                }
                if (i2 != 3) {
                    return null;
                }
                return DEBUGGER_STATE_ACTIVE;
            }

            @Override // com.google.android.gms.internal.ads.zzdoe
            /* renamed from: i */
            public final int mo17879i() {
                return this.f23399l;
            }
        }

        public enum zzc implements zzdoe {
            DEVICE_IDENTIFIER_NO_ID(0),
            DEVICE_IDENTIFIER_APP_SPECIFIC_ID(1),
            DEVICE_IDENTIFIER_GLOBAL_ID(2),
            DEVICE_IDENTIFIER_ADVERTISER_ID(3),
            DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED(4),
            DEVICE_IDENTIFIER_ANDROID_AD_ID(5),
            DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID(6);


            /* renamed from: m */
            private static final zzdof<zzc> f23407m = new C6892le();

            /* renamed from: o */
            private final int f23409o;

            zzc(int i2) {
                this.f23409o = i2;
            }

            /* renamed from: g */
            public static zzdog m18106g() {
                return C7262ve.f20740a;
            }

            /* renamed from: k */
            public static zzc m18107k(int i2) {
                switch (i2) {
                    case 0:
                        return DEVICE_IDENTIFIER_NO_ID;
                    case 1:
                        return DEVICE_IDENTIFIER_APP_SPECIFIC_ID;
                    case 2:
                        return DEVICE_IDENTIFIER_GLOBAL_ID;
                    case 3:
                        return DEVICE_IDENTIFIER_ADVERTISER_ID;
                    case 4:
                        return DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED;
                    case 5:
                        return DEVICE_IDENTIFIER_ANDROID_AD_ID;
                    case 6:
                        return DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID;
                    default:
                        return null;
                }
            }

            @Override // com.google.android.gms.internal.ads.zzdoe
            /* renamed from: i */
            public final int mo17879i() {
                return this.f23409o;
            }
        }

        public enum zzd implements zzdoe {
            ERROR_ENCODE_SIZE_FAIL(1),
            ERROR_UNKNOWN(3),
            ERROR_NO_SIGNALS(5),
            ERROR_ENCRYPTION(7),
            ERROR_MEMORY(9),
            ERROR_SIMULATOR(11),
            ERROR_SERVICE(13),
            ERROR_THREAD(15),
            PSN_WEB64_FAIL(2),
            PSN_DECRYPT_SIZE_FAIL(4),
            PSN_MD5_CHECK_FAIL(8),
            PSN_MD5_SIZE_FAIL(16),
            PSN_MD5_FAIL(32),
            PSN_DECODE_FAIL(64),
            PSN_SALT_FAIL(128),
            PSN_BITSLICER_FAIL(256),
            PSN_REQUEST_TYPE_FAIL(AdRequest.MAX_CONTENT_URL_LENGTH),
            PSN_INVALID_ERROR_CODE(1024),
            PSN_TIMESTAMP_EXPIRED(RecyclerView.AbstractC0599l.FLAG_MOVED),
            PSN_ENCODE_SIZE_FAIL(RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT),
            PSN_BLANK_VALUE(8192),
            PSN_INITIALIZATION_FAIL(Http2.INITIAL_MAX_FRAME_SIZE),
            PSN_GASS_CLIENT_FAIL(32768),
            PSN_SIGNALS_TIMEOUT(65536),
            PSN_TINK_FAIL(131072);


            /* renamed from: E */
            private static final zzdof<zzd> f23414E = new C7410ze();

            /* renamed from: G */
            private final int f23437G;

            zzd(int i2) {
                this.f23437G = i2;
            }

            @Override // com.google.android.gms.internal.ads.zzdoe
            /* renamed from: i */
            public final int mo17879i() {
                return this.f23437G;
            }
        }

        public static final class zze extends zzdob<zze, C11480zza> implements zzdpm {
            private static volatile zzdpv<zze> zzdv;
            private static final zze zzjq;
            private int zzdj;
            private long zzjk;
            private long zzjl;
            private long zzfe = -1;
            private long zzff = -1;
            private long zzix = -1;
            private long zziy = -1;
            private long zziz = -1;
            private long zzja = -1;
            private int zzjb = 1000;
            private long zzjc = -1;
            private long zzjd = -1;
            private long zzje = -1;
            private int zzjf = 1000;
            private long zzjg = -1;
            private long zzjh = -1;
            private long zzji = -1;
            private long zzjj = -1;
            private long zzjm = -1;
            private long zzjn = -1;
            private long zzjo = -1;
            private long zzjp = -1;

            /* renamed from: com.google.android.gms.internal.ads.zzbp$zza$zze$zza, reason: collision with other inner class name */
            public static final class C11480zza extends zzdob.zza<zze, C11480zza> implements zzdpm {
                private C11480zza() {
                    super(zze.zzjq);
                }

                /* renamed from: A */
                public final C11480zza m18150A(long j2) {
                    m19735p();
                    ((zze) this.f25755g).m18112E(j2);
                    return this;
                }

                /* renamed from: B */
                public final C11480zza m18151B(long j2) {
                    m19735p();
                    ((zze) this.f25755g).m18113F(j2);
                    return this;
                }

                /* renamed from: C */
                public final C11480zza m18152C(long j2) {
                    m19735p();
                    ((zze) this.f25755g).m18114G(j2);
                    return this;
                }

                /* renamed from: D */
                public final C11480zza m18153D(long j2) {
                    m19735p();
                    ((zze) this.f25755g).m18115H(j2);
                    return this;
                }

                /* renamed from: E */
                public final C11480zza m18154E(long j2) {
                    m19735p();
                    ((zze) this.f25755g).m18116I(j2);
                    return this;
                }

                /* renamed from: F */
                public final C11480zza m18155F(long j2) {
                    m19735p();
                    ((zze) this.f25755g).m18117J(j2);
                    return this;
                }

                /* renamed from: G */
                public final C11480zza m18156G(long j2) {
                    m19735p();
                    ((zze) this.f25755g).m18118K(j2);
                    return this;
                }

                /* renamed from: H */
                public final C11480zza m18157H(long j2) {
                    m19735p();
                    ((zze) this.f25755g).m18119L(j2);
                    return this;
                }

                /* renamed from: I */
                public final C11480zza m18158I(long j2) {
                    m19735p();
                    ((zze) this.f25755g).m18121N(j2);
                    return this;
                }

                /* renamed from: J */
                public final C11480zza m18159J(long j2) {
                    m19735p();
                    ((zze) this.f25755g).m18122O(j2);
                    return this;
                }

                /* renamed from: K */
                public final C11480zza m18160K(long j2) {
                    m19735p();
                    ((zze) this.f25755g).m18123P(j2);
                    return this;
                }

                /* renamed from: L */
                public final C11480zza m18161L(long j2) {
                    m19735p();
                    ((zze) this.f25755g).m18124Q(j2);
                    return this;
                }

                /* renamed from: M */
                public final C11480zza m18162M(long j2) {
                    m19735p();
                    ((zze) this.f25755g).m18125R(j2);
                    return this;
                }

                /* renamed from: N */
                public final C11480zza m18163N(long j2) {
                    m19735p();
                    ((zze) this.f25755g).m18126S(j2);
                    return this;
                }

                /* renamed from: O */
                public final C11480zza m18164O(long j2) {
                    m19735p();
                    ((zze) this.f25755g).m18127T(j2);
                    return this;
                }

                /* renamed from: P */
                public final C11480zza m18165P(zzbz zzbzVar) {
                    m19735p();
                    ((zze) this.f25755g).m18135b0(zzbzVar);
                    return this;
                }

                /* renamed from: Q */
                public final C11480zza m18166Q(zzbz zzbzVar) {
                    m19735p();
                    ((zze) this.f25755g).m18138f0(zzbzVar);
                    return this;
                }

                /* renamed from: u */
                public final C11480zza m18167u() {
                    m19735p();
                    ((zze) this.f25755g).m18149z();
                    return this;
                }

                /* renamed from: v */
                public final C11480zza m18168v(long j2) {
                    m19735p();
                    ((zze) this.f25755g).m18136c0(j2);
                    return this;
                }

                /* renamed from: w */
                public final C11480zza m18169w(long j2) {
                    m19735p();
                    ((zze) this.f25755g).m18139g0(j2);
                    return this;
                }

                /* synthetic */ C11480zza(C6928md c6928md) {
                    this();
                }
            }

            static {
                zze zzeVar = new zze();
                zzjq = zzeVar;
                zzdob.m19721t(zze.class, zzeVar);
            }

            private zze() {
            }

            /* renamed from: A */
            public static C11480zza m18108A() {
                return (C11480zza) ((zzdob.zza) zzjq.mo17725q(zzdob.zze.f25762e, null, null));
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: E */
            public final void m18112E(long j2) {
                this.zzdj |= 4;
                this.zzix = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: F */
            public final void m18113F(long j2) {
                this.zzdj |= 8;
                this.zziy = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: G */
            public final void m18114G(long j2) {
                this.zzdj |= 16;
                this.zziz = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: H */
            public final void m18115H(long j2) {
                this.zzdj |= 32;
                this.zzja = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: I */
            public final void m18116I(long j2) {
                this.zzdj |= 128;
                this.zzjc = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: J */
            public final void m18117J(long j2) {
                this.zzdj |= 256;
                this.zzjd = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: K */
            public final void m18118K(long j2) {
                this.zzdj |= AdRequest.MAX_CONTENT_URL_LENGTH;
                this.zzje = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: L */
            public final void m18119L(long j2) {
                this.zzdj |= RecyclerView.AbstractC0599l.FLAG_MOVED;
                this.zzjg = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: N */
            public final void m18121N(long j2) {
                this.zzdj |= RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT;
                this.zzjh = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: O */
            public final void m18122O(long j2) {
                this.zzdj |= 8192;
                this.zzji = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: P */
            public final void m18123P(long j2) {
                this.zzdj |= Http2.INITIAL_MAX_FRAME_SIZE;
                this.zzjj = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: Q */
            public final void m18124Q(long j2) {
                this.zzdj |= 32768;
                this.zzjk = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: R */
            public final void m18125R(long j2) {
                this.zzdj |= 65536;
                this.zzjl = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: S */
            public final void m18126S(long j2) {
                this.zzdj |= 131072;
                this.zzjm = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: T */
            public final void m18127T(long j2) {
                this.zzdj |= 262144;
                this.zzjn = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: b0 */
            public final void m18135b0(zzbz zzbzVar) {
                zzbzVar.getClass();
                this.zzdj |= 64;
                this.zzjb = zzbzVar.mo17879i();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: c0 */
            public final void m18136c0(long j2) {
                this.zzdj |= 1;
                this.zzfe = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: f0 */
            public final void m18138f0(zzbz zzbzVar) {
                zzbzVar.getClass();
                this.zzdj |= 1024;
                this.zzjf = zzbzVar.mo17879i();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: g0 */
            public final void m18139g0(long j2) {
                this.zzdj |= 2;
                this.zzff = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: z */
            public final void m18149z() {
                this.zzdj &= -9;
                this.zziy = -1L;
            }

            @Override // com.google.android.gms.internal.ads.zzdob
            /* renamed from: q */
            protected final Object mo17725q(int i2, Object obj, Object obj2) {
                C6928md c6928md = null;
                switch (C6928md.f19912a[i2 - 1]) {
                    case 1:
                        return new zze();
                    case 2:
                        return new C11480zza(c6928md);
                    case 3:
                        return zzdob.m19719r(zzjq, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u0007\f\u0006\b\u0002\u0007\t\u0002\b\n\u0002\t\u000b\f\n\f\u0002\u000b\r\u0002\f\u000e\u0002\r\u000f\u0002\u000e\u0010\u0002\u000f\u0011\u0002\u0010\u0012\u0002\u0011\u0013\u0002\u0012\u0014\u0002\u0013\u0015\u0002\u0014", new Object[]{"zzdj", "zzfe", "zzff", "zzix", "zziy", "zziz", "zzja", "zzjb", zzbz.m18560g(), "zzjc", "zzjd", "zzje", "zzjf", zzbz.m18560g(), "zzjg", "zzjh", "zzji", "zzjj", "zzjk", "zzjl", "zzjm", "zzjn", "zzjo", "zzjp"});
                    case 4:
                        return zzjq;
                    case 5:
                        zzdpv<zze> zzbVar = zzdv;
                        if (zzbVar == null) {
                            synchronized (zze.class) {
                                zzbVar = zzdv;
                                if (zzbVar == null) {
                                    zzbVar = new zzdob.zzb<>(zzjq);
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

        public static final class zzf extends zzdob<zzf, C11481zza> implements zzdpm {
            private static volatile zzdpv<zzf> zzdv;
            private static final zzf zzjv;
            private int zzdj;
            private long zzgg = -1;
            private long zzgh = -1;
            private long zzjr = -1;
            private long zzjs = -1;
            private long zzjt = -1;
            private long zzju = -1;

            /* renamed from: com.google.android.gms.internal.ads.zzbp$zza$zzf$zza, reason: collision with other inner class name */
            public static final class C11481zza extends zzdob.zza<zzf, C11481zza> implements zzdpm {
                private C11481zza() {
                    super(zzf.zzjv);
                }

                /* renamed from: A */
                public final C11481zza m18180A(long j2) {
                    m19735p();
                    ((zzf) this.f25755g).m18176G(j2);
                    return this;
                }

                /* renamed from: u */
                public final C11481zza m18181u(long j2) {
                    m19735p();
                    ((zzf) this.f25755g).m18172C(j2);
                    return this;
                }

                /* renamed from: v */
                public final C11481zza m18182v(long j2) {
                    m19735p();
                    ((zzf) this.f25755g).m18173D(j2);
                    return this;
                }

                /* renamed from: w */
                public final C11481zza m18183w(long j2) {
                    m19735p();
                    ((zzf) this.f25755g).m18175F(j2);
                    return this;
                }

                /* synthetic */ C11481zza(C6928md c6928md) {
                    this();
                }
            }

            static {
                zzf zzfVar = new zzf();
                zzjv = zzfVar;
                zzdob.m19721t(zzf.class, zzfVar);
            }

            private zzf() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: C */
            public final void m18172C(long j2) {
                this.zzdj |= 4;
                this.zzjr = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: D */
            public final void m18173D(long j2) {
                this.zzdj |= 8;
                this.zzjs = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: F */
            public final void m18175F(long j2) {
                this.zzdj |= 16;
                this.zzjt = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: G */
            public final void m18176G(long j2) {
                this.zzdj |= 32;
                this.zzju = j2;
            }

            /* renamed from: y */
            public static C11481zza m18178y() {
                return (C11481zza) ((zzdob.zza) zzjv.mo17725q(zzdob.zze.f25762e, null, null));
            }

            @Override // com.google.android.gms.internal.ads.zzdob
            /* renamed from: q */
            protected final Object mo17725q(int i2, Object obj, Object obj2) {
                C6928md c6928md = null;
                switch (C6928md.f19912a[i2 - 1]) {
                    case 1:
                        return new zzf();
                    case 2:
                        return new C11481zza(c6928md);
                    case 3:
                        return zzdob.m19719r(zzjv, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005", new Object[]{"zzdj", "zzgg", "zzgh", "zzjr", "zzjs", "zzjt", "zzju"});
                    case 4:
                        return zzjv;
                    case 5:
                        zzdpv<zzf> zzbVar = zzdv;
                        if (zzbVar == null) {
                            synchronized (zzf.class) {
                                zzbVar = zzdv;
                                if (zzbVar == null) {
                                    zzbVar = new zzdob.zzb<>(zzjv);
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
            zza zzaVar = new zza();
            zzhj = zzaVar;
            zzdob.m19721t(zza.class, zzaVar);
        }

        private zza() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: A1 */
        public final void m17940A1(String str) {
            str.getClass();
            this.zzeq |= 67108864;
            this.zzgu = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: B0 */
        public final void m17942B0(zzbz zzbzVar) {
            zzbzVar.getClass();
            this.zzer |= 2;
            this.zzhb = zzbzVar.mo17879i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: B1 */
        public final void m17943B1(long j2) {
            this.zzeq |= 1;
            this.zzfv = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C0 */
        public final void m17945C0(long j2) {
            this.zzdj |= 4;
            this.zzet = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: D1 */
        public final void m17949D1(String str) {
            str.getClass();
            this.zzer |= 8;
            this.zzhd = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: E1 */
        public final void m17952E1(long j2) {
            this.zzeq |= 2;
            this.zzfw = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: F0 */
        public final void m17954F0(long j2) {
            this.zzdj |= 16;
            this.zzev = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: G1 */
        public final void m17958G1(long j2) {
            this.zzeq |= 4;
            this.zzfx = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: I0 */
        public final void m17963I0(long j2) {
            this.zzdj |= 32;
            this.zzew = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: I1 */
        public final void m17964I1(long j2) {
            this.zzeq |= 8;
            this.zzfy = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: J */
        public final void m17965J(zzf zzfVar) {
            zzfVar.getClass();
            this.zzgz = zzfVar;
            this.zzeq |= Integer.MIN_VALUE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: K */
        public final void m17968K(zzbz zzbzVar) {
            zzbzVar.getClass();
            this.zzeq |= 256;
            this.zzgb = zzbzVar.mo17879i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: L */
        public final void m17970L(boolean z) {
            this.zzer |= 32;
            this.zzhf = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: L0 */
        public final void m17971L0(long j2) {
            this.zzdj |= 1024;
            this.zzfb = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: M */
        public final void m17972M(long j2) {
            this.zzeq |= 16;
            this.zzfz = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: O */
        public final void m17975O(long j2) {
            this.zzeq |= 32;
            this.zzga = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: P0 */
        public final void m17978P0(long j2) {
            this.zzdj |= RecyclerView.AbstractC0599l.FLAG_MOVED;
            this.zzfc = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: Q */
        public final void m17979Q(long j2) {
            this.zzeq |= 1024;
            this.zzgd = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: S */
        public final void m17983S(long j2) {
            this.zzeq |= RecyclerView.AbstractC0599l.FLAG_MOVED;
            this.zzge = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: S0 */
        public final void m17984S0(long j2) {
            this.zzdj |= 8192;
            this.zzfe = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: U0 */
        public final void m17987U0(long j2) {
            this.zzdj |= Http2.INITIAL_MAX_FRAME_SIZE;
            this.zzff = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: V */
        public final void m17988V(long j2) {
            this.zzeq |= RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT;
            this.zzgf = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: W0 */
        public final void m17991W0(long j2) {
            this.zzdj |= 32768;
            this.zzfg = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: X */
        public final void m17992X(long j2) {
            this.zzeq |= 524288;
            this.zzgn = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: Y0 */
        public final void m17995Y0(long j2) {
            this.zzdj |= 65536;
            this.zzfh = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: Z */
        public final void m17996Z(long j2) {
            this.zzeq |= CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES;
            this.zzgo = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b0 */
        public final void m17999b0(long j2) {
            this.zzeq |= 2097152;
            this.zzgp = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b1 */
        public final void m18000b1(long j2) {
            this.zzdj |= 524288;
            this.zzfk = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c0 */
        public final void m18001c0(long j2) {
            this.zzeq |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
            this.zzgs = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d1 */
        public final void m18003d1(long j2) {
            this.zzdj |= CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES;
            this.zzfl = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f0 */
        public final void m18005f0() {
            this.zzgk = zzdob.m19723v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f1 */
        public final void m18006f1(String str) {
            str.getClass();
            this.zzdj |= 1;
            this.zzes = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g0 */
        public final void m18007g0(long j2) {
            this.zzeq |= 33554432;
            this.zzgt = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g1 */
        public final void m18008g1(long j2) {
            this.zzdj |= 2097152;
            this.zzfm = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h0 */
        public final void m18009h0(long j2) {
            this.zzer |= 128;
            this.zzhh = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i1 */
        public final void m18011i1(String str) {
            str.getClass();
            this.zzdj |= 2;
            this.zzdt = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j1 */
        public final void m18012j1(long j2) {
            this.zzdj |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
            this.zzfo = j2;
        }

        /* renamed from: k0 */
        public static C11479zza m18013k0() {
            return (C11479zza) ((zzdob.zza) zzhj.mo17725q(zzdob.zze.f25762e, null, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l1 */
        public final void m18016l1(String str) {
            str.getClass();
            this.zzdj |= 4194304;
            this.zzej = str;
        }

        /* renamed from: m0 */
        public static zza m18017m0(byte[] bArr, zzdno zzdnoVar) throws zzdok {
            return (zza) zzdob.m19718p(zzhj, bArr, zzdnoVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m1 */
        public final void m18018m1(long j2) {
            this.zzdj |= 33554432;
            this.zzfp = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n0 */
        public final void m18019n0(zze zzeVar) {
            zzeVar.getClass();
            if (!this.zzgk.mo16107m0()) {
                zzdoj<zze> zzdojVar = this.zzgk;
                int size = zzdojVar.size();
                this.zzgk = zzdojVar.mo14989N(size == 0 ? 10 : size << 1);
            }
            this.zzgk.add(zzeVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o1 */
        public final void m18022o1(String str) {
            str.getClass();
            this.zzdj |= 8388608;
            this.zzfn = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p1 */
        public final void m18023p1(long j2) {
            this.zzdj |= 67108864;
            this.zzfq = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r1 */
        public final void m18027r1(String str) {
            str.getClass();
            this.zzdj |= 134217728;
            this.zzel = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s1 */
        public final void m18029s1(long j2) {
            this.zzdj |= 268435456;
            this.zzfr = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t0 */
        public final void m18030t0(zzbz zzbzVar) {
            zzbzVar.getClass();
            this.zzeq |= AdRequest.MAX_CONTENT_URL_LENGTH;
            this.zzgc = zzbzVar.mo17879i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u1 */
        public final void m18033u1(String str) {
            str.getClass();
            this.zzeq |= 64;
            this.zzem = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v1 */
        public final void m18035v1(long j2) {
            this.zzdj |= 536870912;
            this.zzfs = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x */
        public final void m18038x(zzc zzcVar) {
            zzcVar.getClass();
            this.zzer |= 16;
            this.zzhe = zzcVar.mo17879i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x0 */
        public final void m18039x0(zzbz zzbzVar) {
            zzbzVar.getClass();
            this.zzeq |= 32768;
            this.zzgi = zzbzVar.mo17879i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x1 */
        public final void m18040x1(String str) {
            str.getClass();
            this.zzeq |= 128;
            this.zzen = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public final void m18041y(zze zzeVar) {
            zzeVar.getClass();
            this.zzgj = zzeVar;
            this.zzeq |= 65536;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y1 */
        public final void m18043y1(long j2) {
            this.zzdj |= 1073741824;
            this.zzft = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public final void m18044z(zzf zzfVar) {
            zzfVar.getClass();
            this.zzgl = zzfVar;
            this.zzeq |= 131072;
        }

        /* renamed from: U */
        public final String m18047U() {
            return this.zzej;
        }

        /* renamed from: d0 */
        public final boolean m18048d0() {
            return (this.zzdj & 4194304) == 4194304;
        }

        /* renamed from: i0 */
        public final boolean m18049i0() {
            return (this.zzer & 256) == 256;
        }

        /* renamed from: j0 */
        public final zze m18050j0() {
            zze zzeVar = this.zzhi;
            return zzeVar == null ? zze.m18206z() : zzeVar;
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            C6928md c6928md = null;
            switch (C6928md.f19912a[i2 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C11479zza(c6928md);
                case 3:
                    return zzdob.m19719r(zzhj, "\u0001J\u0000\u0003\u0001ÉJ\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u0007\u0002\u0006\b\u0002\u0007\t\u0002\b\n\u0002\t\u000b\u0002\n\f\u0002\u000b\r\b\f\u000e\u0002\r\u000f\u0002\u000e\u0010\u0002\u000f\u0011\u0002\u0010\u0012\u0002\u0011\u0013\u0002\u0012\u0014\u0002\u0013\u0015\u0002B\u0016\u0002\u0014\u0017\u0002\u0015\u0018\bC\u0019\u0002G\u001a\fD\u001b\b\u0016\u001c\u0007E\u001d\b\u0017\u001e\bF\u001f\u0002\u0018 \u0002\u0019!\u0002\u001a\"\b\u001b#\u0002\u001c$\u0002\u001d%\u0002\u001e&\t\u001f'\u0002 (\u0002!)\u0002\"*\u0002#+\u001b,\u0002$-\u0002%.\b&/\b'0\f(1\f)2\t03\u0002*4\u0002+5\u0002,6\u0002-7\u0002.8\f/9\t1:\u00022;\u00023<\u00024=\u00025>\u00028?\u00029@\u0002;A\f<B\f=C\b:D\f>E\t?F\u0002@G\u00026H\u00027I\fAÉ\tH", new Object[]{"zzdj", "zzeq", "zzer", "zzes", "zzdt", "zzet", "zzeu", "zzev", "zzew", "zzex", "zzey", "zzez", "zzfa", "zzfb", "zzfc", "zzfd", "zzfe", "zzff", "zzfg", "zzfh", "zzfi", "zzfj", "zzfk", "zzhc", "zzfl", "zzfm", "zzhd", "zzhh", "zzhe", zzc.m18106g(), "zzej", "zzhf", "zzfn", "zzhg", "zzfo", "zzfp", "zzfq", "zzel", "zzfr", "zzfs", "zzft", "zzfu", "zzfv", "zzfw", "zzfx", "zzfy", "zzgk", zze.class, "zzfz", "zzga", "zzem", "zzen", "zzgb", zzbz.m18560g(), "zzgc", zzbz.m18560g(), "zzgj", "zzgd", "zzge", "zzgf", "zzgg", "zzgh", "zzgi", zzbz.m18560g(), "zzgl", "zzgm", "zzgn", "zzgo", "zzgp", "zzgs", "zzgt", "zzgv", "zzgw", zzbw.m18408g(), "zzgx", zzcc.m18654g(), "zzgu", "zzgy", zzb.m18104g(), "zzgz", "zzha", "zzgq", "zzgr", "zzhb", zzbz.m18560g(), "zzhi"});
                case 4:
                    return zzhj;
                case 5:
                    zzdpv<zza> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zza.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzhj);
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
        private static volatile zzdpv<zzb> zzdv;
        private static final zzb zzkb;
        private int zzdj;
        private long zzjw;
        private int zzjx;
        private boolean zzjy;
        private zzdoh zzjz = zzdob.m19722u();
        private long zzka;

        public static final class zza extends zzdob.zza<zzb, zza> implements zzdpm {
            private zza() {
                super(zzb.zzkb);
            }

            /* synthetic */ zza(C6928md c6928md) {
                this();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzkb = zzbVar;
            zzdob.m19721t(zzb.class, zzbVar);
        }

        private zzb() {
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            C6928md c6928md = null;
            switch (C6928md.f19912a[i2 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(c6928md);
                case 3:
                    return zzdob.m19719r(zzkb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0002\u0000\u0002\u0004\u0001\u0003\u0007\u0002\u0004\u0016\u0005\u0003\u0003", new Object[]{"zzdj", "zzjw", "zzjx", "zzjy", "zzjz", "zzka"});
                case 4:
                    return zzkb;
                case 5:
                    zzdpv<zzb> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzb.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzkb);
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
        private static final zzc zzke;
        private int zzdj;
        private zzdmr zzkc;
        private zzdmr zzkd;

        public static final class zza extends zzdob.zza<zzc, zza> implements zzdpm {
            private zza() {
                super(zzc.zzke);
            }

            /* synthetic */ zza(C6928md c6928md) {
                this();
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzke = zzcVar;
            zzdob.m19721t(zzc.class, zzcVar);
        }

        private zzc() {
            zzdmr zzdmrVar = zzdmr.f25661f;
            this.zzkc = zzdmrVar;
            this.zzkd = zzdmrVar;
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            C6928md c6928md = null;
            switch (C6928md.f19912a[i2 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(c6928md);
                case 3:
                    return zzdob.m19719r(zzke, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0000\u0002\n\u0001", new Object[]{"zzdj", "zzkc", "zzkd"});
                case 4:
                    return zzke;
                case 5:
                    zzdpv<zzc> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzc.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzke);
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
        private static volatile zzdpv<zzd> zzdv;
        private static final zzd zzkj;
        private int zzdj;
        private zzdmr zzkf;
        private zzdmr zzkg;
        private zzdmr zzkh;
        private zzdmr zzki;

        public static final class zza extends zzdob.zza<zzd, zza> implements zzdpm {
            private zza() {
                super(zzd.zzkj);
            }

            /* renamed from: A */
            public final zza m18201A(zzdmr zzdmrVar) {
                m19735p();
                ((zzd) this.f25755g).m18195L(zzdmrVar);
                return this;
            }

            /* renamed from: u */
            public final zza m18202u(zzdmr zzdmrVar) {
                m19735p();
                ((zzd) this.f25755g).m18192I(zzdmrVar);
                return this;
            }

            /* renamed from: v */
            public final zza m18203v(zzdmr zzdmrVar) {
                m19735p();
                ((zzd) this.f25755g).m18193J(zzdmrVar);
                return this;
            }

            /* renamed from: w */
            public final zza m18204w(zzdmr zzdmrVar) {
                m19735p();
                ((zzd) this.f25755g).m18194K(zzdmrVar);
                return this;
            }

            /* synthetic */ zza(C6928md c6928md) {
                this();
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzkj = zzdVar;
            zzdob.m19721t(zzd.class, zzdVar);
        }

        private zzd() {
            zzdmr zzdmrVar = zzdmr.f25661f;
            this.zzkf = zzdmrVar;
            this.zzkg = zzdmrVar;
            this.zzkh = zzdmrVar;
            this.zzki = zzdmrVar;
        }

        /* renamed from: D */
        public static zza m18187D() {
            return (zza) ((zzdob.zza) zzkj.mo17725q(zzdob.zze.f25762e, null, null));
        }

        /* renamed from: F */
        public static zzd m18189F(byte[] bArr, zzdno zzdnoVar) throws zzdok {
            return (zzd) zzdob.m19718p(zzkj, bArr, zzdnoVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: I */
        public final void m18192I(zzdmr zzdmrVar) {
            zzdmrVar.getClass();
            this.zzdj |= 1;
            this.zzkf = zzdmrVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: J */
        public final void m18193J(zzdmr zzdmrVar) {
            zzdmrVar.getClass();
            this.zzdj |= 2;
            this.zzkg = zzdmrVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: K */
        public final void m18194K(zzdmr zzdmrVar) {
            zzdmrVar.getClass();
            this.zzdj |= 4;
            this.zzkh = zzdmrVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: L */
        public final void m18195L(zzdmr zzdmrVar) {
            zzdmrVar.getClass();
            this.zzdj |= 8;
            this.zzki = zzdmrVar;
        }

        /* renamed from: B */
        public final zzdmr m18197B() {
            return this.zzkh;
        }

        /* renamed from: C */
        public final zzdmr m18198C() {
            return this.zzki;
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            C6928md c6928md = null;
            switch (C6928md.f19912a[i2 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(c6928md);
                case 3:
                    return zzdob.m19719r(zzkj, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0000\u0002\n\u0001\u0003\n\u0002\u0004\n\u0003", new Object[]{"zzdj", "zzkf", "zzkg", "zzkh", "zzki"});
                case 4:
                    return zzkj;
                case 5:
                    zzdpv<zzd> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzd.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzkj);
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

        /* renamed from: y */
        public final zzdmr m18199y() {
            return this.zzkf;
        }

        /* renamed from: z */
        public final zzdmr m18200z() {
            return this.zzkg;
        }
    }

    public static final class zze extends zzdob<zze, zza> implements zzdpm {
        private static volatile zzdpv<zze> zzdv;
        private static final zze zzlb;
        private int zzdj;
        private long zzjw;
        private String zzkz = HttpUrl.FRAGMENT_ENCODE_SET;
        private zzdmr zzla = zzdmr.f25661f;

        public static final class zza extends zzdob.zza<zze, zza> implements zzdpm {
            private zza() {
                super(zze.zzlb);
            }

            /* synthetic */ zza(C6928md c6928md) {
                this();
            }
        }

        static {
            zze zzeVar = new zze();
            zzlb = zzeVar;
            zzdob.m19721t(zze.class, zzeVar);
        }

        private zze() {
        }

        /* renamed from: z */
        public static zze m18206z() {
            return zzlb;
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            C6928md c6928md = null;
            switch (C6928md.f19912a[i2 - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(c6928md);
                case 3:
                    return zzdob.m19719r(zzlb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u0002\u0000\u0003\b\u0001\u0004\n\u0002", new Object[]{"zzdj", "zzjw", "zzkz", "zzla"});
                case 4:
                    return zzlb;
                case 5:
                    zzdpv<zze> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zze.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzlb);
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
        public final boolean m18207x() {
            return (this.zzdj & 1) == 1;
        }

        /* renamed from: y */
        public final long m18208y() {
            return this.zzjw;
        }
    }

    public static final class zzf extends zzdob<zzf, zza> implements zzdpm {
        private static volatile zzdpv<zzf> zzdv;
        private static final zzf zzlc;
        private int zzdj;
        private String zzeo = HttpUrl.FRAGMENT_ENCODE_SET;

        public static final class zza extends zzdob.zza<zzf, zza> implements zzdpm {
            private zza() {
                super(zzf.zzlc);
            }

            /* renamed from: u */
            public final zza m18213u(String str) {
                m19735p();
                ((zzf) this.f25755g).m18211y(str);
                return this;
            }

            /* synthetic */ zza(C6928md c6928md) {
                this();
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzlc = zzfVar;
            zzdob.m19721t(zzf.class, zzfVar);
        }

        private zzf() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public final void m18211y(String str) {
            str.getClass();
            this.zzdj |= 1;
            this.zzeo = str;
        }

        /* renamed from: z */
        public static zza m18212z() {
            return (zza) ((zzdob.zza) zzlc.mo17725q(zzdob.zze.f25762e, null, null));
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            C6928md c6928md = null;
            switch (C6928md.f19912a[i2 - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza(c6928md);
                case 3:
                    return zzdob.m19719r(zzlc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"zzdj", "zzeo"});
                case 4:
                    return zzlc;
                case 5:
                    zzdpv<zzf> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzf.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzlc);
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
        private static volatile zzdpv<zzg> zzdv;
        private static final zzg zzle;
        private int zzdj;
        private zzdoj<zzdmr> zzld = zzdob.m19723v();
        private zzdmr zzkg = zzdmr.f25661f;
        private int zzgx = 1;
        private int zzgw = 1;

        public static final class zza extends zzdob.zza<zzg, zza> implements zzdpm {
            private zza() {
                super(zzg.zzle);
            }

            /* renamed from: u */
            public final zza m18222u(zzbw zzbwVar) {
                m19735p();
                ((zzg) this.f25755g).m18221z(zzbwVar);
                return this;
            }

            /* renamed from: v */
            public final zza m18223v(zzdmr zzdmrVar) {
                m19735p();
                ((zzg) this.f25755g).m18218E(zzdmrVar);
                return this;
            }

            /* renamed from: w */
            public final zza m18224w(zzdmr zzdmrVar) {
                m19735p();
                ((zzg) this.f25755g).m18217D(zzdmrVar);
                return this;
            }

            /* synthetic */ zza(C6928md c6928md) {
                this();
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzle = zzgVar;
            zzdob.m19721t(zzg.class, zzgVar);
        }

        private zzg() {
        }

        /* renamed from: B */
        public static zza m18215B() {
            return (zza) ((zzdob.zza) zzle.mo17725q(zzdob.zze.f25762e, null, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: D */
        public final void m18217D(zzdmr zzdmrVar) {
            zzdmrVar.getClass();
            this.zzdj |= 1;
            this.zzkg = zzdmrVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: E */
        public final void m18218E(zzdmr zzdmrVar) {
            zzdmrVar.getClass();
            if (!this.zzld.mo16107m0()) {
                zzdoj<zzdmr> zzdojVar = this.zzld;
                int size = zzdojVar.size();
                this.zzld = zzdojVar.mo14989N(size == 0 ? 10 : size << 1);
            }
            this.zzld.add(zzdmrVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public final void m18221z(zzbw zzbwVar) {
            zzbwVar.getClass();
            this.zzdj |= 4;
            this.zzgw = zzbwVar.mo17879i();
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            C6928md c6928md = null;
            switch (C6928md.f19912a[i2 - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza(c6928md);
                case 3:
                    return zzdob.m19719r(zzle, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002\n\u0000\u0003\f\u0001\u0004\f\u0002", new Object[]{"zzdj", "zzld", "zzkg", "zzgx", zzcc.m18654g(), "zzgw", zzbw.m18408g()});
                case 4:
                    return zzle;
                case 5:
                    zzdpv<zzg> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzg.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzle);
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
