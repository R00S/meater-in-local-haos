package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzdgy extends zzdob<zzdgy, zza> implements zzdpm {
    private static volatile zzdpv<zzdgy> zzdv;
    private static final zzdgy zzguw;
    private int zzgut;
    private boolean zzguu;
    private String zzgus = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzgtz = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzguv = HttpUrl.FRAGMENT_ENCODE_SET;

    public static final class zza extends zzdob.zza<zzdgy, zza> implements zzdpm {
        private zza() {
            super(zzdgy.zzguw);
        }

        /* renamed from: A */
        public final zza m19445A(String str) {
            m19735p();
            ((zzdgy) this.f25755g).m19434L(str);
            return this;
        }

        /* renamed from: B */
        public final zza m19446B(String str) {
            m19735p();
            ((zzdgy) this.f25755g).m19436N(str);
            return this;
        }

        /* renamed from: u */
        public final zza m19447u(boolean z) {
            m19735p();
            ((zzdgy) this.f25755g).m19431I(true);
            return this;
        }

        /* renamed from: v */
        public final zza m19448v(int i2) {
            m19735p();
            ((zzdgy) this.f25755g).m19433K(0);
            return this;
        }

        /* renamed from: w */
        public final zza m19449w(String str) {
            m19735p();
            ((zzdgy) this.f25755g).m19435M(str);
            return this;
        }

        /* synthetic */ zza(C6537bt c6537bt) {
            this();
        }
    }

    static {
        zzdgy zzdgyVar = new zzdgy();
        zzguw = zzdgyVar;
        zzdob.m19721t(zzdgy.class, zzdgyVar);
    }

    private zzdgy() {
    }

    /* renamed from: F */
    public static zza m19428F() {
        return (zza) ((zzdob.zza) zzguw.mo17725q(zzdob.zze.f25762e, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public final void m19431I(boolean z) {
        this.zzguu = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public final void m19433K(int i2) {
        this.zzgut = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public final void m19434L(String str) {
        str.getClass();
        this.zzgtz = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public final void m19435M(String str) {
        str.getClass();
        this.zzgus = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public final void m19436N(String str) {
        str.getClass();
        this.zzguv = str;
    }

    /* renamed from: A */
    public final String m19440A() {
        return this.zzgtz;
    }

    /* renamed from: B */
    public final String m19441B() {
        return this.zzgus;
    }

    /* renamed from: C */
    public final int m19442C() {
        return this.zzgut;
    }

    /* renamed from: D */
    public final boolean m19443D() {
        return this.zzguu;
    }

    /* renamed from: E */
    public final String m19444E() {
        return this.zzguv;
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C6537bt c6537bt = null;
        switch (C6537bt.f18355a[i2 - 1]) {
            case 1:
                return new zzdgy();
            case 2:
                return new zza(c6537bt);
            case 3:
                return zzdob.m19719r(zzguw, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzgus", "zzgtz", "zzgut", "zzguu", "zzguv"});
            case 4:
                return zzguw;
            case 5:
                zzdpv<zzdgy> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzdgy.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzguw);
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
