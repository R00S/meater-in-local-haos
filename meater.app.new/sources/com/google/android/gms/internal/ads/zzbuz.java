package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbuz<T> {

    /* renamed from: a */
    public T f23593a;

    /* renamed from: b */
    public Executor f23594b;

    public zzbuz(T t, Executor executor) {
        this.f23593a = t;
        this.f23594b = executor;
    }

    /* renamed from: a */
    public static <T> zzbuz<T> m18387a(T t, Executor executor) {
        return new zzbuz<>(t, executor);
    }
}
