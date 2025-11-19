package com.google.android.gms.internal.wearable;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class W0 {

    /* renamed from: c, reason: collision with root package name */
    private static final W0 f34534c = new W0();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f34535d = 0;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f34537b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2640a1 f34536a = new F0();

    private W0() {
    }

    public static W0 a() {
        return f34534c;
    }

    public final Z0 b(Class cls) {
        C2689r0.c(cls, "messageType");
        Z0 z0A = (Z0) this.f34537b.get(cls);
        if (z0A == null) {
            z0A = this.f34536a.a(cls);
            C2689r0.c(cls, "messageType");
            Z0 z02 = (Z0) this.f34537b.putIfAbsent(cls, z0A);
            if (z02 != null) {
                return z02;
            }
        }
        return z0A;
    }
}
