package com.google.firebase.crashlytics.internal.p183n;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: OnDemandCounter.java */
/* renamed from: com.google.firebase.crashlytics.h.n.n0 */
/* loaded from: classes2.dex */
public final class C8219n0 {

    /* renamed from: a */
    private final AtomicInteger f30946a = new AtomicInteger();

    /* renamed from: b */
    private final AtomicInteger f30947b = new AtomicInteger();

    /* renamed from: a */
    public void m25278a() {
        this.f30947b.getAndIncrement();
    }

    /* renamed from: b */
    public void m25279b() {
        this.f30946a.getAndIncrement();
    }

    /* renamed from: c */
    public void m25280c() {
        this.f30947b.set(0);
    }
}
