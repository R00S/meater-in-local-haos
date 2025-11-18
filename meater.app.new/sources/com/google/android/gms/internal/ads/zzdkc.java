package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* loaded from: classes2.dex */
public final class zzdkc implements zzdbq {

    /* renamed from: a */
    private static final byte[] f25607a = new byte[0];

    /* renamed from: b */
    private final zzdke f25608b;

    /* renamed from: c */
    private final String f25609c;

    /* renamed from: d */
    private final byte[] f25610d;

    /* renamed from: e */
    private final zzdkv f25611e;

    /* renamed from: f */
    private final zzdka f25612f;

    public zzdkc(ECPublicKey eCPublicKey, byte[] bArr, String str, zzdkv zzdkvVar, zzdka zzdkaVar) throws GeneralSecurityException {
        zzdkr.m19564g(eCPublicKey);
        this.f25608b = new zzdke(eCPublicKey);
        this.f25610d = bArr;
        this.f25609c = str;
        this.f25611e = zzdkvVar;
        this.f25612f = zzdkaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbq
    /* renamed from: a */
    public final byte[] mo15822a(byte[] bArr, byte[] bArr2) throws IllegalStateException, GeneralSecurityException {
        zzdkf zzdkfVarM19555a = this.f25608b.m19555a(this.f25609c, this.f25610d, bArr2, this.f25612f.mo15930b(), this.f25611e);
        byte[] bArrMo15598a = this.f25612f.mo15929a(zzdkfVarM19555a.m19557b()).mo15598a(bArr, f25607a);
        byte[] bArrM19556a = zzdkfVarM19555a.m19556a();
        return ByteBuffer.allocate(bArrM19556a.length + bArrMo15598a.length).put(bArrM19556a).put(bArrMo15598a).array();
    }
}
