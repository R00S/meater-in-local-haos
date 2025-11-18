package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdap;
import com.google.android.gms.internal.ads.zzdob;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzdau extends zzdob<zzdau, zza> implements zzdpm {
    private static volatile zzdpv<zzdau> zzdv;
    private static final zzdau zzgoq;
    private int zzdj;
    private int zzgon;
    private zzdap zzgop;
    private String zzdk = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzgoo = HttpUrl.FRAGMENT_ENCODE_SET;

    public static final class zza extends zzdob.zza<zzdau, zza> implements zzdpm {
        private zza() {
            super(zzdau.zzgoq);
        }

        /* renamed from: u */
        public final zza m19166u(zzdap.zzb zzbVar) {
            m19735p();
            ((zzdau) this.f25755g).m19163x(zzbVar);
            return this;
        }

        /* renamed from: v */
        public final zza m19167v(zzb zzbVar) {
            m19735p();
            ((zzdau) this.f25755g).m19164y(zzbVar);
            return this;
        }

        /* renamed from: w */
        public final zza m19168w(String str) {
            m19735p();
            ((zzdau) this.f25755g).m19162E(str);
            return this;
        }

        /* synthetic */ zza(C7348xq c7348xq) {
            this();
        }
    }

    public enum zzb implements zzdoe {
        EVENT_TYPE_UNKNOWN(0),
        BLOCKED_IMPRESSION(1);


        /* renamed from: h */
        private static final zzdof<zzb> f25446h = new C7385yq();

        /* renamed from: j */
        private final int f25448j;

        zzb(int i2) {
            this.f25448j = i2;
        }

        /* renamed from: g */
        public static zzdog m19169g() {
            return C7422zq.f21474a;
        }

        /* renamed from: k */
        public static zzb m19170k(int i2) {
            if (i2 == 0) {
                return EVENT_TYPE_UNKNOWN;
            }
            if (i2 != 1) {
                return null;
            }
            return BLOCKED_IMPRESSION;
        }

        @Override // com.google.android.gms.internal.ads.zzdoe
        /* renamed from: i */
        public final int mo17879i() {
            return this.f25448j;
        }
    }

    static {
        zzdau zzdauVar = new zzdau();
        zzgoq = zzdauVar;
        zzdob.m19721t(zzdau.class, zzdauVar);
    }

    private zzdau() {
    }

    /* renamed from: C */
    public static zza m19160C() {
        return (zza) ((zzdob.zza) zzgoq.mo17725q(zzdob.zze.f25762e, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public final void m19162E(String str) {
        str.getClass();
        this.zzdj |= 2;
        this.zzdk = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public final void m19163x(zzdap.zzb zzbVar) {
        this.zzgop = (zzdap) ((zzdob) zzbVar.mo19736p0());
        this.zzdj |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public final void m19164y(zzb zzbVar) {
        zzbVar.getClass();
        this.zzdj |= 1;
        this.zzgon = zzbVar.mo17879i();
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C7348xq c7348xq = null;
        switch (C7348xq.f20981a[i2 - 1]) {
            case 1:
                return new zzdau();
            case 2:
                return new zza(c7348xq);
            case 3:
                return zzdob.m19719r(zzgoq, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\b\u0002\u0004\t\u0003", new Object[]{"zzdj", "zzgon", zzb.m19169g(), "zzdk", "zzgoo", "zzgop"});
            case 4:
                return zzgoq;
            case 5:
                zzdpv<zzdau> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzdau.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzgoq);
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
