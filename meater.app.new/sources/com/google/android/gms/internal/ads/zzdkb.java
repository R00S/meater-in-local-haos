package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

/* loaded from: classes2.dex */
public final class zzdkb implements zzdbp {

    /* renamed from: a */
    private static final byte[] f25600a = new byte[0];

    /* renamed from: b */
    private final ECPrivateKey f25601b;

    /* renamed from: c */
    private final zzdkd f25602c;

    /* renamed from: d */
    private final String f25603d;

    /* renamed from: e */
    private final byte[] f25604e;

    /* renamed from: f */
    private final zzdkv f25605f;

    /* renamed from: g */
    private final zzdka f25606g;

    public zzdkb(ECPrivateKey eCPrivateKey, byte[] bArr, String str, zzdkv zzdkvVar, zzdka zzdkaVar) throws GeneralSecurityException {
        this.f25601b = eCPrivateKey;
        this.f25602c = new zzdkd(eCPrivateKey);
        this.f25604e = bArr;
        this.f25603d = str;
        this.f25605f = zzdkvVar;
        this.f25606g = zzdkaVar;
    }
}
