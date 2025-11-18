package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzdap extends zzdob<zzdap, zzb> implements zzdpm {
    private static volatile zzdpv<zzdap> zzdv;
    private static final zzdoi<Integer, zza> zzgof = new C7200tq();
    private static final zzdap zzgoj;
    private int zzdj;
    private zzdoh zzgoe = zzdob.m19722u();
    private String zzgog = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzgoh = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzgoi = HttpUrl.FRAGMENT_ENCODE_SET;

    public enum zza implements zzdoe {
        BLOCKED_REASON_UNKNOWN(1),
        BLOCKED_REASON_BACKGROUND(2);


        /* renamed from: h */
        private static final zzdof<zza> f25441h = new C7274vq();

        /* renamed from: j */
        private final int f25443j;

        zza(int i2) {
            this.f25443j = i2;
        }

        /* renamed from: g */
        public static zzdog m19154g() {
            return C7311wq.f20867a;
        }

        /* renamed from: k */
        public static zza m19155k(int i2) {
            if (i2 == 1) {
                return BLOCKED_REASON_UNKNOWN;
            }
            if (i2 != 2) {
                return null;
            }
            return BLOCKED_REASON_BACKGROUND;
        }

        @Override // com.google.android.gms.internal.ads.zzdoe
        /* renamed from: i */
        public final int mo17879i() {
            return this.f25443j;
        }
    }

    public static final class zzb extends zzdob.zza<zzdap, zzb> implements zzdpm {
        private zzb() {
            super(zzdap.zzgoj);
        }

        /* renamed from: u */
        public final zzb m19156u(zza zzaVar) {
            m19735p();
            ((zzdap) this.f25755g).m19151x(zzaVar);
            return this;
        }

        /* renamed from: v */
        public final zzb m19157v(String str) {
            m19735p();
            ((zzdap) this.f25755g).m19150C(str);
            return this;
        }

        /* synthetic */ zzb(C7200tq c7200tq) {
            this();
        }
    }

    static {
        zzdap zzdapVar = new zzdap();
        zzgoj = zzdapVar;
        zzdob.m19721t(zzdap.class, zzdapVar);
    }

    private zzdap() {
    }

    /* renamed from: A */
    public static zzb m19148A() {
        return (zzb) ((zzdob.zza) zzgoj.mo17725q(zzdob.zze.f25762e, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public final void m19150C(String str) {
        str.getClass();
        this.zzdj |= 1;
        this.zzgog = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public final void m19151x(zza zzaVar) {
        zzaVar.getClass();
        if (!this.zzgoe.mo16107m0()) {
            zzdoh zzdohVar = this.zzgoe;
            int size = zzdohVar.size();
            this.zzgoe = zzdohVar.mo14989N(size == 0 ? 10 : size << 1);
        }
        this.zzgoe.mo15174Z0(zzaVar.mo17879i());
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C7200tq c7200tq = null;
        switch (C7237uq.f20648a[i2 - 1]) {
            case 1:
                return new zzdap();
            case 2:
                return new zzb(c7200tq);
            case 3:
                return zzdob.m19719r(zzgoj, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002\b\u0000\u0003\b\u0001\u0004\b\u0002", new Object[]{"zzdj", "zzgoe", zza.m19154g(), "zzgog", "zzgoh", "zzgoi"});
            case 4:
                return zzgoj;
            case 5:
                zzdpv<zzdap> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzdap.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzgoj);
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
