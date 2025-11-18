package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzbi {

    public static final class zza extends zzdob<zza, C11477zza> implements zzdpm {
        private static final zza zzdu;
        private static volatile zzdpv<zza> zzdv;
        private int zzdj;
        private long zzdl;
        private long zzdp;
        private long zzdq;
        private long zzds;
        private String zzdk = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzdm = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzdn = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzdo = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzdr = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzdt = HttpUrl.FRAGMENT_ENCODE_SET;

        /* renamed from: com.google.android.gms.internal.ads.zzbi$zza$zza, reason: collision with other inner class name */
        public static final class C11477zza extends zzdob.zza<zza, C11477zza> implements zzdpm {
            private C11477zza() {
                super(zza.zzdu);
            }

            /* renamed from: A */
            public final C11477zza m17726A(String str) {
                m19735p();
                ((zza) this.f25755g).m17719E(str);
                return this;
            }

            /* renamed from: u */
            public final C11477zza m17727u(long j2) {
                m19735p();
                ((zza) this.f25755g).m17715A(j2);
                return this;
            }

            /* renamed from: v */
            public final C11477zza m17728v(String str) {
                m19735p();
                ((zza) this.f25755g).m17717C(str);
                return this;
            }

            /* renamed from: w */
            public final C11477zza m17729w(String str) {
                m19735p();
                ((zza) this.f25755g).m17718D(str);
                return this;
            }

            /* synthetic */ C11477zza(C7148sb c7148sb) {
                this();
            }
        }

        static {
            zza zzaVar = new zza();
            zzdu = zzaVar;
            zzdob.m19721t(zza.class, zzaVar);
        }

        private zza() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: A */
        public final void m17715A(long j2) {
            this.zzdj |= 2;
            this.zzdl = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C */
        public final void m17717C(String str) {
            str.getClass();
            this.zzdj |= 1;
            this.zzdk = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: D */
        public final void m17718D(String str) {
            str.getClass();
            this.zzdj |= 4;
            this.zzdm = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: E */
        public final void m17719E(String str) {
            str.getClass();
            this.zzdj |= 8;
            this.zzdn = str;
        }

        /* renamed from: F */
        public static C11477zza m17720F() {
            return (C11477zza) ((zzdob.zza) zzdu.mo17725q(zzdob.zze.f25762e, null, null));
        }

        @Override // com.google.android.gms.internal.ads.zzdob
        /* renamed from: q */
        protected final Object mo17725q(int i2, Object obj, Object obj2) {
            C7148sb c7148sb = null;
            switch (C7148sb.f20516a[i2 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C11477zza(c7148sb);
                case 3:
                    return zzdob.m19719r(zzdu, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\u0002\u0005\u0007\u0002\u0006\b\b\u0007\t\u0002\b\n\b\t", new Object[]{"zzdj", "zzdk", "zzdl", "zzdm", "zzdn", "zzdo", "zzdp", "zzdq", "zzdr", "zzds", "zzdt"});
                case 4:
                    return zzdu;
                case 5:
                    zzdpv<zza> zzbVar = zzdv;
                    if (zzbVar == null) {
                        synchronized (zza.class) {
                            zzbVar = zzdv;
                            if (zzbVar == null) {
                                zzbVar = new zzdob.zzb<>(zzdu);
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
