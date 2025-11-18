package com.google.android.gms.internal.wearable;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2694t0 implements Map.Entry {

    /* renamed from: B, reason: collision with root package name */
    private final Map.Entry f34678B;

    public final C2702x0 a() {
        return (C2702x0) this.f34678B.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f34678B.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((C2702x0) this.f34678B.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof N0) {
            return ((C2702x0) this.f34678B.getValue()).c((N0) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
