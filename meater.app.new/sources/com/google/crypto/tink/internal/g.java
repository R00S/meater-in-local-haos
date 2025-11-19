package com.google.crypto.tink.internal;

import B8.b;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MutableMonitoringRegistry.java */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    private static final g f37657b = new g();

    /* renamed from: c, reason: collision with root package name */
    private static final b f37658c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<B8.b> f37659a = new AtomicReference<>();

    /* compiled from: MutableMonitoringRegistry.java */
    private static class b implements B8.b {
        private b() {
        }

        @Override // B8.b
        public b.a a(B8.c cVar, String str, String str2) {
            return f.f37655a;
        }
    }

    public static g b() {
        return f37657b;
    }

    public B8.b a() {
        B8.b bVar = this.f37659a.get();
        return bVar == null ? f37658c : bVar;
    }
}
