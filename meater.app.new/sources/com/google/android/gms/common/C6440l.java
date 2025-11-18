package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.common.l */
/* loaded from: classes2.dex */
final class C6440l extends C6441m {

    /* renamed from: f */
    private final Callable f17881f;

    /* synthetic */ C6440l(Callable callable, zzu zzuVar) {
        super();
        this.f17881f = callable;
    }

    @Override // com.google.android.gms.common.C6441m
    /* renamed from: a */
    final String mo14527a() {
        try {
            return (String) this.f17881f.call();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
