package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzdhc extends zzdob<zzdhc, zza> implements zzdpm {
    private static volatile zzdpv<zzdhc> zzdv;
    private static final zzdhc zzgvf;
    private int zzdj;
    private int zzgux;
    private zzdoj<zzb> zzgve = zzdob.m19723v();

    public static final class zza extends zzdob.zza<zzdhc, zza> implements zzdpm {
        private zza() {
            super(zzdhc.zzgvf);
        }

        /* renamed from: u */
        public final zza m19474u(zzb zzbVar) {
            m19735p();
            ((zzdhc) this.f25755g).m19471x(zzbVar);
            return this;
        }

        /* renamed from: v */
        public final zza m19475v(int i2) {
            m19735p();
            ((zzdhc) this.f25755g).m19470C(i2);
            return this;
        }

        /* synthetic */ zza(C6611dt c6611dt) {
            this();
        }
    }

    public static final class zzb extends zzdob<zzb, zza> implements zzdpm {
        private static volatile zzdpv<zzb> zzdv;
        private static final zzb zzgvg;
        private String zzgtz = HttpUrl.FRAGMENT_ENCODE_SET;
        private int zzguq;
        private int zzgvb;
        private int zzgvc;

        public static final class zza extends zzdob.zza<zzb, zza> implements zzdpm {
            private zza() {
                super(zzb.zzgvg);
            }

            /* renamed from: A */
            public final zza m19486A(String str) {
                m19735p();
                ((zzb) this.f25755g).m19482G(str);
                return this;
            }

            /* renamed from: u */
            public final zza m19487u(zzdgu zzdguVar) {
                m19735p();
                ((zzb) this.f25755g).m19483x(zzdguVar);
                return this;
            }

            /* renamed from: v */
            public final zza m19488v(zzdhm zzdhmVar) {
                m19735p();
                ((zzb) this.f25755g).m19478C(zzdhmVar);
                return this;
            }

            /* renamed from: w */
            public final zza m19489w(int i2) {
                m19735p();
                ((zzb) this.f25755g).m19481F(i2);
                return this;
            }

            /* synthetic */ zza(C6611dt c6611dt) {
                this();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzgvg = zzbVar;
            zzdob.m19721t(zzb.class, zzbVar);
        }

        private zzb() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C */
        public final void m19478C(zzdhm zzdhmVar) {
            zzdhmVar.getClass();
            this.zzguq = zzdhmVar.mo17879i();
        }

        /* renamed from: D */
        public static zza m19479D() {
            return (zza) ((zzdob.zza) zzgvg.mo17725q(zzdob.zze.f25762e, null, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: F */
        public final void m19481F(int i2) {
            this.zzgvc = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: G */
        public final void m19482G(String str) {
            str.getClass();
            this.zzgtz = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x */
        public final void m19483x(zzdgu zzdguVar) {
            zzdguVar.getClass();
            this.zzgvb = zzdguVar.mo17879i();
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            C6611dt c6611dt = null;
            switch (C6611dt.f18700a[i2 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(c6611dt);
                case 3:
                    return zzdob.m19719r(zzgvg, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzgtz", "zzgvb", "zzgvc", "zzguq"});
                case 4:
                    return zzgvg;
                case 5:
                    zzdpv<zzb> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzb.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzgvg);
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
        zzdhc zzdhcVar = new zzdhc();
        zzgvf = zzdhcVar;
        zzdob.m19721t(zzdhc.class, zzdhcVar);
    }

    private zzdhc() {
    }

    /* renamed from: A */
    public static zza m19468A() {
        return (zza) ((zzdob.zza) zzgvf.mo17725q(zzdob.zze.f25762e, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public final void m19470C(int i2) {
        this.zzgux = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public final void m19471x(zzb zzbVar) {
        zzbVar.getClass();
        if (!this.zzgve.mo16107m0()) {
            zzdoj<zzb> zzdojVar = this.zzgve;
            int size = zzdojVar.size();
            this.zzgve = zzdojVar.mo14989N(size == 0 ? 10 : size << 1);
        }
        this.zzgve.add(zzbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C6611dt c6611dt = null;
        switch (C6611dt.f18700a[i2 - 1]) {
            case 1:
                return new zzdhc();
            case 2:
                return new zza(c6611dt);
            case 3:
                return zzdob.m19719r(zzgvf, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzdj", "zzgux", "zzgve", zzb.class});
            case 4:
                return zzgvf;
            case 5:
                zzdpv<zzdhc> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzdhc.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzgvf);
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
