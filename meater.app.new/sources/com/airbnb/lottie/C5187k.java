package com.airbnb.lottie;

import java.util.Arrays;

/* compiled from: LottieResult.java */
/* renamed from: com.airbnb.lottie.k */
/* loaded from: classes.dex */
public final class C5187k<V> {

    /* renamed from: a */
    private final V f12419a;

    /* renamed from: b */
    private final Throwable f12420b;

    public C5187k(V v) {
        this.f12419a = v;
        this.f12420b = null;
    }

    /* renamed from: a */
    public Throwable m9487a() {
        return this.f12420b;
    }

    /* renamed from: b */
    public V m9488b() {
        return this.f12419a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5187k)) {
            return false;
        }
        C5187k c5187k = (C5187k) obj;
        if (m9488b() != null && m9488b().equals(c5187k.m9488b())) {
            return true;
        }
        if (m9487a() == null || c5187k.m9487a() == null) {
            return false;
        }
        return m9487a().toString().equals(m9487a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{m9488b(), m9487a()});
    }

    public C5187k(Throwable th) {
        this.f12420b = th;
        this.f12419a = null;
    }
}
