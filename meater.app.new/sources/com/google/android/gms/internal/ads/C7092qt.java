package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* renamed from: com.google.android.gms.internal.ads.qt */
/* loaded from: classes2.dex */
final class C7092qt extends ThreadLocal<SecureRandom> {
    C7092qt() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ SecureRandom initialValue() {
        return zzdlo.m19573a();
    }
}
