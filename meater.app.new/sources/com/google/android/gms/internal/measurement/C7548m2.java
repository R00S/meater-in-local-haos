package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfd;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.m2 */
/* loaded from: classes2.dex */
final class C7548m2 implements InterfaceC7495d3 {

    /* renamed from: a */
    private static final C7548m2 f27841a = new C7548m2();

    private C7548m2() {
    }

    /* renamed from: c */
    public static C7548m2 m21238c() {
        return f27841a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7495d3
    /* renamed from: a */
    public final boolean mo21041a(Class<?> cls) {
        return zzfd.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7495d3
    /* renamed from: b */
    public final InterfaceC7501e3 mo21042b(Class<?> cls) {
        if (!zzfd.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (InterfaceC7501e3) zzfd.m22258m(cls.asSubclass(zzfd.class)).mo21510p(zzfd.zze.f28125c, null, null);
        } catch (Exception e2) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e2);
        }
    }
}
