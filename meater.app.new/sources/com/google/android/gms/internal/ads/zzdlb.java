package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;

/* loaded from: classes2.dex */
public final class zzdlb implements zzdky<KeyFactory> {
    @Override // com.google.android.gms.internal.ads.zzdky
    /* renamed from: a */
    public final /* synthetic */ KeyFactory mo19570a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
