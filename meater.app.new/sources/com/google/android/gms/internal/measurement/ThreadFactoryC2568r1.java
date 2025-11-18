package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.r1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class ThreadFactoryC2568r1 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private ThreadFactory f34283a = Executors.defaultThreadFactory();

    ThreadFactoryC2568r1(C2497i1 c2497i1) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f34283a.newThread(runnable);
        threadNewThread.setName("ScionFrontendApi");
        return threadNewThread;
    }
}
