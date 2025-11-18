package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.base.b */
/* loaded from: classes2.dex */
final class C7446b implements zal {
    private C7446b() {
    }

    @Override // com.google.android.gms.internal.base.zal
    /* renamed from: a */
    public final ExecutorService mo20888a(int i2, ThreadFactory threadFactory, int i3) {
        return Executors.newFixedThreadPool(2, threadFactory);
    }
}
