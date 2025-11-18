package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
public final class zzdkz implements zzdky<Cipher> {
    @Override // com.google.android.gms.internal.ads.zzdky
    /* renamed from: a */
    public final /* synthetic */ Cipher mo19570a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
