package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
final class n30 implements ThreadFactory {

    /* renamed from: f */
    private final /* synthetic */ String f19982f;

    n30(String str) {
        this.f19982f = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f19982f);
    }
}
