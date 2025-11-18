package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzdgr extends zzdob<zzdgr, zza> implements zzdpm {
    private static volatile zzdpv<zzdgr> zzdv;
    private static final zzdgr zzguc;
    private String zzgtz = HttpUrl.FRAGMENT_ENCODE_SET;
    private zzdmr zzgua = zzdmr.f25661f;
    private int zzgub;

    public static final class zza extends zzdob.zza<zzdgr, zza> implements zzdpm {
        private zza() {
            super(zzdgr.zzguc);
        }

        /* renamed from: u */
        public final zza m19419u(zzb zzbVar) {
            m19735p();
            ((zzdgr) this.f25755g).m19413x(zzbVar);
            return this;
        }

        /* renamed from: v */
        public final zza m19420v(zzdmr zzdmrVar) {
            m19735p();
            ((zzdgr) this.f25755g).m19411H(zzdmrVar);
            return this;
        }

        /* renamed from: w */
        public final zza m19421w(String str) {
            m19735p();
            ((zzdgr) this.f25755g).m19412I(str);
            return this;
        }

        /* synthetic */ zza(C7350xs c7350xs) {
            this();
        }
    }

    public enum zzb implements zzdoe {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);


        /* renamed from: l */
        private static final zzdof<zzb> f25557l = new C7387ys();

        /* renamed from: n */
        private final int f25559n;

        zzb(int i2) {
            this.f25559n = i2;
        }

        /* renamed from: g */
        public static zzb m19422g(int i2) {
            if (i2 == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i2 == 1) {
                return SYMMETRIC;
            }
            if (i2 == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i2 == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i2 != 4) {
                return null;
            }
            return REMOTE;
        }

        @Override // com.google.android.gms.internal.ads.zzdoe
        /* renamed from: i */
        public final int mo17879i() {
            if (this != UNRECOGNIZED) {
                return this.f25559n;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        zzdgr zzdgrVar = new zzdgr();
        zzguc = zzdgrVar;
        zzdob.m19721t(zzdgr.class, zzdgrVar);
    }

    private zzdgr() {
    }

    /* renamed from: E */
    public static zza m19408E() {
        return (zza) ((zzdob.zza) zzguc.mo17725q(zzdob.zze.f25762e, null, null));
    }

    /* renamed from: F */
    public static zzdgr m19409F() {
        return zzguc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public final void m19411H(zzdmr zzdmrVar) {
        zzdmrVar.getClass();
        this.zzgua = zzdmrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public final void m19412I(String str) {
        str.getClass();
        this.zzgtz = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public final void m19413x(zzb zzbVar) {
        zzbVar.getClass();
        this.zzgub = zzbVar.mo17879i();
    }

    /* renamed from: B */
    public final String m19416B() {
        return this.zzgtz;
    }

    /* renamed from: C */
    public final zzdmr m19417C() {
        return this.zzgua;
    }

    /* renamed from: D */
    public final zzb m19418D() {
        zzb zzbVarM19422g = zzb.m19422g(this.zzgub);
        return zzbVarM19422g == null ? zzb.UNRECOGNIZED : zzbVarM19422g;
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C7350xs c7350xs = null;
        switch (C7350xs.f20982a[i2 - 1]) {
            case 1:
                return new zzdgr();
            case 2:
                return new zza(c7350xs);
            case 3:
                return zzdob.m19719r(zzguc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzgtz", "zzgua", "zzgub"});
            case 4:
                return zzguc;
            case 5:
                zzdpv<zzdgr> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzdgr.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzguc);
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
