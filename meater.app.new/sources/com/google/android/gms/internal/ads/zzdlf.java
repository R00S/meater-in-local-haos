package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;

/* loaded from: classes2.dex */
public final class zzdlf implements zzdky<Signature> {
    @Override // com.google.android.gms.internal.ads.zzdky
    /* renamed from: a */
    public final /* synthetic */ Signature mo19570a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
