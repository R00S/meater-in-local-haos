package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* loaded from: classes2.dex */
public final class zzdlo {

    /* renamed from: a */
    private static final ThreadLocal<SecureRandom> f25652a = new C7092qt();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static SecureRandom m19573a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    /* renamed from: c */
    public static byte[] m19575c(int i2) {
        byte[] bArr = new byte[i2];
        f25652a.get().nextBytes(bArr);
        return bArr;
    }
}
