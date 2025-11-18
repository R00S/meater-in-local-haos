package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: ListenableFuture.java */
/* loaded from: classes2.dex */
public interface f<V> extends Future<V> {
    void c(Runnable runnable, Executor executor);
}
