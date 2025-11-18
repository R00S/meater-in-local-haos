package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.KeyAgreement;

/* loaded from: classes2.dex */
public final class zzdla implements zzdky<KeyAgreement> {
    @Override // com.google.android.gms.internal.ads.zzdky
    /* renamed from: a */
    public final /* synthetic */ KeyAgreement mo19570a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
