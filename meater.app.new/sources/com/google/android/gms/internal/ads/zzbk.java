package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzbk {

    public static final class zza extends zzdob<zza, C11478zza> implements zzdpm {
        private static volatile zzdpv<zza> zzdv;
        private static final zza zzdy;
        private int zzdj;
        private zzb zzdw;
        private zzc zzdx;

        /* renamed from: com.google.android.gms.internal.ads.zzbk$zza$zza, reason: collision with other inner class name */
        public static final class C11478zza extends zzdob.zza<zza, C11478zza> implements zzdpm {
            private C11478zza() {
                super(zza.zzdy);
            }

            /* synthetic */ C11478zza(C7001oc c7001oc) {
                this();
            }
        }

        static {
            zza zzaVar = new zza();
            zzdy = zzaVar;
            zzdob.m19721t(zza.class, zzaVar);
        }

        private zza() {
        }

        /* renamed from: x */
        public static zza m17803x(byte[] bArr, zzdno zzdnoVar) throws zzdok {
            return (zza) zzdob.m19718p(zzdy, bArr, zzdnoVar);
        }

        /* renamed from: A */
        public final boolean m17804A() {
            return (this.zzdj & 2) == 2;
        }

        /* renamed from: B */
        public final zzc m17805B() {
            zzc zzcVar = this.zzdx;
            return zzcVar == null ? zzc.m17812z() : zzcVar;
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            C7001oc c7001oc = null;
            switch (C7001oc.f20186a[i2 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C11478zza(c7001oc);
                case 3:
                    return zzdob.m19719r(zzdy, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001", new Object[]{"zzdj", "zzdw", "zzdx"});
                case 4:
                    return zzdy;
                case 5:
                    zzdpv<zza> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zza.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzdy);
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
        public final boolean m17806y() {
            return (this.zzdj & 1) == 1;
        }

        /* renamed from: z */
        public final zzb m17807z() {
            zzb zzbVar = this.zzdw;
            return zzbVar == null ? zzb.m17808x() : zzbVar;
        }
    }

    public static final class zzb extends zzdob<zzb, zza> implements zzdpm {
        private static volatile zzdpv<zzb> zzdv;
        private static final zzb zzea;
        private int zzdj;
        private int zzdz = 2;

        public static final class zza extends zzdob.zza<zzb, zza> implements zzdpm {
            private zza() {
                super(zzb.zzea);
            }

            /* synthetic */ zza(C7001oc c7001oc) {
                this();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzea = zzbVar;
            zzdob.m19721t(zzb.class, zzbVar);
        }

        private zzb() {
        }

        /* renamed from: x */
        public static zzb m17808x() {
            return zzea;
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            C7001oc c7001oc = null;
            switch (C7001oc.f20186a[i2 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(c7001oc);
                case 3:
                    return zzdob.m19719r(zzea, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b\f\u0000", new Object[]{"zzdj", "zzdz", zzbm.m17877g()});
                case 4:
                    return zzea;
                case 5:
                    zzdpv<zzb> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzb.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzea);
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

        /* renamed from: z */
        public final zzbm m17810z() {
            zzbm zzbmVarM17878k = zzbm.m17878k(this.zzdz);
            return zzbmVarM17878k == null ? zzbm.ENUM_SIGNAL_SOURCE_ADSHIELD : zzbmVarM17878k;
        }
    }

    public static final class zzc extends zzdob<zzc, zza> implements zzdpm {
        private static volatile zzdpv<zzc> zzdv;
        private static final zzc zzep;
        private int zzdj;
        private String zzej = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzek = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzel = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzem = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzen = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzeo = HttpUrl.FRAGMENT_ENCODE_SET;

        public static final class zza extends zzdob.zza<zzc, zza> implements zzdpm {
            private zza() {
                super(zzc.zzep);
            }

            /* synthetic */ zza(C7001oc c7001oc) {
                this();
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzep = zzcVar;
            zzdob.m19721t(zzc.class, zzcVar);
        }

        private zzc() {
        }

        /* renamed from: z */
        public static zzc m17812z() {
            return zzep;
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            C7001oc c7001oc = null;
            switch (C7001oc.f20186a[i2 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(c7001oc);
                case 3:
                    return zzdob.m19719r(zzep, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\b\u0005", new Object[]{"zzdj", "zzej", "zzek", "zzel", "zzem", "zzen", "zzeo"});
                case 4:
                    return zzep;
                case 5:
                    zzdpv<zzc> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zzc.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzep);
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
        public final String m17813x() {
            return this.zzej;
        }

        /* renamed from: y */
        public final String m17814y() {
            return this.zzeo;
        }
    }
}
