package com.google.firebase.crashlytics.internal.p183n;

import android.os.Process;

/* compiled from: BackgroundPriorityRunnable.java */
/* renamed from: com.google.firebase.crashlytics.h.n.o */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC8220o implements Runnable {
    /* renamed from: a */
    protected abstract void mo25249a();

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        mo25249a();
    }
}
