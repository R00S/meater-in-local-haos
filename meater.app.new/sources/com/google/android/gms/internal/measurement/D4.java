package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
final class D4 implements InterfaceC2525l5 {

    /* renamed from: a, reason: collision with root package name */
    private static final D4 f33704a = new D4();

    private D4() {
    }

    public static D4 c() {
        return f33704a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2525l5
    public final InterfaceC2501i5 a(Class<?> cls) {
        if (!F4.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (InterfaceC2501i5) F4.p(cls.asSubclass(F4.class)).s(F4.f.f33734c, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2525l5
    public final boolean b(Class<?> cls) {
        return F4.class.isAssignableFrom(cls);
    }
}
