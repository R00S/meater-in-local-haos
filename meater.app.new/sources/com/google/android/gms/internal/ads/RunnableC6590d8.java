package com.google.android.gms.internal.ads;

import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.d8 */
/* loaded from: classes2.dex */
final class RunnableC6590d8 implements Runnable {
    RunnableC6590d8(C6553c8 c6553c8) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
