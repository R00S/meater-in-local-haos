package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import android.os.Process;

/* loaded from: classes2.dex */
public final class zzko extends HandlerThread {

    /* renamed from: f */
    private final int f26427f;

    public zzko(String str, int i2) {
        super(str);
        this.f26427f = -16;
    }

    @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.f26427f);
        super.run();
    }
}
