package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class NamedThreadFactory implements ThreadFactory {

    /* renamed from: f */
    private final String f18004f;

    /* renamed from: g */
    private final ThreadFactory f18005g = Executors.defaultThreadFactory();

    @KeepForSdk
    public NamedThreadFactory(String str) {
        Preconditions.m14373l(str, "Name must not be null");
        this.f18004f = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f18005g.newThread(new RunnableC6454a(runnable, 0));
        threadNewThread.setName(this.f18004f);
        return threadNewThread;
    }
}
