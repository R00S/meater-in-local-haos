package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzdho extends zzdob<zzdho, zza> implements zzdpm {
    private static volatile zzdpv<zzdho> zzdv;
    private static final zzdho zzgvz;
    private int zzdj;
    private String zzgvx = HttpUrl.FRAGMENT_ENCODE_SET;
    private zzdoj<zzdgy> zzgvy = zzdob.m19723v();

    public static final class zza extends zzdob.zza<zzdho, zza> implements zzdpm {
        private zza() {
            super(zzdho.zzgvz);
        }

        /* renamed from: u */
        public final zza m19529u(zzdgy zzdgyVar) {
            m19735p();
            ((zzdho) this.f25755g).m19525x(zzdgyVar);
            return this;
        }

        /* renamed from: v */
        public final zza m19530v(String str) {
            m19735p();
            ((zzdho) this.f25755g).m19524D(str);
            return this;
        }

        /* synthetic */ zza(C6833jt c6833jt) {
            this();
        }
    }

    static {
        zzdho zzdhoVar = new zzdho();
        zzgvz = zzdhoVar;
        zzdob.m19721t(zzdho.class, zzdhoVar);
    }

    private zzdho() {
    }

    /* renamed from: B */
    public static zza m19522B() {
        return (zza) ((zzdob.zza) zzgvz.mo17725q(zzdob.zze.f25762e, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public final void m19524D(String str) {
        str.getClass();
        this.zzgvx = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public final void m19525x(zzdgy zzdgyVar) {
        zzdgyVar.getClass();
        if (!this.zzgvy.mo16107m0()) {
            zzdoj<zzdgy> zzdojVar = this.zzgvy;
            int size = zzdojVar.size();
            this.zzgvy = zzdojVar.mo14989N(size == 0 ? 10 : size << 1);
        }
        this.zzgvy.add(zzdgyVar);
    }

    /* renamed from: A */
    public final List<zzdgy> m19528A() {
        return this.zzgvy;
    }

    @Override // com.google.android.gms.internal.ads.zzdob
    /* renamed from: q */
    protected final Object mo17725q(int i2, Object obj, Object obj2) {
        C6833jt c6833jt = null;
        switch (C6833jt.f19500a[i2 - 1]) {
            case 1:
                return new zzdho();
            case 2:
                return new zza(c6833jt);
            case 3:
                return zzdob.m19719r(zzgvz, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzdj", "zzgvx", "zzgvy", zzdgy.class});
            case 4:
                return zzgvz;
            case 5:
                zzdpv<zzdho> zzbVar = zzdv;
                if (zzbVar == null) {
                    synchronized (zzdho.class) {
                        zzbVar = zzdv;
                        if (zzbVar == null) {
                            zzbVar = new zzdob.zzb<>(zzgvz);
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
