package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
final class m00 implements ThreadFactory {

    /* renamed from: f */
    private final /* synthetic */ String f19855f;

    m00(String str) {
        this.f19855f = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f19855f);
    }
}
