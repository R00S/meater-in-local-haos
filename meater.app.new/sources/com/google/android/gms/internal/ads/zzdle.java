package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Provider;

/* loaded from: classes2.dex */
public final class zzdle implements zzdky<MessageDigest> {
    @Override // com.google.android.gms.internal.ads.zzdky
    /* renamed from: a */
    public final /* synthetic */ MessageDigest mo19570a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
