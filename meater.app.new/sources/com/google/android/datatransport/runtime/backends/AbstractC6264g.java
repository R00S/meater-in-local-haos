package com.google.android.datatransport.runtime.backends;

import com.google.auto.value.AutoValue;

/* compiled from: BackendResponse.java */
@AutoValue
/* renamed from: com.google.android.datatransport.runtime.backends.g */
/* loaded from: classes2.dex */
public abstract class AbstractC6264g {

    /* compiled from: BackendResponse.java */
    /* renamed from: com.google.android.datatransport.runtime.backends.g$a */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* renamed from: a */
    public static AbstractC6264g m13521a() {
        return new C6259b(a.FATAL_ERROR, -1L);
    }

    /* renamed from: d */
    public static AbstractC6264g m13522d() {
        return new C6259b(a.INVALID_PAYLOAD, -1L);
    }

    /* renamed from: e */
    public static AbstractC6264g m13523e(long j2) {
        return new C6259b(a.OK, j2);
    }

    /* renamed from: f */
    public static AbstractC6264g m13524f() {
        return new C6259b(a.TRANSIENT_ERROR, -1L);
    }

    /* renamed from: b */
    public abstract long mo13514b();

    /* renamed from: c */
    public abstract a mo13515c();
}
