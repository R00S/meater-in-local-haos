package com.google.firebase;

import android.os.SystemClock;
import com.google.auto.value.AutoValue;

/* compiled from: StartupTime.java */
@AutoValue
/* renamed from: com.google.firebase.n */
/* loaded from: classes2.dex */
public abstract class AbstractC8473n {
    /* renamed from: a */
    public static AbstractC8473n m26673a(long j2, long j3, long j4) {
        return new C8349g(j2, j3, j4);
    }

    /* renamed from: e */
    public static AbstractC8473n m26674e() {
        return m26673a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    /* renamed from: b */
    public abstract long mo26158b();

    /* renamed from: c */
    public abstract long mo26159c();

    /* renamed from: d */
    public abstract long mo26160d();
}
