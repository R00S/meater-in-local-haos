package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.ur */
/* loaded from: classes2.dex */
final class C7238ur implements zzdka {

    /* renamed from: a */
    private final String f20649a;

    /* renamed from: b */
    private final int f20650b;

    /* renamed from: c */
    private zzdet f20651c;

    /* renamed from: d */
    private zzddr f20652d;

    /* renamed from: e */
    private int f20653e;

    C7238ur(zzdgw zzdgwVar) throws GeneralSecurityException {
        String strM19426x = zzdgwVar.m19426x();
        this.f20649a = strM19426x;
        if (strM19426x.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzdev zzdevVarM19307y = zzdev.m19307y(zzdgwVar.m19427y());
                this.f20651c = (zzdet) zzdcf.m19219n(zzdgwVar);
                this.f20650b = zzdevVarM19307y.m19309x();
                return;
            } catch (zzdok e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
            }
        }
        if (!strM19426x.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            String strValueOf = String.valueOf(strM19426x);
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(strValueOf) : new String("unsupported AEAD DEM key type: "));
        }
        try {
            zzddt zzddtVarM19244A = zzddt.m19244A(zzdgwVar.m19427y());
            this.f20652d = (zzddr) zzdcf.m19219n(zzdgwVar);
            this.f20653e = zzddtVarM19244A.m19246x().m19269x();
            this.f20650b = this.f20653e + zzddtVarM19244A.m19247y().m19401x();
        } catch (zzdok e3) {
            throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdka
    /* renamed from: a */
    public final zzdbj mo15929a(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.f20650b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.f20649a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            return (zzdbj) zzdcf.m19213h(this.f20649a, (zzdet) ((zzdob) zzdet.m19298D().mo19590j(this.f20651c).m19305u(zzdmr.m19595A(bArr, 0, this.f20650b)).mo19736p0()), zzdbj.class);
        }
        if (!this.f20649a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new GeneralSecurityException("unknown DEM key type");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, this.f20653e);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, this.f20653e, this.f20650b);
        zzdeb zzdebVar = (zzdeb) ((zzdob) zzdeb.m19253F().mo19590j(this.f20652d.m19238E()).m19263u(zzdmr.m19596D(bArrCopyOfRange)).mo19736p0());
        return (zzdbj) zzdcf.m19213h(this.f20649a, (zzddr) ((zzdob) zzddr.m19233G().m19243w(this.f20652d.m19240x()).m19241u(zzdebVar).m19242v((zzdgl) ((zzdob) zzdgl.m19384E().mo19590j(this.f20652d.m19239F()).m19395u(zzdmr.m19596D(bArrCopyOfRange2)).mo19736p0())).mo19736p0()), zzdbj.class);
    }

    @Override // com.google.android.gms.internal.ads.zzdka
    /* renamed from: b */
    public final int mo15930b() {
        return this.f20650b;
    }
}
