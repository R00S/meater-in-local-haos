package io.sentry.util;

import org.jetbrains.annotations.ApiStatus;

/* compiled from: LazyEvaluator.java */
@ApiStatus.Internal
/* renamed from: io.sentry.util.o */
/* loaded from: classes2.dex */
public final class C9644o<T> {

    /* renamed from: a */
    private T f36931a = null;

    /* renamed from: b */
    private final a<T> f36932b;

    /* compiled from: LazyEvaluator.java */
    /* renamed from: io.sentry.util.o$a */
    public interface a<T> {
        /* renamed from: a */
        T mo30402a();
    }

    public C9644o(a<T> aVar) {
        this.f36932b = aVar;
    }

    /* renamed from: a */
    public synchronized T m31798a() {
        if (this.f36931a == null) {
            this.f36931a = this.f36932b.mo30402a();
        }
        return this.f36931a;
    }
}
