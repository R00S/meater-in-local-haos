package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2660h0 implements L0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C2660h0 f34627a = new C2660h0();

    private C2660h0() {
    }

    public static C2660h0 c() {
        return f34627a;
    }

    @Override // com.google.android.gms.internal.wearable.L0
    public final boolean a(Class cls) {
        return AbstractC2672l0.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.wearable.L0
    public final K0 b(Class cls) {
        if (!AbstractC2672l0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (K0) AbstractC2672l0.j(cls.asSubclass(AbstractC2672l0.class)).g(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }
}
