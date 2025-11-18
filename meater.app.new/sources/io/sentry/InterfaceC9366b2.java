package io.sentry;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ISentryExecutorService.java */
@ApiStatus.Internal
/* renamed from: io.sentry.b2 */
/* loaded from: classes2.dex */
public interface InterfaceC9366b2 {
    /* renamed from: a */
    void mo30029a(long j2);

    /* renamed from: b */
    Future<?> mo30030b(Runnable runnable, long j2) throws RejectedExecutionException;

    boolean isClosed();

    Future<?> submit(Runnable runnable) throws RejectedExecutionException;
}
